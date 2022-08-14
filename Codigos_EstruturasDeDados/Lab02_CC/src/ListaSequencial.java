import java.util.Iterator;

public class ListaSequencial {
	private Animal[] listaAnimais = new Animal[4];
	private int tamanho = 0;
	
	public void alocarMaisPosicoes() {
		Animal[] tempLista = new Animal[listaAnimais.length + (int)(listaAnimais.length*0.5)];
		for (int i = 0; i < listaAnimais.length; i++) {
			tempLista[i] = listaAnimais[i];
		}
		listaAnimais = tempLista;
	}
	
	public void incluiNaLista(Animal animal) {
		if (tamanho == listaAnimais.length)
			alocarMaisPosicoes();
		listaAnimais[tamanho] = animal;
		tamanho++;
	}
	
	public void incluiNaLista(Animal animal, int posicao) {
		if (tamanho == listaAnimais.length)
			alocarMaisPosicoes();
		for (int i = tamanho-1; i >= posicao ; i--) {
			listaAnimais[i+1] = listaAnimais[i]; 
		}
		listaAnimais[posicao] = animal;
		tamanho++;
	}
	
	public void exibeLista() {
		System.out.println("Tamanho lista: " + tamanho);
		for (int i = 0; i < tamanho; i++) {
			System.out.println(i + ": " + listaAnimais[i].getNome());
		}
	}
	
	public Animal retiraDaLista(String nome) {
		Animal auxAnimal = null;
		for (int i = 0; i < tamanho-1; i++) {
			if (listaAnimais[i].getNome() == nome)
				auxAnimal = listaAnimais[i];
			if (auxAnimal != null)
				listaAnimais[i] = listaAnimais[i+1];
		}
		tamanho--;
		return auxAnimal;
	}
	
	public void mover(String nome, int destino) {
		incluiNaLista(retiraDaLista(nome), destino);
	}
}
