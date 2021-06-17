/*
*Classe pessoa está pronta!
*/
package fatec.poo.model;

import java.util.Arrays;
import java.util.InputMismatchException;

/**
 *
 * @author gabriel
 */
public class Pessoa {
    private String cpf, nome, endereco, cidade, uf, cep, ddd, telefone;

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefon() {
        return telefone;
    }
    
    public static boolean validarCPF(String cpfPessoa){
        boolean cpfValido = false;
        String[] cpfArray = cpfPessoa.split("-|\\.");
        StringBuilder sbCpf = new StringBuilder();
        for(String a : cpfArray){
            sbCpf.append(a);
        }
        
        if(sbCpf.length() != 11){
            return cpfValido;
            
        }     
        char digito10, digito11;
        int i, soma, num, replace, mult;
        
        try{
            mult = 11;
            soma = 0;

            //Este for vai transformar os caracteres do cpf em numero do tipo int e calcular o primeiro digito verificador
            for(i = 0; i<9; i++){
                num = (Character.getNumericValue(sbCpf.charAt(i)));
                soma = soma + (num * (i+1));                
            }
            
            replace = soma % 11;
            if(replace == 10)
                digito10 = '0';
            else digito10 = (char)(replace+48);
            
            soma = 0;
            
            //Aqui será calculado o segundo digito verificador
            for(i=0; i<10; i++){
                num = (Character.getNumericValue(sbCpf.charAt(i)));
                soma = soma + (num * mult);
                mult = mult - 1;
            }
            
            replace = (soma * 10) % 11;
            if(replace == 10)
                digito11 = '0';
            else digito11 = (char)(replace+48);
            
            //Validação comparando os 2 digitos verificadores inseridos pelo usuário com as variáveis do tipo char digito10 e digito11 que foram atribuidas após os calculos
            if(digito10 == sbCpf.charAt(9) && digito11 == sbCpf.charAt(10)){
                cpfValido = true;
            }
            
            return cpfValido;  
        
        } catch (InputMismatchException error){
            return cpfValido;
        }
    }

    public String getDdd() {
        return ddd;
    }

    public String getTelefone() {
        return telefone;
    }

}
