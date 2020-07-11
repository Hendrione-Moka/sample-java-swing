package coba.java.swing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hendrione
 */
public class DatabaseConnection {

    //GET
    public static final String GET_KARYAWAN = "Select * from KARYAWAN";
    public static final String GET_ARMADA = "Select * from ARMADA";
    public static final String GET_AREA = "Select * from AREA";
    public static final String GET_BARANG = "Select * from BARANG";
    public static final String GET_PENDAPATAN_PER_ARMADA = "Select * from PENDAPATAN_PER_ARMADA";
    public static final String GET_PENDAPATAN_TOTAL = "Select * from PENDAPATAN_TOTAL";
    //INSERT
    public static final String INSERT_KARYAWAN = "insert into KARYAWAN(KODE_KARYAWAN, NAMA_KARYAWAN, JABATAN, GAJI_POKOK) values(?,?,?,?)";
    public static final String INSERT_BARANG = "insert into BARANG(KODE_BARANG, NAMA_BARANG, SATUAN, HARGA) values(?,?,?,?)";
    public static final String INSERT_ARMADA = "insert into ARMADA(KODE_KARYAWAN, KODE_ARMADA, NAMA_ARMADA, JUMLAH_DIBAWA) values(?,?,?,?)";
    public static final String INSERT_AREA = "insert into AREA(KODE_ARMADA, KODE_AREA, AREA, JANGKAUAN) values(?,?,?,?)";
    public Connection conn;
    //DELETE
    public static final String DELETE_KARYAWAN = "delete from KARYAWAN where KODE_KARYAWAN = ?";
    public static final String DELETE_AREA = "delete from AREA where KODE_AREA = ?";
    public static final String DELETE_ARMADA = "delete from ARMADA where KODE_ARMADA = ?";
    public static final String DELETE_BARANG = "delete from BARANG where KODE_BARANG = ?";
    
    
    public void initDB() {
        System.out.println("INIT DB");
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            this.conn = DriverManager
                    .getConnection("jdbc:oracle:thin:@192.168.1.9:1521:XE", "MKHUSNUL41518320042", "system");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public TableData getTableData(String query) {
        try {
            Statement statement = this.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet result = statement.executeQuery(query);
            String[] columns = getColumnName(result.getMetaData());
            String[][] data = getData(result);
            return new TableData(columns, data);

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public int getRowCount(ResultSet resultSet) throws Exception {
        resultSet.last();
        int count = resultSet.getRow();
        resultSet.beforeFirst();
        return count;
    }

    public int getColumnCount(ResultSet resultSet) throws Exception {
        return resultSet.getMetaData().getColumnCount();
    }

    public String[] getColumnName(ResultSetMetaData metaData) throws Exception {
        String[] temp = new String[metaData.getColumnCount()];
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            temp[i - 1] = metaData.getColumnName(i);
        }
        return temp;
    }

    public String[][] getData(ResultSet resultSet) throws Exception {
        String[][] tempData = new String[getRowCount(resultSet)][getColumnCount(resultSet)];
        while (resultSet.next()) {
            for (int i = 1; i <= getColumnCount(resultSet); i++) {
                tempData[resultSet.getRow() - 1][i - 1] = resultSet.getString(i);
            }
        }
        return tempData;
    }

    public void insertData(String query, List<String> data) throws Exception {
        PreparedStatement stmt = conn.prepareStatement(query);
        for (int i = 1; i <= data.size(); i++) {
            stmt.setString(i, data.get(i - 1));
        }
        stmt.execute();
    }

    public void editData(String query, List<String> data) throws Exception {
        insertData(query, data);
    }

    public void deleteData(String query, String id) throws Exception {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, id);
        stmt.execute();

    }
}
