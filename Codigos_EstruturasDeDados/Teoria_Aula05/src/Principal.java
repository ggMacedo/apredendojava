public class Principal {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        System.out.printf("\n A pilha está vazia? %s", pilha.estaVazia());
        System.out.printf("\n A pilha está vazia? %s", pilha.isEmpty());
        System.out.printf("\n A pilha está cheia? %s", pilha.estaCheia());
        System.out.printf("\n A pilha está cheia? %s\n", pilha.isFull());
        
        System.out.println("Qtde de Elementos da pilha = " + pilha.getQtdeElementos());
        System.out.println("Tamanho da Pilha = " + pilha.getTamanho());
        
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        
        System.out.printf("\n Quem é o topo da pilha? %d", pilha.topo());
        pilha.empilhar(50);
        pilha.empilhar(60);
        System.out.printf("\n Quem é o topo da pilha? %d", pilha.topo());
        System.out.printf("\n\n");
        System.out.printf("\n A pilha está vazia? %s", pilha.estaVazia());
        System.out.printf("\n A pilha está vazia? %s", pilha.isEmpty());
        System.out.printf("\n A pilha está cheia? %s", pilha.estaCheia());
        System.out.printf("\n A pilha está cheia? %s\n", pilha.isFull());       
    }
}