
package controller;

import model.Funcionario;
import java.util.Scanner;

public class ExFuncionario {

  
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        
        f1.calcularAumento(10);
        f1.calcularAumento(2);
        System.out.println(f1.getSalario());
        
    }
    
}
