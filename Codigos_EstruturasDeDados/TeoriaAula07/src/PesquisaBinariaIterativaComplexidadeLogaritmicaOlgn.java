public class PesquisaBinariaIterativaComplexidadeLogaritmicaOlgn{
	
    public static int pesquisaBinariaI(int x, int v[]){ 
        final int NOT_FOUND = -1;
        int esq = 0; 
        int dir = v.length-1; 
        int meio;
            while (esq <= dir){
              meio = (esq + dir)/2;
              if (x == v[meio]) return meio; // achei!
              if (x > v[meio])
                   esq = meio+1;
              else
                   dir = meio-1;
         }
         return NOT_FOUND;   // valor (chave) não encontrado
    }
    

    
    public static void main(String[] args) {
        int[] v = {1, 54, 90, 8, 10, 65, 72, 31, 59, 78};
        
        System.out.printf("\n Valor 1 encontrado na posição %d", pesquisaBinariaI(1, v) );
        System.out.printf("\n Valor 78 encontrado na posição %d", pesquisaBinariaI(78, v) );
        System.out.printf("\n Valor 1 encontrado na posição %d", pesquisaBinariaI(1, v) );
        System.out.printf("\n Valor 78 encontrado na posição %d", pesquisaBinariaI(78, v) );
    }
}