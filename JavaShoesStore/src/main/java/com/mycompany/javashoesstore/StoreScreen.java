/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.javashoesstore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author itaxxi
 */
public class StoreScreen extends javax.swing.JFrame {

    HashMap<String, String> shoesMap = new HashMap<String, String>();

    /**
     * Creates new form StoreScreen
     */
    public StoreScreen() {
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

        txtMarca = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        txtCor = new javax.swing.JLabel();
        tfCor = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        txtProcurar = new javax.swing.JLabel();
        tfSearchCode = new javax.swing.JTextField();
        btnSearchCode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtMarca.setText("Marca: ");

        txtModelo.setText("Modelo: ");

        txtCor.setText("Cor: ");

        txtCodigo.setText("Código: ");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        txtProcurar.setText("Informe o código");

        btnSearchCode.setText("Procurar");
        btnSearchCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtCor)
                            .addComponent(txtModelo)
                            .addComponent(txtMarca)
                            .addComponent(tfMarca)
                            .addComponent(tfModelo)
                            .addComponent(tfCor)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProcurar)
                            .addComponent(tfSearchCode, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchCode))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarca)
                    .addComponent(txtProcurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearchCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo)
                    .addComponent(btnSearchCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        JavaShoesStore shoeStore = new JavaShoesStore();
        JavaShoes shoe = new JavaShoes("", "", "", "");

        shoe.setMarca(tfMarca.getText());
        shoe.setModelo(tfModelo.getText());
        shoe.setCor(tfCor.getText());
        shoe.setCodigo(tfCodigo.getText());

        String txtShoe = shoe.getMarca() + " " + shoe.getModelo() + " " + shoe.getCor();

        shoeStore.addShoes(shoe);
        shoeStore.addHash(shoe.getCodigo());
        shoesMap.put(shoe.getCodigo(), txtShoe);

        tfMarca.setText("");
        tfModelo.setText("");
        tfCor.setText("");
        tfCodigo.setText("");

        JFrame sucessMsg = new JFrame();
        JOptionPane.showMessageDialog(sucessMsg, "Tênis cadastrado com sucesso!!");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSearchCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCodeActionPerformed
        // TODO add your handling code here:
        JavaShoesStore shoeStore = new JavaShoesStore();
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame,("" + shoesMap.get(tfSearchCode.getText())));
        tfSearchCode.setText("");
    }//GEN-LAST:event_btnSearchCodeActionPerformed

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
            java.util.logging.Logger.getLogger(StoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreScreen().setVisible(true);
            }
        }); 
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSearchCode;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCor;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfSearchCode;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtCor;
    private javax.swing.JLabel txtMarca;
    private javax.swing.JLabel txtModelo;
    private javax.swing.JLabel txtProcurar;
    // End of variables declaration//GEN-END:variables
}
