
public class MainClassificacao {

	public static void main(String[] args) {
		Classificacao classificacao = new Classificacao();
		
		classificacao.atribui("Estrela do Norte", 40);
		classificacao.atribui("Vasco", 38);
		classificacao.atribui("Juazeirense", 37);
		classificacao.atribui("Botafogo de Ribeirão Preto", 35);
		classificacao.atribui("Jacuipense", 30);
		classificacao.atribui("ABC", 25);
		classificacao.atribui("Bahia de Feira", 19);
		classificacao.atribui("Cruzeiro", 18);
		classificacao.atribui("Brasil de Pelotas", 14);
		classificacao.atribui("Palmeiras", 10);
		
		classificacao.imprime();

	}

}
