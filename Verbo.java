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
		
		//+verbo.replace("r", "rão")
		if(verbo.endsWith("ar")) 
		{
			System.out.println("Conjugação do verbo no futuro: "+verbo.replace("ar", "arão"));
			System.out.println("Conugação do verbo no passado: "+verbo.replace("ar", "aram"));
			System.out.println(troca.toUpperCase()+verbo.substring(1)+ " tem " +verbo.length()+" caracteres.");
			System.out.println(troca.toUpperCase()+verbo.substring(1));
			System.out.println(verbo.substring(0, 1).toUpperCase()+verbo.substring(1)+ " tt"); // ele pega o índice 0 e para no 1, ou seja, 
			//pega só o 0, coloca em maíusculo, e dps, printa o resto da strign apartir do 1, com o outro substring assim é mais fácil
		}
		else if (verbo.endsWith("er")) 
		{
			System.out.println("Conjugação do verbo no futuro: "+verbo.replace("er", "erão"));
			System.out.println("Conjugação do verbo no passado: "+verbo.replace("er", "eram"));
			System.out.println(verbo.length()+" caracteres.");
			System.out.println(troca.toUpperCase()+verbo.substring(1));
		}
		else if (verbo.endsWith("ir")) 
		{
			System.out.println("Conjugação do verbo no futuro: "+verbo.replace("ir", "irão"));
			System.out.println("Conjugação do verbo no passado: "+verbo.replace("ir", "iram"));
			System.out.println(verbo.length()+" caracteres.");
			System.out.println(troca.toUpperCase()+verbo.substring(1));
		}
		//System.out.println("Conjugação do verbo no futuro: " + verbo + "ão");
		//System.out.println("Conjugação do verbo no passado: " + verbo + "am");
		
	}

}
