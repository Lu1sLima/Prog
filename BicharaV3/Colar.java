package BicharaV3;

/** @author (Luís Lima, 19111170-7)
 * @author (Lucas Machado Garcia 1911127-0)
 * @professora (Giraffa)
 * @turma (128)
 * @version (20/06/19)
 *
 * Nessa versão do programa eu coloquei o tamanho das astes (gancho tem 12 cm e caixa redonda tem 24cm), e os pingentes tem 2 cm cada
 * e com isso, o usuário está limitado a comprar uma quantidade X de pingentes de acordo com o tamanho da aste, ou seja, se escolher a aste 1
 * ele pode comprar apenas 6 pingentes, pois 6x2 = 12.
 * Nota de atualização:
 * - Adicionado estoque aos pingentes:
 * Pingente 1 = 10 em estoque
 * Pingente 2 = 12 em estoque
 *
 */

public class Colar {
    private int cordao;
    private int haste;
    private double preco;
    private double valorPrestacao;
    private double precoFinal;
    int pgt1 = 10; // estoque de pingentes
    int pgt2 = 12; // estoque de pingentes
    int qualCordao; // variável auxiliar
    int qualHaste; // variável auxiliar
    int pgt1C; // variável contadora de pingentes 1 comprados
    int pgt2C; // variável contadora de pingentes 2 comprados
    int pgts; // variável acumuladora de pingentes comprados no total

    public Colar(int cordao, int haste){
        this.cordao = cordao;
        this.haste = haste;

        if (cordao == 1){
            this.preco += +300;
            qualCordao = 1; // vou usar essa variável pra fazer o setCordao!
        }
        else if(cordao == 2) {
            this.preco += +400;
            qualCordao = 2; // vou usar essa variável pra fazer o setCordao!
        }
        if (haste == 1){
            this.preco += +200;
            qualHaste = 1; // vou usar essa variável pra fazer o setHaste!
        }
        else if (haste == 2){
            this.preco += +350;
            qualHaste = 2; // vou usar essa variável pra fazer o setHaste!
        }
    }


    // getters
    public double getPreco(){
        return this.preco;
    }

    public int getPgts(){ //retorna o total de pingentes comprados (pingentes 1 + pingentes 2)
        return pgts;
    }

    public int getCordao(){
        return this.cordao;
    }

    public int getHaste(){
        return this.haste;
    }

    public double getValorPrestacao(){
        return valorPrestacao;
    }

    public int getPgt1() { // pra saber quantos tem no estoque
        return pgt1;
    }

    public int getPgt2() { // pra saber quantos tem no estoque
        return pgt2;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    //setters


    public void setCordao(int novoCordao) {
        if (novoCordao == 2 && qualCordao == 1){
            this.preco = (this.preco-300)+400; // troca o valor, para um maior, pois o cordao 2 custa mais que a cordao 1
            qualCordao = 2;
            this.cordao = 2;
        }
        else if(novoCordao == 1 && qualCordao == 2){ // troca o valor para um menor, pois o cordao 1 custa menos do que o cordao 2
            this.preco = (this.preco - 400)+300;
            qualCordao = 1;
            this.cordao = 1;
        }
    }

    public void setHaste(int novaHaste) {
        if (qualHaste == 1 && novaHaste == 2){
            this.preco = (this.preco - 200)+350; // troca o valor, pois a haste 2(nova) custa mais do que a haste antiga.
            this.haste = 2;
            qualHaste = 2;
        }
        else if(qualHaste == 2 && novaHaste == 1){// troca o valor para um maior, pois a haste atual (1) é mais barata do que a nova.
            if (cordao == 1 && qualCordao == 1){ //verificando qual o cordao que está sendo usado para ajustar o valor total(haste+cordao)
                this.preco = 500;
            }
            else if(cordao == 2 && qualCordao == 2){// mesma coisa q acima
                this.preco = 600;
            }
            this.haste = 1;
            qualHaste = 1;
            pgts = 0; // SE TROCAR DA HASTE 2(MAIOR) PARA A HASTE 1(MENOR), OS PINGENTES JÁ COMPRADOS SÃO ZERADOS
            setPgt1(10); // ESTOQUE VOLTA A FICAR CHEIO
            setPgt2(12); // ESTOQUE VOLTA A FICAR CHEIO
            this.pgt1C = 0; // PINGENTES COMPRADOS ANTERIORMENTE QUANDO A HASTE ERA A 2(MAIOR) SÃO ZERADOS
            this.pgt2C = 0; // PINGENTES COMPRADOS ANTERIORMENTE QUANDO A HASTE ERA A 2(MAIOR) SÃO ZERADOS
            // ZEREI OS VALORES POIS A HASTE ANTIGA(2) ERA MAIOR DO QUE A HASTE NOVA(1) E PORTANTO CABIA MAIS PINGENTES, E COMO A HASTE NOVA CABE MENOS, DECIDI ZERAR.
        }
    }

    public void setPgt1(int pgt1) {
        this.pgt1 = pgt1;
    }

    public void setPgt2(int pgt2) {
        this.pgt2 = pgt2;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setValorPrestacao(int opcao) {
        if (opcao == 1){
            this.valorPrestacao = precoFinal;
        }
        else if(opcao == 2){
            this.valorPrestacao = precoFinal/3;
        }
        else if(opcao == 3){
            this.valorPrestacao = precoFinal/5;
        }
    }

    public void setPrecoFinal(int opcao){
        if (opcao == 1){ //valor final à vista e com 5% de desconto!
            this.precoFinal = this.preco - ((this.preco*5)/100);
        }
        else if(opcao == 2){ // parcelado em 3 vezes permanece o preço normal.
            this.precoFinal = this.preco;
        }
        else if(opcao == 3){ // parcelado em 5 vezes, aumento de 10% no preço total
            this.precoFinal = this.preco + this.preco*0.10;
        }
    }




    // métodos
    public void compraPingente1(){
        this.preco += +70;
        pgt1--; // a cada compra retira 1 do estoque!
        pgt1C++; // a cada compra adiciona 1 aos pingentes 1 comprados
        pgts++; // a cada compra adiciona 1 aos pingentes comprados TOTAL(ISSO CONTA OS PINGENTES 1 E PINGENTES 2)

    }

    public void compraPingente2(){
        this.preco += +100;
        pgt2--; // a cada compra retira 1 do estoque!
        pgt2C++; // a cada compra adicona 1 aos pingentes 2 comprados
        pgts++; // a cada compra adiciona 1 aos pingentes comprados TOTAL(ISSO CONTA OS PINGENTES 1 E PINGENTES 2)
    }

    public String toString(){
        return "No fim, você escolheu opção "+getCordao()+" para seu Cordao;\nVocê escolheu a opção "+getHaste()+" para sua haste;" +
                "\nVocê adicionou "+pgt1C+" pingente(s) pratas a sua compra;" +
                "\nVocê também adicionou "+pgt2C+" pingente(s) prata com pedras inrustidas a sua compra." +
                "\nEstoque de pingentes pratas: " +pgt1+"" +
                "\nEstoque de pingentes pratas com pedras irrustidas: "+pgt2;

    }

}
