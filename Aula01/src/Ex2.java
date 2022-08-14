import java.time.LocalDate;
import java.util.*;

public class Ex2 {
	static String nomeEleitor;
	static int idade;
	static int anoNasc;
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Qual seu nome? ");
		nomeEleitor = teclado.nextLine();
		System.out.println("Qual o ano de nascimento? ");
		anoNasc = teclado.nextInt();
		idade = calculoIdade(anoNasc);
		
		if(idade < 16) {
			System.out.println("Voc� n�o pode votar!");
		}else {
			System.out.println("Voc� pode votar.");
		}
		System.out.println("Quem nasceu em 2001, tem " + calculoIdade(anoNasc) + " anos.");
	
	}
	
	static int calculoIdade(int ano) {
		return LocalDate.now().getYear() - ano;
	}
}
