
/**
 * Write a description of class BibliotecaUltimato here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BibliotecaUltimato
{
        static int [] matrizEmVetor (int[][] matriz)

    {

            int[] ret = new int[matriz.length * matriz[0].length];

            int pos = 0;

            for(int j=0;j<matriz.length; j++) {

                  for(int i=0;i<matriz[j].length; i++) {

                        ret[pos++] = matriz[j][i];

                  }

            }

            return ret;

      }
      
       static int[][] vetorEmMatriz (int[] matriz, int largura)

       {

            int altura = matriz.length / largura;

            int[][] ret = new int[altura][largura];

            for(int i=0; i<matriz.length; i++) {

                  ret[i/largura][i%largura] = matriz[i];

            }

            return ret;

      }
    
    public boolean numeroPrimo(int num) // verifica se um numero eh primo.
    {
        int i = 2;
        while(i<num)
        {
            if(num%i==0)
            {
                return false;
            }
            i++;
        }
        return true;
        
    }
    
        public int somaDivisores(int num) //calcula a soma de todos divisores do numero de entrada.
    {
        int i = 1;
        int soma = 0;
        while (i<num)
        {
            if (num%i == 0)
            {
                soma+=i;
            }
            i++;
        }
        
        return soma;
        
    }

    public boolean numeroAmigo(int num) //verifica se o numero de entrada tem numero amigo.
    {
        int amigo=somaDivisores(num); //calcula o potencial numero amigo a este
        
        if ( (somaDivisores(num) == amigo) && (somaDivisores(amigo) == num) ) //verifica se sao amigos
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int qualAmigo(int num) //calcula o numero amigo do numero de entrada. Se nao tiver amigo, retorna 0.
    {
        int amigo=somaDivisores(num); //calcula o potencial numero amigo a este
        
        if ( (somaDivisores(num) == amigo) && (somaDivisores(amigo) == num) ) //verifica se sao amigos
        {
            return amigo;
        }
        else
        {
            return 0;
        }
    }
    
    public boolean numeroPerfeito(int num) //verifica se um numero eh perfeito.
    {
        if ( somaDivisores(num) == num)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public boolean numeroDefectivo(int num) //verifica se um numero eh defectivo.
    {
        if ( somaDivisores(num) < num)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public boolean numeroAbundante(int num)
    {
        if ( !numeroDefectivo(num) && !numeroPerfeito(num) ) //verifica se um numero eh abundante.
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    
    public boolean numeroSociavel(int num) //verifica se um numero eh sociavel numero de "tentativas".
    {   
        int novoNum = somaDivisores(num);
        if(!numeroAmigo(num)) //se eh numero amigo, nao pode ser numero sociavel
        {
            for(int i=0;i<10;i++)
            {
                novoNum=somaDivisores(novoNum);
                if (novoNum == num)
                {
                    return true;
                }
            }
        }
        return false;
        
    }
    
    public boolean primosEntreSi(int num1, int num2) //verifica se dois numeros sao primos entre si
    {
        if (num1<num2)
        {
            int aux = num1;
            num1=num2;
            num2=aux;
        }
        
        for(int i=2;i<num1;i++)
        {
            if( (num1%i == 0)&&(num2%i == 0) )
            {
                return false;
            }
        }
        return true;
        
    }
    
    public boolean numeroFeliz(int num) //verifica se um numero pe feliz atehcerto numero de tentativas
    {
        String numero=String.valueOf(num); //converte o numero para string
        int tamanho=numero.length(); //pega o tamanho do numero
        int soma = 0;
        int numeroNaPosicao = 0;
        int j = 0;
        //System.out.print("\n");
        for(int i=0;i<50;i++)
        {
            
            for(j=0;j<tamanho;j++)
            {
                numeroNaPosicao=Character.getNumericValue(numero.charAt(j)); // converte o numero na posicoao atual para um inteiro
                soma+=Math.pow((double)(numeroNaPosicao),2); // acumula os quadrados dos numeros
                //System.out.print(""+numeroNaPosicao);
            }
            //System.out.print("\n numero ="+numero+" soma ="+soma+"\n");
            if(soma==1)
            {
                return true;
            }
            
            numero=String.valueOf(soma);
            tamanho=numero.length(); //pega o tamanho do numero
            soma = 0;
            numeroNaPosicao = 0;
            
        }
        return false;
    }
    
    public boolean numerosGemeos(int num1, int num2)
    {
        if ( !(numeroPrimo(num1)||numeroPrimo(num2)) ) //verifica se ambos numeros sao realmente primos
        {
            return false;  //se nao forem, retorna falso
        }
        else if(Math.abs(num1-num2)==2) //verifica se a diferencoa entre os numeros ehigual a 2
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   
    
        public boolean numeroCapicuo(int num) //verifica se um numero ehcapícuo.
    {
        String numero=String.valueOf(num); //converte o numero para string
        int tamanho=numero.length(); //pega o tamanho do numero
        
        for(int i=0;i<tamanho/2;i++)//checa atehmetade da string menos o numero "do meio", se tiver tamanho ímpar (i vai de 0 ateh(tamanho-1))
        {
            if(numero.charAt(i)!=numero.charAt(tamanho-i-1))   //verifica se o numero de cada posicoao eho mesmo que em sua posicoao "espelhada"
            { 
                return false; //se encontrar algum diferente, retorna falso
            }
        }
        return true; // se nao encontrar nenhum, retorna verdadeiro
    }
    
    public boolean numeroNarcisista(int num) //verifica se um numero eh narcisista.
    {
        String numero=String.valueOf(num); //converte o numero para string
        int tamanho=numero.length(); //pega o tamanho do numero
        int soma = 0;
        int numeroNaPosicao = 0;
        for(int i = 0;i<tamanho;i++)
        {
            numeroNaPosicao=Character.getNumericValue(numero.charAt(i)); // converte o numero na posicoao atual para um inteiro
            soma+=Math.pow((double)(numeroNaPosicao),(double)(tamanho)); // acumula os quadrados dos numeros
            
        }
        if(soma==num) // se a soma for igual ao numero, retorna verdadeiro.
        {
            return true;
        }
        return false;
        
        
    }
    
    public boolean ehPar(int num)
    {
        //testa se um numer ehpar
        if (num%2 == 0)
        {
            return true;
        }
        return false;
    }
    
    public boolean  ehDivisorSimples(int num1,int num2)
    {
        //testa se o segundo numero ehdivisor do primeiro
        if (num1%num2 == 0)
        {
            return true;
        }
        return false;
        
        
    }
    
    public boolean  ehMultiploSimples(int num1,int num2)
    {
        //testa se o segundo numero ehmultiplo do primeiro
        if (num2%num1 == 0)
        {
            return true;
        }
        return false;
        
        
    }
    
    public boolean numerosDivisores(int num1,int num2)
    {
        //checa se o menor numero entre os dois ehdivisor do maior
        if(num2>num1)
        {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        if (num1%num2 == 0)
        {
            return true;
        }
        return false;
        
    }
    
    public int divisorMuliplo(int num1,int num2)
    {   //checase o primeiro numero ehmultiplo (retorna 1), divisor (retorna 2) ou nenhum dos dois (retorna 0) em relacao  ao segundo.
        int escolha = 1;
        if(num2>num1)
        {
            int aux = num1;
            num1 = num2;
            num2 = aux;
            escolha = 2;
        }
        if (num1%num2 == 0)
        {
            return escolha;
        }
        return 0;
        
    }
    
    public double areaQuadrado (double lado)
    {   //recebe o tamanho do lado do quadrado e retorna a area deste
        return lado*lado;
    }
    
    public double areaRetangulo (double lado1, double lado2)
    {//recebe os 2 lados de um retangulo e retorna sua area
        return lado1*lado2;
    }
    
    public double areaCirculo (double raio)
    {//recebe o raio de um circulo e retorna sua area
        return Math.PI*raio*raio;
    }
    
    public double areaTriangulo (double base, double altura)
    {//recebe a base e a altura de um triangulo e retorna sua area
        return (base*altura)/2.;
    }
    
    public double volumeParalelepipedo(double lado1, double lado2,double lado3)
    {//recebe os 3 lados de um paralelepipedo e retorna o volume
        return (lado1*lado2*lado3);
    }
    
    public double volumePiramide(double ladobase1,double ladobase2,double altura)
    {//recebe os lados da base e a altura de uma piramide e retorna seu volume
        return (ladobase1*ladobase2*altura)/3.;
    }
    
    public double volumeCilindro(double raio,double altura)
    {//recebe os raio da base e a altura de um cilindro e retorna seu volume
        return (Math.PI*Math.pow(raio,2)*altura);
    }
    
    public double volumeEsfera(double raio)
    {//recebe os raio de uma esfera e retorna seu volume
        return (4*Math.PI*Math.pow(raio,3)/3);
    }
    
    public double superficieParalelepipedo(double lado1, double lado2,double lado3)
    { // retorna a área da superfície do paralelepipedo
        return (2*lado1*lado2+2*lado1*lado3+2*lado2*lado3);
    }
    
    public double superficiePiramide(double ladobase1,double ladobase2,double altura)
    {//recebe o laod da base e a altura de uma piramide e retorna a area de sua superficie
        double alturaLado1 = Math.sqrt( Math.pow(ladobase1/2.,2) + Math.pow(altura,2));
        double alturaLado2 = Math.sqrt( Math.pow(ladobase2/2.,2) + Math.pow(altura,2));
        double areaTriangulo1 = (alturaLado1*ladobase1)/2.;
        double areaTriangulo2 = (alturaLado2*ladobase2)/2.;
        return (2*(areaTriangulo1)+2*(areaTriangulo2)+ ladobase1*ladobase2);
    }
    
    public double superficieCilindro(double raio,double altura)
    {//recebe os raio da base e a altura de um cilindro e retorna sua area superficial
        return (2*Math.PI*Math.pow(raio,2)+2*Math.PI*raio*altura);
    }
    
    public double superficieEsfera(double raio)
    {//recebe os raio de uma esfera e retorna seu volume
        return (4*Math.PI*Math.pow(raio,2));
    }
    
    public int maiorDeTres(int a, int b, int c)
    {   //retorna o maior numero entre 3 valores
        int aux = 0;
        if (c>b)
        {
            b=c;
        }
        if (b>a)
        {
            a=b;
        }
        
        return a;
    }
    
    public int menorDeTres(int a, int b, int c)
    {   //retorna o menor numero entre 3 valores
        int aux = 0;
        if (c<b)
        {
            b=c;
        }
        if (b<a)
        {
            a=b;
        }
        
        return a;
    }
    
        public boolean temCharContido(String str,char c)
    {   //verifica se um char esta em uma string
        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==c)
            {
                return true;
            }
        }
        return false;
    }
    
    public int temCharContidoX(String str,char c)
    {   //retorna o numero de vezes que um char aparece em uma string
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if (str.charAt(i)==c)
            {
                count++;
            }
        }
        return count;
    }
    
        public boolean palindromo(String str)
    {   //verifica se uma string ehum palindromo
        for (int i = 0; i<=str.length()/2-1;i++)
        {
            if(str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    
    public void imprimeVetorInt(int[] vetor)
    {   //imprime um vetor de inteiros
         System.out.print("\n");
        for(int i = 0; i<vetor.length;i++)
        {
            System.out.print("|"+vetor[i]);
        }
        System.out.print("|\n");
            
    }
    
    public void imprimeVetorDouble(double[] vetor)
    {   //imprime um vetor de doubles
         System.out.print("\n");
        for(int i = 0; i<vetor.length;i++)
        {
            System.out.print("|"+vetor[i]);
        }
        System.out.print("|\n");
            
    }
    
    public int maiorVetorInt(int[] vetor)
    {   //retorna o maior valor em um vetor de inteiros
        int maior = vetor[0];
        for(int i = 1; i<vetor.length;i++)
        {
            if(vetor[i]>maior)
            {
                maior = vetor[i];
            }
        }
        return maior;
            
    }
    
    public double maiorVetorDouble(double[] vetor)
    {   //retorna o maior valor em um vetor de doubles
        double maior = vetor[0];
        for(int i = 1; i<vetor.length;i++)
        {
            if(vetor[i]>maior)
            {
                maior = vetor[i];
            }
        }
        return maior;
            
    }
    
    public int menorVetorInt(int[] vetor)
    {   //retorna o menor valor em um vetor de inteiros
        int menor = vetor[0];
        for(int i = 1; i<vetor.length;i++)
        {
            if(vetor[i]<menor)
            {
                menor = vetor[i];
            }
        }
        return menor;
            
    }
    
    public double menorVetorDouble(double[] vetor)
    {   //retorna o menor valor em um vetor de doubles
        double menor = vetor[0];
        for(int i = 1; i<vetor.length;i++)
        {
            if(vetor[i]<menor)
            {
                menor = vetor[i];
            }
        }
        return menor;
            
    }
    
    public int[] ordenaVetorInt(int[] vetor)
    {   //ordena um vetor de inteiros (crescente)
        int aux = 0;
        boolean troca = false;
        do{
            troca = false;
            for(int i = 0; i<vetor.length-1;i++)
            {
                if(vetor[i]>vetor[i+1])
                {
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troca = true;
                }
            }
        }while(troca);
        return vetor;
            
    }
    
    public double[] ordenaVetorDouble(double[] vetor)
    {   //ordena um vetor de doubles (crescente)
        double aux = 0;
        boolean troca = false;
        do{
            troca = false;
            for(int i = 0; i<vetor.length-1;i++)
            {
                if(vetor[i]>vetor[i+1])
                {
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troca = true;
                }
            }
        }while(troca);
        return vetor;
            
    }
    
    
    public int[] multiplicaVetorInt(int[] vetor, int num)
    {   //multiplica os elementos de um vetor de ints por um int
        for(int i = 0; i<vetor.length;i++)
        {
            vetor[i]=vetor[i]*num;
        }
        
        return vetor;
            
    }
    
    public double[] multiplicaVetorDouble(double[] vetor, double num)
    {   //multiplica os elementos de um vetor de doubles por um double
        for(int i = 0; i<vetor.length;i++)
        {
            vetor[i]=vetor[i]*num;
        }
        
        return vetor;
            
    }
    
    public int[] somaVetorInt(int[] vetor1, int[] vetor2)
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
    
    public double[] somaVetorDouble(double[] vetor1, double[] vetor2)
    {   //soma os elementos de dois vetores double
        
        
        if(vetor1.length<vetor2.length)
        {
            double[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        
        
        for(int i = 0; i<vetor1.length;i++)
        {
            vetor1[i]=vetor1[i] + vetor2[i];
        }
        
        return vetor1;
            
    }
    
    public int[] produtoVetorInt(int[] vetor1, int[] vetor2)
    {   //multiplica os elementos de dois vetores int
        
        
        if(vetor1.length<vetor2.length)
        {
            int[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        
        
        for(int i = 0; i<vetor1.length;i++)
        {
            vetor1[i]=vetor1[i]*vetor2[i];
        }
        
        return vetor1;
            
    }
    
    public double[] produtoVetorDouble(double[] vetor1, double[] vetor2)
    {   //multiplica os elementos de dois vetores double
        
        
        if(vetor1.length<vetor2.length)
        {
            double[] aux = vetor1;
            vetor1 =vetor2;
            vetor2=aux;
        }
        
        
        for(int i = 0; i<vetor1.length;i++)
        {
            vetor1[i]=vetor1[i]*vetor2[i];
        }
        
        return vetor1;
            
    }
    
    public int[] uniaoVetorInt(int[] vetor1, int[] vetor2)
    {   //faz a uniao entre dois vetores de numeros inteiros, assumindo que elementos nao repetem dentro dos próprios vetores (podem repetir entre (termo comum) os vetores)
        int count  = 0;
        int[] temp = new int[vetor2.length]; // vetor temporário para receber os termos no vetor 2 que nao estao no vetor 1
        int tempIndex = 0;
        
        int tamanho1 = vetor1.length;
        int tamanho2 = vetor2.length;
        
        boolean unico = true;
        for (int i = 0; i<tamanho2; i++) //verifica quantos elementos repetidos existem entre os vetores e coloca os nao repetidos do vetor 2 em um vetor temporário
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
             temp[tempIndex]=vetor2[i];// ...entao ele ehcolocado em um vetor temporario
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
    
    public double[] uniaoVetorDouble(double[] vetor1, double[] vetor2)
    {   //faz a uniao entre dois vetores de numeros double, assumindo que elementos nao repetem dentro dos próprios vetores (podem repetir entre (termo comum) os vetores)
        int count  = 0;
        double[] temp = new double[vetor2.length]; // vetor temporário para receber os termos no vetor 2 que nao estao no vetor 1
        int tempIndex = 0;
        
        int tamanho1 = vetor1.length;
        int tamanho2 = vetor2.length;
        
        boolean unico = true;
        for (int i = 0; i<tamanho2; i++) //verifica quantos elementos repetidos existem entre os vetores e coloca os nao repetidos do vetor 2 em um vetor temporário
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
             temp[tempIndex]=vetor2[i];// ...entao ele ehcolocado em um vetor temporario
             tempIndex++;   
            }
            unico = true;
        }
        
        double[] vetor3 = new double[tamanho1 + tamanho2 - count]; //declara o vetor que receberatodos os termos com o tamanho correto
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
    
    public int[] interVetorInt(int[] vetor1, int[] vetor2)
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
    
    public double[] interVetorDouble(double[] vetor1, double[] vetor2)
    {// faz a interseccoao entre dois vetores double, sendo que os vetores nao possuim termos repetidos internamente
        double[] temp = new double[vetor1.length]; // vetor temporario para mater as variaveis, seu tamanho precisa ser maior do que o menor vetor (aqui escolhemos arbitrariamente um dos vetores)
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
        
        double[] vetor3 = new double[tempIndex]; // vetor a ser retornado, do tamanho certo
        
        for(int i =0; i<tempIndex;i++)
        {
            vetor3[i]=temp[i];
        }
        return vetor3;
        
    }
    
    public int produtoEscalarInt(int[] vetor1, int[] vetor2)
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
    
    public double produtoEscalarInt(double[] vetor1, double[] vetor2)
    {   //retorna o produto escala de dois vetores double com mesmo tamanho, e 0 se os vetores tem tamanho diferente
        if(vetor1.length!=vetor2.length)
        {
            return 0;
        }
        double produto=0;
        for (int i =0; i<vetor1.length; i++)
        {
            produto+=vetor1[i]*vetor2[i];
        }
        return produto;
        
    }
    
    public void imprimeMatrizInt(int[][] matriz)
    {
        for (int i = 0; i<matriz.length;i++)
        {
            System.out.print("\n");
            for(int j= 0; j<matriz[i].length;j++)
            {
                System.out.print("|"+matriz[i][j]);
            }
            System.out.print("|");
        }
        
    }
    
    public void imprimeMatrizDouble(double[][] matriz)
    {
        for (int i = 0; i<matriz.length;i++)
        {
            System.out.print("\n");
            for(int j= 0; j<matriz[i].length;j++)
            {
                System.out.print("|"+matriz[i][j]);
            }
            System.out.print("|");
        }
        
    }
    
    public int[] diagonalInt(int[][] matriz)
    {   //imprime a diagonal principal de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
        int[] diag = new int[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++)
        {
            diag[i]=matriz[i][i];
            System.out.print("|"+matriz[i][i]+"|");
        }
        System.out.print("|");
        return diag;
    }
    
    public double[] diagonalInt(double[][] matriz)
    {   //imprime a diagonal principal de uma matriz quadrada de doubles e retorna um vetor com estes termos
        double[] diag = new double[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++)
        {
            diag[i]=matriz[i][i];
            System.out.print("|"+matriz[i][i]+"|");
        }
        System.out.print("|");
        return diag;
    }
    
    public int[] secundariaInt(int[][] matriz)
    {   //imprime a diagonal secundaria de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
        int[] diag = new int[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++)
        {
            diag[i]=matriz[i][matriz[i].length-i-1];
            System.out.print("|"+matriz[i][matriz[i].length-i-1]+"|");
        }
        System.out.print("|");
        return diag;
    }
    
    public double[] secundariaDouble(double[][] matriz)
    {   //imprime a diagonal secundaria de uma matriz quadrada de inteiros  e retorna um vetor com estes termos
        double[] diag = new double[matriz.length];
        System.out.print("\n|");
        for(int i = 0; i<matriz.length;i++)
        {
            diag[i]=matriz[i][matriz[i].length-i-1];
            System.out.print("|"+matriz[i][matriz[i].length-i-1]+"|");
        }
        System.out.print("|");
        return diag;
    }
    
    public int somaTotalVetorInt(int[] vetor)
    {   // soma todos os elementos de um vetor de inteiros
        int total = 0;
        for( int i = 0 ; i<vetor.length;i++)
        {
            total+=vetor[i];
        }
        return total;
    }
    
    public double somaTotalVetorDouble(double[] vetor)
    {   // soma todos os elementos de um vetor de inteiros
        double total = 0;
        for( int i = 0 ; i<vetor.length;i++)
        {
            total+=vetor[i];
        }
        return total;
    }
    
    public boolean matrizDiagonalInt(int[][] matriz)
    {   //checa se uma matriz ehdiagonal (int)
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                if(i!=j)
                {
                    if(matriz[i][j]!=0)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean matrizDiagonalDouble(double[][] matriz)
    {   //checa se uma matriz ehdiagonal (double)
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                if(i!=j)
                {
                    if(matriz[i][j]!=0)
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public boolean matrizUnidadeInt(int[][] matriz)
    {   //checa se uma matriz ehuma matriz unidade (int)
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                if(i==j)
                {
                    if(matriz[i][j]!=1)
                    {
                        return false;
                    }
                }
                else if (matriz[i][j]!=0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean matrizUnidadeInt(double[][] matriz)
    {   //checa se uma matriz ehuma matriz unidade (double)
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                if(i==j)
                {
                    if(matriz[i][j]!=1)
                    {
                        return false;
                    }
                }
                else if (matriz[i][j]!=0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean matrizEsparsaInt(int[][] matriz)
    {   //retorna true se a matriz (retangular) tem mais de 50% dos elementos iguais a zero
        double count = 0;
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                
                if(matriz[i][j]==0)
                {
                    count+=1.0;
                }
                
            }
        }
        if(count/(matriz.length*matriz[0].length)>0.5)
        {
            return true;
        }
        return false;
    }
    
    public boolean matrizEsparsaDouble(double[][] matriz)
    {   //retorna true se a matriz (retangular) tem mais de 50% dos elementos iguais a zero
        double count = 0;
        for (int i = 0; i<matriz.length;i++)
        {
            for(int j= 0; j<matriz[i].length;j++)
            {
                
                if(matriz[i][j]==0)
                {
                    count+=1.0;
                }
                
            }
        }
        if(count/(matriz.length*matriz[0].length)>0.5)
        {
            return true;
        }
        return false;
    }
    
    public int[][] somaMatrizInt(int[][] matriz1, int[][] matriz2)
    {   //soma os elementos de duas matrizes de mesmo tamanho (int)
        for(int i =0; i<matriz1.length;i++)
        {
            matriz1[i]=somaVetorInt(matriz1[i],matriz2[i]);
        }
        return matriz1;
    }
    
    public double[][] somaMatrizDouble(double[][] matriz1, double[][] matriz2)
    {   //soma os elementos de duas matrizes de mesmo tamanho (double)
        for(int i =0; i<matriz1.length;i++)
        {
            matriz1[i]=somaVetorDouble(matriz1[i],matriz2[i]);
        }
        return matriz1;
    }
    
    public int[][] produtoMatrizInt(int[][] matriz1, int[][] matriz2)
    {   //multiplica os elementos de duas matrizes de mesmo tamanho (int)
        for(int i =0; i<matriz1.length;i++)
        {
            matriz1[i]=produtoVetorInt(matriz1[i],matriz2[i]);
        }
        return matriz1;
    }
    
    public double[][] produtoMatrizDouble(double[][] matriz1, double[][] matriz2)
    {   //soma os elementos de duas matrizes de mesmo tamanho (double)
        for(int i =0; i<matriz1.length;i++)
        {
            matriz1[i]=produtoVetorDouble(matriz1[i],matriz2[i]);
        }
        return matriz1;
    }
    
    public int[][] vetorParaMatrizInt(int[] vetor)
    {   //passa os valores de um vetor para uma matriz mais próxima de uma quadrada possível. (int)
        int tamanhoV=vetor.length;
        int n = 0;
        int m = 0;
        
        for(int i=(int)Math.sqrt(tamanhoV);i>=2;i--)
        {
            if (tamanhoV%i==0)// encontra as dimensões para a matriz
            {
                n = i;
                m =tamanhoV/i;
                break;
            }
        }
        
        if (n==0) // se nao encontrou uma possível, retorna null.
        {
            return null;
        }
        
        int[][] matriz = new int[n][m];
        
        int vIndex = 0;
        for (int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                matriz[i][j] = vetor[vIndex];
                vIndex++;
            }
            
        }
        //imprimeMatrizInt(matriz);
        return matriz;
        
    }
    
    public double[][] vetorParaMatrizDouble(double[] vetor)
    {   //passa os valores de um vetor para uma matriz mais próxima de uma quadrada possível. (double)
        int tamanhoV=vetor.length;
        int n = 0;
        int m = 0;
        
        for(int i=(int)Math.sqrt(tamanhoV);i>=2;i--)
        {
            if (tamanhoV%i==0)// encontra as dimensões para a matriz
            {
                n = i;
                m =tamanhoV/i;
                break;
            }
        }
        
        if (n==0) // se nao encontrou uma possível, retorna null.
        {
            return null;
        }
        
        double[][] matriz = new double[n][m];
        
        int vIndex = 0;
        for (int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                matriz[i][j] = vetor[vIndex];
                vIndex++;
            }
            
        }
        //imprimeMatrizDouble(matriz);
        return matriz;
        
    }
    
    public int[] matrizParaVetor(int[][] matriz)
    {   //passa os valores de uma matriz para um vetor (int)
        int[] vetor = new int[matriz.length*matriz[0].length];
        int index = 0;
        for(int i =0; i<matriz.length;i++)
        {
            for(int j = 0;j<matriz[i].length;j++)
            {
                vetor[index] = matriz[i][j];
                index++;
            }
        }
        return vetor;
    }
    
    public double[] matrizParaVetor(double[][] matriz)
    {   //passa os valores de uma matriz para um vetor (double)
        double[] vetor = new double[matriz.length*matriz[0].length];
        int index = 0;
        for(int i =0; i<matriz.length;i++)
        {
            for(int j = 0;j<matriz[i].length;j++)
            {
                vetor[index] = matriz[i][j];
                index++;
            }
        }
        return vetor;
    }
    
}


