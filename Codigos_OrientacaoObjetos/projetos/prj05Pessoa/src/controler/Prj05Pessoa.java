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

import model.Pessoa;
public class Prj05Pessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa p1 = new Pessoa("Luiz", 16, 690);
        /*p1.setNome("Luiz");
        p1.setIdade(16);
        p1.setRenda(600);*/
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Renda: " + p1.getRenda());
        
    }
    
}
