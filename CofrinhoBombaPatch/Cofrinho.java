public class Cofrinho{
    protected Moeda m1;
    protected int posicao = 0;
    protected Moeda [] moedas;
    protected Moeda moedaRetirada;

    public Cofrinho(){
        this.moedas = new Moeda[10];
    }

    public Moeda getQualMoedaRetirada(){
        return this.moedaRetirada;
    }

    public int getTamanhoVetor(){
        return moedas.length;
    }

    public boolean colocaMoeda(NomeMoeda qual){
        this.m1 = new Moeda(qual);
       if (posicao == moedas.length){
           System.out.println("Cofrinho cheio!");
          return false; 
       } else{
            this.moedas[posicao] = m1;
            this.posicao++;
            return true;
       }
    }

    public Moeda retiraMoeda(){
        Moeda qual = moedas[moedas.length-1];
        if(moedas[0] == null){
            System.out.println("Não ha moedas!");
            return null;
        }else{
            qual = moedas[posicao-1];
            this.moedaRetirada = qual;
            moedas[posicao-1] = null;
            posicao--;
        }
        return qual;
    }

    	   // public Moeda retiraMoeda(){ ANTIGO!
        //Moeda qual = moedas[moedas.length-1];
        //if(moedas[0] == null){
         //   System.out.println("Não ha moedas!");
        //}
       // else{
           // for (int i = moedas.length-1;i>=0;i--){
              //  if(moedas[i] != null){
               //     qual = moedas[i];
               //     this.moedaRetirada = qual;
                //    moedas[i] = null; 
                //    break;
               // }
            //}
      //  }
    //    return qual;
  //  }
	//

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
            if(moedas[i] == null){
                break;
            }
            else{
                somaCentavos += moedas[i].getValorCentavos();
            }
        }
        return somaCentavos;

    }


    public int retornaQualMoeda(NomeMoeda aq){
        int aPila = 0;
        for(int i = 0; i < moedas.length;i++){
            if(moedas[i]!= null){
                if(moedas[i].getNomeMoeda() == aq){
                aPila++;
            }
        }
        }
        return aPila;

    }

    public double totalReais(){
        double somaReais = 0;
        for(int i = 0; i<moedas.length; i++){
            if(moedas[i] == null){
                break;
            }
            else{
                somaReais += moedas[i].getValorReais();
            }
        }
        return somaReais;
    } 



}