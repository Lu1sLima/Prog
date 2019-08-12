package Bank;

public class Banco {

    Conta conta;
    int numeroConta = 0;
    Conta data[] = new Conta[10]; // vai poder guardar até 10 contas

    public void criaConta(String nome, double deposito){
        this.conta = new Conta(nome, deposito);
        this.data[numeroConta] = conta;
        System.out.println(this.data[numeroConta]);
        System.out.println("O número da sua conta é: "+numeroConta);
        this.numeroConta++;

    }

    public void pesquisaConta(int numeroConta){
        System.out.println(data[numeroConta]+"\nNumero da Conta: "+numeroConta);
    }

    public Conta getConta(int numeroConta){
        return data[numeroConta];
    }

}
