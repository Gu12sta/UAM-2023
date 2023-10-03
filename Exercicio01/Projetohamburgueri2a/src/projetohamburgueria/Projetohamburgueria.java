package projetohamburgueria;
    import java.util.Scanner;
    public class Projetohamburgueria    {

       public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            int opcao,suco,hamburguer,hotdog,refri;
            char valor;
            
            System.out.println("----Anhembi Lanches ----");
            System.out.println("Cardapio");
            System.out.println("1 Suco        R$ 2,00 ");
            System.out.println("2 - Refri     R$ 7,00");
            System.out.println("3 - HotdoG    R$ 12,50");
            System.out.println("4 - Hamburguer R$ 19,20");
            
            do {
                System.out.println("Digite seu pedido");
                
                opcao = entrada.nextInt();
                
                switch (opcao) { 
                    
                    case 1:
                        System.out.println("Voce escolheu suco");
                        suco = suco + 1;
                        break;
                        
                    case 2:
                        System.out.println("Voce escolheu refri");
                        break;
                    case 3:
                        System.out.println("Voce escolher Hot Dog");
                        break;
                    case 4:
                        System.out.println("Você escolheu hamburguer");
                        break;
                    default:
                        System.out.println("Voce escolheu uma opcao invalida!");
                        
                           
                }
                    System.out.println("Deseja incluir outro item? (s ou n)");
            
                    valor = entrada.next().charAt(0);
            } 
            }        
            }
            