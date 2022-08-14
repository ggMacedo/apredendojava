
public class ExercicioSelectionSort {

	public static void main(String[] args) {
		int[] v = {9, 3, 7, 6, 11, 14, 5, 8};
		int auxValor, auxI;
		
		for (int posicao = 0; posicao < v.length; posicao++) {
			auxValor = v[posicao];
			auxI = posicao;
			
			for (int proximo = posicao + 1; proximo < v.length; proximo++) {
				if (v[proximo] < auxValor) {
					auxValor = v[proximo];
					auxI = proximo;
				}
			}
			v[auxI] = v[posicao];
			v[posicao] = auxValor;
		}
	
		System.out.println("\n");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + ", ");
		}
	}

}
