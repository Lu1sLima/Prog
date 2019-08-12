package Bank;

import java.lang.Math;
public class Conta{
    private String nome;
    protected static int numeroConta = 0;
    private double depositoInicial;
    private double balanco;
    private double saldoCorrente;
    String maiusculo;
    int contador = 0;

    public Conta(String nomeTitular, double depositoInicial){
        nome = nomeTitular;
        this.depositoInicial = depositoInicial;
        balanco = depositoInicial;
        this.saldoCorrente = balanco*0.10;
    }

    //getters
    public String getNome(){
        maiusculo = nome.substring(0, 1).toUpperCase()+nome.substring(1);
        return maiusculo;
    }

    public double getSaldoCorrente(){ return saldoCorrente; }

    public int getNumeroConta(){
        return numeroConta;
    }

    public double getDepositoInicial(){
        return depositoInicial;
    }

    public double getBalanco() { return balanco; }


    //setters
    public void setNome(String newName) {
        nome = newName;
    }

    protected void setNumeroConta(int newNumero){
        numeroConta = newNumero;
    }

    public void setBalanco(double newSaldo) { balanco = newSaldo;
    }
    public void setSaldoCorrente(double valor){this.saldoCorrente = valor;}

    // métodos
    public void sacar(double quantia){
        if(quantia > 0 && quantia <= balanco){
            balanco = balanco - quantia;
        }

    }

    public void sacar2(int opcao, double quantia){

        if (opcao == 1){
            if(Math.abs(balanco-quantia) <= saldoCorrente){
                balanco = balanco-quantia;
                saldoCorrente = 0;
                System.out.println("Balanco da conta: "+balanco);
            }
            else{
                System.out.println("Você não pode sacar uma quantia maior do que o saldo corrente.");
            }
        }
        else if (opcao == 2){
            if (quantia > 0 && quantia <= balanco){
                balanco = balanco - quantia;
                saldoCorrente = 0;
                System.out.println("Balanco da conta: "+balanco);
            }
            else{
                System.out.println("Você não tem esse valor!");
            }
        }
    }

    public void depositar(double valor){
        if (valor > 0){
            balanco += valor;
        }
    }


    public void transferir(Conta destino, double valor){
        if (valor <= balanco) {
            sacar(valor);
            destino.depositar(valor);
            setSaldoCorrente((balanco*0.10));
            destino.setSaldoCorrente((destino.getBalanco()*0.10));
            System.out.println("Balanco da primeira conta: "+balanco);
            System.out.println("Balanco da segunda conta: "+destino.getBalanco());
        }
        else{
            System.out.println("Você não tem esse valor!");
        }
    }


    public String toString() {
        return "Nome do Titular: "+nome.substring(0, 1).toUpperCase()+nome.substring(1)+"" +
                "\nSaldo da Conta: "+balanco +
                "\nSaldo Corrente: "+saldoCorrente;
    }
}
