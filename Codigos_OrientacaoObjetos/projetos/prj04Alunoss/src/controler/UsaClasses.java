package controler;


import model.Alunos;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class UsaClasses {
    public static void main(String[] args) {
        
        //Parte 01 
        /*Alunos obj_aluno1 = new Alunos();
        
        obj_aluno1.nome = "Luiz";
        obj_aluno1.ra = "22ass3";
        obj_aluno1.idade = 37;
        obj_aluno1.n1 = 9;
        obj_aluno1.n2 = 5;
        
        //System.out.println("A média do aluno" + obj_aluno1.nome + "é de: " + obj_aluno1.calcular_media(obj_aluno1.n1, obj_aluno1.n2));
        
        double resultado = obj_aluno1.calcular_media(obj_aluno1.n1, obj_aluno1.n2);
        System.out.println("A média é de: " + resultado);
        System.out.println("Está aprovado? " + obj_aluno1.verificarAprovacao(resultado));
        */ 
        
        //Parte 2
        /*
        Scanner obj_leia = new Scanner(System.in);
        Alunos obj_aluno1 = new Alunos();
        
        System.out.println("Digite o nome do aluno: ");
        obj_aluno1.setNome(obj_leia.nextLine());
        
        System.out.println("Digite o RA do aluno: ");
        obj_aluno1.setRa(obj_leia.nextLine());
        
        System.out.println("Digite a idade do aluno: ");
        obj_aluno1.setIdade(obj_leia.nextInt());
        
        System.out.println("Digite a nota 1 do aluno: ");
        obj_aluno1.setN1(obj_leia.nextDouble());
        
        System.out.println("Digite a nota 2 do aluno: ");
        obj_aluno1.setN2(obj_leia.nextDouble());
       
        double resultado = obj_aluno1.calcular_media(obj_aluno1.getN1(), obj_aluno1.getN2());
        
        System.out.println("Nome: " + obj_aluno1.getNome());
        System.out.println("R.A: " + obj_aluno1.getRa());
        System.out.println("Idade: " + obj_aluno1.getIdade());
        System.out.println("Nota 1: " + obj_aluno1.getN1());
        System.out.println("Nota 2: " + obj_aluno1.getN2());
        System.out.println("Média: " + resultado + " e o aluno está: " + obj_aluno1.verificarAprovacao(resultado));
        */
       
        //Parte 3
        //JOptionPane.showMessageDialog(null, "Primeiro exemplo");
      
        /*Alunos obj_aluno1 = new Alunos();
        
        obj_aluno1.nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
        obj_aluno1.ra = JOptionPane.showInputDialog("Digite o RA do aluno: ");
        obj_aluno1.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: "));
        obj_aluno1.n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do aluno: "));
        obj_aluno1.n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 do aluno: "));
        
        double resultado = obj_aluno1.calcular_media(obj_aluno1.n1, obj_aluno1.n2);
        
        
        JOptionPane.showMessageDialog(null, "Nome do aluno: " + obj_aluno1.nome);
        JOptionPane.showMessageDialog(null, "RA do aluno: " + obj_aluno1.ra);
        JOptionPane.showMessageDialog(null, "Idade do aluno: " + obj_aluno1.idade);
        JOptionPane.showMessageDialog(null, "Nota 1 do aluno: " + obj_aluno1.n1);
        JOptionPane.showMessageDialog(null, "Nota 2 do aluno: " + obj_aluno1.n2);
        JOptionPane.showMessageDialog(null, "Média: " + resultado + " e o aluno está: " + obj_aluno1.verificarAprovacao(resultado));
        
        */
        
        //Parte 4
        Scanner obj_leia = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = obj_leia.nextLine();
        
        System.out.println("Digite o RA do aluno: ");
        String ra = obj_leia.nextLine();
        
        System.out.println("Digite a idade do aluno: ");
        int idade = obj_leia.nextInt();
        
        System.out.println("Digite a nota 1 do aluno: ");
        double n1 = obj_leia.nextDouble();
        
        System.out.println("Digite a nota 2 do aluno: ");
        double n2 = obj_leia.nextDouble();
       
        Alunos obj_aluno1 = new Alunos(nome, ra, idade, n1, n2);
        obj_aluno1.calcular_media(n1, n2);
        String status = obj_aluno1.verificarAprovacao();
        obj_aluno1.ImprimirDados(status);
 
    }
    
}
