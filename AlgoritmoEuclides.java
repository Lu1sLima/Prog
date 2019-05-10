
/**
 * Algoritmo de Euclides, para mostrar o MDC de 2 números naturais maiores do que zero.
 * 
 * @author (Luís Lima); 
 * @version (10/05)
 */

package euclides;


import java.util.Scanner;
public class AlgoritmoEuclides {
	public static void main (String[]args) 
	{
		int a = 0;
		int b = 0;
		int resto = 0;
		int divisao = 0;
		int aux = 0;
		int acumulador = 0;
		int quociente = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("\f");
		do {
		System.out.println("Digite o divisor: ");
		a = input.nextInt();
		System.out.println("Digite o dividendo: ");
		b = input.nextInt();
		}while (a <= 0 && b <= 0); //garantindo um número natural maior do que zero.
		
		if (a < b) // invertendo as variáveis, caso a seja menor que b.
		{
			aux = a;
			a = b;
			b = aux;
		}
		
		resto = a%b; // se o resto de a/b for zero, então b é o MDC de a.
		if (resto == 0) {System.out.println(b);} //se o resto de a/b for zero, então b é o MDC de a.
		else // se o resto de a/b nao for zero, então entra no loop
		{
			do 
			{
				acumulador = resto; // acumulando o resto
				resto = b % resto; // novo resto será o resto da divisao de b/resto
				b = acumulador; // tranformando o resto no novo dividendo
				if (resto == 0) 
				{
					System.out.println(b);
				}
			} while (resto != 0);
		}
		}
		}
