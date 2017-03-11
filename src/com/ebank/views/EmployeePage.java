/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.views;

import com.ebank.controllers.EmployeePageController;
import static com.ebank.main.CommonFunctions.showMsg;
import static com.ebank.main.CommonFunctions.isValidRowSelection;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Shan
 */
public class EmployeePage extends javax.swing.JFrame {

    private DefaultTableModel employeeTableModel;
    private EmployeePageController controller;

    /**
     * Creates new form EmployeePage
     */
    public EmployeePage() {
        initComponents();
        setLocationRelativeTo(null);
        employeeTableModel = (DefaultTableModel) jtb_employeeList.getModel();
        controller = new EmployeePageController();
        refreshEmployeeRecords();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_goBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_employeeList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Page");

        jPanel1.setBackground(java.awt.Color.cyan);
        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Page");
        jPanel1.add(jLabel1);

        jPanel4.setBackground(java.awt.Color.cyan);
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        btn_goBack.setBackground(java.awt.Color.orange);
        btn_goBack.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btn_goBack.setText("Go to login");
        btn_goBack.setVerifyInputWhenFocusTarget(false);
        btn_goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_goBackActionPerformed(evt);
            }
        });
        jPanel4.add(btn_goBack);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(java.awt.Color.pink);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 20));

        btn_add.setBackground(java.awt.Color.yellow);
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel2.add(btn_add);

        btn_edit.setBackground(java.awt.Color.yellow);
        btn_edit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit);

        btn_delete.setBackground(java.awt.Color.yellow);
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        jtb_employeeList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtb_employeeList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, "Gayashan Bombuwala"},
                {2, "Gayashan Bombuwala"},
                {3, "Gayashan Bombuwala"},
                {4, "Gayashan Bombuwala"},
                {5, "Gayashan Bombuwala"}
            },
            new String [] {
                "#", "Employee Name"
            }
        ));
        jtb_employeeList.setName("Employee List"); // NOI18N
        jScrollPane1.setViewportView(jtb_employeeList);

        jPanel3.add(jScrollPane1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_goBackActionPerformed
        this.dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_btn_goBackActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        new EmployeeForm().setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        deleteEmployee();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        prepareEditEmployee();
    }//GEN-LAST:event_btn_editActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeePage().setVisible(true);
            }
        });
    }

    /**
     * Delete a record from the employee table model
     */
    private void deleteEmployee() {
        if (isValidRowSelection(jtb_employeeList)) {
            int employeeId = (int) employeeTableModel.getValueAt(jtb_employeeList.getSelectedRow(), 0);
            if (controller.syncEmployeeDeleteOperation(employeeId)) {
                employeeTableModel.removeRow(jtb_employeeList.getSelectedRow());
                showMsg(0, 0, "Employee record deleted");
            } else {
                showMsg(2, 2, "Unable to delete the record");
            }
        }
    }

    /**
     * Prepare a record to be edited from the table
     */
    private void prepareEditEmployee() {
        if (isValidRowSelection(jtb_employeeList)) {
            int employeeId = (int) employeeTableModel.getValueAt(jtb_employeeList.getSelectedRow(), 0);
            new EmployeeForm(employeeId).setVisible(true);
        }
    }

    /**
     * Synchronize current employee data from the web service
     */
    private void refreshEmployeeRecords() {
        String[][] employeeObjects = controller.getEmployeesData();
        for (String[] employeeObject : employeeObjects) {
            Object[] test = new Object[2];
            test[0] = Integer.parseInt(employeeObject[0]);
            test[1] = employeeObject[1];
            employeeTableModel.addRow(test);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb_employeeList;
    // End of variables declaration//GEN-END:variables
}
