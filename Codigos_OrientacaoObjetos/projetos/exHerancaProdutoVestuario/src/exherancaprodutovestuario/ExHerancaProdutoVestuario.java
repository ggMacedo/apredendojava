
package exherancaprodutovestuario;

public class ExHerancaProdutoVestuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calcado c1 = new Calcado(01, "Tenis preto", 400.50, "Tenis Vans", "Preto", "42", "Borracha", "Algodao", "Plastico");
        System.out.println(c1.print());
        
        Roupa r1 = new Roupa(02, "Camisa Branca", 50, "Camisa Branca Gucci", "Branco", "M", "Cetim de Seda");
        
        System.out.println(r1.print());
        
        Eletronico e1 = new Eletronico(03, "Computador Dell", 1000, 220);
        System.out.println(e1.print());
    }
    
}
