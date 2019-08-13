public class Cofrinho{
    protected Moeda m1;
    protected int posicao = 0;
    protected Moeda [] moedas;

    public Cofrinho(){
        this.moedas = new Moeda[10];
    }


    public int getTamanhoVetor(){
        return moedas.length;
    }

    public boolean colocaMoeda(NomeMoeda qual){
        this.m1 = new Moeda(qual);
       if (posicao == moedas.length){
          return false; 
       } else{
            this.moedas[posicao] = m1;
            this.posicao++;
            return true;
       }
    }

    public Moeda retiraMoeda(){
        Moeda qual = moedas[moedas.length-1];
        if (moedas[moedas.length-1] != null){
            this.moedas[moedas.length-1] = null;
        }
        else{
            qual = moedas[moedas.length-2];
            this.moedas[moedas.length-2] = null;
        }
        return qual;
    }

    public int quantasMoedas(){
        int vazio = 0;
        for (int i = 0; i<moedas.length; i++){
            if(moedas[i] == null){
                vazio++;
            }
        }
        int conta = moedas.length-vazio;
        return conta;
    }

    public double totalCentavos(){
        double somaCentavos = 0;
        for (int i = 0; i<moedas.length; i++){
            //EM ANDAMENTO
        }
        return somaCentavos;

    }


    public int retornaQualMoeda(NomeMoeda aq){
        int aPila = 0;
        for(int i = 0; i < moedas.length;i++){
            if(moedas[i].getNomeMoeda() == aq){
                aPila++;
            }
        }
        return aPila;

    }

    public double totalReais(){
        double somaReais = 0;
        for(int i = 0; i<moedas.length; i++){
            somaReais += moedas[i].getValorReais();
        }
        return somaReais;
    } 



}