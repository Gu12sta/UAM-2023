package exercicio;

import java.util.Scanner;
/*
 * Ler 18 notas e uma turma e exibir as notas que forem
 * maiores do que a media da turma
 * 
 * 1. Ler as 10 notas
 * 2.Calcular 1 média
 * Exibir as notas maiores que a média
 */

public class exercicio {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        
    //criação de um vetor chamado notas, com 10 posições
    double notas[] = new double[10];
    double media;
    int i = 0;

    for(i = 0; i < notas.length; i++){
    System.out.println("Digite a " + (i + 1) + "º nota");
    notas[i] = teclado.nextDouble();
   
}
 //for(i = 0; i < notas.length; i++){
 //System.out.print(notas[i] + " ");
//}
    for(i = notas.length - 1; i >= 0; i--){
    System.out.printf(notas[i] + " ");
}
}
}
 