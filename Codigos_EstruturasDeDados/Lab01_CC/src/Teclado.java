import java.util.Scanner;

public class Teclado {

	public static void main(String[] args) {
		String[][] nomes = new String[2][3];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < nomes.length; i++) { // Percorre as linhas da matriz
			for (int j = 0; j < nomes[i].length; j++) { // Percorre as colunas da matriz
				nomes[i][j] = scanner.nextLine();
			}
		}

		for (int i = 0; i < nomes.length; i++) {
			for (int j = 0; j < nomes[i].length; j++) {
				if (j == 2) 
					System.out.println(" "+ nomes[i][j]);
				else
					System.out.print(" "+ nomes[i][j]);
			}
		}
	}

}
