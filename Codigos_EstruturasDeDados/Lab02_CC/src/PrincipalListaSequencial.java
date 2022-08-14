
public class PrincipalListaSequencial {

	public static void main(String[] args) {
		ListaSequencial listaSequencial = new ListaSequencial();
		
		listaSequencial.incluiNaLista(new Animal("Raposa"));
		listaSequencial.incluiNaLista(new Animal("Tartaruga"));
		listaSequencial.incluiNaLista(new Animal("Esquilo"));
		listaSequencial.incluiNaLista(new Animal("Coruja"));
		listaSequencial.incluiNaLista(new Animal("Le�o"));
		listaSequencial.incluiNaLista(new Animal("Elefante"));
		
		listaSequencial.exibeLista();
		
		listaSequencial.retiraDaLista("Coruja");
		
		listaSequencial.exibeLista();
		
		listaSequencial.mover("Le�o", 1);
		
		listaSequencial.exibeLista();
	}

}
