import javax.swing.JOptionPane;
public class Ex6 {
	public static void main(String[] args) {
		String matriz[][] = new String[5][10], msg="";
		int op=0, coluna=0, linha=0, andar=0, quarto=0, sair=0;	
		Object[] opcoes = {"LIVRE","OCUPADO"};
		
		for (linha=0 ; linha<=4 ; linha++)
			for (coluna=0 ; coluna<=9 ; coluna++){
				matriz[linha][coluna] = "LIVRE";
				
			}
		
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opcao:\n1 - Lista de quartos\n2 - Ocupar ou desocupar um quarto\n3 - Sair"));
			
			switch(op){
				case 1:
				
					/* 1º ANDAR */
					for (linha=0 ; linha<=0 ; linha++){
						msg = (linha + 1) + " Andar \n";	
						
						for (coluna=0 ; coluna<=9 ; coluna++){
							msg += (coluna + 1) + " - Quarto: " + matriz[linha][coluna] + "\n";
						}
					}
					JOptionPane.showMessageDialog(null, msg);
					
					/* 2º ANDAR */
					for (linha=0 ; linha<=1 ; linha++){
						msg = (linha + 1) + " Andar \n";	
						
						for (coluna=0 ; coluna<=9 ; coluna++){
							msg += (coluna + 1) + " - Quarto: " + matriz[linha][coluna] + "\n";
						}
					}
					JOptionPane.showMessageDialog(null, msg);
					
					/* 3º ANDAR */
					for (linha=0 ; linha<=2 ; linha++){
						msg = (linha + 1) + " Andar \n";	
						
						for (coluna=0 ; coluna<=9 ; coluna++){
							msg += (coluna + 1) + " - Quarto: " + matriz[linha][coluna] + "\n";
						}
					}
					JOptionPane.showMessageDialog(null, msg);
					
					/* 4º ANDAR */
					for (linha=0 ; linha<=3 ; linha++){
						msg = (linha + 1) + " Andar \n";	
						
						for (coluna=0 ; coluna<=9 ; coluna++){
							msg += (coluna + 1) + " - Quarto: " + matriz[linha][coluna] + "\n";
						}
					}
					JOptionPane.showMessageDialog(null, msg);
					
					/* 5º ANDAR */
					for (linha=0 ; linha<=4 ; linha++){
						msg = (linha + 1) + " Andar \n";	
						
						for (coluna=0 ; coluna<=9 ; coluna++){
							msg += (coluna + 1) + " - Quarto: " + matriz[linha][coluna] + "\n";
						}
					}
					JOptionPane.showMessageDialog(null, msg);
					
					break;
					
				case 2:
					
					andar = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do andar desejado:", "Andar", JOptionPane.QUESTION_MESSAGE));
					if(andar > 0 && andar <6){
						quarto =  Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do quarto desejado:", "Quarto", JOptionPane.QUESTION_MESSAGE));
					}else{
						JOptionPane.showMessageDialog(null, "Opcao Invalida!");
					}
					
					if(quarto > 0 && quarto <11){
						andar = andar - 1;
						quarto = quarto -1;
						Object opcao = JOptionPane.showInputDialog(null, "Defina a ocupacao do quarto:", "Ocupacao do quarto", JOptionPane.PLAIN_MESSAGE, null, opcoes, "");
						
						if(opcao.equals("LIVRE")){
							matriz[andar][quarto] = "LIVRE";
						
						}else if(opcao.equals("OCUPADO")){
							matriz[andar][quarto] = "OCUPADO";
								
						}else{
							JOptionPane.showMessageDialog(null, "Opcao Invalida!");
						}
					}else{
						JOptionPane.showMessageDialog(null, "Opcao Invalida!");
						
					}
					
					break;
					
				case 3:
				
					sair = JOptionPane.showConfirmDialog(null,"Deseja Sair?", "Sistema", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
					if(sair == JOptionPane.YES_OPTION){
						JOptionPane.showMessageDialog(null, "Obrigado por utilizar o sistema!");
					}else{
						JOptionPane.showMessageDialog(null, "Voltando para o menu...");
						op=0;
					}
					
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "\nOpcao Invalida!\n");
				break;
			}
			
		}while(op!=3);
	}
}