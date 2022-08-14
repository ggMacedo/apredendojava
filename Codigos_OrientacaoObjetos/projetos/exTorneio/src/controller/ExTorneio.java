
package controller;


import model.Torneio;
import java.util.Scanner;

public class ExTorneio {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj_leia = new Scanner(System.in);

        System.out.println("Digite o nome do participante: ");
        String nome = obj_leia.nextLine();
        
        System.out.println("Digite a idade do participante: ");
        int idade= obj_leia.nextInt();
        
        Torneio t = new Torneio(nome, idade);
        t.imprimirDados();
        
    }
    
}
