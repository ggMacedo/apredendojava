package model;

public class Corrente extends Conta{
    private double limite;

    public Corrente(String nome, int agencia, int conta, double limite) {
        super(nome, agencia, conta);
        this.setLimite(limite);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public String toString(){
        String ret;
        ret = "Nome: " + super.getNome() + 
            "\nAgencia: "+ super.getAgencia() +
            "\nConta: " +  super.getConta() + 
            "\nLimite: " + this.getLimite() +
            "\nSaldo: " + super.getSaldo();
        return ret;
    }
    //INTERVALO, RETORNAREMOS AS 11:25
    @Override
    public void sacar (double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero!");
        }
        else
        {
            if(valor <= (super.getSaldo() + this.getLimite()) )
                super.setSaldo(super.getSaldo() - valor);
            else
                throw new RuntimeException("Não há saldo suficiente");
        }
    }
    
}
