
package exercicioconta;


public abstract class Conta implements Regras{
    private String nome;
    private int agencia;
    private int conta;
    private double saldo;

    public Conta(String n, int a, int c, double s) {
        this.setNome(n);
        this.setAgencia(a);
        this.setConta(c);
        this.setSaldo(s);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }
    
    
    
}
