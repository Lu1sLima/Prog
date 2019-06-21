package BicharaV3;

/** @author (Luís Lima, 19111170-7)
 * @author (Lucas Machado Garcia 1911127-0)
 * @professora (Giraffa)
 * @turma (128)
 * @version (20/06/19)
 *
 * Nessa versão do programa eu coloquei o tamanho das astes (gancho tem 12 cm e caixa redonda tem 24cm), e os pingentes tem 2 cm cada
 * e com isso, o usuário está limitado a comprar uma quantidade X de pingentes de acordo com o tamanho da aste, ou seja, se escolher a aste 1
 * ele pode comprar apenas 6 pingentes, pois 6x2 = 12.
 * Nota de atualização:
 * - Adicionado estoque aos pingentes:
 * Pingente 1 = 10 em estoque
 * Pingente 2 = 12 em estoque
 *
 */

import java.util.Scanner;

public class BicharaAPPV3 {
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
        Colar c1 = new Colar(cordao, aste);

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
                        if (c1.getHaste() == 1) {
                            if (c1.getPgts() < 6) { // se a haste for 1, nela só cabem 6 pingentes
                                c1.compraPingente1();
                                break;
                            } else {
                                System.out.println("Você só pode comprar a quantidade de pingentes equivalente ao tamanho da sua haste.");
                                break;
                            }
                        } else if (c1.getHaste() == 2) {
                            if (c1.pgt1 > 0) {
                                if (c1.getPgts() < 12) { // verificando se o total de pingentes comprados é menor do que 12, pois é oq cabe na haste 2
                                    c1.compraPingente1();
                                    break;
                                } else { // se for maior ou igual a 12, não da mais para comprar nenhum pingente
                                    System.out.println("Você só pode comprar a quantidade de pingentes equivalente ao tamanho da sua haste.");
                                    break;
                                }
                            } else{ // na haste 2 cabem 12 pingentes, mas só há 10 pingentes 1 em estoque
                                System.out.println("Não há mais esse pingente em estoque!");
                                break;
                            }
                        }
                    } else if (pingente == 2) {
                        if (c1.getHaste() == 1) {
                            if (c1.getPgts() < 6) { // veificando se o total de pingentes comprados é menor do que 6
                                c1.compraPingente2();
                                break;
                            } else { // se os pingentes comprados forem > 6, não da mais para comprar, só trocando a haste
                                System.out.println("Você só pode comprar a quantidade de pingentes equivalente ao tamanho da sua haste.");
                                break;
                            }
                        } else if (c1.getHaste() == 2) {
                            if (c1.pgt2 >= 0) { // se a haste for 2, pode comprar todos os pingentes do estoque 2, pois nela cabe, 12 e tem 12 no estoque
                                if (c1.getPgts() < 12) { // verificando se o TOTAL de pingentes comprados é menor do que 12
                                    c1.compraPingente2();
                                    break;
                                } else { // se o total de pingentes for >= 12, não da mais pra comnprar
                                    System.out.println("Você só pode comprar a quantidade de pingentes equivalente ao tamanho da sua haste.");
                                    break;
                                }
                            }
                        }else{ // verificando quantos pingentes tem no estoque
                            System.out.println("Não há mais esse pingente em estoque!");
                            break;
                        }
                    }
                case 3:
                    do{
                        System.out.println("Você deciciu escolher uma nova haste. Lembrando: \nSe você alterar a haste para uma menor do que está sendo usada sua escolha de pingentes será zerada!");
                        System.out.println("O tamanho da sua haste impacta na quantidade de pingentes que você poderá comprar!");
                        System.out.println("1 - Gancho (12cm), R$ 200,00\n2 - Caixa Redonda (20cm), R$ 350,00\nEscolha a opcao desejada: ");
                        aste = input.nextInt();
                        if (aste == 1 || aste == 2){break;}
                        else{
                            System.out.println("Escolha uma opção válida!");
                            System.out.println("******************************************************************************************************************");
                        }
                    }while(true);
                    c1.setHaste(aste);
                    break;
                case 4:
                    System.out.println("O preco está em: " + c1.getPreco());
                    break;
                case 5:
                    System.out.println("Estoque de pingentes pratas: "+c1.getPgt1());
                    System.out.println("Estoque de pingentes pratas com pedras irrustidas: "+c1.getPgt2());
                    break;
                case 6:
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
                    c1.setValorPrestacao(prestacao);
                    //System.out.println(c1.getPgts());
                    System.out.println("Preco final após a escolha de pagamento: R$" + c1.getPrecoFinal());
                    System.out.println("Valor das prestações: R$" + c1.getValorPrestacao());
                    System.out.println(c1);
                    tits  = 1;
                    break;


            }
            if (menu == 6){break;}
        }
    }

    public static int opcao() {
        Scanner input = new Scanner(System.in);
        System.out.println("******************************************************************************************************************");
        System.out.println("Menu de compras Loja Bichara:");
        System.out.println("0 - Finalizar compra;");
        System.out.println("1 - Mudar cordão;");
        System.out.println("2 - Comprar pingente;");
        System.out.println("3 - Mudar haste;");
        System.out.println("4 - Consultar preço atual do colar;");
        System.out.println("5 - Consultar estoque;");
        System.out.println("6 - Finalizar compra;");
        System.out.println("Digite a opção escolhida: ");
        int opcao = input.nextInt();
        return opcao;
    }
}
