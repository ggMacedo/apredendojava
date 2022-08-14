import javax.swing.JOptionPane;

public class Exemplo1 {
	public static void main(String[] args) {
		float n1, n2, resp=0;
		
		
		n1 = 5;
		try{
			n2= Float.parseFloat(JOptionPane.showInputDialog("DIGITE"));
			resp = n1 / n2;
		}catch (Exception e){
			System.out.println("Fudeu \n" + e.toString());
		}
		
		System.out.println(resp);
	}

}
