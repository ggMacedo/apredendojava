//GABRIEL GOMES MACEDO N6598A4 CC4P33


import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;


public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelaEx3 t01 = new TelaEx3 ();
		Label lbl01 = new Label();
		Label lbl02 = new Label();
		TextField txtNome = new TextField();
		TextField txtEmail = new TextField();
		Button btnCancelar = new Button();
		Button btnOk= new Button();
		Button btn1= new Button();
		
		lbl01.setLocation(20, 50);
		lbl01.setSize(50, 20);
		lbl01.setText("Nome: ");

		
		lbl02.setLocation(20, 80);
		lbl02.setSize(50, 20);
		lbl02.setText("E-mail: ");

		txtNome.setSize(170, 20);
		txtNome.setLocation(100, 50);


		txtEmail.setSize(170, 20);
		txtEmail.setLocation(100, 80);

		
		btnCancelar.setLocation(20, 120);
		btnCancelar.setSize(100, 20);
		btnCancelar.setLabel("Cancelar");
		
		btnOk.setLocation(150, 120);
		btnOk.setSize(100, 20);
		btnOk.setLabel("OK");

				
		t01.setTitle("Tela E-mail");
		t01.setSize(t01.d01);
		t01.add(btnOk);
		t01.add(btnCancelar);
		t01.add(lbl01);
		t01.add(lbl02);
		t01.add(txtNome);
		t01.add(txtEmail);
		t01.add(btn1);
		
		t01.setVisible(true);
		
	}

}
