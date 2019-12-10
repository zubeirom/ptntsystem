/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.patientsystem.com;

import com.patientsystem.com.Controller.AppointmentController;
import com.patientsystem.com.Controller.DoctorController;
import com.patientsystem.com.Model.Appointment;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Enumeration;

/**
 *
 * @author zumo
 */
public class ManageAppointment extends javax.swing.JFrame {

    /**
     * Creates new form ManageAppointment
     */
    public ManageAppointment(int id, String doctorId, String firstname, String lastname) {
        initComponents();
        connectButton();
        displayApp(id);
        tFirstname.setText(firstname);
        tLastname.setText(lastname);
        tDoctor.setText(doctorId);
        tPatient.setText(String.valueOf(id));
    }
    
    public void displayApp(int id) {
        AppointmentController app = new AppointmentController();
        
        ArrayList<Appointment> list = app.get(id);
        DefaultTableModel model = (DefaultTableModel)appTable.getModel();
        Object[] row = new Object[6];
        DoctorController dc = new DoctorController();
        
        for(int i = 0; i < list.size(); i++) {
            
            row[0] = list.get(i).getId();
            row[1] = dc.getOneDoctor(list.get(i).getDoctor());
            row[2] = list.get(i).getPatient();
            row[3] = list.get(i).getAppDate();
            row[4] = list.get(i).getStartTime();
            row[5] = list.get(i).getEndTime();
            
            model.addRow(row);
        }
        
    }
    
    public void connectButton() {
        buttonConnector = new ButtonGroup();
        buttonConnector.add(slot1);
        buttonConnector.add(slot2);
        buttonConnector.add(slot3);
        buttonConnector.add(slot4);
        buttonConnector.add(slot5);
        buttonConnector.add(slot6);
        buttonConnector.add(slot7);
        buttonConnector.add(slot8);
        buttonConnector.add(slot9);
        buttonConnector.add(slot10);
        buttonConnector.add(slot11);
        buttonConnector.add(slot12);
        buttonConnector.add(slot13);
        buttonConnector.add(slot14);
        buttonConnector.add(slot15);
        buttonConnector.add(slot16);
        buttonConnector.add(slot17);
        buttonConnector.add(slot18);        
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JScrollPane1 = new javax.swing.JScrollPane();
        appTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tFirstname = new javax.swing.JLabel();
        tLastname = new javax.swing.JLabel();
        tDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        slot1 = new javax.swing.JRadioButton();
        slot7 = new javax.swing.JRadioButton();
        slot13 = new javax.swing.JRadioButton();
        slot2 = new javax.swing.JRadioButton();
        slot8 = new javax.swing.JRadioButton();
        slot14 = new javax.swing.JRadioButton();
        slot3 = new javax.swing.JRadioButton();
        slot9 = new javax.swing.JRadioButton();
        slot15 = new javax.swing.JRadioButton();
        slot4 = new javax.swing.JRadioButton();
        slot10 = new javax.swing.JRadioButton();
        slot16 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        slot5 = new javax.swing.JRadioButton();
        slot11 = new javax.swing.JRadioButton();
        slot17 = new javax.swing.JRadioButton();
        slot6 = new javax.swing.JRadioButton();
        slot12 = new javax.swing.JRadioButton();
        slot18 = new javax.swing.JRadioButton();
        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tDoctor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tPatient = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Doctor", "Patient Id", "Date of App", "Start Time ", "End Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appTableMouseClicked(evt);
            }
        });
        JScrollPane1.setViewportView(appTable);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Appointment Booking for ");

        tFirstname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tFirstname.setText("None");

        tLastname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tLastname.setText("None");

        tDate.setDateFormatString("y-M-d");

        jLabel2.setText("Date of Appointment");

        slot1.setText("09:00-09:30");

        slot7.setText("01:30-02:00");

        slot13.setText("06:00-06:30");

        slot2.setText("09:30-10:00");

        slot8.setText("02:00-02:30");
        slot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot8ActionPerformed(evt);
            }
        });

        slot14.setText("06:30-07:00");

        slot3.setText("10:00-10:30");

        slot9.setText("02:30-03:00");

        slot15.setText("07:00-07:30");

        slot4.setText("10:30-11:00");

        slot10.setText("03:00-03:30");

        slot16.setText("07:30-08:00");
        slot16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot16ActionPerformed(evt);
            }
        });

        jLabel3.setText("Id:");

        idLabel.setText("None");

        slot5.setText("11:00-11:30");

        slot11.setText("03:30-04:00");

        slot17.setText("08:00-08:30");

        slot6.setText("11:30-12:00");

        slot12.setText("04:00-04:30");

        slot18.setText("08:30-09:00");

        insertButton.setText("Insert");
        insertButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonMouseClicked(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Doctor Id:");

        tDoctor.setText("None");

        jLabel6.setText("Patient Id:");

        tPatient.setText("None");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tDate, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(slot7)
                                            .addComponent(slot1)
                                            .addComponent(slot13)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(insertButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deleteButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tFirstname)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idLabel)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot2)
                                    .addComponent(slot8)
                                    .addComponent(slot14))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot9)
                                    .addComponent(slot3)
                                    .addComponent(slot15))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot16)
                                    .addComponent(slot10)
                                    .addComponent(slot4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot11)
                                    .addComponent(slot17)
                                    .addComponent(slot5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot6)
                                    .addComponent(slot18)
                                    .addComponent(slot12)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(tDoctor)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tPatient)))))
                        .addGap(0, 191, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tFirstname)
                    .addComponent(tLastname))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(idLabel)
                            .addComponent(jLabel4)
                            .addComponent(tDoctor)
                            .addComponent(jLabel6)
                            .addComponent(tPatient))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(slot1)
                        .addComponent(slot2)
                        .addComponent(slot3)
                        .addComponent(slot4)
                        .addComponent(slot5)
                        .addComponent(slot6)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slot7)
                    .addComponent(slot8)
                    .addComponent(slot9)
                    .addComponent(slot10)
                    .addComponent(slot11)
                    .addComponent(slot12))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slot15)
                    .addComponent(slot16)
                    .addComponent(slot14)
                    .addComponent(slot13)
                    .addComponent(slot17)
                    .addComponent(slot18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertButton)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addComponent(JScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slot16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slot16ActionPerformed

    private void appTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appTableMouseClicked
        // TODO add your handling code here:
        int i = appTable.getSelectedRow();
        TableModel model = appTable.getModel();
        Date date;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(i, 3).toString());
            tDate.setDate(date);
            idLabel.setText(model.getValueAt(i, 0).toString());
        } catch (ParseException ex) {
            Logger.getLogger(ManageAppointment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_appTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void insertButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonMouseClicked
        // TODO add your handling code here:
        try{
            String slot = getSelectedButtonText(buttonConnector);
            AppointmentController ac = new AppointmentController();
            SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
            
            if(ac.timeSlotAvailable(Integer.parseInt(tPatient.getText()), DATE_FORMAT.format(tDate.getDate()).toString(), slot)) {
                Boolean task = ac.create(Integer.parseInt(tDoctor.getText().substring(0, 1)), Integer.parseInt(tPatient.getText()), DATE_FORMAT.format(tDate.getDate()).toString(), slot);
            
                if(task) {
                    JOptionPane.showMessageDialog(null, "Successfully created new appointment");
                } else {
                    JOptionPane.showMessageDialog(null, "Something went wrong, please check all fields and try again");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Time slot is not available, please select different");
            }
            
            
            
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
            e.printStackTrace();
        }
    }//GEN-LAST:event_insertButtonMouseClicked

    private void slot8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slot8ActionPerformed

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // TODO add your handling code here:
        try {
            if(idLabel.getText() != "None") {
                AppointmentController dc = new AppointmentController();
                dc.delete(Integer.parseInt(idLabel.getText()));
            
                JOptionPane.showMessageDialog(null, "Successfully deleted appointment");
            } else {
                JOptionPane.showMessageDialog(null, "Please select a appointment in the table");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ManageAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageAppointment(0, "None", "None", "None").setVisible(true);
            }
        });
    }
    
    private ButtonGroup buttonConnector;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane1;
    private javax.swing.JTable appTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton slot1;
    private javax.swing.JRadioButton slot10;
    private javax.swing.JRadioButton slot11;
    private javax.swing.JRadioButton slot12;
    private javax.swing.JRadioButton slot13;
    private javax.swing.JRadioButton slot14;
    private javax.swing.JRadioButton slot15;
    private javax.swing.JRadioButton slot16;
    private javax.swing.JRadioButton slot17;
    private javax.swing.JRadioButton slot18;
    private javax.swing.JRadioButton slot2;
    private javax.swing.JRadioButton slot3;
    private javax.swing.JRadioButton slot4;
    private javax.swing.JRadioButton slot5;
    private javax.swing.JRadioButton slot6;
    private javax.swing.JRadioButton slot7;
    private javax.swing.JRadioButton slot8;
    private javax.swing.JRadioButton slot9;
    private com.toedter.calendar.JDateChooser tDate;
    private javax.swing.JLabel tDoctor;
    private javax.swing.JLabel tFirstname;
    private javax.swing.JLabel tLastname;
    private javax.swing.JLabel tPatient;
    // End of variables declaration//GEN-END:variables
    

}
