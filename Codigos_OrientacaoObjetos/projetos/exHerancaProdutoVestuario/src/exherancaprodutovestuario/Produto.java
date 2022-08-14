
package exherancaprodutovestuario;

public abstract class Produto {
    private int codigo;
    private String descricao;
    private double valor;
    
    public Produto() {
    }
    
  
    public Produto(int c, String d, double v) {
        this.codigo = c;
        this.descricao = d;
        this.valor = v;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    /*public abstract String print(); método abstrato */ 
    public String print(){
        String ret = "Código: " + this.getCodigo() + "\nDescricação: " + this.getDescricao() + "\nValor: " + this.getValor();
        return ret;
    }
    
    
    
}
