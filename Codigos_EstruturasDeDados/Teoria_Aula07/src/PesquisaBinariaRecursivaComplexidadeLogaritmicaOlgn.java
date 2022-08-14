public class PesquisaBinariaRecursivaComplexidadeLogaritmicaOlgn{
	public static int pesquisaBinariaR(int x, int v[], int esq, int dir){
        final int NOT_FOUND = -1;
        int meio = (esq+dir)/2;
        if (v[meio]==x) return meio;    // achei!
        if(esq>dir) return NOT_FOUND;   // não achei!
        if (x > v[meio])
           pesquisaBinariaR(x, v, meio+1, dir);
        else
           pesquisaBinariaR(x, v, esq, meio-1);
    }
}