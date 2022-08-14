
package ex01heranca_pessoa;

public class Fornecedor extends Pessoa implements Seguranca{
    private double valorCompra;
    
    public Fornecedor(String n, String f, double vc) {
        super(n, f);
        this.setValorCompra(vc);
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Valor compra com imposto " + this.getValorCompra());  
    }
    
    public void calculaImposto(double imposto){
        this.setValorCompra(this.getValorCompra() + (this.getValorCompra() * imposto/100));

    }
    
    @Override
    public void validar(){
        if(this.getValorCompra()<0){
            System.out.println("Digite um valor de compra valido.");
        }
        
    }

    
    
}
