
package controler;
import model.*;
import java.util.*;

/**
 *
 * @author GABRIEL GOMES MACEDO RA: N6598A4 TURMA: CC3P33
 */
public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Motorista> listaMotorista = new ArrayList<>();
        ArrayList<Automovel> listaAuto = new ArrayList<>();
        ArrayList<Moto> listaMoto = new ArrayList<>();
        ArrayList<Caminhao> listaCaminhao = new ArrayList<>();
        ArrayList<Multa> listaMulta = new ArrayList<>();
        String op ="0";
        Automovel ct = new Automovel();
        Moto mj = new Moto();
        Caminhao ce = new Caminhao();
        Motorista ml = new Motorista();
        Multa mb = new Multa();
        
        do{
            System.out.println("\nMenu Principal");
            System.out.println("\n 1-Cadastrar Motorista\n 2-Cadastrar Carro\n 3-Cadastrar Moto\n 4-Cadastrar Caminhão\n 5-Aplicar Multas\n 6-Consultar Motoristas\n 7-Consultar Carros\n 8-Consultar Motos\n 9-Consultar Caminhões\n 10-Consultar Multas\n 0-Sair");
            System.out.println("\nDigite o número da opção que desejar: ");
            op = leia.next();
            
            switch(op){
                case "1":
                    ml.cadastraMotorista(listaMotorista);               
                    break;
                case "2":
                    ct.cadastraAutomovel(listaAuto);
                    break;
                case "3": 
                    mj.cadastraMoto(listaMoto);
                    break;
                case "4":
                    ce.cadastraCaminhao(listaCaminhao);
                    break;
                case "5":
                    mb.aplicarMulta(listaMulta);
                    break;
                case "6":
                    ml.consultaMotorista(listaMotorista);
                    break;
                case "7":
                    ct.consultaAutomovel(listaAuto);
                    break;
                case "8":
                    mj.consultaMoto(listaMoto);
                   break;
                case "9":
                    ce.consultarCaminhao(listaCaminhao);
                    break;
                case "10":
                    mb.consultaMulta(listaMulta);
                    break;
                case "0":
                    System.out.println("Obrigado por utilizar o sistema de consultas!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                break;       
            }
        }while(op != "0");       
    }  
}
