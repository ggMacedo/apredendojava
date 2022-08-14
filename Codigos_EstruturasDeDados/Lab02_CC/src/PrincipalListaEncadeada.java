
public class PrincipalListaEncadeada {

	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		listaEncadeada.adicionarNoInicio(new No(10));
		listaEncadeada.adicionarNoInicio(new No(20));
		
		listaEncadeada.adicionarNoFinal(new No(30));

		listaEncadeada.exibirLista();
		
	}

}
