
package exemplo3interface;

public class Exemplo3Interface {

    public static void main(String[] args) {
        // TODO code application logic here
        Produto p = new Produto("Macarrão", 10);
        Usuario user = new Usuario("Luiz Lozano", 37, "lozano", "123");
        
        if(p.validar()){
            p.formatoSystemOut();
            System.out.println(p.formatoString());
        }
        
        if(user.validar()){
            user.formatoSystemOut();
            System.out.println(user.formatoString());
        }
    }
    
}
