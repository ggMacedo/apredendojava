public class Principal {
    public static void main(String [] args) {
        try {
            Fila fila = new Fila();
            System.out.println("A Fila está vazia? " + fila.estaVazia() );
            fila.enfileirar("Mateus");
            fila.enfileirar("Marcos");
            fila.enfileirar("Lucas");
            fila.enfileirar("João");
            System.out.println("A Fila está vazia? " + fila.estaVazia() );
            fila.imprimir();
            System.out.println();
            System.out.println("Objeto retirado da fila " + fila.desenfileirar().toString());
            fila.imprimir();
            
            System.out.println();
            fila.enfileirar("Temóteo");
            fila.enfileirar("Felipe");
            
            System.out.println();
            fila.imprimir();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}