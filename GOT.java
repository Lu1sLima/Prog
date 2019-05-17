package eae;

public class GOT {
	public static void main (String[]args) 
	{
		double r = 25;
		double v = (r*0.1)+r;
		double d = (v*0.20)+v;
		double teste = 154;
		double pesoNovoR = pesoDragon(r); // calculando o peso dos dragões durante um ano
		double pesoNovoV = pesoDragon(v); //
		double pesoNovoD = pesoDragon(d); //
		//double pesoTesteR = pesoDragon(teste);
		double qtdRacaoT1 = kgRacaoTotal(r)+kgRacaoTotal(v)+kgRacaoTotal(d);
		double qtdRacaoT2 = kgRacaoTotal2Anos(r)+kgRacaoTotal2Anos(v)+kgRacaoTotal2Anos(d);
		
		System.out.println("Rhaegal comeu: "+kgRacaoTotal(r)+"kgs de ração no primeiro ano.");
		System.out.println("Viserion comeu: "+kgRacaoTotal(v)+"kgs de ração no primeiro ano.");
		System.out.println("Drogon comeu: "+kgRacaoTotal(d)+"kgs de ração no primeiro ano.");
		System.out.println("Os dragões comeram: "+qtdRacaoT1+"Kgs de ração no primeiro ano.");
		
		System.out.println("\n");
		
		System.out.println("Rhaegal ficou com: "+pesoNovoR+"Kgs no primeiro ano.");
		System.out.println("Viserion ficou com: "+pesoNovoV+"Kgs no primeiro ano.");
		System.out.println("Drogon ficou com: "+pesoNovoD+"Kgs no primeiro ano.");

		System.out.println("\n");
		
		System.out.println("Os dragões comeram: "+qtdRacaoT2+"Kgs em 2 anos.");
		System.out.println("Foi necessário: " +Math.round(qtdRacaoT2/500)+ " sacos de ração para alimenta-los.");
		if(suficiente(qtdRacaoT2)) 
		{
			System.out.println("A verba foi suficiente para alimentar os dragões nos 2 primeiros anos.");
		}
		else 
		{
			System.out.println("A verba não suficiente para alimentar os dragões nos 2 primeiros anos.");
		}
		//System.out.println("Os dragões comeram: "+qtdRacaoT1+"kgs de ração durante o primeiro ano.");
		
		
	}
		
		public static double kgRacaoTotal (double peso) 
		{
			double kgRacao = 0;
			double kgRacaoTotal = 0;
			for(int i = 0; i < 365; i++) 
			{
				kgRacao = peso*0.005;
				kgRacaoTotal = kgRacaoTotal +kgRacao;
				peso += kgRacao;
			}
			return kgRacaoTotal;
		}
		
		public static double kgRacaoTotal2Anos(double peso) //método que calcula quanto comeu em 2 anos
		{
			double kgRacao = 0;
			double kgRacaoTotal = 0;
			for(int i = 0; i < 730; i++) 
			{
				kgRacao = peso*0.005;
				kgRacaoTotal = kgRacaoTotal +kgRacao;
				peso += kgRacao;
			}
			return kgRacaoTotal;
		}
		
		public static double pesoDragon (double peso) //retorna o peso do dragão durante 1 ano
		{
			double kgRacao = 0;
			for(int i = 0; i < 365; i++) 
			{
				kgRacao = peso*0.005;
				peso += kgRacao;
			}
			return peso;
		}
		
		public static double pesoDragon2Anos (double peso) //retorna o peso do dragão durante 1 ano
		{
			double kgRacao = 0;
			for(int i = 0; i < 720; i++) 
			{
				kgRacao = peso*0.005;
				peso += kgRacao;
			}
			return peso;
		}
		
		public static boolean suficiente (double quantidadeAno)
		{
			int draconaris = 1000000;
			int dolares = 2 * draconaris;
			int kgRacaoDolares = 30000;
			double racao = (quantidadeAno/500)*kgRacaoDolares;
			
			if (racao <= dolares)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	
}

