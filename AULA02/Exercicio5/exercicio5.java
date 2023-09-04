package Exercicio5;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1, numero2;

        System.out.println("Digite um número inteiro:");
        numero1 = entrada.nextInt();
        System.out.println("Digite um número inteiro:");
        numero2 = entrada.nextInt();

        System.out.println("A média aritmética " + ((numero1 + numero2)/2));

        System.out.println();

        entrada.close();

    }
}

