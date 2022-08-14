
public class Pessoa {
    String nome; //atributo chamado nome de tipo String.
    int idade;//atributo chamado idade de tipo int.
    double sal;//atributo chamado sal de tipo double.
    double reajuste;//atributo chamado reajuste de tipo double.
    
    public void imprimirPessoa(){
       System.out.println("O nome é: " + nome);
       System.out.println("A idade é: " + idade);
       System.out.println("O salário é: " + sal);
       System.out.println("O reajuste de salário é: " + reajuste);
       System.out.println("\n");
    }
    
    public void reajusteSal(double pSal){
        this.reajuste  = pSal * 0.15;
    }
    
    
}
