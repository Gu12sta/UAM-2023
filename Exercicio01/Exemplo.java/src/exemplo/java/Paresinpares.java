/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo.java;

import java.util.Scanner;


public class Paresinpares { 
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, cont, contPares=0, contImpares=0;
        
        
        //Ler 10 numeros inteiros
        // verificar para cada um se é par ou impar e contabilizar
        
        
        for (cont = 1; cont < 11; cont++){
            
            System.out.println("Digite um valor inteiro");
            numero= entrada.nextInt();
            if(numero % 2 ==0) {
                contPares++;
            }else{
                contImpares++;
            }
            
            
        }
        System.out.println("Pares =" + contPares);
        System.out.println("Impares =" + contImpares);
        
        entrada.close();
        
        
       
        
        
    }
    
}
