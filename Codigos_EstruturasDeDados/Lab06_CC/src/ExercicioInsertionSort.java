
public class ExercicioInsertionSort {

	public static void main(String[] args) {
		int[] v = {9, 3, 7, 6, 11, 14, 5, 8};
		int auxValor;
		
		for (int posicao = 1; posicao < v.length; posicao++) {
			auxValor = v[posicao];
			
			int anterior = posicao -1;
			
			while (anterior>=0 && v[anterior]>auxValor) {
				v[anterior+1] = v[anterior];
				anterior--;
			}
			v[anterior+1] = auxValor;
		}
		
		System.out.println("\n");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + ", ");
		}
	}
}
