public class FilaEncadeada {
    private No inicio;
    private No fim;
    private int total_elementos=0;
    
    // Operações de uma fila
    
    // 1. criar uma fila vazia
    public Fila() {
        inicio = new No();
        fim = inicio;
        inicio.setProximo(null);
    }
    
    public void enfileirar(Object elemento) {
        fim.proximo = new No();
        fim = fim.getProximo();
        fim.setItem(elemento);
        fim.proximo = null;
        total_elementos++;
    }
    
    public boolean estaVazia() {
        return (inicio == fim);
    }
    
    public Object desenfileirar() throws Exception{
        Object valor = null;
        if (estaVazia()) {
            throw new Exception("Erro! A fila está vazia");
        }
        inicio = inicio.getProximo();
        valor = inicio.getItem();
        total_elementos--;
        return valor;
    }
    
    public void imprimir() {
        No aux;
        aux = inicio.getProximo();
        while (aux != null) {
            System.out.println(" " + aux.getItem().toString());
            aux = aux.getProximo();
        }
    }
    
    public int tamanho() {
        return total_elementos;
    }
}