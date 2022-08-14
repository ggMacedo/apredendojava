
package exherancaprodutovestuario;


public abstract class Vestuario extends Produto{
    private String nome;
    private String cor;
    private String tamanho;

    public Vestuario() {
    }

    public Vestuario(int c, String d, double v, String nome, String cor, String tamanho) {
        super(c, d, v);
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String print(){
        String ret = super.print();
        ret += "\nNome: " + this.getNome() + "\nCor: " + this.getCor() + "\nTamanho: " + this.getTamanho();
        return ret;
    }
    
    
    
}
