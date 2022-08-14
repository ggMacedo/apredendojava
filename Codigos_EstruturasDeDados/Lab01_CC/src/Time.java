
public class Time {
	private String nome;
	private int vitorias, empates, derrotas;
	private String[] jogadores;
	private int cont;
	
	public Time() {
		jogadores = new String[5];
		cont = 0;
	}
	
	public void atribui(String n, int v, int e, int d) {
		nome = n;
		vitorias = v;
		empates = e;
		derrotas = d;
	}
	
	public void atribuiJogadores(String j) {
		try {
			jogadores[cont] = j;
			cont++;
		} catch (Exception e) {
			System.err.println("Falha ao adicionar jogador: " + j);
		}
	}
	
	public void imprime() {
		System.out.println("Nome: " + nome);
		System.out.println("Vitórias: " + vitorias);
		System.out.println("Empates: " + empates);
		System.out.println("Derrotas: " + derrotas);
		for (int i = 0; i < jogadores.length; i++) {
			System.out.println("Jogador " + i + " " + jogadores[i]);
		}
	}
	
	public int pontuacao() {
		return vitorias*3 + empates;
	}
}
