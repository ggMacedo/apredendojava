import javax.swing.JOptionPane;


public class Exemplo2 {

	public static void main(String[] args) {
		
		String dia;
		 dia = JOptionPane.showInputDialog("Digite o n�mero do dia: ");
		
		 if(dia != null){
			 
			 JOptionPane.showMessageDialog(null, "Rodou");
			 
			 try{ 
				int doi = Integer.parseInt(dia); 
				System.out.println((5/doi));
				 
			 }catch(NumberFormatException e){
				 System.out.println("Digite um valor valido");
				 
			 }catch(ArithmeticException e){
				 System.out.println("N�o consigo dividir");
				 
			 }finally {
				 JOptionPane.showMessageDialog(null, "Fim do processamento","Sistema", JOptionPane.WARNING_MESSAGE);
				 
			 }
				  
		 }
		 else{
			 JOptionPane.showMessageDialog(null, "Cancelou","Sistema", JOptionPane.ERROR_MESSAGE);
		 }
		 
	}

}
