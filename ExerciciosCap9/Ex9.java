import javax.swing.JOptionPane;
public class Ex9 {

	public static void main(String[] args) {
		int i =0;
    
        for(i=1; i<=3; i++){
				
			String senha = JOptionPane.showInputDialog("Digite a senha: ");
			if(senha.equals("Java")){
				JOptionPane.showMessageDialog(null, "Senha Valida");
			break;
			}
			
			if (senha != "Java"){
				JOptionPane.showMessageDialog(null, "Senha invalida, tentativa " + i);
				
			continue;
			}			
			
		}
		 if(i==4){
			JOptionPane.showMessageDialog(null, "Cartao Cancelado!");
			}
	}	
}	