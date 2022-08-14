public class ListaSequencial {

        private Object[] vetor = new Object[4];
        public int totalDeObjetos = 0;
        
        public void adiciona(Object elemento) {
            garantaEspaco();
            vetor[totalDeObjetos] = elemento;
            totalDeObjetos++;
        }
        
        public void garantaEspaco() {
            if(totalDeObjetos==vetor.length) {
                Object[] novo_vetor = new Object[vetor.length*2];
                for(int i=0; i<vetor.length; i++) {
                    novo_vetor[i]=vetor[i];
                }
                vetor = novo_vetor;
            }
        }
        
        public void adiciona(Object elemento, int posicao) {
            garantaEspaco();
            if (!posicaoEhValida(posicao)) {
                throw new IllegalArgumentException("Posicao Inválida!");
            }
            for(int i=totalDeObjetos-1; i>=posicao; i--) {
                vetor[i+1]=vetor[i];
            }
            vetor[posicao]=elemento;
            totalDeObjetos++;
        }
        
        public boolean posicaoEhValida(int posicao) {
            return ((posicao>=0) && (posicao<totalDeObjetos));
        }
        
        public int tamanho() {
            return totalDeObjetos;
        }
        
        public void remove(int posicao) {
            if (!posicaoEhValida(posicao)) {
                throw new IllegalArgumentException("Posicao Inválida!");
            }
            for(int i=posicao; i<totalDeObjetos; i++) {
                vetor[i] = vetor[i+1];
            }
            totalDeObjetos--;
        }
        
        public boolean contem(Object elemento) {
            boolean resposta = false;
            for(int i=0; i<totalDeObjetos; i++) {
                if(elemento.equals(vetor[i])) {
                    resposta = true;
                    i=totalDeObjetos;
                }
            }
            return resposta;
        }
      
}
