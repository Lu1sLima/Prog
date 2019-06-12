
public class Vetores
{


 public static double[] multiplicaVetorDouble(double[] vetor, double num)
    {   //multiplica os elementos de um vetor de doubles por um double
        for(int i = 0; i<vetor.length;i++)
        {
            vetor[i]=vetor[i]*num;
        }
        
        return vetor;
            
    }
    
    public static int[] somaVetorInt(int[] vetor1, int[] vetor2)
    {   //soma os elementos de dois vetores int
        
        
        if(vetor1.length<vetor2.length)
        {
            int[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        
        
        for(int i = 0; i<vetor1.length;i++)
        {
            vetor1[i]=vetor1[i] + vetor2[i];
        }
        
        return vetor1;
            
    }
    
  public static  int produtoEscalarInt(int[] vetor1, int[] vetor2)
    {   //retorna o produto escala de dois vetores inteiros com mesmo tamanho, e 0 se os vetores tem tamanho diferente
        if(vetor1.length!=vetor2.length)
        {
            return 0;
        }
        int produto=0;
        for (int i =0; i<vetor1.length; i++)
        {
            produto+=vetor1[i]*vetor2[i];
        }
        return produto;
        
    }
    
    
    public static  int[] uniaoVetorInt(int[] vetor1, int[] vetor2)
    {   //faz a uniao entre dois vetores de numeros inteiros, assumindo que elementos nao repetem dentro dos proprios vetores (podem repetir entre (termo comum) os vetores)
        int count  = 0;
        int[] temp = new int[vetor2.length]; // vetor temporario para receber os termos no vetor 2 que nao estao no vetor 1
        int tempIndex = 0;
        
        int tamanho1 = vetor1.length;
        int tamanho2 = vetor2.length;
        
        boolean unico = true;
        for (int i = 0; i<tamanho2; i++) //verifica quantos elementos repetidos existem entre os vetores e coloca os nao repetidos do vetor 2 em um vetor temporario
        {
            for(int j= 0; j<tamanho1; j++)
            {
                
                if(vetor2[i]==vetor1[j]) // checamos cada termo do vetor 2 com todos os termos do vetor1
                {
                    count++;
                    unico = false; // o termo do vetor2 existe no vetor1
                }
            }
            if(unico)// se o termo do vetor 2 nao existe no vetor 1...
            {
             temp[tempIndex]=vetor2[i];// ...entao ele e colocado em um vetor temporario
             tempIndex++;   
            }
            unico = true;
        }
        
        int[] vetor3 = new int[tamanho1 + tamanho2 - count]; //declara o vetor que receberatodos os termos com o tamanho correto
        for(int i = 0; i<tamanho1; i++)// colocando os termos do vetor 1 no novo vetor
        {
            vetor3[i]=vetor1[i];
        }
        for(int i = 0; i<(tamanho2-count); i++)// colocando os termos nao repetidos do vetor 2 no novo vetor
        {
            vetor3[tamanho1+i]=temp[i];
        }
        return vetor3;
        
    }
    
    
      public static int[] interVetorInt(int[] vetor1, int[] vetor2)
    {// faz a intersecao entre dois vetores int, sendo que os vetores nao possuim termos repetidos internamente
        int[] temp = new int[vetor1.length]; // vetor temporario para mater as variaveis, seu tamanho precisa ser maior do que o menor vetor (aqui escolhemos arbitrariamente um dos vetores)
        int tempIndex = 0;
        
        for (int i =0; i<vetor1.length; i++)
        {
            for(int j = 0; j<vetor2.length;j++)
            {
                if(vetor1[i] == vetor2[j])
                {
                    temp[tempIndex]=vetor1[i]; //coloca os valores comuns nos dois vetores no vetor temporario
                    tempIndex++;
                    break;
                }
            }
        }
        
        int[] vetor3 = new int[tempIndex]; // vetor a ser retornado, do tamanho certo
        
        for(int i =0; i<tempIndex;i++)
        {
            vetor3[i]=temp[i];
        }
        return vetor3;
        
    }
    
    public static int[] bubbleSort(int[] vetpr)
    {
    }
}
