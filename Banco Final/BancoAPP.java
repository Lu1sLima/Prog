package Bank;

import java.util.Scanner;
public class BancoAPP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu m1 = new Menu();
        String nome;
        double valor;
        System.out.println("\f");
        do {
            System.out.println("******************************************************************************************************************");
            System.out.println("Bem vindo ao Banco!");
            System.out.println("Menu de opçoes: ");
            System.out.println("1 - Criar conta;");
            System.out.println("2 - Depositar;");
            System.out.println("3 - Sacar;");
            System.out.println("4 - Transferência entre contas;");
            System.out.println("5 - Saldo Corrente;");
            System.out.println("6 - Consultar Balanço;");
            System.out.println("7 - Consultar nome do titular pelo número da conta;");
            System.out.println("8 - Sair.");
            int menu = input.nextInt();
            if (menu == 1) {
                if(m1.banco.numeroConta < 10) { // enquanto não tiver atingido o limite de contas (10), pode criar conta
                    m1.opcaoUm();
                }
                else{ // se atingir o limite de contas não da mais pra criar contas
                    System.out.println("Limite de contas atingido!");
                }
            }
            else if(menu == 2){
                m1.opcaoDois();
            }
            else if (menu == 3){
                m1.opcaoTres();
            }
            else if (menu == 4) {
                m1.opcaoQuatro();
            }
            else if(menu == 5){
                m1.opcaoCinco();
            }
            else if (menu == 6){
                m1.opcaoSeis();
            }
            else if (menu == 7){
                m1.opcaoSete();
            }
            else{
                break;
            }
        } while (true);
    }
}