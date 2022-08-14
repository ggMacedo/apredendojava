import java.util.Scanner;
public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, str2;
		System.out.println("Digite seu primeiro nome: ");
		str = sc.next();
		System.out.println("Digite seu segundo nome: ");
		str2 = sc.next();
		
		System.out.println("Tamanho do primeiro nome: " + str.length());
		System.out.println("Tamanho do segundo nome: " + str2.length());
		String concat1 = str.toUpperCase() + str2.toUpperCase();
		String concat2 = str.toLowerCase() + str2.toLowerCase();
		
		System.out.println("Concatenacao Maiuscula: " + concat1);
		System.out.println("Concatenacao Minuscula: " + concat2);

		sc.close();
	}
}
