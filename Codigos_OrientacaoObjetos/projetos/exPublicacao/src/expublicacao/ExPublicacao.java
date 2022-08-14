
package expublicacao;


public class ExPublicacao {

    public static void main(String[] args) {
        // TODO code application logic here
        Livro l = new Livro("livro 1", "12 de abril de 2021", "Editora Abril");
        l.imprimir();
        
        Revista r = new Revista("Revista 1", "25 de abril de 2021", "Editor Abril", "São Paulo");
        r.imprimir();
    }
    
}
