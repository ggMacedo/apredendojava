
package exercicioconta;

public class ExercicioConta {

    public static void main(String[] args) {
        Corrente c = new Corrente("Gabriel", 123, 1235, 100, 10);
        c.depositar(100);
        c.sacar(10);
        System.out.println(c.toString());
        
        Poupanca p = new Poupanca("zz", 145, 14789, 200, 1);
        p.depositar(100);
        p.sacar(10);
        System.out.println(p.toString());
    }
    
}
