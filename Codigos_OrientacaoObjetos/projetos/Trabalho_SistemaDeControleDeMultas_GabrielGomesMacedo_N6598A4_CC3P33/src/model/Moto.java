
package model;

/**
 *
 * @author GABRIEL GOMES MACEDO RA: N6598A4 TURMA: CC3P33
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Moto extends Veiculo{
    private String n_chassi;
    private String n_multa;
    Scanner leia = new Scanner(System.in);
    char controle = 's';
    
    public Moto(){
        
    }

    public Moto(String p, String c, String nome_v, String marca_v, String n_c, String n_m) {
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
    
    public void cadastraMoto(ArrayList<Moto> listaMoto){
         do{
            try{
                System.out.println("Digite a placa da moto que deseja cadastrar: ");
                String placa = leia.next();
                System.out.println("Digite a cor da moto que deseja cadastrar: ");
                String cor = leia.next();
                System.out.println("Digite o nome da moto que deseja cadastrar: ");
                String nome = leia.next();
                System.out.println("Digite a marca da moto que deseja cadastrar: ");
                String marca = leia.next();
                System.out.println("Digite o número do chassi da moto que deseja cadastrar: ");
                String chassi = leia.next();
                System.out.println("Digite o código da multa que a moto recebeu: ");
                String multaa = leia.next();
                Moto m1 = new Moto(placa, cor, nome, marca, chassi, multaa);
                listaMoto.add(m1);
                System.out.println("Deseja cadastrar outra moto? (S/N)");
                controle = leia.next().charAt(0);
            }catch(Exception e){
                System.out.print("Erro: " + e);
                break;   
            }
        }while(controle == 's' || controle == 'S');
    }
    
    public void consultaMoto(ArrayList<Moto> listaMoto){
        if(listaMoto.isEmpty()){
            System.out.println("Não existe motos registradas.");
        }else{
            for(Moto v:listaMoto){
            System.out.println("\nMoto N° - " + listaMoto.indexOf(v));
            System.out.println("Placa da moto: " + v.getPlaca());
            System.out.println("Nome da moto: " + v.getNome_veiculo());
            System.out.println("Cor da moto: " + v.getCor());
            System.out.println("Marca da moto: " + v.getMarca_veiculo());
            System.out.println("Númerro do Chassi da moto: " + v.getN_chassi());
            System.out.println("Número de multas que a moto recebeu: " + v.getN_multa());
        }
        }
    }
    
}
