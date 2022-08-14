package exercicio2;

public class TabelaHash {
	private HashNo[] tabelaHash;
	private int TAM_MAX;
	
	public TabelaHash(int tam) {
		tabelaHash = new HashNo[tam];
		TAM_MAX = tam;
		for (int i = 0; i < tabelaHash.length; i++) {
			tabelaHash[i] = new HashNo(false);
		}
	}
	
	public int funcaoHash(String valor) {
		int chave = valor.toUpperCase().toCharArray()[0];
		return (chave - 65); //65 é o código decimal do caractere 'A'
	}
	
	public void insere(String valor) {

		int pos = funcaoHash(valor); // CALCULA POSIÇÃO

		if (!tabelaHash[pos].ocupado) {
			No novoNo = new No();
			novoNo.setValor(valor);
			tabelaHash[pos].item = novoNo;
			tabelaHash[pos].ocupado = true;
		}
		else {
			No itemNo = tabelaHash[pos].item;
			
			while (itemNo.getProximo() != null) {
				itemNo = itemNo.getProximo();
			}
			
			No novoNo = new No();
			novoNo.setValor(valor);
			itemNo.setProximo(novoNo);
		}
	}

	public void imprime() {
		for (int i = 0; i < tabelaHash.length; i++) {
			if (tabelaHash[i].ocupado) {
				System.out.println("\n" + i + ": ");
				No itemNo = tabelaHash[i].item;
				
				while (itemNo != null) {
					System.out.println(itemNo.getValor());
					itemNo = itemNo.getProximo();
				}
			}
				
		}
	}
	
	public int busca(String valor) {
		int pos = funcaoHash(valor);

		if (tabelaHash[pos].ocupado) {
			No itemNo = tabelaHash[pos].item;
			
			while (itemNo != null) {
				if  (itemNo.getValor().toUpperCase().equals(valor.toUpperCase())) {
					return pos;
				}
				itemNo = itemNo.getProximo();
			}
			
		}
		return -1;
	}
	
}
