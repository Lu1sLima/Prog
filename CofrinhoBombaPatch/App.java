

public class App{
    public static void main(String[]args){
            Cofrinho cofre = new Cofrinho();
            for(int i = 0; i < cofre.getTamanhoVetor();i++){
                if (i <= 3){
                    cofre.colocaMoeda(NomeMoeda.UmReal);
                }
                else{
                    cofre.colocaMoeda(NomeMoeda.Cinquenta);
                }
            }
    
        System.out.println("Foram armazenadas: "+cofre.quantasMoedas()+" moedas");
        System.out.println("Tem quantas moedas de 1 pila? "+cofre.retornaQualMoeda(NomeMoeda.UmReal));
        System.out.println("Tem quantas moedas de 50 centavos? "+cofre.retornaQualMoeda(NomeMoeda.Cinquenta));
        System.out.println("O valor total em centavos armazenado no cofrinho eh: "+cofre.totalCentavos());
        System.out.println("O valor total em reais armazenado no cofrinho eh: "+cofre.totalReais());
        System.out.println("*** Retirei CINCO moedas ***");
        cofre.retiraMoeda();
        cofre.retiraMoeda();
        cofre.retiraMoeda();
        cofre.retiraMoeda();
        cofre.retiraMoeda();
        System.out.println("Quantas moedas tem no cofrinho? "+cofre.quantasMoedas());
        System.out.println("O valor em CENTAVOS apos a retirada das 5 ultimas moedas eh: "+cofre.totalCentavos());
        
    }

}

