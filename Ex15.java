
/**
 * Implemente um trecho de código no método main que faça a leitura de 10 idades de nadadores,
uma idade por vez, e a cada idade lida escreva na tela a categoria em que o nadador se encontra.
As categorias existentes são:
 infantil A = 5 - 7 anos
 infantil B = 8-10 anos
 juvenil A = 11-13 anos
 juvenil B = 14-17 anos
 adulto = maiores de 18 anos
 * 
 * @author (Luis L.) 
 * @version (08/05/19)
 */


import java.util.Scanner;
public class Ex15{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("\f");
		for (int i = 1; i <= 10; i++){
			System.out.println("Digite sua idade: ");
			int idade = input.nextInt();
			if (idade < 5){System.out.println("Idade inválida");}
			else if (idade >= 5 && idade <= 7){System.out.println("Infantil A.");}
			else if (idade <= 10){System.out.println("Infantil B");}
			else if (idade <= 13){System.out.println("Juvenil A.");}
			else if (idade <= 17){System.out.println("Juvenil B");}
			else{System.out.println("Adulto");}
		}
		
	}
}
