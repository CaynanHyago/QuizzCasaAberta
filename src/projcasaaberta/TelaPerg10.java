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
public class TelaPerg10 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public TelaPerg10() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblPerg = new javax.swing.JLabel();
        rdbOpcE1 = new javax.swing.JRadioButton();
        rdbOpcC = new javax.swing.JRadioButton();
        rdbOpcE = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(520, 279));

        lblPerg.setBackground(new java.awt.Color(153, 255, 153));
        lblPerg.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        lblPerg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerg.setText("Não é fonte de energia renovável:");

        rdbOpcE1.setBackground(new java.awt.Color(153, 255, 153));
        rdbOpcE1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        rdbOpcE1.setText("Energia solar passiva");
        rdbOpcE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOpcE1ActionPerformed(evt);
            }
        });

        rdbOpcC.setBackground(new java.awt.Color(153, 255, 153));
        rdbOpcC.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        rdbOpcC.setText("Energia nuclear");
        rdbOpcC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOpcCActionPerformed(evt);
            }
        });

        rdbOpcE.setBackground(new java.awt.Color(153, 255, 153));
        rdbOpcE.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        rdbOpcE.setText("Energia Geotérmica");
        rdbOpcE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbOpcEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPerg, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbOpcC)
                    .addComponent(rdbOpcE)
                    .addComponent(rdbOpcE1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblPerg)
                .addGap(41, 41, 41)
                .addComponent(rdbOpcE1)
                .addGap(31, 31, 31)
                .addComponent(rdbOpcC)
                .addGap(30, 30, 30)
                .addComponent(rdbOpcE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbOpcCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOpcCActionPerformed
         if(rdbOpcC.isSelected()==true){
            JOptionPane.showMessageDialog(null, "Parabens,você acertou");

            new TelaLogin().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_rdbOpcCActionPerformed

    private void rdbOpcE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOpcE1ActionPerformed
         if(rdbOpcE1.isSelected()==true){
            JOptionPane.showMessageDialog(null, "Você errou :(");

            new TelaLogin().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_rdbOpcE1ActionPerformed

    private void rdbOpcEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbOpcEActionPerformed
        if(rdbOpcE.isSelected()==true){
            JOptionPane.showMessageDialog(null, "Você errou :(");

            new TelaLogin().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_rdbOpcEActionPerformed

   

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
            java.util.logging.Logger.getLogger(TelaPerg10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerg10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerg10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerg10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPerg;
    private javax.swing.JRadioButton rdbOpcC;
    private javax.swing.JRadioButton rdbOpcE;
    private javax.swing.JRadioButton rdbOpcE1;
    // End of variables declaration//GEN-END:variables
}
