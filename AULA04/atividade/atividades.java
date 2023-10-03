package atividade;

import java.util.Scanner;

public class atividades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura[] = new double[8];
        double AlturaTeste;
        int diferente=0; 
        for (int i = 0; i < 8; i++) {
            System.out.printf("Digite a " + (i+1) + "º altura: ");
            altura[i] = entrada.nextDouble();
        }
        System.out.println("Digite uma nova altura: ");
        AlturaTeste = entrada.nextDouble();
        for (int i = 0; i < 8; i++){   
        if(AlturaTeste == altura[i]){
        System.out.println("Valor encontrado na posição " + (i+1));    
            
     }else{
            diferente++;
    }
    if(diferente == 8){
        System.out.println("Valor não encontrado no vetor!");
}
    entrada.close();
}
}
}