package Exemplo02;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, falta, media; 
        int numero = 16;
        String resposta;

        System.out.println("Digite sua nota1: ");
        nota1 = teclado.nextDouble();
        
        System.out.println("Digite sua nota2: ");
        nota2 = teclado.nextDouble();

        System.out.println("Digite suas faltas: ");
        falta = teclado.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.println(("Sua média é: " + media));

        if(media>=6) {
        System.out.println("Parabéns você foi aprovado");   

        }
        } else {
            System.out.println("Reprovado");

            resposta = (numero >=16) ? "Reprovado" : "Aprovado";
            System.out.println(resposta);


        teclado.close();





    }
    
}

