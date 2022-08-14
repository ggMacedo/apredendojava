
package ex01heranca_pessoa;

public class Cliente extends Pessoa{
    private double valorDivida;
    
    public Cliente(String n, String f, double v) {
        super(n, f);
        this.setValorDivida(v);
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Valor divida " + this.getValorDivida());
        
    }
    
    public double calculaJuros(double tx){
        double result = (tx/100) * this.getValorDivida();
        return result;
    }

}
