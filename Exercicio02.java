package Exercicio2;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero, cont, contPares = 0, contImpares = 0;
        int somaPares = 0;

        // ler 10 números inteiros
        // verificar para cada um se é par ou ímpar e contabilizar
        for (cont = 1; cont < 11; cont++) {
            System.out.println("Digite um valor inteiro: ");
            numero = teclado.nextInt();
           

            if (numero % 2 == 0) {
                contPares++;
                somaPares = numero + somaPares;
            }else{
                contImpares++;
            }
        }
         teclado.close();
        System.out.println("Média Pares =" + (double)somaPares / contPares);
        System.out.println("Impares =" + (double) contImpares * 10 + "%");
    }
}
            

           

    
