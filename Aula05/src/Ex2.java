//GABRIEL GOMES MACEDO N6598A4 CC4P33

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ex2 extends TelaBaseEx02 implements ActionListener{
	
	private JLabel lblNota1; // Nota 1
	private JLabel lblNota2; // Nota 2
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JLabel lblMedia; // Media;
	private JLabel lblValorMedia; ///Resultado de (Nota 1 + Nota 2 ) / 2
	private JButton btCalcular; //Calcular Calcular a Média
	private JButton btSair;
	
	private int n1, n2, media;
	
	public Ex2(){
		
		 setLayout(new GridLayout(4,2, 10, 10));
		 lblNota1 = new JLabel("Nota 1:");
	     lblNota2	= new JLabel("Nota 2:");
	     
	     txtNota1 = new JTextField();
	     txtNota2 = new JTextField();
	     
	     
	     lblMedia = new JLabel("Média:");
	     
	     lblValorMedia = new JLabel("0");
	     
	     
	     btCalcular = new JButton("Calcular");
	     btCalcular.addActionListener(this);
	    
	     btSair= new JButton("Sair");
	     btSair.addActionListener(this);

	     add(lblNota1);
	     add(txtNota1);
	     add(lblNota2);
	     add(txtNota2);
	     add(lblMedia);
	     add(lblValorMedia);
	     add(btCalcular);
	     add(btSair);
	     setVisible(true);

	}
	
	 // main
    public static void main(String[] args) {
    	 new Ex2();
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource() == btCalcular) {
	           n1 = Integer.parseInt(txtNota1.getText());
	           n2 = Integer.parseInt(txtNota2.getText());
	           media = (n1 + n2) / 2;
	           
	           if(media >= 7) {
	        	   lblValorMedia.setText(Integer.toString(media));
	        	   lblValorMedia.setForeground(Color.BLUE);
	           }else {
	        	   lblValorMedia.setText(Integer.toString(media));
	        	   lblValorMedia.setForeground(Color.RED);
	           }
	           
	           
	    }else if (e.getSource() == btSair) {
	        	System.exit(0);
	    }
		
	}
	
	
	
	

}
