
import Project.DB_Connection;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class New_Student extends javax.swing.JFrame {
    
    public New_Student() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlable1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        jlabel4 = new javax.swing.JLabel();
        jlabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        Savebutton = new javax.swing.JButton();
        Closebutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlable1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlable1.setText("Student ID:");
        getContentPane().add(jlable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 134, -1, -1));

        jlabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlabel2.setText("Name:");
        getContentPane().add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 172, 50, -1));

        jlabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlabel3.setText("Father's Name:");
        getContentPane().add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 210, -1, -1));

        jlabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlabel4.setText("Course Name:");
        getContentPane().add(jlabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 248, -1, -1));

        jlabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlabel5.setText("Branch Name:");
        getContentPane().add(jlabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 292, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 134, 236, 27));

        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 172, 236, 27));

        jTextField3.setBackground(new java.awt.Color(255, 255, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 210, 236, 27));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "MCA" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 248, 236, 30));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 204));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "IT", "MECHANICAL", "CIVIL", "ELECTRICAL", "MCA" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 289, 236, 30));

        Savebutton.setBackground(new java.awt.Color(204, 255, 204));
        Savebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Savebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon--1.png"))); // NOI18N
        Savebutton.setText("Save");
        Savebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 330, -1, -1));

        Closebutton.setBackground(new java.awt.Color(255, 153, 153));
        Closebutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Closebutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\NetBeansProjects\\Library Management System\\Icon 1\\Icon 1\\red-x-mark-transparent-background-3.png")); // NOI18N
        Closebutton.setText("Close");
        Closebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClosebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 330, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/123456.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
      
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void SavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebuttonActionPerformed
                
        String studentID = jTextField1.getText();
        String name = jTextField2.getText();
        String fathersName = jTextField3.getText();
        String courseName = (String)jComboBox1.getSelectedItem();
        String branchName = (String)jComboBox2.getSelectedItem();
        try
        {
            Connection con = DB_Connection.getConnection();
            Statement st = con.createStatement();
            st.executeUpdate("insert into newstudent values('"+studentID+"','"+name+"','"+fathersName+"','"+courseName+"','"+branchName+"')");
            JOptionPane.showMessageDialog(null, "Details Updated Successfully");
            setVisible(false);
            new New_Student().setVisible(true);   
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "StudentID Already Exist");
            setVisible(false);
            new New_Student().setVisible(true);
        }    
    }//GEN-LAST:event_SavebuttonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ClosebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClosebuttonActionPerformed
            setVisible(false);
    }//GEN-LAST:event_ClosebuttonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(New_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new New_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Closebutton;
    private javax.swing.JButton Savebutton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jlabel4;
    private javax.swing.JLabel jlabel5;
    private javax.swing.JLabel jlable1;
    // End of variables declaration//GEN-END:variables
}
