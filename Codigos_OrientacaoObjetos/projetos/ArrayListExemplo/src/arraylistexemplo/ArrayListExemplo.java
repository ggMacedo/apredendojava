/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexemplo;

/**
 *
 * @author gabri
 */
import java.util.*;
public class ArrayListExemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
        
        char controle = 's';
        do{
            System.out.println("Digite o nome: ");
            String n = leia.next();
            System.out.println("Digite a idade: ");
            int i = leia.nextInt();
            Pessoa p = new Pessoa(n, i);
            lista.add(p);
            System.out.println("Deseja cadastrar outra pessoa? (S/N)");
            controle = leia.next().charAt(0);
            
        }while(controle == 's' || controle == 'S');
        
        for(Pessoa i:lista){
            System.out.println(i);
        }
    }
    
}
