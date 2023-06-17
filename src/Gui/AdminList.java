package Gui;
import finalproject.FundraiserManager;
public class AdminList extends javax.swing.JFrame {
    static FundraiserManager fm=new FundraiserManager();
    public AdminList(FundraiserManager fm) {
        initComponents();
        this.fm=fm;
        setExtendedState(this.MAXIMIZED_BOTH);
        String txt=fm.viewFundRaisers();
        txtDisplay.setText(txt);
        txtDisplay.setEditable(false);
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
        txtDisplay = new javax.swing.JTextArea();
        btnViewF = new javax.swing.JButton();
        btnAddFR = new javax.swing.JButton();
        btnExpired = new javax.swing.JButton();
        btnCompleted = new javax.swing.JButton();
        btnAddDonor = new javax.swing.JButton();
        btnViewD = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("DISPLAING LIST OF ALL AVAILABLE FUNDRAISING COMPAIGNS");

        txtDisplay.setColumns(20);
        txtDisplay.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        txtDisplay.setRows(5);
        jScrollPane1.setViewportView(txtDisplay);

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

        btnHome.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnDelete.setText("DELETE  FUNDRAISER");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewF, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddFR, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompleted)
                    .addComponent(btnAddDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewD, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(285, 285, 285)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(580, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(406, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
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
                        .addComponent(btnViewD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        Home h=new Home(fm);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        AdminDelete del=new AdminDelete(fm);
        del.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(AdminList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminList(fm).setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtDisplay;
    // End of variables declaration//GEN-END:variables
}
