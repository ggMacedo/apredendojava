
package controller;


import model.Vendedor;
import java.util.Scanner;

public class ExVendedor {


    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner obj_leia = new Scanner(System.in);
        
        System.out.println("Digite o número de vendas do vendedor: ");
        double vendas = obj_leia.nextDouble();

        System.out.println("Digite o salario base do vendedor: ");
        double sal= obj_leia.nextDouble();
        
        System.out.println("Digite o nome do vendedor: ");
        String nome = obj_leia.nextLine();
        
        System.out.println("Digite as faltas nos mês do vendedor: ");
        int falta = obj_leia.nextInt();*/
        
        Vendedor v = new Vendedor(3000, 1000, "Gabriel", 2);
        System.out.println(v.imprimirDados());
    }
    
}
