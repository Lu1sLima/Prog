
/**
 * Escreva a descrição da classe testeCod1 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

import java.util.Scanner;
public class testeCod1
{
    public static void main (String []args)
    {
        System.out.println("\f");
        Scanner input = new Scanner(System.in);
        int i = 0;
        int n = 0;
        int p = 0;
        int a = 0;
        int d = 0;
        
        do{
        System.out.println("Digite o valor de n: ");
        n = input.nextInt();
        i++;
        if (somaDivPro(n) == n){p++;}
        else if (somaDivPro(n) < n) {d++;}
        else{a++;}
       
        
        
    }while (i < 50);
     
    double porcentagemP = (100*p/50);
    double porcentagemA = (100*a/50);
    double porcentagemD = (100*d/50);
    
    System.out.println("Porcentagem de números perfeitos: " +porcentagemP);
    System.out.println("Porcentagem de números abundantes: " +porcentagemA);
    System.out.println("Porcentagem de números defectivos: " +porcentagemD);
    System.out.println("Pefeito: "+p);
    System.out.println("Defectivo: "+d);
    System.out.println("Abundante: "+a);
    
    }
    
    
    public static int somaDivPro(int num)
    {
        int soma = 0;
        for (int i = num/2; i >= 1; i--)
        {
            if (num % i == 0){soma += i;}
        }
        return soma;
    }
    

    //public static boolean testePerfeito (int num)
    //{
        //if (somaDivPro(num) == num){return true;}
        //else if (somaDivPro(num) < num){return false;}    
    //}
}

