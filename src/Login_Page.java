
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Login_Page extends javax.swing.JFrame 
{

    /**
     * Creates new form Login_Page
     */
    public Login_Page() 
    {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        Loginbutton = new javax.swing.JButton();
        Resetbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        username.setText("Username:");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, -1));

        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.setText("Password:");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        username_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        username_field.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });
        getContentPane().add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 208, -1));

        password_field.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password_field.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, 208, -1));

        Loginbutton.setBackground(new java.awt.Color(0, 204, 204));
        Loginbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Loginbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Library Management System\\Icon 1\\Icon 1\\login.png")); // NOI18N
        Loginbutton.setText("Login");
        Loginbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, -1, -1));

        Resetbutton.setBackground(new java.awt.Color(255, 153, 153));
        Resetbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Resetbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Library Management System\\Icon 1\\Icon 1\\red-x-mark-transparent-background-3.png")); // NOI18N
        Resetbutton.setText("Reset");
        Resetbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Resetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login background.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed

    }//GEN-LAST:event_username_fieldActionPerformed

    private void LoginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbuttonActionPerformed
 
        if(username_field.getText().equals("admin")&& password_field.getText().equals("admin"))
           {
               setVisible(false);
               new Home_Page().setVisible(true);
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Incorrect Username and Password");
           }
        
    }//GEN-LAST:event_LoginbuttonActionPerformed

    private void ResetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbuttonActionPerformed
        
        username_field.setText(null);
        password_field.setText(null);
    }//GEN-LAST:event_ResetbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loginbutton;
    private javax.swing.JButton Resetbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel username;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}