package exerc�ciosRepeti��oGiraffa;

/**
*
* @author Lu�s Lima
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
		double soma = 0; // declarando DOUBLE para a divis�o ser um valor REAL.
		
		do // fazendo digitar um n�mero positivo
		{
			
			System.out.println("Digite um n�mero inteiro e positivo: ");
			num = input.nextInt();
			for (int contador = 1; contador <= num; contador++) // vai fazer o loop at� o contador for igual ao n�mero, contador inicia com 1.
			{
				soma += 1.0/contador; // S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
				System.out.println("A soma �: "+soma); // printa todos os resultados at� 1/n.
			}
			
			
		} while (num >= 0);
	}

}
