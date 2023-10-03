package poo02;

public class Applivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.titulo = "Programando em java";
        livro1.autor = "Deitel";
        livro1.paginas = 200;
        livro1.preco = 150;

        livro1.exibir();
    }
    
}
