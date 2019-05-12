package exercíciosRepetiçãoGiraffa;
/**
*
* @author Luís Lima
* @version 12/05/19
* 
*/

import java.util.Scanner;
public class Ex17 {
	public static void main (String[]args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("\f");
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double aluno = 0;
		int contador1 = 0;
		int contador2 = 0;
		int contador3 = 0;
		int somaCont = 0;
		double somaNotas = 0;
		double somaTotal = 0;
		double media = 0;
		
		
		
		do 
		{
			System.out.println("Informe seu código de aluno: ");
			aluno = input.nextInt();
			if (aluno < 0) {System.out.println("Código inválido!");
			break;} // se for menor do que zero, printa a mensagem e PARA O PROGRAMA NA HORA!
			System.out.println("Informe a primeira nota: ");
			contador1++; 
			nota1 = input.nextInt();
			System.out.println("Informe a segunda nota: ");
			nota2 = input.nextInt();
			contador2++;
			System.out.println("Informe a terceira nota: ");
			nota3 = input.nextInt();
			contador3++;
			somaNotas = nota1+nota2+nota3; // soma todas as notas digitadas.
			somaTotal += somaNotas; // acumula as notas anteriores e soma a nova.
			somaCont = contador1 + contador2 + contador3; // soma quantas vezes foram digitadas as notas.
		} while(aluno > 0); // se o código de aluno for menor do que zero, o programa para.
		
		media = somaTotal / somaCont;
		System.out.println("A média aritmética dos alunos é: "+media);
	}
}
