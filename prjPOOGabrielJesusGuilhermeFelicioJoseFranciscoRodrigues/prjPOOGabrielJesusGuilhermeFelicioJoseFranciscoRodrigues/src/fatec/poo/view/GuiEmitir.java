package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pedido;
import fatec.poo.model.Pessoa;
import fatec.poo.model.Vendedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class GuiEmitir extends javax.swing.JFrame {

    /**
     * Creates new form GuiEmitirT
     */
    public GuiEmitir(ArrayList<Pedido> cadPedido, ArrayList<Pessoa> cadCliVend) {
        initComponents();
        cadPedido = cadPedido;
        cadCliVend = cadCliVend;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblNumPedido = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblFormaPagamento = new javax.swing.JLabel();
        txtNumPedido = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        cbxFormaPagamento = new javax.swing.JComboBox<>();
        btnConsultarPedido = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblCodProd = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JFormattedTextField();
        btnConsultaProd = new javax.swing.JButton();
        txtConsultaProd = new javax.swing.JTextField();
        lblQtdeVend = new javax.swing.JLabel();
        txtQtdeVendProd = new javax.swing.JTextField();
        btnAdicionarItem = new javax.swing.JButton();
        btnRemoverItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        lvlVlrPedido = new javax.swing.JLabel();
        lblQtdeItensPed = new javax.swing.JLabel();
        txtQtdeItensPed = new javax.swing.JTextField();
        txtVlrPedido = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblCpfCli = new javax.swing.JLabel();
        txtCpfCli = new javax.swing.JFormattedTextField();
        btnConsultaCli = new javax.swing.JButton();
        txtConsulCli = new javax.swing.JTextField();
        Jpanel = new javax.swing.JPanel();
        lblCpfVend = new javax.swing.JLabel();
        btnConsultaVend = new javax.swing.JButton();
        txtConsulVend = new javax.swing.JTextField();
        txtCpfVend = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        lblNumPedido.setText("Numero do Pedido");

        lblData.setText("Data do Pedido");

        lblFormaPagamento.setText("Forma de Pagamento");

        txtData.setEnabled(false);

        cbxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A vista", "A prazo", "Parcelado", " " }));
        cbxFormaPagamento.setEnabled(false);

        btnConsultarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Consultar.png"))); // NOI18N
        btnConsultarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblNumPedido)
                .addGap(18, 18, 18)
                .addComponent(txtNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFormaPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumPedido)
                    .addComponent(lblData)
                    .addComponent(lblFormaPagamento)
                    .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarPedido)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens Pedido"));

        lblCodProd.setText("Codigo do Produto");

        btnConsultaProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Consultar.png"))); // NOI18N
        btnConsultaProd.setEnabled(false);

        txtConsultaProd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtConsultaProd.setEnabled(false);

        lblQtdeVend.setText("Qtde Vendida");

        txtQtdeVendProd.setEnabled(false);

        btnAdicionarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Inserir.png"))); // NOI18N
        btnAdicionarItem.setText("Adicionar Item");
        btnAdicionarItem.setEnabled(false);

        btnRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Remover.png"))); // NOI18N
        btnRemoverItem.setText("Remover item");
        btnRemoverItem.setEnabled(false);

        tblProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Prec. Unit.", "Qtde. Vend.", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProduto);

        lvlVlrPedido.setText("Valor Total do Pedido");

        lblQtdeItensPed.setText("Quantidade de itens Pedido");

        txtQtdeItensPed.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtQtdeItensPed.setEnabled(false);

        txtVlrPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtVlrPedido.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblCodProd)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultaProd)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblQtdeVend)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtdeVendProd))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnAdicionarItem)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemoverItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lvlVlrPedido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtVlrPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lblQtdeItensPed)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQtdeItensPed, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblQtdeVend)
                        .addComponent(txtQtdeVendProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnConsultaProd)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodProd)
                            .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionarItem)
                    .addComponent(btnRemoverItem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVlrPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvlVlrPedido))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQtdeItensPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblQtdeItensPed))))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados cliente"));
        jPanel1.setEnabled(false);

        lblCpfCli.setText("Cpf Cliente");

        try {
            txtCpfCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnConsultaCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Consultar.png"))); // NOI18N
        btnConsultaCli.setEnabled(false);
        btnConsultaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaCliActionPerformed(evt);
            }
        });

        txtConsulCli.setEditable(false);
        txtConsulCli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtConsulCli.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCpfCli)
                .addGap(18, 18, 18)
                .addComponent(txtCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaCli)
                .addGap(18, 18, 18)
                .addComponent(txtConsulCli, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConsulCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnConsultaCli)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCpfCli)
                            .addComponent(txtCpfCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Jpanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Vendedor"));
        Jpanel.setToolTipText("");
        Jpanel.setEnabled(false);

        lblCpfVend.setText("Cpf Vendedor");

        btnConsultaVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icons/icon/Consultar.png"))); // NOI18N
        btnConsultaVend.setEnabled(false);
        btnConsultaVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaVendActionPerformed(evt);
            }
        });

        txtConsulVend.setEditable(false);
        txtConsulVend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtConsulVend.setEnabled(false);

        try {
            txtCpfVend.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout JpanelLayout = new javax.swing.GroupLayout(Jpanel);
        Jpanel.setLayout(JpanelLayout);
        JpanelLayout.setHorizontalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCpfVend)
                .addGap(18, 18, 18)
                .addComponent(txtCpfVend, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultaVend)
                .addGap(18, 18, 18)
                .addComponent(txtConsulVend, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JpanelLayout.setVerticalGroup(
            JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConsulVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultaVend)
                    .addGroup(JpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCpfVend)
                        .addComponent(txtCpfVend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnSair)
                .addContainerGap())
        );

        Jpanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnConsultarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPedidoActionPerformed
int codigo;
        Boolean eInteiro = true;
        try{                                                   //tratamento de erro para número inteiro (se der erro na conversão nao é inteiro) 
            codigo = Integer.parseInt(txtNumPedido.getText());                
        }catch(NumberFormatException erroConversaoInt){   
            JOptionPane.showMessageDialog(null, "Insira apenas valores inteiros", "aviso", JOptionPane.ERROR_MESSAGE);
            txtNumPedido.requestFocus();
            eInteiro = false;
        }
        if(eInteiro == true){// se o trataemento de erros deu certo o número é inteiro, então...
            int x;
            for(x=0; x<cadPedido.size();x++){
                if(cadPedido.get(x).getNumero().equals(txtNumPedido.getText())){
                    break;
                }
            }
            if(x < cadPedido.size()){
                posPedido = x;//achou
            }else{
                posPedido = -1;// não achou
            }    
            if(posPedido <0){
                btnConsultarPedido.setEnabled(false);
                txtCodProd.setEnabled(true);
                btnConsultaProd.setEnabled(true);
                btnAdicionarItem.setEnabled(true);
                btnRemoverItem.setEnabled(true);
                
                
            }
            else{
                
            }
        }        
    }//GEN-LAST:event_btnConsultarPedidoActionPerformed

    private void btnConsultaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaCliActionPerformed
        String cpfCliente = txtCpfCli.getText();
        int x;
        if(Pessoa.validarCPF(cpfCliente)){
        JOptionPane.showMessageDialog(null, "Número de CPF inválido", "aviso", JOptionPane.ERROR_MESSAGE);
        }
        else{      
            for(x=0; x<cadCliVend.size(); x++){
                if(cpfCliente.equals(cadCliVend.get(x).getCpf())){
                    if(cadCliVend.get(x) instanceof Cliente){
                        break;
                    }else if(cadCliVend.get(x) instanceof Vendedor){
                        JOptionPane.showMessageDialog(null, "O número de cpf digitado pertence a um vendedor", "aviso", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            if(x < cadCliVend.size()){
                posCli = x;
            }else{
                posCli = -1;
            }    

            if(posCli >= 0){
                txtConsulCli.setText(cadCliVend.get(posCli).getNome());
                txtData.setEnabled(false);
                txtCpfCli.setEnabled(false);
                btnConsultaCli.setEnabled(false);
                txtCpfVend.setEnabled(true);
                btnConsultaVend.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado!", "aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConsultaCliActionPerformed

    private void btnConsultaVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaVendActionPerformed
        String cpfVendedor = txtCpfVend.getText();
        int x;
        if(Pessoa.validarCPF(cpfVendedor)){
        JOptionPane.showMessageDialog(null, "Número de CPF inválido", "aviso", JOptionPane.ERROR_MESSAGE);
        }
        else{      
            for(x=0; x<cadCliVend.size(); x++){
                if(cpfVendedor.equals(cadCliVend.get(x).getCpf())){
                    if(cadCliVend.get(x) instanceof Vendedor){
                        break;
                    }else if(cadCliVend.get(x) instanceof Cliente){
                        JOptionPane.showMessageDialog(null, "O número de cpf digitado pertence a um Cliente", "aviso", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            if(x < cadCliVend.size()){
                posVend = x;
            }else{
                posVend = -1;
            }    

            if(posVend >= 0){
                txtConsulVend.setText(cadCliVend.get(posVend).getNome());
                txtCpfVend.setEnabled(false);
                txtConsulVend.setEnabled(false);
                txtCodProd.setEnabled(true);
                btnConsultaProd.setEnabled(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Vendedor não cadastrado!", "aviso", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConsultaVendActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private javax.swing.JButton btnAdicionarItem;
    private javax.swing.JButton btnConsultaCli;
    private javax.swing.JButton btnConsultaProd;
    private javax.swing.JButton btnConsultaVend;
    private javax.swing.JButton btnConsultarPedido;
    private javax.swing.JButton btnRemoverItem;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxFormaPagamento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodProd;
    private javax.swing.JLabel lblCpfCli;
    private javax.swing.JLabel lblCpfVend;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFormaPagamento;
    private javax.swing.JLabel lblNumPedido;
    private javax.swing.JLabel lblQtdeItensPed;
    private javax.swing.JLabel lblQtdeVend;
    private javax.swing.JLabel lvlVlrPedido;
    private javax.swing.JTable tblProduto;
    private javax.swing.JFormattedTextField txtCodProd;
    private javax.swing.JTextField txtConsulCli;
    private javax.swing.JTextField txtConsulVend;
    private javax.swing.JTextField txtConsultaProd;
    private javax.swing.JFormattedTextField txtCpfCli;
    private javax.swing.JFormattedTextField txtCpfVend;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNumPedido;
    private javax.swing.JTextField txtQtdeItensPed;
    private javax.swing.JTextField txtQtdeVendProd;
    private javax.swing.JTextField txtVlrPedido;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pedido> cadPedido = new ArrayList<Pedido>();
     private ArrayList<Pessoa> cadCliVend = new ArrayList<Pessoa>();
     int posCli;
     int posVend;
     int posPedido;
}
