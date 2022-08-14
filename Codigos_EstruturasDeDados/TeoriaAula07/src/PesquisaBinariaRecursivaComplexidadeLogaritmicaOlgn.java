public class PesquisaBinariaRecursivaComplexidadeLogaritmicaOlgn{
	
	public static int pesquisaBinariaR(int x, int v[], int esq, int dir){
        final int NOT_FOUND = -1;
        int meio = (esq+dir)/2;
        if (v[meio]==x) {return meio; }   // achei!
        if(esq>dir) { return NOT_FOUND;}   // não achei!
        if (x > v[meio])
           return pesquisaBinariaR(x, v, meio+1, dir);
        else
           return pesquisaBinariaR(x, v, esq, meio-1);
    }
	
	 public static void main(String[] args) {
	        int[] v = {1, 54, 90, 8, 10, 65, 72, 31, 59, 78};
	        
	        int e=0;
	        int d= v.length - 1;
	        
	        System.out.printf("\n Valor 1 encontrado na posição %d", pesquisaBinariaR(1, v, e, d) );
	        System.out.printf("\n Valor 78 encontrado na posição %d", pesquisaBinariaR(78, v, e, d) );
	        System.out.printf("\n Valor 1 encontrado na posição %d", pesquisaBinariaR(1, v, e, d) );
	        System.out.printf("\n Valor 78 encontrado na posição %d", pesquisaBinariaR(78, v, e, d) );
	    }
	
}