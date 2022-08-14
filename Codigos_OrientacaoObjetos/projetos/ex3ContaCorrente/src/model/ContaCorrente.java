
package model;

public class ContaCorrente {
    
    private String nome;
    private double saldo;
    private double limite;
    private char tipo;

    public ContaCorrente() {
    
    }
     
    public ContaCorrente(String n, double l, char t) {
        this.setNome(n);
        this.setSaldo(0);
        this.setLimite(l);
        this.setTipo(t);
    }

   
    public ContaCorrente(String n, char t) {
        this.setNome(n);
        this.setTipo(t);
        this.setSaldo(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    public void cadastrarDados(){
      
      
     
    }
    
    public String imprimirDados(){
        String ret = "Nome: " + this.getNome() +
                     "\nLimite: " + this.getLimite() +
                     "\nSaldo: " + this.getSaldo() +
                     "\nTipo de conta: " + this.getTipo();
        return ret;
        
    }
    
    public void depositar(double valor){ 
        if(valor > 0){
            this.setSaldo(this.getSaldo() + valor);
        }
            
    }
    
    public void sacar(double valor){
        if(valor < (this.saldo + this.limite)){
            this.setSaldo(this.getSaldo() - valor);
        }
    }  
    
}
