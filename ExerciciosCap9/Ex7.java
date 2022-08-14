import javax.swing.JOptionPane;
public class Ex7 {

	public static void main(String[] args) {
	
		int op;
		try{
			do{
				op = Integer.parseInt(JOptionPane.showInputDialog("Escolha o codigo:" + "\nCodigo-1 aumento de 5%\nCodigo-2 aumento de 10%\nCodigo-3 aumento de 20%\nCodigo-4 aumento de 50%"));
				double valorp;
				double result;
				switch(op){
				
				case 1:
					valorp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
					result = valorp + (valorp * 0.05);
					JOptionPane.showMessageDialog(null, "\nO produto no valor de: " + valorp + " custara " + result + " com o aumento de escolhido");
				break;
					
				case 2:
					valorp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
					result = valorp + (valorp * 0.1);
					JOptionPane.showMessageDialog(null, "\nO produto no valor de: " + valorp + " custara " + result + " com o aumento de escolhido");
					
				break;
				
					
				case 3:
					valorp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
					result = valorp + (valorp * 0.2);
					JOptionPane.showMessageDialog(null, "\nO produto no valor de: " + valorp + " custara " + result + " com o aumento de escolhido");
					
				break;
				
				case 4:
					valorp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
					result = valorp + (valorp * 0.5);
					JOptionPane.showMessageDialog(null, "\nO produto no valor de: " + valorp + " custara " + result + " com o aumento de escolhido");
					
				break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opcao Invalida!");
				break;

				}
				
			}while(op != 0);
			
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
