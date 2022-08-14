// GABRIEL GOMES MACEDO N6598A4 CC4P33
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExercicioConta extends JFrame implements ActionListener{
	
	
	private String listaBancos[] = {"", "001 - CEF", "033 - Santander", "237 - Bradesco", "341 - Itaú"};
    private int intervalo = 200, i = 0;
    private Timer tempo;
    private ButtonGroup btg;
    private JComboBox cboBcoOrig, cboBcoDest;
    private JButton btnTransferir, btnSair;
    private JPanel pnlTpConta;
    private JProgressBar prbTransferir;
    private JLabel lblDispOrig, lblBcoOrig, lblAgOrig, lblCCOrig, lblCPFOrig, lblValorOrig, lblDispDest, lblBcoDest, lblAgDest, lblCtDest, lblCPFDest, lblNomeDest;
    private JTextField txtAgOrig, txtCCOrig, txtCPFOrig, txtValorOrig, txtAgDest, txtCtDest, txtCPFDest, txtNomeDest;
    private JRadioButton rdbPoupanca, rdbCorrente;

    public ExercicioConta(){
    	
        super("Transferência entre contas");

        setSize(570, 380);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        pnlTpConta = new JPanel(new GridLayout(3, 1));
        pnlTpConta.setBorder(BorderFactory.createTitledBorder("Tipo de conta"));
        pnlTpConta.setBounds(10, 160, 240, 80);
        
        lblDispOrig = new JLabel("Conta Origem");
        lblDispOrig.setBounds(10, 5, 150, 30);
        lblBcoOrig	= new JLabel("Banco:");
        lblBcoOrig.setBounds(10, 30, 50, 30);
        lblAgOrig       = new JLabel("Agência:");
        lblAgOrig.setBounds(220, 30, 50, 30);
        lblCCOrig       = new JLabel("Conta Corrente:");
        lblCCOrig.setBounds(340, 30, 100, 30);
        lblCPFOrig      = new JLabel("CPF:");
        lblCPFOrig.setBounds(10, 60, 100, 30);
        lblValorOrig    = new JLabel("Valor:");
        lblValorOrig.setBounds(200, 60, 100, 30);
        lblDispDest     = new JLabel("Conta Destino");
        lblDispDest.setBounds(10, 100, 150, 30);
        lblBcoDest      = new JLabel("Banco:");
        lblBcoDest.setBounds(10, 130, 150, 30);
        lblAgDest       = new JLabel("Agência:");
        lblAgDest.setBounds(220, 130, 150, 30);
        lblCtDest       = new JLabel("Conta:");
        lblCtDest.setBounds(390, 130, 100, 30);
        lblCPFDest      = new JLabel("CPF:");
        lblCPFDest.setBounds(300, 170, 100, 30);
        lblNomeDest     = new JLabel("Nome:");
        lblNomeDest.setBounds(300, 200, 190, 30);
        
        cboBcoOrig = new JComboBox(listaBancos);
        cboBcoOrig.setBounds(50, 30, 160, 30);
        cboBcoDest = new JComboBox(listaBancos);
        cboBcoDest.setBounds(50, 130, 160, 30);
        
        txtAgOrig       = new JTextField();
        txtAgOrig.setBounds(280, 30, 50, 30);
        txtCCOrig       = new JTextField();
        txtCCOrig.setBounds(440, 30, 100, 30);
        txtCPFOrig      = new JTextField();
        txtCPFOrig.setBounds(50, 60, 120, 30);
        txtValorOrig    = new JTextField();
        txtValorOrig.setBounds(250, 60, 120, 30);
        txtAgDest       = new JTextField();
        txtAgDest.setBounds(280, 130, 50, 30);
        txtCtDest       = new JTextField();
        txtCtDest.setBounds(440, 130, 100, 30);
        txtCPFDest      = new JTextField();
        txtCPFDest.setBounds(350, 170, 120, 30);
        txtNomeDest     = new JTextField();
        txtNomeDest.setBounds(350, 200, 190, 30);
        
        rdbCorrente = new JRadioButton("Corrente", false);
        rdbPoupanca = new JRadioButton("Poupança", false);
        btg = new ButtonGroup();
        btg.add(rdbCorrente);
        btg.add(rdbPoupanca);
        pnlTpConta.add(rdbCorrente);
        pnlTpConta.add(rdbPoupanca);

        btnTransferir = new JButton("Tranferir");
        btnTransferir.addActionListener(this);
        btnTransferir.setBounds(30, 250, 190, 50);
        btnSair       = new JButton("Sair");
        btnSair.addActionListener(this);
        btnSair.setBounds(330, 250, 190, 50);
        
        prbTransferir = new JProgressBar();
        prbTransferir = new JProgressBar(0, 20);
        prbTransferir.setValue(0);
        prbTransferir.setStringPainted(true);
        prbTransferir.setBounds(10, 305, 530, 15);
        prbTransferir.setVisible(false);
        
        tempo = new Timer(intervalo, new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                if (i == 20){
                    tempo.stop();
                    JOptionPane.showMessageDialog(null, "Transferido com sucesso!");
                    btnSair.setEnabled(true);
                    btnTransferir.setEnabled(true);
                    prbTransferir.setEnabled(true);
                    prbTransferir.setValue(0);
                    prbTransferir.setVisible(false);
                    txtAgOrig.setText("");
                    txtCCOrig.setText("");
                    txtCPFOrig.setText("");
                    txtValorOrig.setText("");
                    txtAgDest.setText("");
                    txtCtDest.setText("");
                    txtCPFDest.setText("");
                    txtNomeDest.setText("");
                    cboBcoOrig.setSelectedIndex(0);
                    cboBcoDest.setSelectedIndex(0);
               
                }
                i++;
                prbTransferir.setValue(i);
        	}    
        });

        add(lblDispOrig);
        add(lblBcoOrig);
        add(cboBcoOrig);
        add(lblAgOrig);
        add(txtAgOrig);
        add(lblCCOrig);
        add(txtCCOrig);
        add(lblCPFOrig);
        add(txtCPFOrig);
        add(lblValorOrig);
        add(txtValorOrig);
        add(lblDispDest);
        add(lblBcoDest);
        add(cboBcoDest);
        add(lblAgDest);
        add(txtAgDest);
        add(lblCtDest);
        add(txtCtDest);
        add(pnlTpConta);
        add(lblCPFDest);
        add(txtCPFDest);
        add(lblNomeDest);
        add(txtNomeDest);
        add(btnTransferir);
        add(btnSair);
        add(prbTransferir);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new ExercicioConta();
    }
    
    // ActionPerformed
    @Override
    public void actionPerformed(ActionEvent e){
    	
        if (e.getSource() == btnSair){
        	
            if(JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair...", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
                System.exit(0);
            }
            
        }
        else if (e.getSource() == btnTransferir){
        	
        	if(cboBcoDest.getSelectedIndex() == 0 || cboBcoOrig.getSelectedIndex() == 0 || txtAgOrig.getText().isEmpty() == true || txtCCOrig.getText().isEmpty() == true || txtCPFOrig.getText().isEmpty() == true || txtValorOrig.getText().isEmpty() == true || txtAgDest.getText().isEmpty() == true || txtCtDest.getText().isEmpty() == true || txtCPFDest.getText().isEmpty() == true || txtNomeDest.getText().isEmpty() == true) {
        		JOptionPane.showMessageDialog(null, "Por favor, preencha os dados que estão faltando!");
        	}else{
	            prbTransferir.setValue(0);
	            prbTransferir.setVisible(true);
	            btnSair.setEnabled(false);
	            btnTransferir.setEnabled(false);
	            i = 0;
	            tempo.start();
        	}
        	    
        }
    }
}
