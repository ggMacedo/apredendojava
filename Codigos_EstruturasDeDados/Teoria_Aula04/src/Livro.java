
public class Livro {
    String nome;
    int ano;
    double preco;
    Livro anterior;
    static int total_livros = 0;
    public Livro(String nome, int ano, double preco) {
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
        total_livros++;
    }
    public Livro getAnterior() {
        return anterior;
    }
    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + " Ano: " + ano + " Preço: " + preco;
    }
}