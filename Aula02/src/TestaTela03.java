//GABRIEL GOMES MACEDO N6598A4 CC4P33

import java.awt.Color;

public class TestaTela03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tela03 t01 = new Tela03();
		Tela03 t02 = new Tela03();
		
		t01.setTitle("Tela Base - Utilizando AWT");
		t01.setSize(t01.d01);
		t01.setBackground(Color.GREEN);
		t01.setResizable(false);
		t01.setVisible(true);
		
		t02.setTitle("Tela Base - Tela 02");
		t02.setSize(t02.d01);
		t02.setLocation(300, 0);
		t02.setBackground(Color.yellow);
		t02.setResizable(false);
		t02.setVisible(true);
		

	

	}

}
