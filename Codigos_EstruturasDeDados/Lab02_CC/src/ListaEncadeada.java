
public class ListaEncadeada {
	private No primeiro;
	private No ultimo;
	private int tamanho = 0;
	
	public void adicionarNoInicio(No no) {
		No aux = null;
		if (tamanho == 0) {
			primeiro = no;
			ultimo = no;
		} else {
			aux = primeiro;
			primeiro = no;
			primeiro.setProximo(aux);
		}
		tamanho++;
	}

	public void exibirLista() {
		System.out.println(primeiro.getValor());
		No aux = primeiro;
		while (aux.getProximo() != null) {
			aux = aux.getProximo();
			System.out.println(aux.getValor());
		}
	}
	
	public void adicionarNoFinal(No no) {
		if (tamanho == 0) {
			primeiro = no;
			ultimo = no;
		} else {
			ultimo.setProximo(no);
		}
		tamanho++;
	}
	
	
}
