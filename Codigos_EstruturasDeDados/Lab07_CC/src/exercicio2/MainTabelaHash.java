package exercicio2;

public class MainTabelaHash {

	public static void main(String[] args) {
		TabelaHash tabelaHash = new TabelaHash(26);

		tabelaHash.insere("Amanda");
		tabelaHash.insere("Beatriz");
		tabelaHash.insere("Eliane");
		tabelaHash.insere("Arlete");
		tabelaHash.insere("Marcos");
		tabelaHash.insere("Zeca");
		tabelaHash.insere("Ari");
		tabelaHash.insere("Zelda");
		
		tabelaHash.imprime();
		
		System.out.println("\nPosi��o de eliane: " + tabelaHash.busca("eliane"));
		System.out.println("Posi��o de Arlete: " + tabelaHash.busca("Arlete"));
		System.out.println("Posi��o de Zelda: " + tabelaHash.busca("Zelda"));
	}

}
