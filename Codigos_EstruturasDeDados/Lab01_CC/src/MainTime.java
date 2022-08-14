
public class MainTime {
	public static void main(String[] args) {
		Time time = new Time();
		
		time.atribui("PSG", 10, 5, 2);
		time.atribuiJogadores("Neymar");
		time.atribuiJogadores("Messi");
		time.atribuiJogadores("MBapee");
		time.atribuiJogadores("Marquinhos");
		time.atribuiJogadores("Sergio Ramos");
		time.atribuiJogadores("Teste");
		
		time.imprime();
		
		System.out.println("Pontuação: " + time.pontuacao());
	}
}
