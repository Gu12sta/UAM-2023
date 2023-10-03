package metodos1;

public class metodos2 {
    public static void main(String[] args) {
        linha(10);
        linha(20);
    
    }
    //metódo com parâmetros
    // void signific que não retorna resultado
    static void linha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-" + "-" + "-");

        }
        System.out.print("-");
    }
}

