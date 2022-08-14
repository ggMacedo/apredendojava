
public class Classificacao {
	private String[][] top10 = new String[10][2];
	private int linha = 0;
	
	public void atribui(String nome, int pontuacao) {
		try {
			top10[linha][0] = nome;
			top10[linha][1] = pontuacao+"";
			linha++;
		} catch (Exception e) {
			System.err.println("Falha na inclusão da matriz.");
		}
	}
	
	public void imprime() {
		for (int i = 0; i < top10.length; i++) {
			for (int j = 0; j < top10[i].length; j++) {
				if (j == 1)
					System.out.println(" " + top10[i][j]);
				else
					System.out.print(" " + top10[i][j]);
			}
		}
	}
	
}
