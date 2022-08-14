
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GABRIEL GOMES MACEDO RA: N6598A4 TURMA: CC3P33
 */
public class Multa {
    private String cod_multa;
    private double valor;
    private String data_multa;
    private String placaVeiculo;
    private String cpfMotorista;
    Scanner leia = new Scanner(System.in);
    char controle = 's';
    
    public Multa(){
        
    }

    public Multa(String cod_m, double v, String data_m, String p, String cpf) {
        this.setCod_multa(cod_m);
        this.setValor(v);
        this.setData_multa(data_m);
        this.setPlacaVeiculo(p);
        this.setCpfMotorista(cpf);
    }
    
    public String getCod_multa() {
        return cod_multa;
    }

    public void setCod_multa(String cod_multa) {
        this.cod_multa = cod_multa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData_multa() {
        return data_multa;
    }

    public void setData_multa(String data_multa) {
        this.data_multa = data_multa;
    }
    
    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }
    
    public String getCpfMotorista() {
        return cpfMotorista;
    }

    public void setCpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
    }
    
    public void aplicarMulta(ArrayList<Multa> listaMulta){
        do{
            try{
                System.out.println("Digite um código para multa que deseja aplicar: ");
                String codM = leia.next();
                System.out.println("Digite o valor da multa aplicada: ");
                double valor = leia.nextInt();
                System.out.println("Digite a data da multa: ");
                String dataM = leia.next();
                System.out.println("Digite a placa do veiculo que recebeu a multa: ");
                String placaMulta = leia.next();
                System.out.println("Digite o CPF do motorista que recebeu a multa: ");
                String cpfMotoristaMulta = leia.next();
                Multa multa1 = new Multa(codM, valor, dataM, placaMulta, cpfMotoristaMulta);
                listaMulta.add(multa1);
                System.out.println("Deseja aplicar outra multa? (S/N)");
                controle = leia.next().charAt(0);
            }catch(Exception e){
                System.out.print("Erro: " + e);
                break;   
            }
        }while(controle == 's' || controle == 'S');
    }
    
    public void consultaMulta(ArrayList<Multa> listaMulta){
        if(listaMulta.isEmpty()){
            System.out.println("Não existe multas aplicadas registradas nos veiculos da empresa.");
        }else{
            for(Multa z:listaMulta){
                System.out.println("\nMulta N° - " + listaMulta.indexOf(z));
                System.out.println("Código da multa: " + z.getCod_multa());
                System.out.println("Valor da multa: " + z.getValor());
                System.out.println("Data da multa: " + z.getData_multa());
                System.out.println("Placa do veiculo que recebeu a multa: " + z.getPlacaVeiculo());
                System.out.println("CPF do motorista que recebeu a multa: " + z.getCpfMotorista());
            }
        }
    }
 
    
}
