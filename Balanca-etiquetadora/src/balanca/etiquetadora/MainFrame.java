/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balanca.etiquetadora;

import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author paola
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFPreco = new javax.swing.JTextField();
        jTFPeso = new javax.swing.JTextField();
        jBGerar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTFCodProd = new javax.swing.JTextField();
        jLResult = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();
        jTFValor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Preço por kg (R$):");

        jLabel2.setText("Peso:");

        jTFPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFPrecoKeyPressed(evt);
            }
        });

        jTFPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFPesoKeyPressed(evt);
            }
        });

        jBGerar.setText("Gerar etiqueta");
        jBGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGerarActionPerformed(evt);
            }
        });

        jLabel3.setText("Cód. Produto:");

        jTFCodProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFCodProdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTFCodProdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFCodProdKeyTyped(evt);
            }
        });

        jLValor.setText("Valor (R$):");

        jTFValor.setEditable(false);
        jTFValor.setEnabled(false);
        jTFValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBGerar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFPreco)
                            .addComponent(jTFPeso)
                            .addComponent(jTFCodProd, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jTFValor))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFCodProd, jTFPeso, jTFPreco, jTFValor});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLResult, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jBGerar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGerarActionPerformed
        // TODO add your handling code here:
        double peso = 0;
        double precoQuilo = 0;
        double valor = 0;
        int verificador;
        String codProd;
        String codBarra;
        jLResult.setForeground(Color.black);
        try{
            peso = Double.valueOf(jTFPeso.getText());
            precoQuilo = Double.valueOf(jTFPreco.getText());
            codProd = String.format("%05d", Integer.valueOf(jTFCodProd.getText()));
            valor = peso*precoQuilo;
            System.out.println("Valor sem arredondar: " + String.valueOf(valor));
            valor = Calculador.arredonda(valor,2);            
            codBarra = "2" + codProd + "0" + Calculador.calculaValorInteiroCodigo(valor);
            verificador = Calculador.calculaVerificador(codBarra);
            codBarra += Integer.toString(verificador);            
                       
            jTFValor.setText(String.format("%.2f",valor).replace(',', '.'));
            jLResult.setText(codBarra);
        }catch(Exception e){
            jLResult.setForeground(Color.red);
            jLResult.setText("ERRO: " + e.getMessage());
            
        }
        
    }//GEN-LAST:event_jBGerarActionPerformed

    private void jTFValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFValorActionPerformed

    private void jTFCodProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodProdKeyPressed
        // TODO add your handling code here:
        trataEventoTextField(evt,jTFCodProd,jTFPreco);
        jTFCodProd.setText(jTFCodProd.getText().replace(".",""));
    }//GEN-LAST:event_jTFCodProdKeyPressed

    private void jTFPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPrecoKeyPressed
        // TODO add your handling code here:
        trataEventoTextField(evt,jTFPreco,jTFPeso);
    }//GEN-LAST:event_jTFPrecoKeyPressed

    private void jTFPesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFPesoKeyPressed
        // TODO add your handling code here:
        trataEventoTextField(evt,jTFPeso,jBGerar);
    }//GEN-LAST:event_jTFPesoKeyPressed

    private void jTFCodProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodProdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodProdKeyReleased

    private void jTFCodProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFCodProdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCodProdKeyTyped

    public void trataEventoTextField(java.awt.event.KeyEvent evt, JTextField campoAtual,javax.swing.JComponent componentProx){
        int evtcod = evt.getKeyCode();
        if(evtcod == KeyEvent.VK_ENTER) {
            String txt = campoAtual.getText();
            txt = txt.replace(',','.');
            txt = txt.replaceAll("[^0-9.]+", "");
            campoAtual.setText(txt);
            componentProx.grabFocus();
        }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGerar;
    private javax.swing.JLabel jLResult;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCodProd;
    private javax.swing.JTextField jTFPeso;
    private javax.swing.JTextField jTFPreco;
    private javax.swing.JTextField jTFValor;
    // End of variables declaration//GEN-END:variables
}
