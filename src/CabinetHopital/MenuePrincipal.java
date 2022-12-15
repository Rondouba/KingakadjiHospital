package CabinetHopital;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author RMR
 */
public class MenuePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuePrincipal
     */
    public MenuePrincipal() {
        initComponents();
        DateHeure();
    }

   public void DateHeure(){
       Thread tr=new Thread(){
           public void run(){
               for (;;) {
                   try {
                       Calendar cal=new GregorianCalendar();
                       //date
                       int annee=cal.get(Calendar.YEAR);
                       int mois=cal.get(Calendar.MONTH);
                       int jour=cal.get(Calendar.DAY_OF_MONTH);
                       
                       //Heure
                       int heure=cal.get(Calendar.HOUR_OF_DAY);
                       int minute=cal.get(Calendar.MINUTE);
                       int seconde=cal.get(Calendar.SECOND);
                       
                       txtdate.setText(jour+"/"+mois+"/"+annee+"");
                       txtheure.setText(seconde+":"+minute+":"+heure+"");
                       sleep(1000);
                  } catch (Exception e) {
                      e.printStackTrace();
                   }
               }
           }
       };
        tr.start();
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        txtheure = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        patientBouton = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        rendezVousBouton = new javax.swing.JButton();
        TraitementBouton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 255, 102), null));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Base de données\\accueil.jpg")); // NOI18N

        txtdate.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        txtdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabinetHopital/date.png"))); // NOI18N
        txtdate.setText("DATE");

        txtheure.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        txtheure.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabinetHopital/heure.png"))); // NOI18N
        txtheure.setText("HEURE");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Base de données\\hopital-icone-du-patient_23-2147495490.jpg")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("AVEC TROIS ANS D'EXPÉRIENCE, LOKINGADJI EST LE MEILLEUR!!!");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        patientBouton.setBackground(new java.awt.Color(255, 255, 255));
        patientBouton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        patientBouton.setForeground(new java.awt.Color(0, 153, 204));
        patientBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabinetHopital/patient.jpg"))); // NOI18N
        patientBouton.setText("PATIENTS");
        patientBouton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientBoutonMouseClicked(evt);
            }
        });
        patientBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBoutonActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabinetHopital/EXIT.PNG"))); // NOI18N
        jButton8.setText("SE DECONNECTER");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        rendezVousBouton.setBackground(new java.awt.Color(255, 255, 255));
        rendezVousBouton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        rendezVousBouton.setForeground(new java.awt.Color(0, 153, 204));
        rendezVousBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabinetHopital/rendez-vous.jpg"))); // NOI18N
        rendezVousBouton.setText("RENDEZ-VOUS");
        rendezVousBouton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rendezVousBoutonMouseClicked(evt);
            }
        });
        rendezVousBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rendezVousBoutonActionPerformed(evt);
            }
        });

        TraitementBouton.setBackground(new java.awt.Color(255, 255, 255));
        TraitementBouton.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        TraitementBouton.setForeground(new java.awt.Color(0, 153, 204));
        TraitementBouton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabinetHopital/traitement.jpg"))); // NOI18N
        TraitementBouton.setText("TRAITEMENT");
        TraitementBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraitementBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rendezVousBouton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(patientBouton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TraitementBouton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(patientBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rendezVousBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(TraitementBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("HÔPITAL LOKINGAKADJI");

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("N’HÉSITER PAS À VENIR VOUS FAIRE SOIGNER !!! ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(txtheure, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtheure)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1060, 671));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        MenuePrincipal.super.dispose();
        int choix=JOptionPane.showConfirmDialog(this, "Etes-vous sûr de vouloir vous déconnecter?", "Confirmation",JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if(choix==0){
        Login log=new Login();
        log.setVisible(true);}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void patientBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBoutonActionPerformed
        MenuePrincipal.super.dispose();
        Patient log=new Patient();
        log.setVisible(true);
    }//GEN-LAST:event_patientBoutonActionPerformed

    private void rendezVousBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rendezVousBoutonActionPerformed
        MenuePrincipal.super.dispose();
        RendezVous log=new RendezVous();
        log.setVisible(true);
    }//GEN-LAST:event_rendezVousBoutonActionPerformed

    private void TraitementBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraitementBoutonActionPerformed
        MenuePrincipal.super.dispose();
        Traitement trait=new Traitement();
        trait.setVisible(true);
    }//GEN-LAST:event_TraitementBoutonActionPerformed

    private void patientBoutonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientBoutonMouseClicked
//        Patient log=new Patient();
//        log.setVisible(true);
//        patientBouton.setVisible(true);
//        rendezVousBouton.setVisible(false);
    }//GEN-LAST:event_patientBoutonMouseClicked

    private void rendezVousBoutonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rendezVousBoutonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rendezVousBoutonMouseClicked

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
            java.util.logging.Logger.getLogger(MenuePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuePrincipal().setVisible(true);
            }
        });*/
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TraitementBouton;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton patientBouton;
    private javax.swing.JButton rendezVousBouton;
    private javax.swing.JLabel txtdate;
    private javax.swing.JLabel txtheure;
    // End of variables declaration//GEN-END:variables
}
