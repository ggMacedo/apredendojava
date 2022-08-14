import javax.swing.JOptionPane;
public class Ex8 {

	public static void main(String[] args) {
		
		String op;
		try{
			do{
				op = JOptionPane.showInputDialog("Escolha a letra:" + "\nA- Soma\nB- Subtracao\nC- Multiplicacao\nD- Divisao");
				double numero1, numero2, result;
				switch(op){
					
				case "a":
				case "A":
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
					result = numero1 + numero2;
					JOptionPane.showMessageDialog(null, "\nOs numeros fornecidos foram: " + numero1 + " e " + numero2 + " \nOperacao escolhida: " + " soma" + "\nResultado da operacao: " + result);
						
				break;
					
				case "b":	
				case "B":
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
					result = numero1 - numero2;
					JOptionPane.showMessageDialog(null, "\nOs numeros fornecidos foram: " + numero1 + " e " + numero2 + " \nOperacao escolhida: " + " subtracao" + "\nResultado da operacao: " + result);
						
				break;
					
				case "c":	
				case "C":
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
					result = numero1 * numero2;
					JOptionPane.showMessageDialog(null, "\nOs numeros fornecidos foram: " + numero1 + " e " + numero2 + " \nOperacao escolhida: " + " multiplicacao" + "\nResultado da operacao: " + result);
						
				break;
					
				case "d":
				case "D":
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero: "));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero: "));
					result = numero1 / numero2;
					JOptionPane.showMessageDialog(null, "\nOs numeros fornecidos foram: " + numero1 + " e " + numero2 + " \nOperacao escolhida: " + " divisao" + "\nResultado da operacao: " + result);
					
				break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opcao Invalida!");
				break;

				}
					
			}while(op != "A");
			
		}	catch(NullPointerException e){
				JOptionPane.showMessageDialog(null, "Cancelou \n" + e.toString(), "Sistema", JOptionPane.ERROR_MESSAGE);
			 
		}	catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Formato de numero ivalido - \n" + e.toString(), "ERRO", JOptionPane.ERROR_MESSAGE);
			 
		}	catch(ArithmeticException e){
				JOptionPane.showMessageDialog(null, "Nao foi possivel fazer a conta - \n" + "ERRO" + e.toString()); 
				 
		}	
			finally {
				JOptionPane.showMessageDialog(null, "Fim do processamento","Sistema", JOptionPane.WARNING_MESSAGE);
			 
		} 
	}	
}	