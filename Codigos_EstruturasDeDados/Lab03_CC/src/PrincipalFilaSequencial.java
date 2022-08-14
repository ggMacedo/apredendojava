
public class PrincipalFilaSequencial {

	public static void main(String[] args) {
		FilaSequencial fila = new FilaSequencial();
		
		fila.enfileirar(10);
		fila.enfileirar(23);
		fila.enfileirar(55);
		fila.enfileirar(9);

		fila.exibe();
		
		fila.desenfileirar();
		fila.desenfileirar();
		//fila.desenfileirar();
		//fila.desenfileirar();
		
		//fila.desenfileirar();
				
		fila.exibe();
		
		fila.enfileirar(77);

		fila.exibe();
		
		fila.desenfileirar();
		fila.desenfileirar();

		fila.exibe();
		
		//fila.enfileirar(77);

		//fila.exibe();
	}

}
