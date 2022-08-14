import javax.swing.JOptionPane;
import java.util.Arrays;
public class Ex2 {
	public static void main(String[] args) {
		int numeros[] = new int[10];
		int i= 0;
		int soma=0, maior=0, menor=0;
		for(i = 0; i < 10; i++){
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os numeros:"));
			
		}
		Arrays.sort(numeros);
		for(int n: numeros){
			menor = numeros[0];
			maior = numeros[9];
		}
		soma = menor + maior;
		JOptionPane.showMessageDialog(null, "Soma do maior e menor numeros:" + soma);
	}
}