
package expublicacao;


public class Livro extends Publicacao {
    
    private String editora;

    public Livro(String t, String d, String editora) {
        super(t, d);
        this.setEditora(editora);
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Titulo: " + super.getTitulo() + "\nData publicação: " + super.getDataPublicacao() + "\nEditora: " + this.getEditora());
    } 
}
