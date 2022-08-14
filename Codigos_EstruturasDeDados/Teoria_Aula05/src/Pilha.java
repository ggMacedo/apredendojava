public class Pilha {
    int inicio;
    int fim;
    int qtdeElementos=0;
    int p[];
    
    // método construtor
    public Pilha(int tamanho) {
        inicio = fim = -1;
        p = new int[tamanho];
        qtdeElementos=0;
    }
    
    public boolean estaVazia() {
        if (qtdeElementos==0)
            return true;
        return false;
    }
    
    public boolean isEmpty() {
        if (inicio == -1) 
            return true;
        return false;
    }
    
    public boolean estaCheia() {
        if (fim==p.length-1)
            return true;
        return false;
    }
    
    public boolean isFull() {
        if(qtdeElementos==getTamanho())
            return true;
        return false;
    }
    public int getQtdeElementos() {
        return qtdeElementos;
    }
    
    public int getTamanho() {
        return p.length;
    }
    
    public void empilhar(int elemento) {
        if(!estaCheia()) {
            if(inicio==-1) {
                inicio=0;
            }
            fim++;
            p[fim]=elemento;
            qtdeElementos++;
        }
    }
    
    public int topo() {
        if(!estaVazia())
            return p[fim];
        return -1;
    }
    
    public int desempilhar() {
        int aux = -1;
        if(!estaVazia()) {
            aux = p[fim];
            fim--;
            qtdeElementos--;
        }
        return aux;
    }
    
    public void imprimir() {
        if(!estaVazia()) {
            for(int i=fim; i>=0;i--) {
                System.out.printf("\n %d - ",p[i]);
                //System.out.println(p[i] + " ");
            }
        }
    }
}