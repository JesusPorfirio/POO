/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pedido;
import fatec.poo.model.Produto;
import fatec.poo.model.Vendedor;
import fatec.poo.model.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenu
     */
    public GuiMenu() {
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

        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemVendedores = new javax.swing.JMenuItem();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuPedido = new javax.swing.JMenu();
        jMenuItemEmitirPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Vendas");

        jMenuCadastros.setText("Cadastros");

        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemClientes);

        jMenuItemVendedores.setText("Vendedores");
        jMenuItemVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendedoresActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemVendedores);

        jMenuItemProdutos.setText("Produtos");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemProdutos);
        jMenuCadastros.add(jSeparator1);

        jMenuItemSair.setText("Sair");
        jMenuCadastros.add(jMenuItemSair);

        jMenuBarPrincipal.add(jMenuCadastros);

        jMenuPedido.setText("Pedido");

        jMenuItemEmitirPedido.setText("Emitir Pedido");
        jMenuItemEmitirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmitirPedidoActionPerformed(evt);
            }
        });
        jMenuPedido.add(jMenuItemEmitirPedido);

        jMenuBarPrincipal.add(jMenuPedido);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClientesActionPerformed
        new GuiCliente(cadCliVend, cadCliente).setVisible(true);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        new GuiProduto(cadProd).setVisible(true);
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuItemVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendedoresActionPerformed
        new GuiVendedor(cadCliVend).setVisible(true);
    }//GEN-LAST:event_jMenuItemVendedoresActionPerformed

    private void jMenuItemEmitirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmitirPedidoActionPerformed
        new GuiEmitir(cadEmitir, cadCliVend).setVisible(true);
    }//GEN-LAST:event_jMenuItemEmitirPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemEmitirPedido;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemVendedores;
    private javax.swing.JMenu jMenuPedido;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Cliente> cadCliente = new ArrayList<Cliente>();
    private ArrayList<Produto> cadProd = new ArrayList <Produto>();
    private ArrayList<Vendedor> cadVendedores = new ArrayList<Vendedor>();
    private ArrayList<Pessoa> cadCliVend = new ArrayList<Pessoa>();
    private ArrayList<Pedido> cadEmitir = new ArrayList<Pedido>();
}
