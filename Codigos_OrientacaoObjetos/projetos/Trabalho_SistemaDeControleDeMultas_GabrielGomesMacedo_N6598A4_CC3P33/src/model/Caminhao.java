
package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GABRIEL GOMES MACEDO RA: N6598A4 TURMA: CC3P33
 */
public class Caminhao extends Veiculo{
    private String n_chassi;
    private String n_multa;
    Scanner leia = new Scanner(System.in);
    char controle = 's';
    
    public Caminhao(){
        
    }

    public Caminhao(String p, String c, String nome_v, String marca_v, String n_c, String n_m) {
        super(p, c, nome_v, marca_v);
        this.setN_chassi(n_c);
        this.setN_multa(n_m);
    }

    public String getN_chassi() {
        return n_chassi;
    }

    public void setN_chassi(String n_chassi) {
        this.n_chassi = n_chassi;
    }

    public String getN_multa() {
        return n_multa;
    }

    public void setN_multa(String n_multa) {
        this.n_multa = n_multa;
    }
    
    public void cadastraCaminhao(ArrayList<Caminhao> listaCaminhao){
        do{
            try{
                System.out.println("Digite a placa do caminhão que deseja cadastrar: ");
                String placa = leia.next();
                System.out.println("Digite a cor do caminhão que deseja cadastrar: ");
                String cor = leia.next();
                System.out.println("Digite o nome do caminhão que deseja cadastrar: ");
                String nome = leia.next();
                System.out.println("Digite a marca do caminhão que deseja cadastrar: ");
                String marca = leia.next();
                System.out.println("Digite o número do chassi do caminhão que deseja cadastrar: ");
                String chassi = leia.next();
                System.out.println("Digite o código da multa que o caminhão recebeu: ");
                String multaaaaa = leia.next();
                Caminhao c1 = new Caminhao(placa, cor, nome, marca, chassi, multaaaaa);
                listaCaminhao.add(c1);
                System.out.println("Deseja cadastrar outro caminhão? (S/N)");
                controle = leia.next().charAt(0);
            }catch(Exception e){
                System.out.print("Erro: " + e);
                break;   
            }
        }while(controle == 's' || controle == 'S');
    }
    
    public void consultarCaminhao(ArrayList<Caminhao> listaCaminhao){
        if(listaCaminhao.isEmpty()){
            System.out.println("Não existe caminhões registrados.");
        }else{
            for(Caminhao x:listaCaminhao){
                System.out.println("\nCaminhão N° - " + listaCaminhao.indexOf(x));
                System.out.println("Placa do caminhão: " + x.getPlaca());
                System.out.println("Nome do caminhão: " + x.getNome_veiculo());
                System.out.println("Cor do caminhão: " + x.getCor());
                System.out.println("Marca do caminhão: " + x.getMarca_veiculo());
                System.out.println("Númerro do Chassi do caminhão: " + x.getN_chassi());
                System.out.println("Número de multas que o caminhão recebeu: " + x.getN_multa());
            }
        }
    }
 
}
