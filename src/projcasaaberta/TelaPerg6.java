/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projcasaaberta;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class TelaPerg6 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public TelaPerg6() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPerg = new javax.swing.JLabel();
        RadioButtonC = new javax.swing.JRadioButton();
        RadioButtonE = new javax.swing.JRadioButton();
        RadioButtonE1 = new javax.swing.JRadioButton();
        lblPerg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 279));

        lblPerg.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblPerg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerg.setText("Entre as opções, qual delas ");

        RadioButtonC.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonC.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonC.setText(" Computador");
        RadioButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonCActionPerformed(evt);
            }
        });

        RadioButtonE.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonE.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonE.setText("Garrafa Pet");
        RadioButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEActionPerformed(evt);
            }
        });

        RadioButtonE1.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonE1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonE1.setText("Papel");
        RadioButtonE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonE1ActionPerformed(evt);
            }
        });

        lblPerg1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblPerg1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerg1.setText("é um lixo eletrônico?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(RadioButtonE)
                        .addGap(59, 59, 59)
                        .addComponent(RadioButtonE1)
                        .addGap(67, 67, 67)
                        .addComponent(RadioButtonC)
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addComponent(lblPerg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPerg1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblPerg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPerg1)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButtonE1)
                    .addComponent(RadioButtonE)
                    .addComponent(RadioButtonC))
                .addGap(0, 58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonCActionPerformed
        if(RadioButtonC.isSelected()==true){
        JOptionPane.showMessageDialog(null, "Parabens, você acertou!");

        new TelaPerg7().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_RadioButtonCActionPerformed

    private void RadioButtonE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonE1ActionPerformed
         if(RadioButtonE1.isSelected()==true){
              JOptionPane.showMessageDialog(null, "Você errou :(");

        new TelaPerg7().setVisible(true);
        this.dispose();
         }
    }//GEN-LAST:event_RadioButtonE1ActionPerformed

    private void RadioButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEActionPerformed
       if(RadioButtonE.isSelected()==true){
        JOptionPane.showMessageDialog(null, "Você errou :(");

        new TelaPerg7().setVisible(true);
        this.dispose();
       }
    }//GEN-LAST:event_RadioButtonEActionPerformed

   

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
            java.util.logging.Logger.getLogger(TelaPerg6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerg6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerg6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerg6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerg6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonC;
    private javax.swing.JRadioButton RadioButtonE;
    private javax.swing.JRadioButton RadioButtonE1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPerg;
    private javax.swing.JLabel lblPerg1;
    // End of variables declaration//GEN-END:variables
}
