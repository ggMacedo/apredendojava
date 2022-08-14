
public class Fibonacci {
	
	public static int fibonaci (int n) {
		
		if(n<=1) {
			return 1;
		}
		
		return fibonaci(n-1) + fibonaci(n-2); 
		
	}
	
	public static int somatorio(int n) {
		if(n==1) {
			return 1;
		}
		
		return n + somatorio(n-1); 
			
	}
	
	public static void main(String[] args) {
	  	int fibonacciR = fibonaci(5);
		System.out.println(fibonacciR);
	   	int somatorioR = somatorio(50);
		System.out.println(somatorioR);
	}
	


}
