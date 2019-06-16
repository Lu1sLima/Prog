package BicharaV2;

/** @author (Luís Lima, 19111170-7)
 * @author (Lucas Machado Garcia 1911127-0)
 * @professora (Giraffa)
 * @turma (128)
 * @version (09/06/19)
 */


public class ColarV2 {
     int cordao;
     int aste;
     int preco;
    int testeC = 0;
    int precoFinal;
    int testeA = 0;
    int valorPresteca;
    int pgtC1 = 0;
    int pgtC2 = 0;
    int pgts = 0;


    public ColarV2(int cordao, int aste)
    {
        this.cordao = cordao;
        this.aste = aste;

        if (cordao == 1)
        {
            this.preco += +300;
            this.testeC = 1;
        }
        else if (cordao == 2)
        {
            this.preco += +400;
            this.testeC = 2;
        }
        if (aste == 1)
        {
            this.preco += +200;
            testeA = 1;
        }
        else if (aste == 2)
        {
            this.preco += 350;
            testeA = 2;
        }
    }


    public int getPgts(){
        this.pgts = pgtC1+pgtC2;
        return pgts;

    }
    public int getPreco()
    {
        return this.preco;
    }

    public int getTesteA(){ return this.testeA;}

    public int getPrecoFinal()
    {
        return precoFinal;
    }

    public int getCordao()
    {
        return this.cordao;
    }

    public int getAste()
    {
        return this.aste;
    }

    public int getValorPrestreca()
    {
        return this.valorPresteca;
    }

    public int getPgtC1()
    {
        return pgtC1;
    }

    public int getPgtC2()
    {
        return pgtC2;
    }


    public void setValorPrestreca(int opcao)
    {
        if (opcao == 1)
        {
            this.valorPresteca = getPrecoFinal();
        }
        if (opcao == 2)
        {
            this.valorPresteca = getPrecoFinal()/3;
        }
        if (opcao == 3)
        {
            this.valorPresteca = getPrecoFinal()/5;
        }
    }

    public void setPgtC1(int novo)
    {
        this.pgtC1 = novo;
    }

    public void setPgtC2 (int novo)
    {
        this.pgtC2 = novo;
    }

    public void setPreco(int novoPreco)
    {
        this.preco = novoPreco;
    }

    public void setPrecoFinal(int prestacao)
    {
        if (prestacao == 1)
        {
            this.precoFinal = this.preco - ((this.preco*5)/100);
        }
        else if (prestacao == 2)
        {
            this.precoFinal = this.preco;
        }
        else if (prestacao == 3)
        {
            this.precoFinal = this.preco+((this.preco*10)/100);
        }
    }


    public void setCordao(int novoCordao)
    {
        if (this.testeC == 1 && novoCordao == 2)
        {
            this.preco = (this.preco-300)+400;
            this.testeC = 2;
        }
        else if(this.testeC == 2 && novoCordao == 1)
        {
            this.preco = (this.preco-400)+300;
            this.testeC = 1;
        }

    }

    public void setAste(int novaAste)
    {
        if (this.testeA == 1 && novaAste == 2)
        {
            this.preco = (this.preco-200)+350;
            this.aste = 2;
            testeA = 2;
        }
        else if(this.testeA == 2 && novaAste == 1)
        {
            if (cordao == 1 && testeC == 1){this.preco = 300+200;}
            else if(cordao == 2 && testeC == 2){this.preco = 400+200;}
            testeA = 1;
            this.aste = 1;
            pgts = 0;
            setPgtC1(0);
            setPgtC2(0);

        }

    }

    public void compraPingente1()
    {
        this.preco+= +70;
        pgtC1++;
    }

    public void compraPingente2()
    {
        this.preco += +100;
        pgtC2++;
    }

    public String toString()
    {
        return "No fim, você escolheu opção "+getCordao()+" para seu Cordao;\nVocê escolheu a opção "+getAste()+" para sua Aste;\nVocê adicionou "+getPgtC1()+" pingente(s) pratas a sua compra;\nVocê também adicionou "+getPgtC2()+" pingente(s) prata com pedras inrustidas a sua compra.";
    }
}
