
package controller;

import model.*;
import java.util.Scanner;

public class ExTrianguloData {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner obj_leia = new Scanner(System.in);

        Triangulo t = new Triangulo();
        
        System.out.println("Digite a base do triangulo: ");
        double base = obj_leia.nextDouble();
        
        System.out.println("Digite a altura do triangulo: ");
        double alt = obj_leia.nextDouble();
        
        t.setAltura(alt);
        t.setBase(base);
        
        
        Triangulo t2 = new Triangulo(50, 100);
        
        System.out.println(t.imprimirDados());
        System.out.println("\n");
        System.out.println(t2.imprimirDados());
        
        Data d = new Data();
        d.setDia(06);
        d.setMes(03);
        d.setAno(2021);
        System.out.println(d.imprimirData());
        
        
    }
    
}
