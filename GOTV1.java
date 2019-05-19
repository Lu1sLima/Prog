package exercíciosRepetiçãoGiraffa;

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
		double dolares = 2*draconaris;
		double sacos = 0;
		double valor = 0;
		
		
		
		
		for (int i = 0; i < 365; i++) // 1 ano.
		{
			kgRacaoR = r * 0.005; // calculando 0,5% de peso do dragão (que é oq ele come por dia)
			kgRacaoTotalR += +kgRacaoR; // acumulando quantos kgs de ração ele comeu no total.
			r += +kgRacaoR; // atualizando o novo peso, a cada loop(dia);
			
			kgRacaoV = v * 0.005;
			kgRacaoTotalV += +kgRacaoV;
			v += +kgRacaoV;
			
			kgRacaoD = d * 0.005;
			kgRacaoTotalD += +kgRacaoD;
			d += +kgRacaoD;
		}
		
		kgRacaoTodos = kgRacaoTotalR+kgRacaoTotalV+kgRacaoTotalD; // calculando quantos kgs de ração foi consumido POR TODOS ELES, durante o primeiro ano
		sacos = kgRacaoTodos/500; // calculando quantos sacos de ração eles comeram
		valor = sacos*30000; // calculando quanto foi gasto com os sacos de ração
		
		System.out.println("Rhaegal comeu: " +Math.round(kgRacaoTotalR)+ "Kgs de ração no seu primeiro ano de vida.");
		System.out.println("Viserion comeu: " +Math.round(kgRacaoTotalV)+ "Kgs de ração no seu primeiro ano de vida.");
		System.out.println("Drogon comeu: " +Math.round(kgRacaoTotalD)+ "Kgs de ração no seu primeiro ano de vida.");
		System.out.println("\n");
		System.out.println("Foi consumido: " +Math.round(kgRacaoTodos)+ "Kgs de ração no primeiro ano.");
		System.out.println("Foi consumido: " +Math.round(sacos)+ " saco(s) de ração no primeiro ano.");
		System.out.println("\n");
		System.out.println("Rhaegal ficou com: "+Math.round(r)+"Kgs no primeiro ano.");
		System.out.println("Viserion ficou com: "+Math.round(v)+"Kgs no primeiro ano.");
		System.out.println("Drogon ficou com: "+Math.round(d)+"Kgs no primeiro ano.");
		System.out.println("\n");
		
		for (int j = 0; j < 365; j++) // segundo ano, lembrando que as variáveis ja estão com o valor do primeiro ano.
		{
			kgRacaoR = r * 0.005; // calculando 0,5% de peso do dragão (que é oq ele come por dia)
			kgRacaoTotalR += +kgRacaoR; // acumulando quantos kgs de ração ele comeu no total.
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
		
		System.out.println("Os dragões comeram: "+Math.round(kgRacaoTodos)+"Kgs de ração no segundo ano de vida.");
		System.out.println("Foi consumido: "+Math.round(sacos)+ " saco(s) de ração no segundo ano de vida.");
		if (valor <= dolares)
		{
			System.out.println("A verba foi suficiente para alimentar os dragões nos dois primeiros anos de vida.");
		}
		else
		{
			System.out.println ("A verba não foi suficiente para alimentar os dragões nos dois primeiros anos de vida.");
		}
	}
}
