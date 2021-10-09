
public class JFrameChessCalculator extends javax.swing.JFrame {

    
    public JFrameChessCalculator() {
        initComponents();
        initComponents1();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        description = new javax.swing.JLabel();
        raiting = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        W = new javax.swing.JLabel();
        jComboBoxScore = new javax.swing.JComboBox<>();
        Kval = new javax.swing.JLabel();
        jComboBoxKVal = new javax.swing.JComboBox<>();
        calc = new javax.swing.JToggleButton();
        jLabelChangeRating = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldRating = new javax.swing.JTextField();
        jTextFieldOponentRating = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chess Ratings Change Calculator");

        raiting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        raiting.setText("Rating");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Rc");

        W.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        W.setText("W");

        jComboBoxScore.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxScore.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "0.5", "1", "" }));
        jComboBoxScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxScoreActionPerformed(evt);
            }
        });

        Kval.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Kval.setText("Kval");

        jComboBoxKVal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxKVal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "40", "30", "20", "15", "10" }));

        calc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calc.setText("Calculate");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });

        jLabelChangeRating.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelChangeRating.setForeground(new java.awt.Color(0, 153, 102));
        jLabelChangeRating.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("Rating Change is:");

        jTextFieldRating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRatingActionPerformed(evt);
            }
        });

        jTextFieldOponentRating.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(W)
                                    .addComponent(Kval))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxKVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(raiting, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldOponentRating, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldRating, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabelChangeRating, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(calc, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelChangeRating, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raiting))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOponentRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxKVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kval))
                .addGap(42, 42, 42)
                .addComponent(calc)
                .addGap(18, 18, 18)
                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        double ra = Double.parseDouble(jTextFieldRating.getText());
        double rb = Double.parseDouble(jTextFieldOponentRating.getText());
        double k = Double.parseDouble((String) jComboBoxKVal.getSelectedItem());
        double score = Double.parseDouble((String) jComboBoxScore.getSelectedItem());
        double difference = rb - ra;
        if (difference > 400) {
            difference = 400;
        }
        if (difference < -400) {
            difference = -400;
        }
        double exp = (difference) / 400;
        double ea = 1 / (1 + (Math.pow(10, exp)));
        double scoreChange = Math.round((k * (score - ea))*100)/100.0;
        
        jLabelChangeRating.setText((""+ scoreChange));

    }//GEN-LAST:event_calcActionPerformed

    private void jComboBoxScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxScoreActionPerformed

    private void jTextFieldRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRatingActionPerformed
    private void initComponents1() {
        description.setText("<html>Help notes: <br>Rating - Rating of a player.  "
                + "<br>Rc - Opponent rating.  <br>W - Score.  "
                + "<br>K val - K is the development coefficient."
                + "<br>K = 40 for a player new to the rating list until he has completed events with at least 30 games  "
                + "<br>K = 20 as long as a player's rating remains under 2400.  "
                + "<br>K = 10 once a player's published rating has reached 2400 and remains at that level subsequently, even if the rating drops below 2400.  "
                + "<br>K = 40 for all players until their 18th birthday, as long as their rating remains under 2300.   "
                + "<br>K = 20 for RAPID and BLITZ ratings all players.</html>");

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
            java.util.logging.Logger.getLogger(JFrameChessCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameChessCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameChessCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameChessCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameChessCalculator().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kval;
    private javax.swing.JLabel W;
    private javax.swing.JToggleButton calc;
    private javax.swing.JLabel description;
    private javax.swing.JComboBox<String> jComboBoxKVal;
    private javax.swing.JComboBox<String> jComboBoxScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelChangeRating;
    private javax.swing.JTextField jTextFieldOponentRating;
    private javax.swing.JTextField jTextFieldRating;
    private javax.swing.JLabel raiting;
    // End of variables declaration//GEN-END:variables

}
