package metodos1;

public class metodos1 {
    public static void main(String[] args) {
        exibir();
        System.out.println("Executando instrução no main");
        exibir();
    }

    static void exibir() {
        System.out.println("Executando o método exibir");
        exibir(); // chamando o metódo exibir
    }
        
    }
    
