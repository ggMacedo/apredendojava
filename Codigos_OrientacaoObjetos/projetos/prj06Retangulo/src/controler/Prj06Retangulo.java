/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

/**
 *
 * @author gabri
 */
import model.Retangulo;
public class Prj06Retangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Retangulo p1 = new Retangulo();
        p1.ImprimirDados();
        System.out.println("\n");
        Retangulo p2 = new Retangulo(16, 690);
        p2.ImprimirDados();

    }
    
}
