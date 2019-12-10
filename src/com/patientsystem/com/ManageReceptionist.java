/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patientsystem.com;

import com.patientsystem.com.Controller.ReceptionistController;
import com.patientsystem.com.Model.Receptionist;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author zumo
 */
public class ManageReceptionist extends javax.swing.JFrame {

    /**
     * Creates new form ManageReceptionist
     */
    public ManageReceptionist() {
        initComponents();
        displayRecs();
    }
    
    public void openFrame() {
        initComponents();
        displayRecs();
    }
    
    public void displayRecs() {
        ReceptionistController rc = new ReceptionistController();
        
        ArrayList<Receptionist> list = rc.get();
        DefaultTableModel model = (DefaultTableModel)recTable.getModel();
        Object[] row = new Object[9];
        
        for(int i=0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getFirstname();
            row[2] = list.get(i).getMiddlename();
            row[3] = list.get(i).getLastname();
            row[4] = list.get(i).getUsername();
            row[5] = list.get(i).getContactNumber();
            row[6] = list.get(i).getEmail();
            row[7] = list.get(i).getAddress();
            
            model.addRow(row);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        recTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tFirstname = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        tMiddlename = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tLastname = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        tUsername = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        tPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        tContactNumber = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        tEmail = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        tAddress = new java.awt.TextField();
        insertButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        recTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Firstname", "Middlename", "Lastname", "Username", "Contactnumber", "Email", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(recTable);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Receptionist Manager");

        jLabel2.setText("Firstname: ");

        jLabel3.setText("Middlename: ");

        jLabel4.setText("Id:");

        idLabel.setText("None");

        jLabel5.setText("Lastname: ");

        jLabel6.setText("Username:");

        jLabel7.setText("Password: ");

        jLabel8.setText("Contactnumber: ");

        jLabel9.setText("Email: ");

        jLabel10.setText("Address: ");

        insertButton.setText("Insert");
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonMouseClicked(evt);
            }
        });
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        resetButton.setText("Reset Fields");
        resetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(idLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(tEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tMiddlename, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(tAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tLastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tContactNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetButton)
                                .addGap(84, 84, 84)
                                .addComponent(insertButton)
                                .addGap(18, 18, 18)
                                .addComponent(updateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton)))
                        .addGap(0, 116, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(idLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(tFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tMiddlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(tContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertButtonActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void recTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recTableMouseClicked
        // TODO add your handling code here:
        int i = recTable.getSelectedRow();
        TableModel model = recTable.getModel();
        idLabel.setText(model.getValueAt(i, 0).toString());
        tFirstname.setText(model.getValueAt(i, 1).toString());
        tMiddlename.setText(model.getValueAt(i, 2).toString());
        tLastname.setText(model.getValueAt(i, 3).toString());
        tUsername.setText(model.getValueAt(i, 4).toString());
        
        //Fetch Password and display to password field
        ReceptionistController rc = new ReceptionistController();
        tPassword.setText(rc.getPassword(idLabel.getText()));
        tContactNumber.setText(model.getValueAt(i, 5).toString());
        tEmail.setText(model.getValueAt(i, 6).toString());
        tAddress.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_recTableMouseClicked

    private void insertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseClicked
        // TODO add your handling code here:
        try{
            ReceptionistController rc = new ReceptionistController();
            rc.create(tFirstname.getText(), tMiddlename.getText(), tLastname.getText(),  tAddress.getText(),  tEmail.getText(), tUsername.getText(), String.valueOf(tPassword.getPassword()), Integer.parseInt(tContactNumber.getText()));
            
            JOptionPane.showMessageDialog(null, "Successfully created new receptionist");
            DefaultTableModel model = (DefaultTableModel)recTable.getModel();
            model.setRowCount(0);
            displayRecs();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_insertButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        // TODO add your handling code here:
        
        try {
            ReceptionistController rc = new ReceptionistController();
            rc.update(Integer.parseInt(idLabel.getText()), tFirstname.getText(), tMiddlename.getText(), tLastname.getText(), tUsername.getText(), String.valueOf(tPassword.getPassword()), Integer.parseInt(tContactNumber.getText()), tEmail.getText(),  tAddress.getText());
            JOptionPane.showMessageDialog(null, "Successfully update table");
            DefaultTableModel model = (DefaultTableModel)recTable.getModel();
            model.setRowCount(0);
            displayRecs();
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }//GEN-LAST:event_updateButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // TODO add your handling code here:
        try {
            ReceptionistController rc = new ReceptionistController();
            rc.delete(Integer.parseInt(idLabel.getText()));
            JOptionPane.showMessageDialog(null, "Successfully deleted doctor");
            DefaultTableModel model = (DefaultTableModel)recTable.getModel();
            model.setRowCount(0);
            displayRecs();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void resetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetButtonMouseClicked
        // TODO add your handling code here:
        idLabel.setText("None");
        tFirstname.setText("");
        tMiddlename.setText("");
        tLastname.setText("");
        tUsername.setText("");
        tPassword.setText("");
        tContactNumber.setText("");
        tEmail.setText("");
        tAddress.setText("");
    }//GEN-LAST:event_resetButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ManageReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageReceptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable recTable;
    private javax.swing.JButton resetButton;
    private java.awt.TextField tAddress;
    private java.awt.TextField tContactNumber;
    private java.awt.TextField tEmail;
    private java.awt.TextField tFirstname;
    private java.awt.TextField tLastname;
    private java.awt.TextField tMiddlename;
    private javax.swing.JPasswordField tPassword;
    private java.awt.TextField tUsername;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
