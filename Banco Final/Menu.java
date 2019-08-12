package Bank;

import java.util.Scanner;
public class Menu {
    private int opcoes;
    Banco banco;
    Scanner input = new Scanner(System.in);

    public Menu (){
        this.banco = new Banco();
    }

    public void opcaoUm (){
        double deposito = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();
        do{
            System.out.println("Informe o depósito: ");
            deposito = input.nextDouble();
            if (deposito >= 50){
                break;
            }
            else{
                System.out.println("Você precisa depositar no mínimo R$ 50,00.");
            }
        }while(true);

        banco.criaConta(nome, deposito);
    }

    public void opcaoDois(){
        System.out.println("Informe o número da conta que deseja depositar: ");
        int numContaDep = input.nextInt();
        if(numContaDep < banco.numeroConta) {
            System.out.println("Informe a quantia que deseja depositar: ");
            double quantiaD = input.nextDouble();
            banco.data[numContaDep].depositar(quantiaD);
            System.out.println("Novo balanço da conta " + numContaDep + ": " + banco.data[numContaDep].getBalanco());
        } else{
            System.out.println("Essa conta ainda não existe!");
        }
    }

    public void opcaoTres(){
        System.out.println("Informe o número da conta: ");
        int numContaSac = input.nextInt();
        if (numContaSac < banco.numeroConta) {
            System.out.println(banco.data[numContaSac]);
            System.out.println("Você quer utilizar o saldo corrente?(Se sim, seu balanco ficará negativo!)\n1 - Sim;\n2 - Não;\nDigite a opção desejada:");
            int option = input.nextInt();
            System.out.println("Informe o valor que deseja sacar: ");
            double valorSac = input.nextDouble();
            banco.data[numContaSac].sacar2(option, valorSac);
        }else{
            System.out.println("Essa conta ainda nao existe!");
        }

    }

    public void opcaoQuatro(){
        System.out.println("Informe o número da sua conta: ");
        int numeroConta = input.nextInt();
        if (numeroConta < banco.numeroConta) {
            System.out.println("Informe o número da conta que você vai transferir o dinheiro: ");
            int numeroConta2 = input.nextInt();
            if (numeroConta2 < banco.numeroConta) {
                System.out.println("Informe o valor desejado: ");
                double valor = input.nextDouble();
                this.banco.data[numeroConta].transferir(banco.data[numeroConta2], valor);
            }else{
                System.out.println("Essa conta ainda não existe!");
            }
        }else{
            System.out.println("Essa conta ainda não existe!");
        }
    }

    public void opcaoCinco(){
        System.out.println("Informe o numero da conta: ");
        int numContaSaldo = input.nextInt();
        if (numContaSaldo < banco.numeroConta) {

            System.out.println("Saldo corrente da conta " + numContaSaldo + ": " + banco.data[numContaSaldo].getSaldoCorrente());
        } else{
            System.out.println("Essa conta ainda nao existe!");
        }

    }

    public void opcaoSeis(){
        System.out.println("Informe o número da conta: ");
        int numContaBalanco = input.nextInt();
        if(numContaBalanco < banco.numeroConta) {
            System.out.println("Balanco da conta " + numContaBalanco + ": " + banco.data[numContaBalanco].getBalanco());
        } else{
            System.out.println("Essa conta ainda nao existe!");
        }
    }

    public void opcaoSete(){
        System.out.println("Informe o número da conta: ");
        int numContaConsulta = input.nextInt();
        if (numContaConsulta < banco.numeroConta){
            System.out.println("Nome do titular da conta "+numContaConsulta+": "+banco.data[numContaConsulta].getNome());
        }
        else{
            System.out.println("Essa conta nao existe!");
        }
    }

}



