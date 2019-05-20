
/**
 * Escreva a descrição da classe cod1 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
import java.util.Scanner;
public class cod1
{
   public static void main (String[]args)
   {
       Scanner teclado = new Scanner(System.in);
        int i, n;
        System.out.println("\f");
        System.out.println("Digite o valor de n: ");
         n = teclado.nextInt();
        /* testando as condições */
    for (i = 1; i*(i+1)*(i+2) <= n; i++){
    if (i*(i+1)*(i+2) == n)
    System.out.println("\n e' triangular \n " +n+ " " +i+ " " +(i+1)+ " " +(i+2));
   }
   if (i*(i+1)*(i+2) !=  n) 
        System.out.println("\n Não é triangular" +n);
   }
}
