package model;

public class Poupanca extends Conta{
    private int aniversario;

    public Poupanca(String nome, int agencia, int conta, int aniversario) {
        super(nome, agencia, conta);
        this.setAniversario(aniversario);
    }
    
    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        if (aniversario <= 0 || aniversario > 30){
            String msg = "Este valor não pode ser 0 ou negativo e não pode ser maior que 30";
            throw new IllegalArgumentException(msg);
        }
        else
            this.aniversario = aniversario;
    }
    
    @Override
    public void sacar (double valor){
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero!");
        }
        else
        {
            if(valor <= super.getSaldo() )
                super.setSaldo(super.getSaldo() - valor);
            else
                throw new RuntimeException("Não há saldo suficiente");
        }
    }
    
    @Override
    public String toString(){
        String ret;
        ret = "Nome: " + super.getNome() + 
            "\nAgencia: "+ super.getAgencia() +
            "\nConta: " +  super.getConta() + 
            "\nAniversario: " + this.getAniversario() +
            "\nSaldo: " + super.getSaldo();
        return ret;
    }
}
