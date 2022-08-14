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

import model.Produto;
public class Ex2Produto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Produto p1 = new Produto();
        p1.ImprimirDados();
        
        System.out.println("\n");
        Produto p2 = new Produto("Colgate", "Colgate", "C2234KJ", 65.70);
        p2.ImprimirDados();
    }
    
}
