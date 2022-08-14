
public class FilaSequencial {
	private int[] fila;
	private int inicio, fim;
	
	public FilaSequencial() {
		fila = new int[4];
		inicio = 0;
		fim = 0;
	}
	
	public void enfileirar(int obj) {
		if (!estaCheia()) { 
			fila[fim] = obj;
			fim++;
		} else System.err.println("A fila est� cheia e novos objetos n�o podem ser adicionados.");
	}
	
	public void desenfileirar() {
		if (!estaVazia()) {
			int obj = fila[inicio];
			fila[inicio] = 0;
			inicio++;
			System.out.println("O objeto " + obj + " foi removido da fila.");
		} else {
			System.out.println("A fila est� vazia. Fazendo a libera��o de uma nova fila...");
			inicio = 0;
			fim = 0;
		}
	}
	
	public boolean estaCheia() {
		return (fim>=fila.length);
	}
	
	public boolean estaVazia() {
		return (inicio == fim);
	}
	
	public void exibe() {
		System.out.println("Exibe a fila:");
		for (int i = inicio; i < fila.length; i++) {
			System.out.println(i + ": " + fila[i]);
		}
	}
}
