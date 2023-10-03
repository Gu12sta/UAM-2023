package metodos1;

public class metodos3 {

    public static void main(String[] args) {
        int resultado;

        resultado = soma(5, 7);
        System.out.println("A soma da sua conta é " + resultado);
    }

    //metódo com retorno

    static int soma(int n1, int n2) {
    int resposta;
    resposta = n1 + n2;
    return resposta;
}
}
