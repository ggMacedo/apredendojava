
public class Fibonacci {

	public void sequencia(int p) { //m�todo interativo
		int p1 = 1, p2 = 1;
		int soma;

		System.out.println(p1);//posi��o 0
		System.out.println(p2);//posi��o 1
		for (int i = 2; i < p; i++) {
			soma = p1 + p2;
			System.out.println(soma);
			p1 = p2;
			p2 = soma;
		}
	}
	
	public int fib(int p) { //m�todo recursivo
		if (p<=2)
			return 1;
		else
			return fib(p-1)+fib(p-2);
	}
	
	public static void main(String[] args) {
		
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.sequencia(7);
		
		System.out.println("Valor da posi��o 1: " + fibonacci.fib(1));
		System.out.println("Valor da posi��o 2: " + fibonacci.fib(2));
		System.out.println("Valor da posi��o 5: " + fibonacci.fib(5));
		System.out.println("Valor da posi��o 6: " + fibonacci.fib(6));
	}

}
