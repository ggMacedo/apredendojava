import java.util.*;

public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String seuNome;
		System.out.print("Qual seu nome?");
		seuNome = ler.nextLine();
		System.out.print("Ola, " + seuNome + "!\nEu sou o Java.");
		Random rnd = new Random();
		int n1, n2;
		String cont = "SIM";
		while(cont.toUpperCase().equals("SIM")) {
			n1 = rnd.nextInt(100);
			n2 = rnd.nextInt(100);
			System.out.println("Numero 1 = " + n1);
			System.out.println("Numero 2 = " + n2);
			System.out.println("Soma = " + soma(n1, n2));
			System.out.println("Produto = " + produto(n1, n2));
			if(n1 > n2) {
				System.out.println("Maior = " + n1);
			}else {
				System.out.println("Maior = " + n2);
			}
			System.out.println("Maior na Função" + maior(n1, n2));
			System.out.println("Executar novamente ? (Sim ou Nao) ");
			cont = ler.nextLine();

		}
		System.out.println("Fim do programa");
		ler.close();
	}
	
	public static int soma(int a, int b) {
		int soma;
		soma = a+b;
		return soma;
	}
	
	public static int produto(int a, int b) {
		return a * b;
	}
	
	public static float dobro(float a) {
		return a * 2;
	}
	
	static int maior(int a, int b) {
		return (a>b ? a:b);
	}
	

}
