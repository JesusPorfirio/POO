/*
*Foi implementado todos os metodos e classes
*Implementado ArrayList verificar associação 0..*
*/
package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */
public class Vendedor extends Pessoa{
    private double salarioBase, taxaComissão;
    private ArrayList<Pedido> pedidos;
    
    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        this.pedidos = new ArrayList();
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
     public void setTaxaComissão(double taxaComissão) {
        this.taxaComissão = taxaComissão;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
    public double getTaxaComissão() {
        return taxaComissão;
    }

   
    public void addPedido(Pedido p){
        this.pedidos.add(p);
        p.setVendedor(this);
    }
    
}
