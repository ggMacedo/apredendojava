//GABRIEL GOMES MACEDO N6598A4 CC4P33



import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;


public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelaEx4 t01 = new TelaEx4 ();
		Label lbl01 = new Label();
		Label lbl02 = new Label();
		Label lbl03 = new Label();
		Label lbl04 = new Label();
		Label lbl05 = new Label();
		
		TextField txtNome = new TextField();
		TextField txtEmail = new TextField();
		TextField txtEnd = new TextField();
		TextField txtTel = new TextField();
		TextField txtCod = new TextField();
		
		Button btnOk= new Button();
		Button btn1= new Button();
		
		lbl01.setLocation(20, 50);
		lbl01.setSize(50, 20);
		lbl01.setText("Código: ");

		
		lbl02.setLocation(200, 50);
		lbl02.setSize(50, 20);
		lbl02.setText("Nome: ");
		
		lbl03.setLocation(20, 90);
		lbl03.setSize(40, 20);
		lbl03.setText("E-mail: ");
		
		lbl04.setLocation(290, 90);
		lbl04.setSize(40, 20);
		lbl04.setText("Fone: ");
		
		lbl05.setLocation(20, 130);
		lbl05.setSize(60, 20);
		lbl05.setText("Endereço: ");
		
		txtCod.setSize(80, 20);
		txtCod.setLocation(70, 50);

		txtNome.setSize(200, 20);
		txtNome.setLocation(250, 50);
		

		txtEmail.setSize(170, 20);
		txtEmail.setLocation(70, 90);
		
		txtEnd.setSize(120, 20);
		txtEnd.setLocation(330, 90);
		
		txtTel.setSize(360, 20);
		txtTel.setLocation(90, 130);

		
		btnOk.setLocation(370, 250);
		btnOk.setSize(70, 25);
		btnOk.setLabel("OK");

				
		t01.setTitle("Tela Cadstro");
		t01.setSize(t01.d01);
	
		t01.add(lbl01);
		t01.add(lbl02);
		t01.add(lbl03);
		t01.add(lbl04);
		t01.add(lbl05);
		t01.add(txtCod);
		t01.add(txtNome);
		t01.add(txtEmail);
		t01.add(txtEnd);
		t01.add(txtTel);
		t01.add(btnOk);
		t01.add(btn1);
		
		t01.setVisible(true);
		
	}

}
