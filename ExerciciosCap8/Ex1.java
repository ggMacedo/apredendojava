import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
	
		double imcM, imcH;
		String sexo;
		
		try{
		sexo = JOptionPane.showInputDialog("Qual o sexo: \nDigite [h] para Homem\n Digite [m] para Mulher");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		
			if(sexo.equals("h")){
				imcH = peso / (altura * altura);
				
				if(imcH < 20)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcH + "\nPeso abaixo do normal");
					
				else if (imcH >= 20 && imcH < 25)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcH + "\nPeso ideal");
					
				else if (imcH >= 25 && imcH < 30)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcH + "\nPré-obesidade");
					
				else if (imcH >= 30 && imcH < 40)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcH + "\nObesidade classe I");
					
				else if (imcH >= 40 && imcH < 43)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcH + "\nObesidade classe II (severa)");
					
				else
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcH + "\nObesidade classe III (mórbida)");
				} 
				
			if(sexo.equals("m")){
				imcM = peso / (altura * altura);
					
				if(imcM < 19)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcM + "\nPeso abaixo do normal");
					
				else if (imcM >= 19 && imcM < 24)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcM + "\nPeso ideal");
					
				else if (imcM >= 24 && imcM < 29)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcM + "\nPré-obesidade");
					
				else if (imcM >= 29 && imcM < 39)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcM + "\nObesidade classe I");
					
				else if (imcM >= 39 && imcM < 42)
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcM + "\nObesidade classe II (severa)");
					
				else
					JOptionPane.showMessageDialog(null, "Seu IMC é de: "+ imcM + "\nObesidade classe III (mórbida)");
				}
				
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Cancelou \n" + e.toString(), "Sistema", JOptionPane.ERROR_MESSAGE);
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Formato de número iválido - \n" + e.toString(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, "Não foi possível fazer a conta - \n" + "ERRO" + e.toString()); 
		}	 
		finally {
			JOptionPane.showMessageDialog(null, "Fim do processamento","Sistema", JOptionPane.WARNING_MESSAGE);
		} 
	}
}