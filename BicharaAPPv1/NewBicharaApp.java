package BicharaV1;

/** @author (Luís Lima, 19111170-7)
 * @author (Lucas Machado Garcia 19111270-5)
 * @professora (Giraffa)
 * @turma (128)
 * @version (09/06/19)
 */

import java.util.Scanner;

public class NewBicharaApp {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Bem vindo à loja Bichara!");
        System.out.println("Antes de entrarmos no Menu de Compra, você deve informar o tamanho do cordão e a aste utilizada para segurar os pingentes.");

        System.out.println("Para o cordão temos as seguintes opções: \n1 - 50cm, R$ 300,00\n2 - 70cm, R$ 400,00\nDigite a opção escolhida: ");
        int cordao = input.nextInt();
        System.out.println("Para aste temos as seguintes opções: \n1 - Gancho, R$ 200,00\n2 - Caixa Redonda, R$ 350,00 ");
        int aste = input.nextInt();
        ColarV2 c1 = new ColarV2(cordao, aste);

        do {
            System.out.println("\f");
            System.out.println("******************************************************************************************************************");
            System.out.println("Menu de compras Loja Bichara:");
            System.out.println("0 - Finalizar compra;");
            System.out.println("1 - Mudar cordão;");
            System.out.println("2 - Comprar pingente;");
            System.out.println("3 - Mudar Aste;");
            System.out.println("4 - Consultar preço atual do colar;");
            System.out.println("5 - Finalizar compra;");
            System.out.println("Digite a opção escolhida: ");
            int opcao = input.nextInt();
            if (opcao == 0)
            {
                break;
            }

                if (opcao == 1) {
                    System.out.println("Digite o novo tipo de cordão desejado: ");
                    cordao = input.nextInt();
                    c1.setCordao(cordao);



                }
                else if(opcao == 2){
                    System.out.println("Temos 2 tipos de Pingente, escolha uma das opções abaixo:\n1 - Prata, valor: R$ 70,00\n2 - Prata com pedras incrustadas, valor: R$ 100,00\nDigite o pingente escolhido: ");
                    int pingente = input.nextInt();
                    if (pingente == 1)
                    {
                        c1.compraPingente1();
                    }
                    else if(pingente == 2)
                    {
                        c1.compraPingente2();
                    }
                 }
                else if (opcao == 3)
                {
                    System.out.println("Escolha a nova aste: ");
                    aste = input.nextInt();
                    c1.setAste(aste);
                }
                else if (opcao == 4)
                {
                    System.out.println("O preco está em: "+c1.getPreco());
                }
                else if (opcao == 5)
                {
                    System.out.println("Escolha uma forma de pagamento: ");
                    System.out.println("1 - Pagar a vista com 5% de desconto;");
                    System.out.println("2 - Pagar em até 3x sem juros;");
                    System.out.println("3 - Pagar em 5x com juros de 10%;");
                    System.out.println("Digite a forma de pagamento desejada: ");
                    int prestacao = input.nextInt();
                    c1.setPrecoFinal(prestacao);
                    c1.setValorPrestreca(prestacao);
                    System.out.println("Preco final após a escolha de pagamento: R$"+c1.getPrecoFinal());
                    System.out.println("Valor das prestações: R$"+c1.getValorPrestreca());
                    System.out.println(c1);
                    break;

                }
        }while(true);
}


}
