
/**
 * BubbleSort Method.
 * 
 * @author (Luís) 
 * @version (12/06/19)
 */
public class bubbleShort
{
    public static void main(String[]args)
    {
        System.out.println("\f");
        int [] vetor1 = {1, 2, 3, 4};
        int aux = 0;
        int [] guardaVec = new int [4];
        
        for (int i = 0; i < vetor1.length; i++)
        {
            for (int j = i+1; j < vetor1.length; j++)
            {
                if (vetor1[i] > vetor1[j])
                {
                    aux = vetor1[i];
                    vetor1[i] = vetor1[j];
                    vetor1[j] = aux;
                }
                
            }
        }
    
        
        for(int i = 0; i < vetor1.length; i++)
        {
            System.out.println(vetor1[i]);
        }
 
    }
}

