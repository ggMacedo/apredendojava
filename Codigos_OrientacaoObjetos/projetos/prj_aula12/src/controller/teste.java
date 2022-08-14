package controller;

public class teste {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        
        try{
            int c = a / b;
        }
        catch(ArithmeticException e){
            System.out.println("Erro: "+ e);
        }
        finally{
            System.out.println("Executado sempre");
        }
    }
}
