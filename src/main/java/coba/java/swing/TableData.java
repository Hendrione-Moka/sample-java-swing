/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.java.swing;

/**
 *
 * @author hendrione
 */
public class TableData {

    public TableData(String[] column, String[][] data) {
        this.column = column;
        this.data = data;
    }

    private String[] column;
    private String[][] data;

    public String[] getColumn() {
        return column;
    }

    public String[][] getData() {
        return data;
    }
}
