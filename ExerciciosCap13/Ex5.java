import javax.swing.JOptionPane;
public class Ex5 {
	public static void main(String[] args) {
		String matriz[][] = new String[2][5], procurado, procurado1, msg="";
		int coluna=0, linha=0;
		boolean status = false;
		Object[] opcoes = {"masculino","feminino"};
		
		/* Cadastro */
		for(linha=0; linha<2; linha++)
			for(coluna=0; coluna<5; coluna++){
				
				/* Nome */
				if(linha==0){
					matriz[0][coluna] =  JOptionPane.showInputDialog(null, "Digite o nome da " + (coluna + 1) + " pessoa:", "Nomes", JOptionPane.PLAIN_MESSAGE);
					
				}
				/* Sexo */
				else if(linha==1){
					Object sexo = JOptionPane.showInputDialog(null, "Selecione o sexo de " + matriz[0][coluna], "Sexo", JOptionPane.PLAIN_MESSAGE, null, opcoes, "");
					
					if(sexo.equals("masculino")){
						matriz[1][coluna] = "masculino";
						
					}else if(sexo.equals("feminino")){
						matriz[1][coluna] = "feminino";
						
					}	
				}				
			}
			
		/* Pesquisa */
		procurado = JOptionPane.showInputDialog(null, "Qual o sexo a ser pesquisado?", "Sexo", JOptionPane.QUESTION_MESSAGE);
		procurado = procurado.replaceAll(" ", "");
		procurado1 = procurado.toLowerCase();
	
		for(int j=0; j<5; j++){
			if(matriz[1][j].equals(procurado1)){
				status = true;
				if(status == true) {
					msg += (j + 1) + " - " + matriz[0][j] + "\n";
				}
			}
		}
		if(status == true){
			JOptionPane.showMessageDialog(null, "As pessoas encontradas com o sexo " + procurado1 + " foram: \n" + msg);
		}
		
		if(status == false){
			JOptionPane.showMessageDialog(null, "Sexo nao encontrado.");
		}
		
	}
}