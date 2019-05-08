
/**
 * Escreva a descrição da classe Ex9 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Ex9{
public static void main(String[]args){
        int num = 1000;
        int aux = 0;
        int contador = 0;
        System.out.println("\f");
        while (contador < 100){
            if (testePrimo(num)){System.out.println(num);
            contador++;}
            num++;
        }
           
            
        
}
    


public static int testeDiv(int num){
    int aux = 0;
    int contador = 0;
    for (int i = 1; i <= num; i++){
        if (num % i == 0){contador++;}
        
    }
    return contador;
}
public static boolean testePrimo (int num){
    if (testeDiv(num) == 2){return true;}
    else{return false;}
    
}
}
