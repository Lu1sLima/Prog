import java.util.Scanner;
public class App2{
    public static void main(String[]args){
        Cofrinho c1 = new Cofrinho();
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("*********************************************************************************");
        System.out.println("Digite uma opcao:\n1 - Colocar Moeda no Cofrinho;\n2 - Retirar Moeda do Cofrinho.");
        int op = input.nextInt();

        switch(op){
            case 1:
                System.out.println("*********************************************************************************");
                System.out.println("Qual moeda?\n1 - Para moeda de 1 Real;\n2 - Para moeda de 50 centavos;\n3 - Para moeda de 25 centavos;\n4 - Para moeda de dez centavos;\n5 - Para moeda de 5 centavos;\n6 - Para moeda de 1 centavo.");
                int coin = input.nextInt();
            switch(coin){
                case 1:
                    c1.colocaMoeda(NomeMoeda.UmReal);
                    System.out.println("Tem "+c1.retornaQualMoeda(NomeMoeda.UmReal)+" moeda de 1 Pila no cofrinho.");
                    System.out.println("Tem R$ "+c1.totalReais()+" no Cofrinho");
                    break;
                case 2:
                    c1.colocaMoeda(NomeMoeda.Cinquenta);
                    System.out.println("Tem "+c1.retornaQualMoeda(NomeMoeda.Cinquenta)+" moeda de 50 Centavos no cofrinho.");
                    System.out.println("Tem R$ "+c1.totalReais()+"no Cofrinho");
                    break;
                case 3:
                    c1.colocaMoeda(NomeMoeda.VinteCinco);
                    System.out.println("Tem "+c1.retornaQualMoeda(NomeMoeda.VinteCinco)+" moeda de 25 Centavos no cofrinho.");
                    System.out.println("Tem R$ "+c1.totalReais()+"no Cofrinho");
                    break;
                case 4:
                    c1.colocaMoeda(NomeMoeda.Dez);
                    System.out.println("Tem "+c1.retornaQualMoeda(NomeMoeda.Dez)+" moeda de 10 Centavos no cofrinho.");
                    System.out.println("Tem R$ "+c1.totalReais()+"no Cofrinho");
                    break;
                case 5:
                    c1.colocaMoeda(NomeMoeda.Cinco);
                    System.out.println("Tem "+c1.retornaQualMoeda(NomeMoeda.Cinco)+" moeda de 5 Centavos no cofrinho.");
                    System.out.println("Tem R$ "+c1.totalReais()+"no Cofrinho");
                    break;
                case 6:
                    c1.colocaMoeda(NomeMoeda.Um);
                    System.out.println("Tem "+c1.retornaQualMoeda(NomeMoeda.Um)+" moeda de 1 Centavo no cofrinho.");
                    System.out.println("Tem R$ "+c1.totalReais()+"no Cofrinho");
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
                    break;

            }
            break;
        case 2:
            c1.retiraMoeda();
            System.out.println("Foi retirado uma moeda de: "+c1.getQualMoedaRetirada());
            System.out.println("Ainda tem: "+c1.retornaQualMoeda(c1.getQualMoedaRetirada().getNomeMoeda())+" moeda(s) de "+c1.getQualMoedaRetirada());
            System.out.println("O cofrinho ainda tem: "+c1.quantasMoedas()+" moeda(s) ao todo.");
            break;

        }
    }while(true);

}
}