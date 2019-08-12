public class Cofrinho{
    protected int posicao = 0;
    protected Moeda [] cofrinho;

    public Cofrinho(){
        this.cofrinho = new Moeda[10];
    }

    public boolean ColocaMoeda(Moeda qual){
       if (posicao == cofrinho.length){
          return false; 
       } else{
            this.cofrinho[posicao] = qual;
            this.posicao++;
            return true;
       }
    }

    public void RetiraMoeda(){
        Moeda moedaRetirada = this.cofrinho[cofrinho.length-1];
        this.cofrinho[cofrinho.lengh-1] = null;
        return moedaRetirada;
    }

    public void QuantasMoedas(){
        for (int i = 0; i<cofrinho.length; i++){
            int vazio = 0;
            if(cofrinho[i] == null){
                vazio++;
            }
        }
        int conta = cofrinho.length-vazio;
        return conta;
    }




}