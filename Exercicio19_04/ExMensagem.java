import javax.swing.JOptionPane;
public class ExMensagem {

	public static void main(String[] args) {
	
		int op;
		int gerente;
		try{
			do{
				op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma mensagem:" + "\n1- Mensagem Bom Dia" + "\n2- Mensagem Boa Tarde" + "\n3- Mensagem de Boa Noite" + "\n4- Sair"));
				switch(op){
				
				case 1:
					
					JOptionPane.showMessageDialog(null, "Bom Dia");
				break;
					
				case 2:
					JOptionPane.showMessageDialog(null, "Boa Tarde");
					
				break;
					
				case 3:
					JOptionPane.showMessageDialog(null, "Boa Noite");
					
				break;
				
				case 4:
					gerente = JOptionPane.showConfirmDialog(null,"Deseja Sair?", "Sistema", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
							
					if(gerente == JOptionPane.NO_OPTION){
						op =0;
						JOptionPane.showMessageDialog(null, "Voltando para o menu");
					}
					
				break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opcao Invalida!");
				break;

				}
				
			}while(op != 4);
			
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
