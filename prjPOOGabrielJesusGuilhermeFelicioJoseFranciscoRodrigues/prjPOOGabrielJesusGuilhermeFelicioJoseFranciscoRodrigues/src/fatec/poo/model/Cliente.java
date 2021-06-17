/*
*Todas os metodos estão inclusos
*Implementado a multiplicidade via Array. Verificar se ocorre multiplicidade 1..*
*adicionado metodo addPedido
*/
package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author gabriel
 */

public class Cliente extends Pessoa {
    double limiteCred, limiteDisp;
    String tipo;
    private ArrayList<Pedido> pedidos;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        limiteDisp = this.limiteCred;
        pedidos = new ArrayList<Pedido>();
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
    public void addPedido(Pedido p){
        this.pedidos.add(p);
        p.setCliente(this);
    }   
}
