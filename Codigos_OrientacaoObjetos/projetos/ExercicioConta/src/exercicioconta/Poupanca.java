
package exercicioconta;


public class Poupanca extends Conta{
    private int aniversario;

    public Poupanca(String n, int a, int c, double s, int ani) {
        super(n, a, c, s);
        this.setAniversario(ani);
    }
    
    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }
    
    @Override
    public void sacar (double valor){
        super.setSaldo(super.getSaldo() - valor);
    }
    
    @Override
    public String toString(){
        String resp = "Nome: " + super.getNome();
        resp += "\nAgencia: " + super.getAgencia();
        resp += "\nConta: " + super.getConta();
        resp += "\nSaldo: " + super.getSaldo();
        resp += "\nAniversario: " + this.getAniversario();
        return resp;
    }
   
}
