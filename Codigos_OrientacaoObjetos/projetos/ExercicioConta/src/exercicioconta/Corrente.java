
package exercicioconta;

public class Corrente extends Conta {
    private double limite;

    public Corrente(String n, int a, int c, double s, double l) {
        super(n, a, c, s);
        this.setLimite(l);
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor){
        super.setSaldo(super.getSaldo() - valor);
    }
    
    @Override
    public String toString(){
        String resp = "Nome: " + super.getNome();
        resp += "\nAgencia: " + super.getAgencia();
        resp += "\nConta: " + super.getConta();
        resp += "\nSaldo: " + super.getSaldo();
        resp += "\nLimite: " + this.getLimite();
        return resp;
    }
  
}
