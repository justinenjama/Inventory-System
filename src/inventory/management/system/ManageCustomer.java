/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inventory.management.system;

import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author justine
 */
public class ManageCustomer extends javax.swing.JFrame {

    private int customerPk = 0;
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form ManageProduct
     */
    public ManageCustomer() {
        initComponents();
        table_update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        txtclose = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("Manage Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 6, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 470, 478));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 319, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        txtphone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 319, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 319, -1));

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 405, -1, -1));

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 405, -1, -1));

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 405, -1, -1));

        txtclose.setText("Close");
        txtclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcloseActionPerformed(evt);
            }
        });
        getContentPane().add(txtclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 405, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/All_page_Background.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        txtphone.setText("");
        txtemail.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_txtcloseActionPerformed

    // save button
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String phone = txtphone.getText();
        String email = txtemail.getText();
        
        if (validateFields("new")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            conn = ConnectionProvider.getConn();
            try {
                pst = conn.prepareStatement("insert into customer (name, mobileNumber, email) values (?,?,?)");
                pst.setString(1, name);
                pst.setString(2, phone);
                pst.setString(3, email);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer added successfully");
                txtname.setText("");
                txtphone.setText("");
                txtemail.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        table_update();
    }//GEN-LAST:event_btnsaveActionPerformed

    // populating fields from table rows
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int selectIndex = jTable1.getSelectedRow();
       
       DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
       
       String idText = model.getValueAt(selectIndex, 0).toString();
       String name = model.getValueAt(selectIndex, 1).toString();
       String phone = model.getValueAt(selectIndex, 2).toString();
       String email = model.getValueAt(selectIndex, 3).toString();
       
       customerPk = Integer.parseInt(idText);
       txtname.setText(name);
       txtphone.setText(phone);
       txtemail.setText(email);
       
       btnsave.setEnabled(false);
       btnupdate.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    // update button
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        
        String name = txtname.getText();
        String phone = txtphone.getText();
        String email = txtemail.getText();
        
        if (validateFields("edit")) {
            JOptionPane.showMessageDialog(null, "All fields are required");
        } else {
            conn = ConnectionProvider.getConn();
            try {
                pst = conn.prepareStatement("update customer set name=?, mobileNumber=?, email=? where customer_pk=?");
                pst.setString(1, name);
                pst.setString(2, phone);
                pst.setString(3, email);
                pst.setInt(4, customerPk);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer updated successfully");
                txtname.setText("");
                txtphone.setText("");
                txtemail.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        table_update();
    }//GEN-LAST:event_btnupdateActionPerformed

    private boolean validateFields(String formType) {
        if (formType.equals("edit") && !txtname.getText().equals("") && !txtemail.getText().equals("") && !txtphone.getText().equals("")) {
            return false;
        } else if (formType.equals("new") && !txtname.getText().equals("") && !txtemail.getText().equals("") && !txtphone.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }

    private void table_update() {

        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        conn = ConnectionProvider.getConn();
        try {
            pst = conn.prepareStatement("select * from customer");
            rs = pst.executeQuery();
            
            model.setRowCount(0);
            
            while(rs.next()){
                Vector v2 = new Vector();
                v2.add(rs.getString("customer_pk"));
                v2.add(rs.getString("name"));
                v2.add(rs.getString("mobileNumber"));
                v2.add(rs.getString("email"));
                model.addRow(v2); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        btnupdate.setEnabled(false);
        btnsave.setEnabled(true);
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
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton txtclose;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
