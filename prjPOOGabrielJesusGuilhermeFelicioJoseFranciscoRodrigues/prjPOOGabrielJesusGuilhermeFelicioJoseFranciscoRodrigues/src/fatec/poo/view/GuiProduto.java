/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gfeli
 */
public class GuiProduto extends javax.swing.JFrame {

    /**
     * Creates new form GuiProduto
     */
    public GuiProduto(ArrayList<Produto> cadProd) {
        initComponents();
        cadastro = cadProd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblQtdeDisp = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblEstoqueMin = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQtdeDisp = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        txtEstoqueMin = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblUniMed = new javax.swing.JLabel();
        txtUniMed = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodigo.setText("Código");

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDescricao.setText("Descrição");

        lblQtdeDisp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQtdeDisp.setText("Qtde.Disponível");

        lblPreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPreco.setText("Preço Unitário");

        lblEstoqueMin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEstoqueMin.setText("Estoque Mínimo");

        txtDescricao.setEnabled(false);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        txtQtdeDisp.setEnabled(false);
        txtQtdeDisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdeDispActionPerformed(evt);
            }
        });

        txtPreco.setEnabled(false);
        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        txtEstoqueMin.setToolTipText("");
        txtEstoqueMin.setEnabled(false);
        txtEstoqueMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstoqueMinActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Consultar.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Inserir.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.setMaximumSize(new java.awt.Dimension(99, 25));
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Remover.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblUniMed.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUniMed.setText("Unidade de medida:");

        txtUniMed.setEnabled(false);
        txtUniMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescricao))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodigo)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(lblUniMed)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtUniMed))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblQtdeDisp)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtQtdeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblPreco)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblEstoqueMin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPreco)
                    .addComponent(lblEstoqueMin)
                    .addComponent(lblQtdeDisp)
                    .addComponent(txtQtdeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniMed)
                    .addComponent(txtUniMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtdeDispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdeDispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdeDispActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void txtEstoqueMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstoqueMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstoqueMinActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int codigo;
        Boolean eInteiro = true;
        try{                                                   //tratamento de erro para número inteiro (se der erro na conversão nao é inteiro) 
            codigo = Integer.parseInt(txtCodigo.getText());                
        }catch(NumberFormatException erroConversaoInt){   
            JOptionPane.showMessageDialog(null, "Insira apenas valores inteiros", "aviso", JOptionPane.ERROR_MESSAGE);
            txtCodigo.requestFocus();
            eInteiro = false;
        }
        
        if(eInteiro == true){// se o trataemento de erros deu certo o número é inteiro, então...
            int x;
            for(x=0; x<cadastro.size();x++){
                if(cadastro.get(x).getCodigo().equals(txtCodigo.getText())){
                    break;
                }
            }
        
        if(x < cadastro.size()){
            posProd = x;//achou
        }else{
            posProd = -1;// não achou
        }    

        if(posProd >=0){
            txtCodigo.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtDescricao.setText(cadastro.get(posProd).getDescricao());
            txtQtdeDisp.setEnabled(true);
            txtQtdeDisp.setText(String.valueOf(cadastro.get(posProd).getQtdeEstoque()));
            txtPreco.setEnabled(true);
            txtPreco.setText(String.valueOf(cadastro.get(posProd).getPreco()));
            txtEstoqueMin.setEnabled(true);
            txtEstoqueMin.setText(String.valueOf(cadastro.get(posProd).getEstoqueMinimo()));
            txtUniMed.setEnabled(true);
            txtUniMed.setText(cadastro.get(posProd).getUnidadeMedida());
            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
            txtDescricao.requestFocus();
            
        }else{
            txtCodigo.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtQtdeDisp.setEnabled(true);
            txtPreco.setEnabled(true);
            txtEstoqueMin.setEnabled(true);
            txtUniMed.setEnabled(true);
            btnConsultar.setEnabled(false);
            btnIncluir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
            txtDescricao.requestFocus();
        }
    }
      
            
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtUniMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniMedActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Produto produto = new Produto(txtCodigo.getText(), txtDescricao.getText());
        produto.setQtdeEstoque(Double.parseDouble(txtQtdeDisp.getText()));
        produto.setPreco(Double.parseDouble(txtPreco.getText()));
        produto.setEstoqueMinimo(Double.parseDouble(txtEstoqueMin.getText()));
        produto.setUnidadeMedida(txtUniMed.getText());
        cadastro.add(produto);
        
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtPreco.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtUniMed.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtQtdeDisp.setText(null);
        txtPreco.setText(null);
        txtEstoqueMin.setText(null);
        txtUniMed.setText(null);
        txtCodigo.requestFocus();
            
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        cadastro.get(posProd).setDescricao(txtDescricao.getText());
        cadastro.get(posProd).setQtdeEstoque(Double.parseDouble(txtQtdeDisp.getText()));
        cadastro.get(posProd).setPreco(Double.parseDouble(txtPreco.getText()));
        cadastro.get(posProd).setEstoqueMinimo(Double.parseDouble(txtEstoqueMin.getText()));
        cadastro.get(posProd).setUnidadeMedida(txtUniMed.getText());
        
           
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtPreco.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtUniMed.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCodigo.requestFocus();
        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtQtdeDisp.setText(null);
        txtPreco.setText(null);
        txtUniMed.setText(null);
        txtEstoqueMin.setText(null);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
         if (posProd >= 0){
            cadastro.remove(posProd);
            posProd = -1;
        }
         
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtPreco.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtUniMed.setEnabled(false);
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        txtCodigo.requestFocus();
        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtQtdeDisp.setText(null);
        txtPreco.setText(null);
        txtUniMed.setText(null);
        txtEstoqueMin.setText(null);
    }//GEN-LAST:event_btnExcluirActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoqueMin;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQtdeDisp;
    private javax.swing.JLabel lblUniMed;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtdeDisp;
    private javax.swing.JTextField txtUniMed;
    // End of variables declaration//GEN-END:variables
    ArrayList<Produto> cadastro = new ArrayList<Produto>();
    int posProd;
}
