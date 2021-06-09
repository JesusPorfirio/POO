package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Pedido {
    private String numero, dataEmissao, dataPagto;
    private boolean formaPagto, situacao;
    private ArrayList<ItemPedido> itemPedido;
    private Cliente cliente;
    private Vendedor vendedor;
    
    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itemPedido = new ArrayList<ItemPedido>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    
      public String getNumero() {
        return numero;
    }
    
     public String getDataEmissao() {
        return dataEmissao;
    }
     
     public String getDataPagto() {
        return dataPagto;
    }
     
       public boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public void addItemPedido(ItemPedido p){
        double a =0;
        this.itemPedido.add(p);
        p.setPedido(this);
        cliente.setLimiteDisp(cliente.getLimiteDisp() - (itemPedido.get(itemPedido.size() - 1).getQtdeVendida()
                                                       *itemPedido.get(itemPedido.size() - 1).getProduto().getPreco())); //Estamos adicionando um ItemPedido
                                                                                                                         //nesse método, então ele é o ultimo
                                                                                                                         //no array
       
    }    
}
