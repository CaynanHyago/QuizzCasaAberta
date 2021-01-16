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
public class TelaPerg5 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public TelaPerg5() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioButtonE1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        lblPerg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RadioButtonEE = new javax.swing.JRadioButton();
        RadioButtonE = new javax.swing.JRadioButton();
        RadioButtonCX = new javax.swing.JRadioButton();

        RadioButtonE1.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonE1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonE1.setText("Papel");
        RadioButtonE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonE1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 279));

        lblPerg.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblPerg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerg.setText("Para você, o descarte incorreto do");

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("problemas principalmente:");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("lixo eletrônico pode acarretar ");

        RadioButtonEE.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonEE.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonEE.setText("As fábricas");
        RadioButtonEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEEActionPerformed(evt);
            }
        });

        RadioButtonE.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonE.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonE.setText("Os transportes");
        RadioButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonEActionPerformed(evt);
            }
        });

        RadioButtonCX.setBackground(new java.awt.Color(153, 255, 153));
        RadioButtonCX.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        RadioButtonCX.setText("Ao meio ambiente / Saúde da população");
        RadioButtonCX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonCXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPerg, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RadioButtonCX)
                    .addComponent(RadioButtonEE)
                    .addComponent(RadioButtonE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblPerg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RadioButtonE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addComponent(RadioButtonEE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RadioButtonCX)
                .addGap(34, 34, 34))
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

    private void RadioButtonE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonE1ActionPerformed
        
    }//GEN-LAST:event_RadioButtonE1ActionPerformed

    private void RadioButtonEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEEActionPerformed
    if(RadioButtonEE.isSelected()==true){
            JOptionPane.showMessageDialog(null, "Você errou :(");

            new TelaPerg7().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_RadioButtonEEActionPerformed

    private void RadioButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonEActionPerformed
         if(RadioButtonE.isSelected()==true){
        JOptionPane.showMessageDialog(null, "Você errou :(");

        new TelaPerg6().setVisible(true);
        this.dispose();
         }
    }//GEN-LAST:event_RadioButtonEActionPerformed

    private void RadioButtonCXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonCXActionPerformed
        if(RadioButtonCX.isSelected()==true){
            JOptionPane.showMessageDialog(null, "Parabens, você acertou!");

            new TelaPerg6().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_RadioButtonCXActionPerformed

   

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
            java.util.logging.Logger.getLogger(TelaPerg5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerg5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerg5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerg5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaPerg6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButtonCX;
    private javax.swing.JRadioButton RadioButtonE;
    private javax.swing.JRadioButton RadioButtonE1;
    private javax.swing.JRadioButton RadioButtonEE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPerg;
    // End of variables declaration//GEN-END:variables
}
