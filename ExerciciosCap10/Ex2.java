import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Ex2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat();
		double valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda:"));
		double porc = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de desconto:"));
		double result;
		double desconto;
		
		desconto = (valorVenda / 100) * porc;
		result = valorVenda - desconto;
		
		df.applyPattern("R$ #,##0.00");
		
		JOptionPane.showMessageDialog(null, "Valor original:" + df.format(valorVenda) + "\nPercentual de desconto:" + Math.round(porc) + "%" + "\nValor final do produto com desconto:" + df.format(result));
	}	
}