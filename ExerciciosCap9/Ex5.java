public class Ex5 {

	public static void main(String[] args) {
		long n = 1;
		long result=1;
		long soma=1;
		
		long n2 = 1;
		long result2=1;
		long soma2=1;
		
		long n3 = 1;
		long result3=1;
		long soma3=1;
		
		long n4 = 1;
		long result4=1;
		long soma4=1;
		
		System.out.print("\n Fatorial 10 \n");
		for(n = 1; n<=10; n++){
		result *= soma * n ;
			
		System.out.print(n + " != " + result + "\n");
		}
		System.out.print("\n");
		
		System.out.print("\n Fatorial 20 \n");
		for(n2 = 1; n2<=20; n2++){
		result2 *= soma2 * n2 ;
			
		System.out.print(n2 + " != " + result2 + "\n");
		}
		System.out.print("\n");
		
		System.out.print("\n Fatorial 30 \n");
		for(n3 = 1; n3<=30; n3++){
		result3 *= soma3 * n3 ;
			
		System.out.print(n3 + " != " + result3 + "\n");
		}
		System.out.print("\n");
		
		System.out.print("\n Fatorial 40 \n");
		for(n4 = 1; n4<=40; n4++){
		result4 *= soma4 * n4 ;
			
		System.out.print(n4 + " != " + result4 + "\n");
		}

		System.out.println("\nAcabou");
		
	}	
}	
