
/*
 * Esse algoritmo permite impress�o bidiomensional
 */
public class Asteriscos {
	public static void main (String[]args) 
	{
		System.out.println("f");
		for (int i = 5; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*"); // prende o CURSOR
			}
			System.out.println(); // entre os dois la�os de FOR. DESBLOQUEIA O CURSOS
		}
	}

}
