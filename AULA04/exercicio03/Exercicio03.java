package exercicio03;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2, resultado;

        System.out.println("Digite dois valores inteiros: ");
        valor1 = scanner.nextInt();
        valor2 = scanner.nextInt();

       resultado =  maior(valor1, valor2);
       System.out.println("O maior é " + resultado);

        scanner.close();

    }
        
       static int maior(int n1, int n2){
        if(n1 > n2){
        return n1;

        }else{
        return n2;
        }
    }
   
    }
