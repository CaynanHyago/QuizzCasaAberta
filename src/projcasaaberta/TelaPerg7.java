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
public class TelaPerg7 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public TelaPerg7() {
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
        RadioButtonE2 = new javax.swing.JRadioButton();
        RadioButtonE3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 279));

        lblPerg.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblPerg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerg.setText("Quais são as consequências mais diretas");

        RadioButtonC.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonC.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonC.setText("Enchentes e doenças.");
        RadioButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonCActionPerformed(evt);
            }
        });

        RadioButtonE.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonE.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonE.setText("Chuvas ácidas e o buraco na camada de ozônio");
        RadioButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEActionPerformed(evt);
            }
        });

        RadioButtonE1.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonE1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonE1.setText("Extinção de algumas espécies de animais, plantas e bactérias");
        RadioButtonE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonE1ActionPerformed(evt);
            }
        });

        RadioButtonE2.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonE2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonE2.setText("Esgotamento dos reservatórios de água no planeta e estiagem");
        RadioButtonE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonE2ActionPerformed(evt);
            }
        });

        RadioButtonE3.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonE3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonE3.setText("Não há consequências");
        RadioButtonE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonE3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("do despejo inadequado do lixo?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioButtonE)
                    .addComponent(RadioButtonE2)
                    .addComponent(RadioButtonC)
                    .addComponent(RadioButtonE3)
                    .addComponent(RadioButtonE1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPerg, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblPerg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(RadioButtonC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonE2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonE1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonE3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonCActionPerformed
       if(RadioButtonC.isSelected()==true){
       JOptionPane.showMessageDialog(null, "Parabens, você acertou!");

        new TelaPerg8().setVisible(true);
        this.dispose();
       }
     
    }//GEN-LAST:event_RadioButtonCActionPerformed

    private void RadioButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEActionPerformed
        if(RadioButtonE.isSelected()==true){
        JOptionPane.showMessageDialog(null, "Você errou :(");

        new TelaPerg8().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_RadioButtonEActionPerformed

    private void RadioButtonE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonE1ActionPerformed
           if(RadioButtonE1.isSelected()==true){
        JOptionPane.showMessageDialog(null, "Você errou :(");

        new TelaPerg8().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_RadioButtonE1ActionPerformed

    private void RadioButtonE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonE2ActionPerformed
           if(RadioButtonE2.isSelected()==true){
        JOptionPane.showMessageDialog(null, "Você errou :(");

        new TelaPerg8().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_RadioButtonE2ActionPerformed

    private void RadioButtonE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonE3ActionPerformed
           if(RadioButtonE3.isSelected()==true){
        JOptionPane.showMessageDialog(null, "Você errou :(");

        new TelaPerg8().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_RadioButtonE3ActionPerformed

   

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
            java.util.logging.Logger.getLogger(TelaPerg7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerg7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerg7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerg7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaPerg7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonC;
    private javax.swing.JRadioButton RadioButtonE;
    private javax.swing.JRadioButton RadioButtonE1;
    private javax.swing.JRadioButton RadioButtonE2;
    private javax.swing.JRadioButton RadioButtonE3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPerg;
    // End of variables declaration//GEN-END:variables
}
