
package exherancaprodutovestuario;


public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico() {
    }

    public Eletronico(int c, String d, double v, int voltagem) {
        super(c, d, v);
        this.voltagem = voltagem;
    }
    
    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
 
    @Override
    public String print(){
        System.out.println("\nEletrônico");
        String saida = super.print();
        saida += "\nVoltagem: " + this.getVoltagem();
        return saida;
    
    }

    
    
}
