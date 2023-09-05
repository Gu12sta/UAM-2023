package exercicio02;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double salariobruto, valorPrestação, limitePrestacao;

        System.out.println("Digite o valor do salario");
        salariobruto = teclado.nextDouble();

        System.out.println("Digite o valor da prestação");
        valorPrestação = teclado.nextDouble();

        limitePrestacao = ((salariobruto ) ) * 0.3;
        System.out.println("O valor máximo da parcela é" + limitePrestacao);

        if (valorPrestação <= limitePrestacao) {
            System.out.println("Emprestimo aprovado");

        } else {
            System.out.println("Empréstimo não aprovado");

            teclado.close();

        }

    }

}
