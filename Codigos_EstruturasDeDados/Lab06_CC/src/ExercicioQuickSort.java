
public class ExercicioQuickSort {

	public static void main(String[] args) {
		int[] vetor = {9, 3, 7, 6, 11, 14, 5, 8};
		
		quickSort(vetor, 0, vetor.length-1);
		
		System.out.println("\n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + ", ");
		}
		
	}

	public static void quickSort(int[] v, int inicio, int fim) {
		int pivo;
		int auxInicio = inicio;
		int auxFim = fim;
		int iPivo;
		
		pivo = v[inicio];
		
		while (inicio < fim) {
			while ((v[fim]>pivo) && (inicio<fim)) // correção da condição do while com "&& (inicio<fim)"
				fim--;
			if (inicio != fim) {
				v[inicio] = v[fim];
				inicio++;
			}
			while ((v[inicio]<pivo) && (inicio<fim)) // correção da condição do while com "&& (inicio<fim)"
				inicio++;
			if (inicio != fim) {
				v[fim] = v[inicio];
				fim--;
			}
		}
		v[inicio] = pivo;
		iPivo = inicio;
		
		//System.out.println(auxInicio + " " + iPivo);
		if (auxInicio < iPivo)
			quickSort(v, auxInicio, iPivo-1);
		if (auxFim > iPivo)
			quickSort(v, iPivo+1, auxFim);

	}
	
}
