
/**
 * Escreva a descrição da classe Ex1v2 aqui.
 * 
 * @author (Luis L.) 
 * @version (08/05)
 */

import java.util.Scanner;
public class Ex1v2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("\f");
		int contador = 0;
		int num = 0;
		int soma = 0;
		System.out.println("Digite um número inteiro: ");
		num = input.nextInt();

		for (contador = num; contador >= 1; contador--){
		    soma = contador+soma;
		  }
		  System.out.println(soma);
	}
}
