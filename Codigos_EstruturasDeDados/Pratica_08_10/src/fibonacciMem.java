
public class fibonacciMem {
	private final static int TAM_MEMORIA = 25;
	private static long[] memoria = new long[TAM_MEMORIA];
	
	public static long fibonacci(int n) {
		if(n<2) {
			return memoria[n];
		}
		
		long long_fib = memoria[n];
		if(long_fib ==0) {
			long_fib = fibonacci(n-1) + fibonacci(n-2); 
			memoria[n] = long_fib;
			
		}
		return memoria[n];
	}
	
	public static void main(String[] args) {
	 	memoria[0] = 0;
		memoria[1] = 1;
		
		for(int i =0; i<TAM_MEMORIA; i++) {
			System.out.println("Fibonacci de " + i + " : " + fibonacci(i));
		}
	  			
	}
	

}
