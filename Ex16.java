package exerc�ciosRepeti��oGiraffa;
/**
*
* @author Lu�s Lima
* @version 12/05/19
* 
*/

import java.util.Scanner;
public class Ex16 {
	public static void main(String[]args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\f");
		int idade = 1; // iniciando com 1 por causa do while.
		double contador = 0; // declarei DOUBLE para fazer uma divis�o de n�mero REAL na m�dia.
		int soma = 0;
		double media = 0;
		do {
		System.out.println("Informe sua idade: ");
		idade = input.nextInt();
		if (idade < 0) {System.out.println("Idade inv�lida.");
		break;}//VAI PARAR O PROGRAMA QUANDO FOR DIGITADO NEGATIVO, ASSIM N�O ATUALIZANDO AS VARI�VEIS CONTADOR E SOMA.
		contador++; // conta quantas pessoas inseriram a idade.
		soma += idade; // SOMA AS IDADES
		} while (idade > 0);
		media = soma/contador;
		System.out.println("A m�dia das idades lidas �: "+media);
	}

}