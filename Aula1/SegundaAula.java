import java.util.Scanner;

class SegundaAula 
{
	public static void main(String[] args)
	{
		String nome; String cpf; String idade;
		
                Scanner florzinha  = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
                nome = florzinha.next();
		System.out.println("Digite seu cpf: ");
                cpf = florzinha.next();
		System.out.println("Digite sua idade: ");
                idade = florzinha.next();

		System.out.print("Sua idade: " + idade);
		System.out.print(" Seu CPF: " + cpf);
		System.out.print(" Seu nome: " + nome);
	}

}