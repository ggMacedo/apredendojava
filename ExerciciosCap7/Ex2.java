import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		double result;
		double valorp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
		double codigo = Double.parseDouble(JOptionPane.showInputDialog("Digite o codigo de aumento: " + "\nCodigo-1 aumento de 15%" + "\nCodigo-2 aumento de 20% " + "\nCodigo-3 aumento de 35%" + "\nCodigo-4 aumento de 40%"));
		
		if(codigo == 1){
			result = valorp + (valorp * 0.15);
			JOptionPane.showMessageDialog(null, "\nO produto no valor de: " + valorp + " custará " + result + " com o aumento de escolhido");
			}
		
			else if(codigo == 2){
			result = valorp + (valorp * 0.20);
			JOptionPane.showMessageDialog(null, "\nO produto no valor de: R$" + valorp + " custará " + result + " com o aumento de escolhido");
			}
		
			else if(codigo == 3){
			result = valorp + (valorp * 0.35);
			JOptionPane.showMessageDialog(null, "\nO produto no valor de: R$" + valorp + " custará " + result + " com o aumento de escolhido");
			}
		
			else if(codigo == 4){
			result = valorp + (valorp * 0.40);
			JOptionPane.showMessageDialog(null, "\nO produto no valor de: R$" + valorp + " custará " + result + " com o aumento de escolhido");
			}
			
	}

}
