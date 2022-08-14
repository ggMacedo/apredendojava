
public class UsaClasses {
    
    public static void main(String[] args) {
        
        Pessoa obj_p1 = new Pessoa();
        obj_p1.nome = "Luiz";
        obj_p1.idade = 37;
        obj_p1.sal = 622.00;
        obj_p1.reajusteSal(obj_p1.sal);
        
        
        Pessoa obj_p2 = new Pessoa();
        obj_p2.nome = "Wescley";
        obj_p2.idade = 30;
        obj_p2.sal = 100.00;
        obj_p2.reajusteSal(obj_p2.sal);
            
        obj_p1.imprimirPessoa();
        obj_p2.imprimirPessoa();
        
        
    }
    
}
