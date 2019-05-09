
/**
 * Mostra os 4 primeiros números perfeitos (Não foi até o 5 pq seria um loop muito grande.
 * 
 * @author (Luís) 
 * @version (08/05/19)
 */
public class Ex8
{
    public static void main (String []args){
        System.out.println("\f");
        for (int num = 6; num <=  100000; num++){
            if (testePerfeito(num)){System.out.println(num);}
        }
    }
    
    
       public static int somaDivPro (int num){ //retorna a soma dos divisores exceto o próprio número
        int soma = 0;
        for (int i = num/2; i >= 1; i--) { // coloquei num/2 pq os divisores de um número N estão até a METADE desse número. (e assim, não soma o próprio N)
            if (num % i == 0){soma +=i;} // testando se i é divisor do número, se sim, guarda na variável auxiliar que recebe auxiliar+i
        }
        return soma;//retorna a variável axiliar, somando os divisores de num
    }
    
    public static boolean testePerfeito (int num){// método para ver se o número é perfeito
        if (somaDivPro(num) == num){return true;} // se a soma dos divisores for igual ao número, então ele é um número perfeito
        else{return false;}
    }
    
}
