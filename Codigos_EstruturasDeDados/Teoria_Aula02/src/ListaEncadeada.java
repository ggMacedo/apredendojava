public class ListaEncadeada {
    private Estudante cabeca=null;
    private Estudante cauda=null;
    private int total=0;
    
    public void adicionarElementoNoFimDaLista(Estudante e) {
        if (cabeca==null) {
            cabeca = e;
            cauda = e;
        }
        else if(cauda.getProximo()==null) {
            cauda.setProximo(e);
            cauda = e;
        }
        total++;
    }
    
    public int tamanho() {
        return total;
    }
    
    public void listarTodos() {
        Estudante aux = cabeca;
        while (aux!=null) {
            System.out.println(aux.getNome() + " - " + aux.getRa());
            aux = aux.getProximo();
        }
    }
    
    public void adicionarElementoNoInicioDaLista(Estudante e) {
        e.setProximo(cabeca);
        cabeca = e;
        total++;
    }
    
    public void removerEstudanteDaLista(Estudante e) {
        Estudante aux = cabeca;
        while(aux!=null) {
            if(aux.getProximo()==e) {
                Estudante proximo = aux.getProximo();
                aux.setProximo(proximo.getProximo());
            }
            else if(aux==e) {
                cabeca = e.getProximo();
            }
            aux = aux.getProximo();
        }
    }
    public void adicionarEstudanteNoMeioDaLista(Estudante e, int posicao) {
        Estudante aux = cabeca;
        for(int i=0; i<=posicao; i++) {
            if(i==posicao) {
                e.setProximo(aux.getProximo());
                aux.setProximo(e);
            }
            aux=aux.getProximo();
        }
        total++;
    }
    
    public String getNomePrimeiro() {
        return (cabeca != null ? cabeca.getNome() : " ");
    }
    
    public String getNomeUltimo() {
        return (cauda!= null ? cauda.getNome() 
                                + " " 
                                + cauda.getRa() 
                            : " ");
    }
}