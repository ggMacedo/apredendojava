public class Exercicio{
//Apresente uma versão recursiva para a função pesquisa()  dada abaixo:
	public static int pesquisa(int valor, int v[]) {
			final int NOT_FOUND = -1;
			for(int i=0; i<v.length; i++)
				if(v[i]==valor) return i;
			return NOT_FOUND;
		}
}