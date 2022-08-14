import java.util.*;

public class Ex1 {
	static int x, y;
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int z;
		x = lerInt("Primeiro Numero: ");
		y = lerInt("Segundo Numero: ");
		z = lerInt("Terceiro Numero: ");
		imprima("Soma: " + somar(x,y));
		imprima("Teste: " + somar(20,13));
		imprima("Produto: " + multiplicar(x,y));
		imprima("Dobro do primeiro: " + dobro(x));
		imprima("Dobro do segundo: " + dobro(y));
		imprima("Dobro do terceiro: " + dobro(z));
		
	}
	
	public static void imprima(String s) {
		System.out.println(s);
	}
	
	public static int somar(int a, int b) {
		int soma;
		soma = a+b;
		return soma;
	}
	
	public static int multiplicar(int a, int b) {
		return a * b;
	}
	
	public static int dobro(int a) {
		return somar(a, a);
	}
	
	public static int lerInt(String texto) {
		int num;
		System.out.println(texto);
		num= teclado.nextInt();
		return num;
	}
		

}
