
public class Ex4Busca {

		public static boolean buscarNumeros(int numero, int[] numeros){
			
			boolean achou = false;
			
            for(int i = 0; i < numeros.length; i++){
            	
                if (numeros[i] == numero){
                   achou = true;    
                   break;
                }   	
            }
         
			return achou;
			
		}
		
		public static boolean buscarPalavra(String palavra, String[] palavras) {
			boolean achou1 = false;
			
            for(int i = 0; i < palavras.length; i++){
            	
                if (palavras[i] == palavra){
                   achou1 = true;    
                   break;
                }   	
            }
         
			return achou1;
			
		}
}
