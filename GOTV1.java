package exerc�ciosRepeti��oGiraffa;

public class GOT
{
	public static void main (String[]args)
	{
		double r = 25;
		double v = (25*0.10)+r;
		double d = (v*0.20)+v;
		double kgRacaoR = 0;
		double kgRacaoTotalR = 0;
		double kgRacaoV = 0;
		double kgRacaoTotalV = 0;
		double kgRacaoD = 0;
		double kgRacaoTotalD = 0;
		double kgRacaoTodos = 0;
		double draconaris = 1000000;
		double dolar = 2*draconaris;
		double sacos = 0;
		double valor = 0;
		
		
		
		
		for (int i = 0; i < 365; i++) // 1 ano.
		{
			kgRacaoR = r * 0.005; // calculando 0,5% de peso do drag�o (que � oq ele come por dia)
			kgRacaoTotalR += +kgRacaoR; // acumulando quantos kgs de ra��o ele comeu no total.
			r += +kgRacaoR; // atualizando o novo peso, a cada loop(dia);
			
			kgRacaoV = v * 0.005;
			kgRacaoTotalV += +kgRacaoV;
			v += +kgRacaoV;
			
			kgRacaoD = d * 0.005;
			kgRacaoTotalD += +kgRacaoD;
			d += +kgRacaoD;
		}
		
		kgRacaoTodos = kgRacaoTotalR+kgRacaoTotalV+kgRacaoTotalD; // calculando quantos kgs de ra��o foi consumido POR TODOS ELES, durante o primeiro ano
		sacos = kgRacaoTodos/500; // calculando quantos sacos de ra��o eles comeram
		valor = sacos*30000; // calculando quanto foi gasto com os sacos de ra��o
		
		System.out.println("Rhaegal comeu: " +Math.round(kgRacaoTotalR)+ "Kgs de ra��o no seu primeiro ano de vida.");
		System.out.println("Viserion comeu: " +Math.round(kgRacaoTotalV)+ "Kgs de ra��o no seu primeiro ano de vida.");
		System.out.println("Drogon comeu: " +Math.round(kgRacaoTotalD)+ "Kgs de ra��o no seu primeiro ano de vida.");
		System.out.println("\n");
		System.out.println("Foi consumido: " +Math.round(kgRacaoTodos)+ "Kgs de ra��o no primeiro ano.");
		System.out.println("Foi consumido: " +Math.round(sacos)+ " saco(s) de ra��o no primeiro ano.");
		System.out.println("\n");
		System.out.println("Rhaegal ficou com: "+Math.round(r)+"Kgs no primeiro ano.");
		System.out.println("Viserion ficou com: "+Math.round(v)+"Kgs no primeiro ano.");
		System.out.println("Drogon ficou com: "+Math.round(d)+"Kgs no primeiro ano.");
		System.out.println("\n");
		
		for (int j = 0; j < 365; j++) // segundo ano, lembrando que as vari�veis ja est�o com o valor do primeiro ano.
		{
			kgRacaoR = r * 0.005; // calculando 0,5% de peso do drag�o (que � oq ele come por dia)
			kgRacaoTotalR += +kgRacaoR; // acumulando quantos kgs de ra��o ele comeu no total.
			r += +kgRacaoR; // atualizando o novo peso, a cada loop(dia);
			
			kgRacaoV = v * 0.005;
			kgRacaoTotalV += +kgRacaoV;
			v += +kgRacaoV;
			
			kgRacaoD = d * 0.005;
			kgRacaoTotalD += +kgRacaoD;
			d += +kgRacaoD;
		}
		
		kgRacaoTodos = kgRacaoTotalR+kgRacaoTotalV+kgRacaoTotalD;
		sacos = kgRacaoTodos/500;
		valor = sacos*30000;
		
		System.out.println("Os drag�es comeram: "+Math.round(kgRacaoTodos)+"Kgs de ra��o no segundo ano de vida.");
		System.out.println("Foi consumido: "+Math.round(sacos)+ " saco(s) de ra��o no segundo ano de vida.");
		if (valor <= 2000000)
		{
			System.out.println("A verba foi suficiente para alimentar os drag�es nos dois primeiros anos de vida.");
		}
		else
		{
			System.out.println ("A verba n�o foi suficiente para alimentar os drag�es nos dois primeiros anos de vida.");
		}
	}
}