package POOPlacas;
import java.util.Scanner;
public class App{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        Placa p1 = new Placa("Brasil","ABC1R23");
        Placa p2 = new Placa("Venezuela", "EFG1R23");
        Placa p3 = new Placa ("Peru", "HIJ1R23");
        Placa p4 = new Placa("Argentina", "KLM1R23");
        Placa p5 = new Placa ("Uruguai", "NOP1R23");

        Veiculo v1 = new Veiculo(p1);
        Veiculo v2 = new Veiculo(p2);
        Veiculo v3 = new Veiculo(p3);
        Veiculo v4 = new Veiculo(p4);
        Veiculo v5 = new Veiculo(p5);

        Veiculo [] dados = {v1, v2, v3, v4, v5};
        int a = 0;

        while(a != 3){
            System.out.println("Por favor, escolha uma das opções abaixo: ");
            System.out.println("1 - Abastecer;");
            System.out.println("2 - Dirigir;");
            System.out.println("3 - Fim");
            System.out.println("Informe a opção desejada: ");
            int opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe a placa do veículo que deseja abastecer: ");
                    input.nextLine();
                    String placa = input.nextLine();
                    int carro = 0;
                    int contador = 0;
                    for (int i = 0; i<dados.length; i++){
                        if (dados[i].getPlaca().getCodigo().equals(placa)){
                            carro = i;
                            do {
                                System.out.println("Informe quantos litros deseja abastecer: ");
                                double litros = input.nextDouble();
                                if(litros > 0 && litros <= 60) {
                                    dados[i].abastece(litros);
                                    break;
                                } else{
                                        System.out.println("Informe um valor válido!");
                                    }
                            }while(true);
                            System.out.println(dados[i]);
                            break;
                        }
                        else{
                            contador++;
                            if (contador == dados.length-1){
                                System.out.println("Veículo não encontrado!");
                                break;
                            }
                        }

                    }
                    break;
                case 2:
                    int carro1 = 0;
                    int contador1 = 0;
                    System.out.println("Informe a placa do veículo: ");
                    input.nextLine();
                    String placa1 = input.nextLine();
                    for (int i = 0; i<dados.length; i++) {
                        if (dados[i].getPlaca().getCodigo().equals(placa1)) {
                            carro1 = i;
                            System.out.println("Você têm "+dados[carro1].getCombustivelNoTanque()+" de combustível no tanque.");
                            do {
                                System.out.println("Informe a distância a ser percorrida: ");
                                double distancia = input.nextDouble();
                                if(distancia >= 0 && distancia <= 600) {
                                    System.out.println("Você percorreu: " + dados[carro1].dirige(distancia) + " e ainda tem: " + dados[carro1].getCombustivelNoTanque() + " de combustível no tanque.");
                                    break;
                                }else{
                                    System.out.println("Com base no tamanho do tanque do seu carro, e nos cálculos de média do mesmo, conclui-se que o seu carro não poderá percorrer essa distância, portanto informe um valor menor.");
                                }
                            }while(true);

                        } else {
                            contador1++;
                            if (contador1 == dados.length-1) {
                                System.out.println("Veículo não encontrado!");
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    for(int i = 0; i<dados.length; i++){
                        System.out.println(dados[i]);
                    }
                    a = 3;
                    break;
            }
        }
        }
}