package exercíciosRepetiçãoGiraffa;

/**
*
* @author Luís Lima
* @version 12/05/19
* 
*/

import java.util.Scanner;
public class Ex18 {
	public static void main (String[]args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\f");
		int num = 0;
		int num2 = 0;
		
		for (int i = 0; i <= 20; i++) // VAI LER 20 NÚMEROS
		{
			System.out.println("Informe um número Inteiro: ");
			num = input.nextInt();
			for(int contador = 1; contador <= num; contador++) // A CADA NÚMERO LIDO, VAI FAZER A TABUADA ATÉ O NÚMERO.
			{
				num2 = num*contador; // a cada loop, fará o produto de num * contador, lembrando q contador inicia com 1 é incrementado com 1 a todo loop, até for == num.
				System.out.println(+contador+ " X " +num+ " = " +num2); // printa a cada loop.
			}
		}
	}

}
