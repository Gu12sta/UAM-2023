package exemplo.java;

import java.util.Scanner;


public class Exercicio2{ 
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, cont, contPares=0, contImpares=0;
        int somaPares=0;
        

        for (cont = 1; cont < 11; cont++){
            
            System.out.println("Digite um valor inteiro");
            numero= entrada.nextInt();
            if(numero % 2 ==0) {
                contPares++;
                somaPares = somaPares + numero;
            }else{
                contImpares++;
            }
            
            
        }
        System.out.println("Pares =" + contPares);
        System.out.println("Impares =" + contImpares);
        
        entrada.close();