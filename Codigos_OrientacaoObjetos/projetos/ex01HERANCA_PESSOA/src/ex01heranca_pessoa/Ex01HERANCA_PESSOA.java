
package ex01heranca_pessoa;


public class Ex01HERANCA_PESSOA {

    
    public static void main(String[] args) {
        Cliente c1 = new Cliente("g", "123", 100.0);
        Fornecedor f1 = new Fornecedor("l", "456", 90);
        
        c1.print();
        System.out.println("Juros "+ c1.calculaJuros(10));
        f1.calculaImposto(10);
        f1.validar();
        f1.print();
        
    }
    
}
