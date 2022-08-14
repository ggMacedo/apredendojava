//GABRIEL GOMES MACEDO N6598A4 CC4P33

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex5 extends TelaBaseEx05 implements ActionListener{
	 
	    private JCheckBox cbPort;
	    private JCheckBox cbEspa;
	    private JCheckBox cbIngles;
	    private JCheckBox cbAle;
	    private JComboBox<String> UF;
	    private JLabel lblUF;
	    private JLabel lblSexo;
	    private JLabel lblLinguas;
	    private JLabel lblResult;
	    private JRadioButton masc;
	    private JRadioButton fem;
	    private JButton btnOk;
	    private JButton btnSair;
	    private JTextArea txtAreaTextos;
	    
	    private String ufSelect, sexSelect, lingSelect;

	    public Ex5(){
	    	
	    	setLayout(new GridLayout(14,1));
	    	
	    	lblUF = new JLabel("UF");
	    	UF = new JComboBox();
	    	UF.setModel(new DefaultComboBoxModel<>(new String[] { "AC", "SP", "RJ", "MG", "ES", "BA", "RN" }));

		    lblSexo	= new JLabel("Sexos:");
		    masc = new JRadioButton();
		    masc.setText("Masculino.");
		    fem = new JRadioButton();
		    fem.setText("Feminino.");
		    
		    lblLinguas	= new JLabel("Linguas:");
		    cbPort = new JCheckBox();
		    cbPort.setText("Português");
		    cbEspa= new JCheckBox();
		    cbEspa.setText("Espanhol");
		    cbIngles= new JCheckBox();
		    cbIngles.setText("Inglês");
		    cbAle= new JCheckBox();
		    cbAle.setText("Alemão");
		    
		   
		    lblResult	= new JLabel("Resultado");
		    txtAreaTextos = new JTextArea();
		    btnOk = new JButton("Ok");
		    btnOk.addActionListener(this);
		    
		    btnSair = new JButton("Sair");
		    btnSair.addActionListener(this);
		    
		    
		    add(lblUF);
		    add(UF);
		    
		    add(lblSexo);
		    add(masc);
		    add(fem);
		    
		    
		    add(lblLinguas);
		    add(cbPort);
		    add(cbEspa);
		    add(cbIngles);
		    add(cbAle);
		    
		    add(lblResult);
		    add(txtAreaTextos);
		    
		    add(btnOk);
		    add(btnSair);
		    
		    setVisible(true);
		    
	    }
	    
	    // main
	    public static void main(String[] args) {
	    	 new Ex5();
	    }
	    
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			 if (e.getSource() == btnOk) {
		           ufSelect = (String) UF.getSelectedItem();
		           
		           if(masc.isSelected() == true) {
		        	   sexSelect = masc.getText();
		           }else if(fem.isSelected() == true) {
		        	   sexSelect = fem.getText();
		           }else {
		        	   sexSelect = "Sexo não selecionado.";
		           }
		           
		           if(cbPort.isSelected() == true) {
		        	   lingSelect = cbPort.getText();
		           }else if(cbEspa.isSelected() == true) {
		        	   lingSelect = cbEspa.getText();
		           }else if(cbIngles.isSelected() == true) {
		        	   lingSelect = cbIngles.getText();
		           }else if(cbAle.isSelected() == true) {
		        	   lingSelect = cbAle.getText();
		           }else {
		        	   lingSelect = "Língua não selecionada.";
		           }
		           
		           txtAreaTextos.setText("UF: " + ufSelect + "\n" + "Sexo: " + sexSelect + "\n" + "Línguas: " + lingSelect + "\n");
  
			           
			    }else if (e.getSource() == btnSair) {
			        	System.exit(0);
			    }
			
		}
	    
}
