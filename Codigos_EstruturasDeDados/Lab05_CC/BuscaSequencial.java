import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class BuscaSequencial {

	public static int buscaSeq(int seek, int[] v) {
		final int NOT_FOUND = -1;
		for (int i = 0; i < v.length; i++) {
			if (seek == v[i])
				return i;
		}
		return NOT_FOUND;
	}
	
	public static void main(String[] args) {
		int[] numeros = new int[10000];
		int nroBusca;
		int retorno;
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * 10000);
			System.out.println(i + ": " + numeros[i]);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o valor entre 0 e 10000 que deseja localizar: ");
		nroBusca = Integer.parseInt(scanner.nextLine());
		
		retorno = buscaSeq(nroBusca, numeros);
		if (retorno != -1)
			System.out.println("Sucesso! O número foi localizado na posição " + retorno);
		else
			System.out.println("Número não localizado.");

		
		// maneira pronta de fazer a ordenação do vetor (exercício 3):
		/*System.out.println("----- teste de ordenação");
		int[] v1 = {10, 3, 5, 1, 8};
		IntStream intStream = Arrays.stream(v1);
		intStream = intStream.sorted();
		v1 = intStream.toArray();
		for (int i = 0; i < v1.length; i++) {
			System.out.println(v1[i]);
		}*/
		
	}

}
