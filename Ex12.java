package exercíciosRepetiçãoGiraffa;

/**
*
* @author Luís Lima
* @version 9 may 19
* 
*/

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
			System.out.println("Digite um número maior que zero: ");
			num = input.nextInt();
			if (num % 2 == 0) // definição de número par.
			{
				somaPar+= num; // Soma só os números que são pares.
				if (num > maior) {maior = num;}
			}
			
			if (num % 2 != 0) // ímpar
			{
				if (num < menor) {menor = num;}
			}
			soma += num; // soma de todos números lidos.
			i++; // contadora
			percentPar = (somaPar*100)/soma; // PORCENTAGEM, PEGA A SOMA DE PARES, MULTIPLICA POR 100 E DIVIDE PELA SOMA DE TODOS OS NÚMEROS
		} while (num >= 1);
		media = ((double)soma)/(i-1); // tirei 1 do contador, pra nao contar o encerremento do loop quando num == 0 ou num < 0.
		if (num <= 0) {System.out.println("Número inválido!");}
		System.out.println("Maior número par: " +maior);
		System.out.println("Menor número ímpar: " +menor);
		System.out.println("Soma dos números lidos: " +soma);
		System.out.println("Média dos números lidos: "+media);
		System.out.println("Porcentagem de números pares: "+percentPar);
	}
}
