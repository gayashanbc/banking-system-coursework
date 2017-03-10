/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.main;

import javax.swing.JOptionPane;

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
     * @param title title of the message box
     * @param message message needed to be displayed
     */
    public static void showMsg(int iconType, String title, String message) {
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
}
