
package model;

/**
 *
 * @author GABRIEL GOMES MACEDO RA: N6598A4 TURMA: CC3P33
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Automovel extends Veiculo{
    private String n_chassi;
    private String n_multa;
    Scanner leia = new Scanner(System.in);
    char controle = 's';

    public Automovel(){
        
    }

    public Automovel(String p, String c, String nome_v, String marca_v, String n_c, String n_m) {
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
    
    public void cadastraAutomovel(ArrayList<Automovel> listaAuto){
        do{
            try{
                System.out.println("Digite a placa do carro que deseja cadastrar: ");
                String placa = leia.next();
                System.out.println("Digite a cor do carro que deseja cadastrar: ");
                String cor = leia.next();
                System.out.println("Digite o nome do carro que deseja cadastrar: ");
                String nome = leia.next();
                System.out.println("Digite a marca do carro que deseja cadastrar: ");
                String marca = leia.next();
                System.out.println("Digite o número do chassi do carro que deseja cadastrar: ");
                String chassi = leia.next();
                System.out.println("Digite o código da multa que o carro recebeu: ");
                String multaaa = leia.next();
                Automovel a1 = new Automovel(placa, cor, nome, marca, chassi, multaaa);
                listaAuto.add(a1);
                System.out.println("Deseja cadastrar outro carro? (S/N)");
                controle = leia.next().charAt(0);
            }catch(Exception e){
                System.out.print("Erro: " + e);
                break;   
            }
        }while(controle == 's' || controle == 'S');
    }
    
    public void consultaAutomovel(ArrayList<Automovel> listaAuto){
        if(listaAuto.isEmpty()){
            System.out.println("Não existe carros registrados.");
        }else{
            for(Automovel n:listaAuto){
                System.out.println("\nCarro N° - " + listaAuto.indexOf(n));
                System.out.println("Placa do carro: " + n.getPlaca());
                System.out.println("Nome do carro: " + n.getNome_veiculo());
                System.out.println("Cor do carro: " + n.getCor());
                System.out.println("Marca do carro: " + n.getMarca_veiculo());
                System.out.println("Númerro do Chassi do carro: " + n.getN_chassi());
                System.out.println("Número de multas que o carro recebeu: " + n.getN_multa());
            }
        }
    }
    
}
