
public class Livro {
    // atributos
    protected int    idLivro;
    protected String titulo;
    protected int    edicao;
    // construtores
    public Livro() {
        this(0, "", 0);
    }
    public Livro(int idLivro) {
        this(idLivro, "", 0);
    }
    public Livro(String titulo) {
        this(0, titulo, 0);
    }
    public Livro(String titulo, int edicao) {
        this(0, titulo, edicao);
    }
    public Livro(int idLivro, String titulo, int edicao) {
        setIdLivro(idLivro);
        setTitulo(titulo);
        setEdicao(edicao);
    }
    // m√©todos modificadores
    public void setIdLivro(int    idLivro) { this.idLivro = idLivro; }
    public void setTitulo (String titulo ) { this.titulo  = titulo; }
    public void setEdicao (int    edicao)  { this.edicao  = edicao; }
    // m√©todos de acesso
    public int    getIdLivro() { return this.idLivro; }
    public String getTitulo()  { return this.titulo; }
    public int    getEdicao()  { return this.edicao; }
    // toString
    public String toString() {
        return "\nId: "        + getIdLivro() +
               " - Titulo: "   + getTitulo()  +
               " - EdiÁ„o n∫ " + getEdicao();
    }
}