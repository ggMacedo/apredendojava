import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;


public class Cadastro extends JFrame implements ActionListener {
	
	Calendar c = Calendar.getInstance();
	JButton btnOk, btnCancelar;
	JTextField txtUser, txtData;
	JPasswordField txtSenha;
	JLabel lblSenha, lblUser, lblResp, lblData;
	int resp, anoAtual, idade;
	String dataNascimento, anoNascimento;
	String  dia, mes, ano;
	int diaAtual, mesAtual,diaNas, mesNas, anoNas,resd, resm, resa;
	
	public Cadastro(){
		
		setSize(500, 250);//Largura X Altura
		setResizable(false);//Não deixa o usuário alterar o tamanho da janela
		setTitle("Login");//Titulo para janela
		setLocationRelativeTo(null);//Centralizar
		
		setLayout(null); 
		
		lblUser = new JLabel("Nome:");
		lblUser.setBounds(10, 5, 45, 15);
		txtUser = new JTextField(10);
		txtUser.setBounds(10, 25, 100, 15);
		
		lblData = new JLabel("Data de nascimento:");
		lblData.setBounds(10, 40, 150, 15);
		txtData = new JTextField(100);
		txtData.setBounds(10, 60, 100, 15);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 90, 45, 15);
		txtSenha = new JPasswordField(10);
		txtSenha.setBounds(10, 110, 100, 15);
		
		btnOk = new JButton("OK");
		btnOk.setBounds(10, 150, 100, 15);
		btnOk.addActionListener(this);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 190, 100, 15);
		btnCancelar.addActionListener(this);
			
		add(lblUser);
		add(txtUser);
		add(lblData);
		add(txtData);
		add(lblSenha);
		add(txtSenha);
		add(btnOk);
		add(btnCancelar);
		
		lblResp = new JLabel();
		lblResp.setBounds(190, 30, 300, 30);
		add(lblResp);
		
		setVisible(true);
				
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e1){
		
		if(e1.getSource() == btnOk) {
			
			dataNascimento = txtData.getText();
			  dia = dataNascimento.substring(0, 2);
			  mes= dataNascimento.substring(3, 5);
			  ano= dataNascimento.substring(6, 10);
			  
			  diaNas=Integer.parseInt(dia);
			  mesNas=Integer.parseInt(mes);
			  anoNas=Integer.parseInt(ano);
			  
			  diaAtual = c.get(Calendar.DAY_OF_MONTH);
			  mesAtual = c.get(Calendar.MONTH) + 1;
			  anoAtual = c.get(Calendar.YEAR);
			  
			  resa = anoAtual - anoNas;
			  resm = mesNas - mesAtual;
			  resd = diaNas - diaAtual;
			  
			  if(resa == 18) {
				  if(resm<0) {
					  JOptionPane.showMessageDialog(null, "Cadastro Concluido!");
				  }else if(resm == 0){
					  if(resd<=0) {
						  JOptionPane.showMessageDialog(null, "Cadastro Concluido!"); 
					  }else{
						  JOptionPane.showMessageDialog(null, "Não é permitido o cadastro de menores de idade" );
					  }
				  }else {
					  JOptionPane.showMessageDialog(null, "Não é permitido o cadastro de menores de idade" );
				  }
			  }else if(resa >= 19) {
				  JOptionPane.showMessageDialog(null, "Cadastro Concluido!");
			  }else{
				  JOptionPane.showMessageDialog(null, "Não é permitido o cadastro de menores de idade" );
			  }	
	
			
		}else {
			JOptionPane.showMessageDialog(null, "Bye Bye");
			System.exit(0);
		}
		
	}
}
