package exerc�ciosRepeti��oGiraffa;


import java.util.Scanner;
public class Ex12 {
	public static void main(String[]args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\f");
		int num = 1;
		int maior = 0;
		int menor = 999999999;
		int soma = 0;
		double media = 0;
		int i = 0;
		double percentPar = 0;
		double somaPar = 0;
		do 
		{
			System.out.println("Digite um n�mero maior que zero: ");
			num = input.nextInt();
			if (num % 2 == 0) // defini��o de n�mero par.
			{
				somaPar+= num; // Soma s� os n�meros que s�o pares.
				if (num > maior) {maior = num;}
			}
			
			if (num % 2 != 0) // �mpar
			{
				if (num < menor) {menor = num;}
			}
			soma += num; // soma de todos n�meros lidos.
			i++; // contadora
			percentPar = (somaPar*100)/soma; // PORCENTAGEM, PEGA A SOMA DE PARES, MULTIPLICA POR 100 E DIVIDE PELA SOMA DE TODOS OS N�MEROS
		} while (num >= 1);
		media = ((double)soma)/(i-1); // tirei 1 do contador, pra nao contar o encerremento do loop quando num == 0 ou num < 0.
		if (num <= 0) {System.out.println("N�mero inv�lido!");}
		System.out.println("Maior n�mero par: " +maior);
		System.out.println("Menor n�mero �mpar: " +menor);
		System.out.println("Soma dos n�meros lidos: " +soma);
		System.out.println("M�dia dos n�meros lidos: "+media);
		System.out.println("Porcentagem de n�meros pares: "+percentPar);
	}
}
