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
import model.Paciente;
public class Ex1Pacientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Paciente p1 = new Paciente();
        System.out.println(p1.ImprimirDados());
        
        System.out.println("\n");
        Paciente p2 = new Paciente("Luiz");
        System.out.println(p2.ImprimirDados());
        
        
    }
    
}
