/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo.java;

import java.util.Scanner;

public class ExemploJava {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero = 0;
        
        while( numero< 1 || numero > 10) {
        
        System.out.println("Digite um valor entre 1 e 10");
        
        numero = entrada.nextInt();
       
        }
        
        entrada.close();    
        
    }
    
}
