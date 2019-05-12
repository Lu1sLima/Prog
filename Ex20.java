package exercíciosRepetiçãoGiraffa;

/**
*
* @author Luís Lima
* @version 12/05/19
* 
*/


import java.util.Scanner;
public class Ex20 {
	public static void main (String[]args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\f");
		int num = 0;
		double soma = 0; // declarando DOUBLE para a divisão ser um valor REAL.
		
		do // fazendo digitar um número positivo
		{
			
			System.out.println("Digite um número inteiro e positivo: ");
			num = input.nextInt();
			for (int contador = 1; contador <= num; contador++) // vai fazer o loop até o contador for igual ao número, contador inicia com 1.
			{
				soma += 1.0/contador; // S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
				System.out.println("A soma é: "+soma); // printa todos os resultados até 1/n.
			}
			
			
		} while (num >= 0);
	}

}
