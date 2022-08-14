package model;

public abstract class Conta implements Regras{
    private String nome;
    private int agencia;
    private int conta;
    private double saldo;

    public Conta(String nome, int agencia, int conta) {
        this.setNome(nome);
        this.setAgencia(agencia);
        this.setConta(conta);
        this.setSaldo(0);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() >=5){
            this.nome = nome;
        }
        else 
        {
            throw new IllegalArgumentException("Nome deve ter 5 ou mais caracteres!");
        }
        
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
        if (valor >0){
            this.setSaldo(this.saldo + valor);
        }
        else
        {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que zero!");
        }
        
    }
    
}
