package Gui;
import static Gui.UserSections.fm;
import finalproject.Donor;
import finalproject.FundraiserManager;
import finalproject.Donation;
public class UserViewList extends javax.swing.JFrame {
    static FundraiserManager fm=new FundraiserManager();
    static Donor donor;
    static Donation donation;
    public UserViewList(FundraiserManager fm, Donor donor,Donation donation)
    {
        initComponents();
        setExtendedState(this.MAXIMIZED_BOTH);
        this.fm=fm;
        this.donor=donor;
        this.donation=donation;
        String list=fm.viewFundRaisers();
        txtList.setEditable(false);
        txtList.setText(list);
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
        txtList = new javax.swing.JTextArea();
        btnuserList = new javax.swing.JButton();
        btnuserDonate = new javax.swing.JButton();
        btnUserExpired = new javax.swing.JButton();
        btnUserCom = new javax.swing.JButton();
        btnViewDonors = new javax.swing.JButton();
        btnYourDon = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("V I E W I N G   L I S T   O F   A L L   C O M P A I G N S");

        txtList.setColumns(20);
        txtList.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        txtList.setRows(5);
        txtList.setText("===>");
        jScrollPane1.setViewportView(txtList);

        btnuserList.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnuserList.setText("V I E W  L I S T  O F  A L L  F U N D R A I S E R S");
        btnuserList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserListActionPerformed(evt);
            }
        });

        btnuserDonate.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnuserDonate.setText("D O N A T E   T O  A V A I L A B L E  F U N D R A I S E R  ");
        btnuserDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserDonateActionPerformed(evt);
            }
        });

        btnUserExpired.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnUserExpired.setText("V I E W   E X P I R E D   C O M P A I G N S");
        btnUserExpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserExpiredActionPerformed(evt);
            }
        });

        btnUserCom.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnUserCom.setText("V I E W   C O M P L E T E D   C O M P A I G N S");
        btnUserCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserComActionPerformed(evt);
            }
        });

        btnViewDonors.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnViewDonors.setText("V I E W   O U R  D O N O R S");
        btnViewDonors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDonorsActionPerformed(evt);
            }
        });

        btnYourDon.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        btnYourDon.setText("V I E W  Y O U R  D O N A T I O N S");
        btnYourDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYourDonActionPerformed(evt);
            }
        });

        btnHome.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        btnHome.setText("H O M E");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(652, 652, 652)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnuserList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnuserDonate, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUserExpired, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUserCom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewDonors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnYourDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(257, 257, 257)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(btnHome)
                        .addGap(37, 37, 37)
                        .addComponent(btnuserList, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnuserDonate, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnUserExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnUserCom, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnViewDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnYourDon, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnuserListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserListActionPerformed
        // TODO add your handling code here:
        UserViewList list=new UserViewList(fm,donor,donation);
        list.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnuserListActionPerformed

    private void btnuserDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserDonateActionPerformed
        // TODO add your handling code here:
        UserDonate donate=new UserDonate(fm, donor, donation);
        donate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnuserDonateActionPerformed

    private void btnUserExpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserExpiredActionPerformed
        // TODO add your handling code here:
        UserViewExp exp=new UserViewExp(fm, donor, donation);
        exp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUserExpiredActionPerformed

    private void btnUserComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserComActionPerformed
        // TODO add your handling code here:
        UserViewComp com=new UserViewComp(fm, donor, donation);
        com.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUserComActionPerformed

    private void btnViewDonorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDonorsActionPerformed
        // TODO add your handling code here:
        UserViewDonor viewDonor=new UserViewDonor(fm, donor, donation);
        viewDonor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewDonorsActionPerformed

    private void btnYourDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYourDonActionPerformed
        // TODO add your handling code here:
        UserMyDonation myDonation=new UserMyDonation(fm, donor, donation);
        myDonation.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnYourDonActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        Home h=new Home(fm);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(UserViewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserViewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserViewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserViewList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserViewList(fm,donor,donation).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnUserCom;
    private javax.swing.JButton btnUserExpired;
    private javax.swing.JButton btnViewDonors;
    private javax.swing.JButton btnYourDon;
    private javax.swing.JButton btnuserDonate;
    private javax.swing.JButton btnuserList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtList;
    // End of variables declaration//GEN-END:variables
}
