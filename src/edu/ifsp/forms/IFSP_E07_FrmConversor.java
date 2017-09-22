/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsp;

import javax.swing.JOptionPane;

/**
 *
 * @author igorzadi
 */
public class IFSP_E07_FrmConversor extends javax.swing.JFrame {

    /**
     * Creates new form FrmConversor
     */
    public IFSP_E07_FrmConversor() {
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

        grupoMoedas = new javax.swing.ButtonGroup();
        lblConversor = new javax.swing.JLabel();
        txtReais = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        rdbDolar = new javax.swing.JRadioButton();
        rdbEuro = new javax.swing.JRadioButton();
        rdbLibra = new javax.swing.JRadioButton();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblConversor.setText("Conversor de Moedas");

        lblValor.setText("Digite o valor em reais");

        grupoMoedas.add(rdbDolar);
        rdbDolar.setText("Dólar");
        rdbDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbDolarActionPerformed(evt);
            }
        });

        grupoMoedas.add(rdbEuro);
        rdbEuro.setText("Euro");

        grupoMoedas.add(rdbLibra);
        rdbLibra.setText("Libra");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblValor)
                            .addComponent(txtReais, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdbEuro))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblConversor)
                        .addGap(128, 128, 128))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(rdbDolar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdbLibra)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConversor)
                .addGap(18, 18, 18)
                .addComponent(lblValor)
                .addGap(5, 5, 5)
                .addComponent(txtReais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbDolar)
                    .addComponent(rdbEuro)
                    .addComponent(rdbLibra))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnLimpar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbDolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbDolarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        //limpar campo de texto
        txtReais.setText("");
        
        //desmarcar radiobutton
        grupoMoedas.clearSelection();
        
        //foco para o campo de texto
        txtReais.requestFocus();
        
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        double reais = 0, convertido = 0;
        
        //receber o valor em reais
        reais = Double.parseDouble(txtReais.getText().replace(",", "."));
        
        //verificar moedas
        if(rdbDolar.isSelected()){
            convertido = reais / 3.13;
        }
        
        if(rdbEuro.isSelected()){
            convertido = reais / 3.38;
        }
        
        if(rdbLibra.isSelected()){
            convertido = reais / 3.85;
        }
        
        JOptionPane.showMessageDialog(this, "Valor: " + convertido);
        
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(IFSP_E07_FrmConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IFSP_E07_FrmConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IFSP_E07_FrmConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IFSP_E07_FrmConversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IFSP_E07_FrmConversor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.ButtonGroup grupoMoedas;
    private javax.swing.JLabel lblConversor;
    private javax.swing.JLabel lblValor;
    private javax.swing.JRadioButton rdbDolar;
    private javax.swing.JRadioButton rdbEuro;
    private javax.swing.JRadioButton rdbLibra;
    private javax.swing.JTextField txtReais;
    // End of variables declaration//GEN-END:variables
}