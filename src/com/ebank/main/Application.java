/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.main;

import com.ebank.views.LoginPage;
import javax.swing.SwingUtilities;

/**
 *
 * @author Shan
 */
public class Application {

    public static void main(String[] args) {
        // run the UI in a seperate thread to avoid conflicts
        SwingUtilities.invokeLater(() -> {
           new LoginPage().setVisible(true);
        });
    }
}
