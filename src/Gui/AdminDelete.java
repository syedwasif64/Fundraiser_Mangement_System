package Gui;
import finalproject.FundraiserManager;
import javax.swing.JOptionPane;
public class AdminDelete extends javax.swing.JFrame {
    static FundraiserManager fm=new FundraiserManager();
    public AdminDelete(FundraiserManager fm) {
        initComponents();
        setExtendedState(this.MAXIMIZED_BOTH);
        this.fm=fm;
        display();
//        String txt=fm.viewFundRaisers();
//        txtDisplayFr.setText(txt);
        txtDisplayFr.setEditable(false);
        
    }
    public void display(){
        String txt=fm.viewFundRaisers();
        txtDisplayFr.setText(txt);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHome = new javax.swing.JButton();
        btnViewF = new javax.swing.JButton();
        btnAddFR = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExpired = new javax.swing.JButton();
        btnCompleted = new javax.swing.JButton();
        btnAddDonor = new javax.swing.JButton();
        btnViewD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDisplayFr = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        txtNameToDel = new javax.swing.JTextField();
        btndeleteFr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnHome.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnViewF.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnViewF.setText("VIEW FUNDRAISER");
        btnViewF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFActionPerformed(evt);
            }
        });

        btnAddFR.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnAddFR.setText("ADD FUNDRAISER");
        btnAddFR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFRActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnDelete.setText("DELETE  FUNDRAISER");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExpired.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnExpired.setText("VIEW EXPIRED FUNDRAISER");
        btnExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpiredActionPerformed(evt);
            }
        });

        btnCompleted.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnCompleted.setText("VIEW COMPLETED FUNDRAISER");
        btnCompleted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedActionPerformed(evt);
            }
        });

        btnAddDonor.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnAddDonor.setText("ADD A DONOR");
        btnAddDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDonorActionPerformed(evt);
            }
        });

        btnViewD.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnViewD.setText("VIEW ALL DONORS");
        btnViewD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("D E L E T E   F U N D R A I S E R   B Y   E N T E R I N G   T H E I R   C O R R E C T   N A M E ");

        txtDisplayFr.setColumns(20);
        txtDisplayFr.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        txtDisplayFr.setRows(5);
        jScrollPane1.setViewportView(txtDisplayFr);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("ENTER FUNDRAISER NAME:");

        txtNameToDel.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        btndeleteFr.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        btndeleteFr.setText("D E L E T E");
        btndeleteFr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteFrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(233, 233, 233)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCompleted)
                                    .addComponent(btnAddDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewD, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewF, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddFR, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(303, 303, 303)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(626, 626, 626)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(txtNameToDel, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(365, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btndeleteFr, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(773, 773, 773))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewF, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnAddFR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnAddDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnViewD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(txtNameToDel))
                .addGap(48, 48, 48)
                .addComponent(btndeleteFr, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        Home h=new Home(fm);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnViewFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFActionPerformed
        // TODO add your handling code here:
        AdminList aList=new AdminList(fm);
        aList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewFActionPerformed

    private void btnAddFRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFRActionPerformed
        // TODO add your handling code here:
        AdminAddFr addFr=new AdminAddFr(fm);
        addFr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddFRActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        AdminDelete del=new AdminDelete(fm);
        del.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpiredActionPerformed
        // TODO add your handling code here:
        AdminExpired adminExp=new AdminExpired(fm);
        adminExp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExpiredActionPerformed

    private void btnCompletedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedActionPerformed
        // TODO add your handling code here:
        AdminComplete complete=new AdminComplete(fm);
        complete.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCompletedActionPerformed

    private void btnAddDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDonorActionPerformed
        // TODO add your handling code here:
        AdminAddDonor addDonor=new AdminAddDonor(fm);
        addDonor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddDonorActionPerformed

    private void btnViewDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDActionPerformed
        // TODO add your handling code here:
        AdminViewDonor viewDonor=new AdminViewDonor(fm);
        viewDonor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewDActionPerformed

    private void btndeleteFrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteFrActionPerformed
        // TODO add your handling code here:
        String result;
        if (txtNameToDel.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NAME FIELD IS EMPTY");
        }
        else{
            result=fm.deleteFundraiserByName(txtNameToDel.getText());
            JOptionPane.showMessageDialog(this, result);
        }
        display();
    }//GEN-LAST:event_btndeleteFrActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDelete(fm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDonor;
    private javax.swing.JButton btnAddFR;
    private javax.swing.JButton btnCompleted;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExpired;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnViewD;
    private javax.swing.JButton btnViewF;
    private javax.swing.JButton btndeleteFr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDisplayFr;
    private javax.swing.JTextField txtNameToDel;
    // End of variables declaration//GEN-END:variables
}
