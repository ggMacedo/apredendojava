public class PesquisaLinearRecursivaComplexidadeLinearOn{
public static int pesquisaLinearR(int valor, int v[], int tam) {
        final int NOT_FOUND = -1;
        if (tam<0) return NOT_FOUND;
        if (v[tam-1]==valor) return tam-1;
        return pesquisaLinearR(valor, v, tam-1);
    }  

}
