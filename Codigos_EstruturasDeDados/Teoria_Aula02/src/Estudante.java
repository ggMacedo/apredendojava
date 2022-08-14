public class Estudante {
    private String nome;
    private int ra;
    private Estudante proximo;

    public Estudante(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }
    
    public Estudante getProximo() {
        return proximo;
    }
    public void setProximo(Estudante proximo) {
        this.proximo = proximo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    }
}