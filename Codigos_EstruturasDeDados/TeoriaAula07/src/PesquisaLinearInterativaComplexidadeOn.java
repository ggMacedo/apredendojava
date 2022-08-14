public class PesquisaLinearInterativaComplexidadeOn{
	
	public static int pesquisaLinearI(int valor, int v[]) {
        final int NOT_FOUND = -1;
        for(int i=0; i<v.length; i++)
            if(v[i]==valor) return i;
        return NOT_FOUND;
    }
       
    public static void main(String[] args) {
        int[] v = {1, 54, 90, 8, 10, 65, 72, 31, 59, 78};
        
        System.out.printf("\n Valor 1 encontrado na posição %d", pesquisaLinearI(1, v) );
        System.out.printf("\n Valor 78 encontrado na posição %d", pesquisaLinearI(78, v) );
    }
    
}
