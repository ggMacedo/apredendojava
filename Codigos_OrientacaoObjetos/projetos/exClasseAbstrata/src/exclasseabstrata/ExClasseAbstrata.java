
package exclasseabstrata;

public class ExClasseAbstrata {

    public static void main(String[] args) {
        // TODO code application logic here
        Quadrado q = new Quadrado(5.0);
        q.mostra();
        
        Triangulo t;
        t = new Triangulo(4, 5);
        t.mostra();
    }
    
}
