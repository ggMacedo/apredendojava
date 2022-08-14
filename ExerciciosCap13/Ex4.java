
import java.util.Arrays;
public class Ex4 {
	public static void main(String[] args) {
		int numeros[] = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};
		Arrays.sort(numeros);
		
		System.out.print("Crescente: ");
		for(int n: numeros){
			System.out.print(n + ", ");
		}
		System.out.println();
		System.out.print("Decrescente: ");
		for(int i = numeros.length - 1; i >= 0; i--){
			System.out.print(numeros[i] + ", ");
		}
		
		
		
	}
}