package exerc�ciosRepeti��oGiraffa;

/**
*
* @author Lu�s Lima
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
		
		for (int i = 0; i <= 20; i++) // VAI LER 20 N�MEROS
		{
			System.out.println("Informe um n�mero Inteiro: ");
			num = input.nextInt();
			for(int contador = 1; contador <= num; contador++) // A CADA N�MERO LIDO, VAI FAZER A TABUADA AT� O N�MERO.
			{
				num2 = num*contador; // a cada loop, far� o produto de num * contador, lembrando q contador inicia com 1 � incrementado com 1 a todo loop, at� for == num.
				System.out.println(+contador+ " X " +num+ " = " +num2); // printa a cada loop.
			}
		}
	}

}
