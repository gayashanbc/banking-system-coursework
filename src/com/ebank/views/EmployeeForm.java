/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebank.views;

/**
 *
 * @author Shan
 */
public class EmployeeForm extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeForm
     */
    public EmployeeForm(String operation) {
        initComponents();
        this.setTitle(operation + " employee");
        btn_operation.setText(operation);
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_operation = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_employeeId = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_position = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        jPanel10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.cyan);
        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Details Form");
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("All fields are required");
        jPanel1.add(jLabel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(java.awt.Color.pink);
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 20));

        btn_operation.setBackground(java.awt.Color.yellow);
        btn_operation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_operation.setText("Operation");
        jPanel2.add(btn_operation);

        btn_cancel.setBackground(java.awt.Color.yellow);
        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_cancel.setText("Cancel");
        jPanel2.add(btn_cancel);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(7, 0, 0, 15));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 15, 5));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Employee Id: ");
        jPanel5.add(jLabel4);

        txt_employeeId.setColumns(10);
        txt_employeeId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel5.add(txt_employeeId);

        jPanel3.add(jPanel5);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 95, 5));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Name: ");
        jPanel6.add(jLabel5);

        txt_Name.setColumns(10);
        txt_Name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel6.add(txt_Name);

        jPanel3.add(jPanel6);

        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 70, 5));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Position: ");
        jPanel7.add(jLabel6);

        txt_position.setColumns(10);
        txt_position.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel7.add(txt_position);

        jPanel3.add(jPanel7);

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Username: ");
        jPanel8.add(jLabel3);

        txt_username.setColumns(10);
        txt_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel8.add(txt_username);

        jPanel3.add(jPanel8);

        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 55, 5));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Password: ");
        jPanel9.add(jLabel7);

        txt_password.setColumns(10);
        txt_password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel9.add(txt_password);

        jPanel3.add(jPanel9);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel10);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_operation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_employeeId;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_position;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
