/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projcasaaberta;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelaPerg1 extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame1
     */
    public TelaPerg1() {
        initComponents();
        this.setTitle("Casa Aberta 2018");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPerg = new javax.swing.JLabel();
        rdbC1 = new javax.swing.JRadioButton();
        rdbEE = new javax.swing.JRadioButton();
        rdbE12 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 279));

        lblPerg.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblPerg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerg.setText("O que é lixo eletrônico?");

        rdbC1.setBackground(new java.awt.Color(153, 255, 153));
        rdbC1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        rdbC1.setText("É todo resíduo material produzido pelo descarte de equipamentos eletrônicos.");
        rdbC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbC1ActionPerformed(evt);
            }
        });

        rdbEE.setBackground(new java.awt.Color(153, 255, 153));
        rdbEE.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        rdbEE.setText("Resíduos mecânicos.");
        rdbEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbEEActionPerformed(evt);
            }
        });

        rdbE12.setBackground(new java.awt.Color(153, 255, 153));
        rdbE12.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        rdbE12.setText("Resíduos químicos.");
        rdbE12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbE12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbE12)
                    .addComponent(rdbEE)
                    .addComponent(rdbC1))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(lblPerg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblPerg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(rdbC1)
                .addGap(28, 28, 28)
                .addComponent(rdbEE)
                .addGap(27, 27, 27)
                .addComponent(rdbE12)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbEEActionPerformed
        if(rdbEE.isSelected()==true){
            JOptionPane.showMessageDialog(null, "Você errou :(");

            new TelaPerg2().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_rdbEEActionPerformed

    private void rdbC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbC1ActionPerformed
        if(rdbC1.isSelected()==true){
            JOptionPane.showMessageDialog(null, "Você acertou,Parabens");

            new TelaPerg2().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_rdbC1ActionPerformed

    private void rdbE12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbE12ActionPerformed
         if(rdbE12.isSelected()==true){
            JOptionPane.showMessageDialog(null, "Você errou :(");

            new TelaPerg2().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_rdbE12ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerg1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerg2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPerg;
    private javax.swing.JRadioButton rdbC1;
    private javax.swing.JRadioButton rdbE12;
    private javax.swing.JRadioButton rdbEE;
    // End of variables declaration//GEN-END:variables
}
