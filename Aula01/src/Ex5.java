import java.util.*;
public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("Digite seu nome completo: ");
		str = sc.nextLine();
		System.out.println("String: " + str);
		System.out.println("Tamanho: " + str.length());
		System.out.println("Maiuscula: " + str.toUpperCase());
		System.out.println("Minuscula: " + str.toLowerCase());
		System.out.println("charAt(0): " + str.charAt(0));
		System.out.println("charAt(1): " + str.charAt(1));
		System.out.println("charAt(5): " + str.charAt(5));
		System.out.println("charAt(6): " + str.charAt(6));
		System.out.println("substring(0,3): " + str.substring(0, 3));
		System.out.println("substring(6,8): " + str.substring(6, 8));
		System.out.println("indexOf(\"A\"): " + str.indexOf("A"));
		sc.close();
	}

}
