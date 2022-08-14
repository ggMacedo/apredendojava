
package exherancaprodutovestuario;


public class Roupa extends Vestuario{
    private String tecido;

    public Roupa() {
    }

    public Roupa(int c, String d, double v, String nome, String cor, String tamanho, String tecido) {
        super(c, d, v, nome, cor, tamanho);
        this.tecido = tecido;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }
    
    @Override
    public String print(){
        System.out.println("\nRoupa");
        String ret = super.print();
        ret += "\nTecido: " + this.getTecido();
        return ret;
    
    }
     
    
}
