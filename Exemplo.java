package Exemplo;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        // leia um valor entre 1 e 10
        // não aceite valores inválidos

        Scanner teclado = new Scanner(System.in);
        int numero, cont, contPares = 0, contImpares = 0;

        // ler 10 números inteiros
        // verificar para cada um se é par ou ímpar e contabilizar
        for (cont = 0; cont < 11; cont++) {
            System.out.println("Digite um valor inteiro: ");
            numero = teclado.nextInt();
           

            if (numero % 2 == 0) {
                contPares++;
            }else{
                contImpares++;
            }
        }
         teclado.close();
        System.out.println("Pares =" + contPares);
        System.out.println("Impares =" + contImpares);
    }
}
