public class Principal {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        
        Estudante e1 = new Estudante("Gobitta", 123);
        Estudante e2 = new Estudante("Luciano", 124);
        Estudante e3 = new Estudante("Hugo", 125);
        Estudante e4 = new Estudante("Eliane", 126);
        Estudante e5 = new Estudante("Salvador", 127);
        Estudante e6 = new Estudante("Lozanno", 127);
        Estudante e7 = new Estudante("Caique", 127);
        Estudante e8 = new Estudante("André", 127);
        Estudante e9 = new Estudante("Alvaro", 127);
        Estudante e10 = new Estudante("Marcelo", 127);
    
        lista.adicionarElementoNoFimDaLista(e1);
        lista.adicionarElementoNoFimDaLista(e2);
        lista.adicionarElementoNoFimDaLista(e3);
        lista.adicionarElementoNoFimDaLista(e4);
        lista.adicionarElementoNoInicioDaLista(e5);
        lista.adicionarElementoNoInicioDaLista(e6);
        lista.adicionarElementoNoInicioDaLista(e7);
        lista.adicionarElementoNoInicioDaLista(e8);
        lista.adicionarElementoNoInicioDaLista(e9);
        lista.adicionarElementoNoInicioDaLista(e10);
        lista.listarTodos();
        
        System.out.printf("\n %d de estudantes na lista", lista.tamanho());
    }
}