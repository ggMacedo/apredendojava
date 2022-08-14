package exercicio1;

public class TabelaHash {
	private HashString[] tabelaHash;
	private int TAM_MAX;
	
	public TabelaHash(int tam) {
		tabelaHash = new HashString[tam];
		TAM_MAX = tam;
		for (int i = 0; i < tabelaHash.length; i++) {
			tabelaHash[i] = new HashString(false);
		}
	}
	
	public int funcaoHash(String valor) {
		int chave = valor.toUpperCase().toCharArray()[0];
		return (chave-65); //65 é o código decimal do caractere 'A'
	}
	
	public void insere(String valor) {

		if (cheia()) {
			System.out.println("\n->ATENCAO Tabela cheia");
			return;
		}

		int pos = funcaoHash(valor); // CALCULA POSIÇÃO

		if (!tabelaHash[pos].ocupado) {
			tabelaHash[pos].item = valor;
			tabelaHash[pos].ocupado = true;
		}
		else {
			int i = pos;
			while (i < tabelaHash.length) {
				if (!tabelaHash[i].ocupado) {
					tabelaHash[i].item = valor;
					tabelaHash[i].ocupado = true;
					break;
				}
				i++;
				if (i == tabelaHash.length && !cheia())
					i = 0;
			}
		}
	}

	public boolean cheia() {
		int i, qtde = 0;
		for (i = 0; i < TAM_MAX; i++)
			if (tabelaHash[i].ocupado == true) {
				qtde++;
			}
		if (qtde == TAM_MAX)
			return true;
		return false;
	}

	public void imprime() {
		for (int i = 0; i < tabelaHash.length; i++)
			if (tabelaHash[i].ocupado == true)
				System.out.print("\nTabelaHash[" + i + "] = " + tabelaHash[i].item);
	}
	
	public int busca(String valor) {
		int pos = funcaoHash(valor);
	
		if (tabelaHash[pos].item.toUpperCase().equals(valor.toUpperCase())) {
			return pos;
		} else {
			int i = pos;
			while (pos < tabelaHash.length) {
				if (tabelaHash[pos].ocupado && tabelaHash[pos].item.toUpperCase().equals(valor.toUpperCase())) {
					return pos;
				}
				pos++;
				if (pos == tabelaHash.length)
					pos = 0;
				if (pos == i)
					break;
			}
			return -1;
		}
		
	}
	
}
