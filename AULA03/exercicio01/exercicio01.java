package exercicio01;

    import java.util.Scanner;

/**
 * exercicio01
 */
public class exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;


        //Entrada de dados
        System.out.println("Digite a primeira nota:");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = teclado.nextDouble();

        //Processamento
        media = (nota1 + nota2) / 2;

        //Saída
        System.out.println("A média é " + media);



        teclado.close();
    }
}