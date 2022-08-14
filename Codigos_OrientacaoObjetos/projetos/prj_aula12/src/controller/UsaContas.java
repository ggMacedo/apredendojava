package controller;

import model.Corrente;
import model.Poupanca;

public class UsaContas {
    public static void main(String[] args) {
        /*
        Poupanca p = new Poupanca("Bradesco", 1100, 7878, 1);
        p.depositar(1000);
        p.sacar(100);
        System.out.println(p);
        */
        
        /*
        Corrente c = new Corrente("Bradesco",7800,11813,500);
        c.depositar(100);
        c.sacar(-200);
        System.out.println(c);
        */
        
        /*
        Poupanca cp = new Poupanca("Santander",4444,555,1);
        try{
            cp.depositar(-100);
        }catch(RuntimeException e){
            System.out.println("Erro: "+ e);
        }
        //System.out.println(cp);
        */
        
        Corrente cc = new Corrente("Bradesco", 4100, 1234, 1000);
        cc.depositar(200);
        try{
            cc.sacar(100);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println(cc);
    }
}
