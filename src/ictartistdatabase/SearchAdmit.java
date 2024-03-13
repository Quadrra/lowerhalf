/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ictartistdatabase;

/**
 *
 * @author Renren
 */
public class SearchAdmit extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SearchAdmit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admit = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Admit.setForeground(new java.awt.Color(51, 102, 255));
        Admit.setText("Admit an Artist!");
        Admit.setActionCommand("Search");
        Admit.setBorder(null);
        Admit.setBorderPainted(false);
        Admit.setContentAreaFilled(false);
        Admit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmitActionPerformed(evt);
            }
        });
        getContentPane().add(Admit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 280, 60));

        Search.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Search.setForeground(new java.awt.Color(51, 102, 255));
        Search.setText("Find an Artist");
        Search.setActionCommand("Search");
        Search.setBorder(null);
        Search.setBorderPainted(false);
        Search.setContentAreaFilled(false);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 280, 60));

        LogOut.setForeground(new java.awt.Color(153, 153, 0));
        LogOut.setText("Log Out");
        LogOut.setActionCommand("Search");
        LogOut.setBorder(null);
        LogOut.setBorderPainted(false);
        LogOut.setContentAreaFilled(false);
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });
        getContentPane().add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ictartistdatabase/dlsud smol logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lh1/project/IMG/HOMEPAGE.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        dispose();
        new ArtistBrowser().setVisible(true);
    }//GEN-LAST:event_SearchActionPerformed

    private void AdmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmitActionPerformed
        // TODO add your handling code here:
        dispose();
        new Request().setVisible(true);
    }//GEN-LAST:event_AdmitActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        dispose();
        new LogIn().setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

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
            java.util.logging.Logger.getLogger(SearchAdmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAdmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAdmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAdmit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchAdmit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admit;
    private javax.swing.JLabel BG;
    private javax.swing.JButton LogOut;
    private javax.swing.JButton Search;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
