public class FuncaoFatorialRecursiva{
	private static int fatorial(int n){
    		if ((n==0) || (n==1)) return 1; 
    		return n * fatorial(n-1); 
	}
	public static void main(String [] args){
    		for(int i=0; i<5; i++)
        	System.out.println(“Fatorial de ” + i + “é: ” + fatorial(i));
	}
}