import javax.swing.JOptionPane;
public class Ex3 {
	public static void main(String[] args) {
		int matriz[][] = new int[50][20];
		int i=0, linha=0, coluna=0;
			
			
		for(linha=0; linha<=49; linha++)
			for(coluna=0; coluna<=19; coluna++){
				i = (int)(Math.random() * 1000);
				matriz[linha][coluna] = i;
			
			}
			int procurado = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
			boolean status = false;
				
			for(linha=0; linha<=49; linha++)
				for(coluna=0; coluna<=19; coluna++){
					if(procurado == matriz[linha][coluna]){
						status = true;
					}
				}
				
			if(status == true){
				JOptionPane.showMessageDialog(null, "Numero encontrado");
			}
			if(status == false){
				JOptionPane.showMessageDialog(null, "Numero nao encontrado");
			}
	}
}