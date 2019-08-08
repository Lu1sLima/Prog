package Beicola;
import java.util.Scanner;
public class App{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //instanciando as placas
        Placa p1 = new Placa("Brasil","ABC1R23");
        Placa p2 = new Placa("New York","ABD1R23");
        Placa p3 = new Placa("Bahamas","ABE1R23");
        Placa p4 = new Placa("Panama","ABF1R23");
        Placa p5 = new Placa("Venezuela","ABG1R23");

        //instanciando os veiculos que recebem as placas
        Veiculo v1 = new Veiculo(p1);
        Veiculo v2 = new Veiculo(p2);
        Veiculo v3 = new Veiculo(p3);
        Veiculo v4 = new Veiculo(p4);
        Veiculo v5 = new Veiculo(p5);

        //criando o vetor que guarda as placas
        Veiculo []veiculo = {v1,v2,v3,v4,v5};

        //menu
        while(true) {
            System.out.println("Informe o que voce deseja fazer: ");
            System.out.println("1 - Abastecer");
            System.out.println("2 - Dirigir");
            System.out.println("3 - Fim");
            int num = input.nextInt();

            switch(num){
                case 1:
                    System.out.println("Informe a placa do veiculo a ser abastecido: ");
                    input.nextLine();
                    String placa = input.nextLine();
                    int aux = 0;
                    int invalida = 0;
                    for(int i = 0; i < veiculo.length; i++){
                        if(veiculo[i].getPlaca().getCodigo().equals(placa)){ //getPlaca() me faz entrar dentro da classe placa, o getCodigo me faz entrar dentro da classe Placa, onde ele guarda os codigos dos carros.
                            aux = i;
                            //me da a posicao do vetor que a placa esta
                            System.out.println("Informe quantos litros serao abastecidos: ");
                            int litros = input.nextInt();
                            veiculo[aux].abastece(litros);
                            System.out.println(veiculo[aux].toString());
                            System.out.println();
                            break;
                        }

                        else  {
                            invalida++;
                            if(invalida == veiculo.length-1)
                                System.out.println("Veiculo nao encontrado");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Informe a placa do veiculo que pretende dirigir: ");
                    input.nextLine();
                    placa = input.nextLine();
                    aux = 0;
                    for(int i = 0; i < veiculo.length; i++){
                        if(veiculo[i].getPlaca().getCodigo().equals(placa)){
                            aux = i; //me da a posicao do vetor que a placa esta
                            System.out.println("Informe a distancia a ser percorrida : ");
                            double distancia = input.nextDouble();
                            System.out.println("Distancia efetivamente percorrida: "+veiculo[aux].dirige(distancia) + "Combustivel no tanque: "+ veiculo[aux].getCombustivelNoTanque());
                            System.out.println();
                            break;
                        }

                        else {
                            System.out.println("Veiculo nao encontrado");
                        }

                    }
                    break;
                case 3:
                    for(int i = 0; i < veiculo.length; i++) {
                        System.out.println();
                        System.out.println("Veiculo #"+ (i+1));
                        System.out.println(veiculo[i].toString());
                        System.out.println();
                    }
                    break;
            }



        }
    }
}