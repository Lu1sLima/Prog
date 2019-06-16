package BicharaV2;
/** @author (Luís Lima, 19111170-7)
 * @author (Lucas Machado Garcia 1911127-0)
 * @professora (Giraffa)
 * @turma (128)
 * @version (09/06/19)
 *
 * Nessa versão do programa eu coloquei o tamanho das astes (gancho tem 12 cm e caixa redonda tem 24cm), e os pingentes tem 2 cm cada
 * e com isso, o usuário está limitado a comprar uma quantidade X de pingentes de acordo com o tamanho da aste, ou seja, se escolher a aste 1
 * ele pode comprar apenas 6 pingentes, pois 6x2 = 12.
 */
import java.util.Scanner;
public class BicharaAPPv2 {
    public static void main(String[] args) {
        int tits = 0;
        int menu = 4;
        int pingente = 0;
        int cordao = 0;
        int aste = 0;
        int prestacao = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Bem vindo à loja Bichara!");
        System.out.println("Antes de entrarmos no Menu de Compra, você deve informar o tamanho do cordão e a aste utilizada para segurar os pingentes.");
        do{
        System.out.println("Para o cordão temos as seguintes opções: \n1 - 50cm, R$ 300,00\n2 - 70cm, R$ 400,00\nDigite a opção escolhida: ");
        cordao = input.nextInt();
        if (cordao == 1 || cordao == 2){break;}
        else{
            System.out.println("Digite uma opção válida!");
            System.out.println("******************************************************************************************************************");
        }
        }while(true);
        do{
        System.out.println("Para aste temos as seguintes opções: \n1 - Gancho (12cm), R$ 200,00\n2 - Caixa Redonda (20cm), R$ 350,00 ");
        aste = input.nextInt();
        if (aste == 1 || aste == 2){break;}
        else{
            System.out.println("Digite uma opção válida!");
            System.out.println("******************************************************************************************************************");
        }

        }while(true);
        ColarV2 c1 = new ColarV2(cordao, aste);

        while (true) {
            menu = opcao();
            if (menu == 0) {
                break;
            }
            switch (menu) {
                case 1:
                    do{
                    System.out.println("Digite o novo tipo de cordão desejado: ");
                    cordao = input.nextInt();
                    if (cordao == 1 || cordao == 2){break;}
                    else{
                        System.out.println("Digite uma opção válida!");
                        System.out.println("******************************************************************************************************************");
                    }
                    }while(true);
                    c1.setCordao(cordao);
                    break;
                case 2:
                    do {
                        System.out.println("Temos 2 tipos de Pingente, escolha uma das opções abaixo:\n1 - Prata (2cm), valor: R$ 70,00\n2 - Prata com pedras incrustadas (2cm), valor: R$ 100,00\nDigite o pingente escolhido: ");
                        pingente = input.nextInt();
                        if (pingente == 1 || pingente == 2){break;}
                        else{
                            System.out.println("Digite uma opção válida!");
                            System.out.println("******************************************************************************************************************");
                        }
                    }while(true);
                        if (pingente == 1) {
                            if (c1.getTesteA() == 1) {
                                if (c1.getPgts() < 6) {
                                    c1.compraPingente1();
                                    break;
                                } else {
                                    System.out.println("Você só pode comprar a quantidade de pingentes equivalente ao tamanho da sua aste.");
                                    break;
                                }
                            } else if (c1.getTesteA() == 2) {
                                if (c1.getPgts() < 12) {
                                    c1.compraPingente1();
                                    break;
                                } else {
                                    System.out.println("Você só pode comprar a quantidade de pingentes equivalente ao tamanho da sua aste.");
                                    break;
                                }
                            }
                        } else if (pingente == 2) {
                            if (c1.getTesteA() == 1) {
                                if (c1.getPgts() < 6) {
                                    c1.compraPingente2();
                                    break;
                                } else {
                                    System.out.println("Você só pode comprar a quantidade de pingentes equivalente ao tamanho da sua aste.");
                                    break;
                                }
                            } else if (c1.getTesteA() == 2) {
                                if (c1.getPgts() < 12) {
                                    c1.compraPingente2();
                                    break;
                                } else {
                                    System.out.println("Você só pode comprar a quantidade de pingentes equivalente ao tamanho da sua aste.");
                                    break;
                                }
                            }
                        }
                case 3:
                    do{
                    System.out.println("Você deciciu escolher uma nova aste. Lembrando: \nSe você alterar a aste para uma menor do que está sendo usada sua escolha de pingentes será zerada!");
                    System.out.println("O tamanho da sua aste impacta na quantidade de pingentes que você poderá comprar!");
                    System.out.println("1 - Gancho (12cm), R$ 200,00\n2 - Caixa Redonda (20cm), R$ 350,00\nEscolha a opcao desejada: ");
                    aste = input.nextInt();
                    if (aste == 1 || aste == 2){break;}
                    else{
                        System.out.println("Escolha uma opção válida!");
                        System.out.println("******************************************************************************************************************");
                    }
                    }while(true);
                    c1.setAste(aste);
                    break;
                case 4:
                    System.out.println("O preco está em: " + c1.getPreco());
                    break;
                case 5:
                    do{
                    System.out.println("Escolha uma forma de pagamento: ");
                    System.out.println("1 - Pagar a vista com 5% de desconto;");
                    System.out.println("2 - Pagar em até 3x sem juros;");
                    System.out.println("3 - Pagar em 5x com juros de 10%;");
                    System.out.println("Digite a forma de pagamento desejada: ");
                    prestacao = input.nextInt();

                    if (prestacao == 1 || prestacao == 2 || prestacao == 3){break;}
                    else{
                        System.out.println("Digite uma opção válida!");
                        System.out.println("******************************************************************************************************************");
                    }
                    }while(true);
                    c1.setPrecoFinal(prestacao);
                    c1.setValorPrestreca(prestacao);
                    System.out.println("Preco final após a escolha de pagamento: R$" + c1.getPrecoFinal());
                    System.out.println("Valor das prestações: R$" + c1.getValorPrestreca());
                    System.out.println(c1);
                    System.out.println(c1.getPgts());
                    tits  = 1;
                    break;


            }
            if (menu == 5){break;}
        }
    }

    public static int opcao() {
        Scanner input = new Scanner(System.in);
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
        return opcao;
    }
}