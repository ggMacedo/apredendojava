
package controller;

import model.ContaCorrente;
import java.util.Scanner;

public class Ex3ContaCorrente {

    public static void main(String[] args) {

        Scanner obj_leia = new Scanner(System.in);

        System.out.println("Digite o nome da conta: ");
        String nome = obj_leia.nextLine();
        
        System.out.println("Digite o limite da conta: ");
        double limite = obj_leia.nextDouble();
        
        System.out.println("Digite o tipo da conta: ");
        char tipo = obj_leia.next().charAt(0);

        ContaCorrente conta1 = new ContaCorrente(nome, limite, tipo);
        
        System.out.println(conta1.imprimirDados());
        System.out.println("\n");
        
        System.out.println("Digite o valor do deposito: ");
        double valor = obj_leia.nextDouble();
        conta1.depositar(valor);
        
        System.out.println("Digite o valor de saque: ");
        double saque = obj_leia.nextDouble();
        conta1.sacar(saque);

        System.out.println(conta1.imprimirDados());

    }
    
}
