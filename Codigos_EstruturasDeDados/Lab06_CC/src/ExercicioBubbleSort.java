
public class ExercicioBubbleSort {

	public static void main(String[] args) {
		int[] v = {9, 3, 7, 6, 11, 14, 5, 8};
		int aux;
		
		for (int iteracao = 0; iteracao < v.length; iteracao++) {
			for (int posicao = 0; posicao < v.length-1; posicao++) {
				if (v[posicao+1] < v[posicao]) {
					aux = v[posicao];
					v[posicao] = v[posicao+1];
					v[posicao+1] = aux;
				}
			}
			
			/*
			// código para visualizar o vetor após cada iteração
			System.out.println("\n");
			for (int i = 0; i < v.length; i++) {
				System.out.print(v[i] + ", ");
			}*/
		}
		
		System.out.println("\n");
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + ", ");
		}
	}
}
