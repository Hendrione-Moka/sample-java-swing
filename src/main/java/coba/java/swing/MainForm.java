/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.java.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Point;
import java.awt.ScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author hendrione
 */
public class MainForm extends javax.swing.JFrame {

    public static DatabaseConnection db = new DatabaseConnection();

    /**
     * Creates new form NewJFrame
     */
    public MainForm() {
        db.initDB();
//        db.getDataKaryawan();
        initComponents();
//        initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuTambahDataKaryawan = new javax.swing.JMenuItem();
        menuLihatDataKaryawan = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuTambahDataArmada = new javax.swing.JMenuItem();
        menuLihatDataArmada = new javax.swing.JMenuItem();
        menuTambahDataArea = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        menuLihatDataArea = new javax.swing.JMenuItem();
        menuTambahDataBarang = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        menuLihatDataBarang = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuLihatDataPendapatanPerArmada = new javax.swing.JMenuItem();
        menuLihatDataPendapatanTotal = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenu7.setText("File");
        jMenuBar2.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar2.add(jMenu8);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Master Data");

        jMenu3.setText("Karyawan");

        menuTambahDataKaryawan.setText("Tambah Data");
        menuTambahDataKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTambahDataKaryawanActionPerformed(evt);
            }
        });
        jMenu3.add(menuTambahDataKaryawan);

        menuLihatDataKaryawan.setText("Lihat Data");
        menuLihatDataKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLihatDataKaryawanActionPerformed(evt);
            }
        });
        jMenu3.add(menuLihatDataKaryawan);

        jMenu1.add(jMenu3);

        jMenu4.setText("Armada");

        menuTambahDataArmada.setText("Tambah Data");
        menuTambahDataArmada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTambahDataArmadaActionPerformed(evt);
            }
        });
        jMenu4.add(menuTambahDataArmada);

        menuLihatDataArmada.setText("Lihat Data");
        menuLihatDataArmada.setToolTipText("");
        menuLihatDataArmada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLihatDataArmadaActionPerformed(evt);
            }
        });
        jMenu4.add(menuLihatDataArmada);

        jMenu1.add(jMenu4);

        menuTambahDataArea.setText("Area");

        jMenuItem6.setText("Tambah Data");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuTambahDataArea.add(jMenuItem6);

        menuLihatDataArea.setText("Lihat Data");
        menuLihatDataArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLihatDataAreaActionPerformed(evt);
            }
        });
        menuTambahDataArea.add(menuLihatDataArea);

        jMenu1.add(menuTambahDataArea);

        menuTambahDataBarang.setText("Barang");

        jMenuItem9.setText("Tambah Data");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuTambahDataBarang.add(jMenuItem9);

        menuLihatDataBarang.setText("Lihat Data");
        menuLihatDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLihatDataBarangActionPerformed(evt);
            }
        });
        menuTambahDataBarang.add(menuLihatDataBarang);

        jMenu1.add(menuTambahDataBarang);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Laporan");

        jMenu5.setText("Pendapatan Per Armada");

        menuLihatDataPendapatanPerArmada.setText("Lihat Data");
        menuLihatDataPendapatanPerArmada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLihatDataPendapatanPerArmadaActionPerformed(evt);
            }
        });
        jMenu5.add(menuLihatDataPendapatanPerArmada);

        jMenu2.add(jMenu5);

        menuLihatDataPendapatanTotal.setText("Pendapatan Total");

        jMenuItem10.setText("Lihat Data");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        menuLihatDataPendapatanTotal.add(jMenuItem10);

        jMenu2.add(menuLihatDataPendapatanTotal);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuTambahDataKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTambahDataKaryawanActionPerformed
        new AddKaryawanForm().setVisible(true);
    }//GEN-LAST:event_menuTambahDataKaryawanActionPerformed

    private void menuLihatDataKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLihatDataKaryawanActionPerformed
        showTableData(DatabaseConnection.GET_KARYAWAN, "Data Karyawan");
    }//GEN-LAST:event_menuLihatDataKaryawanActionPerformed

    private void menuTambahDataArmadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTambahDataArmadaActionPerformed
        new AddArmadaForm().setVisible(true);
    }//GEN-LAST:event_menuTambahDataArmadaActionPerformed

    private void menuLihatDataArmadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLihatDataArmadaActionPerformed
        showTableData(DatabaseConnection.GET_ARMADA, "Data Armada");
    }//GEN-LAST:event_menuLihatDataArmadaActionPerformed

    private void menuLihatDataAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLihatDataAreaActionPerformed
        showTableData(DatabaseConnection.GET_AREA, "Data Area");
    }//GEN-LAST:event_menuLihatDataAreaActionPerformed

    private void menuLihatDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLihatDataBarangActionPerformed
        showTableData(DatabaseConnection.GET_BARANG, "Data Barang");
    }//GEN-LAST:event_menuLihatDataBarangActionPerformed

    private void menuLihatDataPendapatanPerArmadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLihatDataPendapatanPerArmadaActionPerformed
        showTableData(DatabaseConnection.GET_PENDAPATAN_PER_ARMADA, "Data Pendapatan Per Armada");
    }//GEN-LAST:event_menuLihatDataPendapatanPerArmadaActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        showTableData(DatabaseConnection.GET_PENDAPATAN_TOTAL, "Data Pendapatan Total");
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new AddBarangForm().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new AddAreaForm().setVisible(true);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    public void showTableData(String query, String title) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        TableData data = db.getTableData(query);
        TableModel model = new DefaultTableModel(data.getData(), data.getColumn()) {
            public boolean isCellEditable(int row, int column) {
                return false;//This causes all cells to be not editable
            }
        };
        JTable table = new JTable(model);
        addDoubleClickEvent(table, data.getData(), title);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setTitle(title);
        frame.setSize(1000, 500);
        frame.setVisible(true);
    }

    private void addDoubleClickEvent(JTable jTable, String[][] data, String title) {
        jTable.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table = (JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    System.out.println("Data yg di klik" + data[table.getSelectedRow()][0]);
                    if(title.contains("Karyawan")){
                        new AddKaryawanForm("edit", data[table.getSelectedRow()]).setVisible(true);
                    }else if(title.contains("Area")){
                        new AddAreaForm("edit", data[table.getSelectedRow()]).setVisible(true);
                    }else if(title.contains("Barang")){
                        new AddBarangForm("edit", data[table.getSelectedRow()]).setVisible(true);
                    }else if(title.contains("Armada")){
                        new AddArmadaForm("edit", data[table.getSelectedRow()]).setVisible(true);
                    }
                }
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuLihatDataArea;
    private javax.swing.JMenuItem menuLihatDataArmada;
    private javax.swing.JMenuItem menuLihatDataBarang;
    public javax.swing.JMenuItem menuLihatDataKaryawan;
    private javax.swing.JMenuItem menuLihatDataPendapatanPerArmada;
    private javax.swing.JMenu menuLihatDataPendapatanTotal;
    private javax.swing.JMenu menuTambahDataArea;
    private javax.swing.JMenuItem menuTambahDataArmada;
    private javax.swing.JMenu menuTambahDataBarang;
    public javax.swing.JMenuItem menuTambahDataKaryawan;
    // End of variables declaration//GEN-END:variables
}