
package ex01heranca_pessoa;

public class Pessoa {
    private String nome;
    private String fone;

    public Pessoa(String nome, String fone) {
        this.setNome(nome);
        this.setFone(fone);
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void print(){
        System.out.println("\nNome " + this.getNome());
        System.out.println("Telefone " + this.getFone());
        
    }
  
}
