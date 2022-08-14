public class Principal {

    public static void main(String[] args) {
        Livro l1 = new Livro("Iracema", "Gobitta");
        Livro l2 = new Livro("Romeu e Julieta", "Eliane");
        Livro l3 = new Livro("Memorias Postumas de Bras Cubas", "Luciano");
        Livro l4 = new Livro("Meu pao de laranja lima", "Jorge");
        Livro l5 = new Livro("Biblia Sagrada", "Hugo");
        Livro l6 = new Livro("Clube da Luta", "Salvador");
        Livro l7 = new Livro("A Republica", "Platão");
        Livro l8 = new Livro("Eros e Civilização", "Marcuse");
        Livro l9 = new Livro("O nome da rosa", "Umberto Eco");
        Livro l10 = new Livro("Assim falou zaratustra", "Nietzsche");

        
        ListaSequencial lista = new ListaSequencial();
        lista.adiciona(l1);
        lista.adiciona(l2);
        lista.adiciona(l3);
        lista.adiciona(l4);
        lista.adiciona(l5, 1);
        lista.adiciona(l6, 2);
        lista.adiciona(l7);
        lista.adiciona(l8);
        lista.adiciona(l9);
        lista.adiciona(l10);
        
        System.out.printf("\nTamanho da lista = %d", lista.tamanho());
        
        lista.remove(1);
        lista.remove(3);
        System.out.printf("\nTamanho da lista = %d", lista.tamanho());
            
    }
}
