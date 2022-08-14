import javax.swing.JOptionPane;

public class Ex2 {

	public static void main(String[] args) {
		
		double salario_bruto, inss, ir, salario_liq;
		
		try {
		double qtde_horasT = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
		double salario_hora = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário por hora: "));
		int dep = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes: "));
			
		salario_bruto = qtde_horasT * salario_hora + (50 * dep);
		 
		if(salario_bruto < 700) { 
			inss = salario_bruto * 0.08;
			
		}
		else if(salario_bruto > 700 && salario_bruto <= 1.248) {
			inss = salario_bruto * 0.08;
			
		}
		else if(salario_bruto > 1.248 && salario_bruto <= 2.080) {
			inss = salario_bruto * 0.09;
			
		}
		else if(salario_bruto > 2.080 && salario_bruto <= 4.159) {
			inss = salario_bruto * 0.11;
			
		}
		else 
			inss = salario_bruto - 458;
			
			
		if(salario_bruto < 700) { 
			ir = 0;
		}
		else if(salario_bruto > 700 && salario_bruto <= 1.000) {
			
			ir = salario_bruto * 0.05;
		}
		else 
			ir= salario_bruto * 0.07;


		salario_liq = salario_bruto - inss - ir;
		
		JOptionPane.showMessageDialog(null, "\nAutor Gabriel Gomes Macedo" + "\nQuantidade de horas trabalhadas: " + qtde_horasT + "\nSálario por hora: " + salario_hora + "\nDependentes: " + dep + "\nAdicional dependentes: 50" + "\nSálario bruto: " + salario_bruto + "\nDesconto INSS: " + inss + "\nDesconto IRRF: " + ir + "\nSálario líquido: " + salario_liq);
		
		}
			catch(NullPointerException e){
				JOptionPane.showMessageDialog(null, "Cancelou \n" + e.toString(), "Sistema", JOptionPane.ERROR_MESSAGE);
			 
		}	catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Formato de número iválido - \n" + e.toString(), "ERRO", JOptionPane.ERROR_MESSAGE);
			 
		}	catch(ArithmeticException e){
				JOptionPane.showMessageDialog(null, "Não foi possível fazer a conta - \n" + "ERRO" + e.toString()); 
				 
		}	
			finally {
				JOptionPane.showMessageDialog(null, "Fim do processamento","Sistema", JOptionPane.WARNING_MESSAGE);
			 
		} 
		
	}
	
}