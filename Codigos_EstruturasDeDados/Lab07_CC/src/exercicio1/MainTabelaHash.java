package exercicio1;

public class MainTabelaHash {

	public static void main(String[] args) {
		TabelaHash tabelaHash = new TabelaHash(26);

		tabelaHash.insere("Amanda");
		tabelaHash.insere("Beatriz");
		tabelaHash.insere("Eliane");
		tabelaHash.insere("Marcos");
		tabelaHash.insere("Zeca");
		tabelaHash.insere("Zelda");
		
		tabelaHash.imprime();
		
		System.out.println("\nPosi��o de eliane: " + tabelaHash.busca("eliane"));
		System.out.println("Posi��o de Beatriz: " + tabelaHash.busca("Beatriz"));
		System.out.println("Posi��o de Zelda: " + tabelaHash.busca("Zelda"));
	}

}
