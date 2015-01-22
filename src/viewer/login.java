/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package viewer;

import com.Messages;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author LasithaRanawaka
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        FirstLoad();
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
        txt_UserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        cmb_EmployeName = new javax.swing.JComboBox();
        btn_Login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel1.setText("Welcome to the Lakmuthu...");

        jLabel2.setText("User name");

        txt_UserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_UserNameKeyPressed(evt);
            }
        });

        jLabel3.setText("Password");

        txt_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_PasswordKeyPressed(evt);
            }
        });

        jLabel4.setText("Employee Name");

        cmb_EmployeName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmb_EmployeNameKeyPressed(evt);
            }
        });

        btn_Login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Login.setText("Login");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmb_EmployeName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_UserName)
                        .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmb_EmployeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_Login)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        if (cmb_EmployeName.getSelectedIndex() != 0 && !txt_UserName.getText().isEmpty() && !txt_Password.getText().isEmpty()) {
            Login();
        } else {
            Messages.fillemptydata();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void cmb_EmployeNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmb_EmployeNameKeyPressed
        if (evt.getKeyCode() == 10) {
            if (cmb_EmployeName.getSelectedIndex() != 0) {
                txt_UserName.grabFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_EmployeNameKeyPressed

    private void txt_UserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UserNameKeyPressed
       if (evt.getKeyCode() == 10) {
            if (!txt_UserName.getText().isEmpty()) {
                txt_Password.grabFocus();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserNameKeyPressed

    private void txt_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PasswordKeyPressed
      if (evt.getKeyCode() == 10) {
           Login();
        }   // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JComboBox cmb_EmployeName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_UserName;
    // End of variables declaration//GEN-END:variables

    private void FirstLoad() {
        cmb_EmployeName.grabFocus();
        LoadEmployeeCombo();
    }

    private void LoadEmployeeCombo() {

        DefaultComboBoxModel dcbm = (DefaultComboBoxModel) cmb_EmployeName.getModel();
        dcbm.removeAllElements();

        try {
            dcbm.addElement("--Select--");
            ResultSet rs = model.db.fetch("SELECT\n"
                    + "employee.full_name\n"
                    + "FROM\n"
                    + "employee");

            while (rs.next()) {
                dcbm.addElement(rs.getString(1));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void Login() {
        try {



            ResultSet rs = model.db.fetch("SELECT\n"
                    + "employee.full_name\n"
                    + "FROM\n"
                    + "employee ,\n"
                    + "`user`\n"
                    + "WHERE\n"
                    + "`user`.employee_id = employee.id AND\n"
                    + "`user`.`name` = '" + txt_UserName.getText().trim() + "' AND\n"
                    + "`user`.pw = '" + txt_Password.getText().trim() + "' AND\n"
                    + "employee.full_name = '" + cmb_EmployeName.getSelectedItem() + "'AND\n"
                    + "`user`.`status` = '0'");

            if (rs.next()) {
                this.dispose();
                new mainView().setVisible(true);

            } else {
                Messages.warningjoption("Incorrect User Name or Password ! ");
                cmb_EmployeName.grabFocus();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
