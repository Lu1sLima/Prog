package testeString;

import java.util.Scanner;
public class Verbo {
	public static void main (String[]args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um verbom o verbo: ");
		String verbo = input.nextLine();
		char letra = verbo.charAt(0);
		String troca = Character.toString(letra);
		
		//+verbo.replace("r", "r�o")
		if(verbo.endsWith("ar")) 
		{
			System.out.println("Conjuga��o do verbo no futuro: "+verbo.replace("ar", "ar�o"));
			System.out.println("Conuga��o do verbo no passado: "+verbo.replace("ar", "aram"));
			System.out.println(troca.toUpperCase()+verbo.substring(1)+ " tem " +verbo.length()+" caracteres.");
			System.out.println(troca.toUpperCase()+verbo.substring(1));
			System.out.println(verbo.substring(0, 1).toUpperCase()+verbo.substring(1)+ " tt"); // ele pega o �ndice 0 e para no 1, ou seja, 
			//pega s� o 0, coloca em ma�usculo, e dps, printa o resto da strign apartir do 1, com o outro substring assim � mais f�cil
		}
		else if (verbo.endsWith("er")) 
		{
			System.out.println("Conjuga��o do verbo no futuro: "+verbo.replace("er", "er�o"));
			System.out.println("Conjuga��o do verbo no passado: "+verbo.replace("er", "eram"));
			System.out.println(verbo.length()+" caracteres.");
			System.out.println(troca.toUpperCase()+verbo.substring(1));
		}
		else if (verbo.endsWith("ir")) 
		{
			System.out.println("Conjuga��o do verbo no futuro: "+verbo.replace("ir", "ir�o"));
			System.out.println("Conjuga��o do verbo no passado: "+verbo.replace("ir", "iram"));
			System.out.println(verbo.length()+" caracteres.");
			System.out.println(troca.toUpperCase()+verbo.substring(1));
		}
		//System.out.println("Conjuga��o do verbo no futuro: " + verbo + "�o");
		//System.out.println("Conjuga��o do verbo no passado: " + verbo + "am");
		
	}

}
