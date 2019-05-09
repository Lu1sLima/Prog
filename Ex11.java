package exercíciosRepetiçãoGiraffa;


import java.util.Scanner;
public class Ex11 {
	public static void main (String[]Args)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("\f");
	int sexo = 0;
	double acumuladorG = 0;
	double acumuladorW = 0;
	int women = 0;
	int men = 0;
	double maior = 0;
	double menor = 100000; //Thx to Anderson! - Colocando a variável MENOR como um número GRANDE pra nao bugar na hora do teste.
	double altura = 0;
	double mediaG = 0;
	double mediaW = 0;
	for (int i = 1; i <= 3; i++) // VAI MANDAR PEDIR ENTRADA DE DADOS ATÉ X VEZES, O EX PEDE 50, MAS DEIXEI 3 PARA TESTAR APENAS.
	{
		do //OBRIGANDO O USUÁRIO A DIGITAR OS NÚMEROS SOLICITADOS
		{
			System.out.println("Informe o seu sexo, 1 para Masculino e 2 para Feminino: ");
			sexo = input.nextInt();
			if (sexo == 1) {men++;} // Se for homem adiciona 1 na variável men.
			if (sexo == 2) {women++;} // Se for mulher, adiciona 1 na variável women.
			if (sexo <= 0 || sexo > 2) {System.out.println("Você digitou um número inválido.");} // Se digitar um número fora do range (1,2), aparece essa msg.
		} while (sexo <= 0 || sexo > 2); // Controle do DO.
		
		do //OBRIGANDO O USUÁRIO A DIGITAR UMA ALTURA VÁLIDA
		{
			System.out.println("Informe a sua altura em metros: ");
			altura = input.nextDouble();
			if (altura <= 0) {System.out.println("Você digitou um número inválido.");} // Se digitar uma altura negativa aparece essa mensagem.
			if (sexo == 2) {acumuladorW += altura; // Variável acumuladora de altura quando for 2 (feminino)
			}
			acumuladorG += altura; // Variável acumuladora de altura de grupo, ou seja, independente do sexo.
		}while (altura <= 0); // Controle do DO.
		if (altura > maior) {maior = altura;}
		else if (altura < menor) {menor = altura;}
	}
	mediaW = acumuladorW/women; // Calcula a média da altura das mulheres.
	mediaG = acumuladorG/(men+women); // Calcula a média da altura do grupo inteiro.
	System.out.println("Maior altura do grupo: "+(maior));
	System.out.println("Menor altura do grupo: "+(menor)); 
	System.out.println("Média de altura do grupo: "+(mediaG));
	System.out.println("Média de altura das mulheres: "+(mediaW));
}
}

