
public class Fatorial {
	
	public static int  factorialnaorec(int num){
	    int total = 1;
	    for (int i=num; i>1; i--){
	          total *= i;
	    }
	    return total;
	}
	
	public static int fatorial(int num){
		if (num == 0){
		   return 1;
	    } 	    
	        
		return num * fatorial(num-1);
	} 
	
	public static void main(String[] args) {
	  	int fatorialNR = factorialnaorec(5);
		System.out.println(fatorialNR);
	   	int fatorialR = fatorial(5);
		System.out.println(fatorialR);
	}

}
