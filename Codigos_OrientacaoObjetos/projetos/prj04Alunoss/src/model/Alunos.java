package model;


public class Alunos {
    //atributos
    private int idade;
    private String nome, ra;
    private double n1, n2;
    private double media;

    //metodo construtor
    public Alunos(String nome, String ra, int idade, double n1, double n2){
        this.setNome(nome);
        this.setRa(ra);
        this.setIdade(idade);  
        this.setN1(n1);
        this.setN2(n2); 
    }
    
    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
    //metodo get
    public int getIdade(){
        return this.idade;
    }
    
    //metodo set
    public void setIdade(int idade){
        if(idade>=18)
            this.idade = idade;
        else
            System.out.println("Não é permitido menores de idade!");
    }
    
    //metodo get
    public String getNome(){
        return this.nome;
    }
    
    //metodo set
    public void setNome(String nome){
        if(nome.length()>2)
            this.nome = nome;
        else
            System.out.println("Nome deve ter no máximo 3 caracteres!");
    }
    
     //metodo get
    public String getRa(){
        return this.ra;
    }
    
    //metodo set
    public void setRa(String ra){
        if(ra.length()<=7)
            this.ra = ra;
        else
            System.out.println("R.A deve ter no máximo 7 caracteres!");
    }
    
    //metodo get
    public double getN1(){
        return this.n1;
    }
    
    //metodo set
    public void setN1(double n1){
        if(n1>=0 && n1<=10)
            this.n1 = n1;
        else
            System.out.println("Nota 1 inválida!");
    }
    
    //metodo get
    public double getN2(){
        return this.n2;
    }
    
    //metodo set
    public void setN2(double n2){
        if(n2>=0 && n2<=10)
            this.n2 = n2;
        else
            System.out.println("Nota 2 inválida!");
    }
    
    
    //metodos
    public void calcular_media(double pN1, double pN2){
        this.media = (pN1 + pN2)/2;
           
    }
    
    /*public boolean verificarAprovacao(double pMedia){
        if(pMedia >= 7)
            return true;
        else
            return false;
    }*/
    
    public String verificarAprovacao(){
        double pMedia = this.getMedia();
        if(pMedia >= 7)
            return "APROVADO";
        else
            return "REPROVADO";
    }
    
    public void ImprimirDados(String status){
        System.out.println("Nome: " + this.getNome());
        System.out.println("R.A: " + this.getRa());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Nota 1: " + this.getN1());
        System.out.println("Nota 2: " + this.getN2());
        System.out.println("Média: " + this.getMedia());
        System.out.println("O aluno está: " + this.verificarAprovacao());
        
        
    }
}
