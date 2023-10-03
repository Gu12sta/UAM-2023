package exemplo.java;

import java.util.Scanner;


public class Numerosdigitados { 
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, cont;
        
        
        //Ler 10 numeros inteiros
        // verificar para cada um se é par ou impar e contabilizar
        
        
        for (cont = 1; cont < 11; cont++){
            
            System.out.println("Digite um valor inteiro");
            numero= entrada.nextInt();