package Exemplo2;

/*Atalhos:
 * SHIFT + ALT + SETA BAIXO: duplice linha ou bloco
 * SHIT + ALT + F : formatar código
 * sout: println: escreve e pula para próxima linha
 * Concaternar é juntar as coisas, logo se houver texto junto com os número, ele tende a concaternar
 * Ele entende da esquerda para direita, logo se há um texto de esquerda, ele entende como um texto os números
 */
//esse é um comentário de linha2                                ''
public class Exemplo2 {
    public static void main(String[] args) {
        //Operadores mmatemáticos
        System.out.println("12 + 10");
        System.out.println(12 + 10 + "texto");
        System.out.println("texto" + 12 + 10);
        System.out.println("texto" + (12 + 10) );

        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);

        //obedece a ordem de precedência ou parênteses
        System.out.println(10 - 4 / 2);
        System.out.println((10 - 4) / 2);
        /*Variavéis seria uma área da memória para guardar informação. Tipos: Int/double/boolean/char/String
         * Não pode nomear com caractere especial, não pode letra minúscula, não pode começar com número
         * Scanner entrada = new Scanner (system.in);
         * Entrada padrão para ler e precisa trazer uma biblioteca de algum lugar
         * Importjava.util.Scanner; Entrada de dados;
         * 
         */
    }
}
