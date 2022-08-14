//GABRIEL GOMES MACEDO N6598A4 CC4P33

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ex4 extends TelaBaseEx04 implements ActionListener{
	
	private JLabel lblPeso; 
	private JLabel lblAlt; 
	private JTextField txtPeso;
	private JTextField txtAlt;
	private JLabel lblIMCResult; 
	private JButton btCalcular; 
	private JButton btLimpar;
	
	private double pes, alt, rest;
	
	public Ex4(){
		
		 setLayout(new GridLayout(4,2, 10, 10));
		 lblPeso = new JLabel("Peso:");
	     lblAlt	= new JLabel("Altura:");
	     
	     txtPeso = new JTextField();
	     txtAlt = new JTextField();
	     
	     lblIMCResult = new JLabel("");

	     btCalcular = new JButton("Calcular");
	     btCalcular.addActionListener(this);
	    
	     btLimpar= new JButton("Limpar");
	     btLimpar.addActionListener(this);

	     add(lblPeso);
	     add(txtPeso);
	     add(lblAlt);
	     add(txtAlt);
	     
	     add(btCalcular);
	     add(btLimpar);
	     add(lblIMCResult);
	     setVisible(true);

	}
	
	 // main
    public static void main(String[] args) {
    	 new Ex4();
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource() == btCalcular) {
	           pes = Double.parseDouble(txtPeso.getText());
	           alt = Double.parseDouble(txtAlt.getText());
	           rest = pes / (alt * alt);
	           
	           if(rest < 17) {
	        	   lblIMCResult.setText("IMC = " + Double.toString(rest) + " - Muito abaixo do peso.");
	        	   lblIMCResult.setForeground(Color.black);
	           }else if(rest >= 17 && rest <=18.99) {
	        	   lblIMCResult.setText("IMC = " + Double.toString(rest) + " - Abaixo do peso.");
	        	   lblIMCResult.setForeground(Color.black);
	           }else if(rest >= 19 && rest <=24.99) {
	        	   lblIMCResult.setText("IMC = " + Double.toString(rest) + " - Peso norma.");
	        	   lblIMCResult.setForeground(Color.black);
	           }else if(rest >= 25 && rest <=29.99) {
	        	   lblIMCResult.setText("IMC = " + Double.toString(rest) + " - Acima do peso.");
	        	   lblIMCResult.setForeground(Color.black);
	           }else if(rest >= 30 && rest <=34.99) {
	        	   lblIMCResult.setText("IMC = " + Double.toString(rest) + " - Obesidade I.");
	        	   lblIMCResult.setForeground(Color.black);
	           }else if(rest >= 35 && rest <=39.99) {
	        	   lblIMCResult.setText("IMC = " + Double.toString(rest) + " - Obesidade II (severa).");
	        	   lblIMCResult.setForeground(Color.black);
	           }else if(rest > 40){
	        	   lblIMCResult.setText("IMC = " + Double.toString(rest) + " - Obesidade III (mórbida).");
	        	   lblIMCResult.setForeground(Color.black);
	        	   
	           }else{
	        	   lblIMCResult.setText("Peso inválido para calculo.");
	        	   lblIMCResult.setForeground(Color.black);  
	           }
	           
	           
	    }else if (e.getSource() == btLimpar) {
	        	txtPeso.setText("");
	        	txtAlt.setText("");
	        	lblIMCResult.setText("");
	    }
		
	}
	
	
	
	

}
