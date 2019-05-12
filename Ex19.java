package exercíciosRepetiçãoGiraffa;

/**
*
* @author Luís Lima
* @version 12/05/19
* 
*/

import java.util.Scanner;
public class Ex19 {
	public static void main(String[]args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\f");
		double num = 0;
		double menor = 999999;
		double maior = 0;
		double soma = 0;
		double media = 0;
		int i = 0;
		
		for(i = 0; i < 500; i++) //
		{
			System.out.println("Digite um número: ");
			num = input.nextDouble();
			if (num > maior) {maior = num;} // apenas colocando a variável maior.
			else if (num < menor) {menor = num;} // apenas colocando a variável menor.
			soma += num; // acumula os números e soma-os.
		}
		media = soma/i;
		System.out.println("O maior valor lido foi: "+maior);
		System.out.println("O menor valor lido foi: "+menor);
		System.out.println("A média dos valores lidos foi: "+media);
	}

}
