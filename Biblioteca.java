/** 
 * 
 * 
 *  
 * 
 * 
**/
public class Biblioteca {
    public int MDC(int dividendo, int divisor){
        int resto = 0;
        int MDC = 0;

        if(dividendo != 0 && divisor != 0){
            resto = dividendo % divisor;
            while(resto != 0){
                System.out.println(dividendo + " / " + divisor);
                resto = dividendo % divisor;
                if(dividendo % divisor == 0){
                    MDC = divisor;
                }else if(resto == 1){
                    return 1;
                }else{
                    dividendo = divisor;
                    divisor = resto;
                }
            }
        }
        return MDC;
    }
    
        public int testeDiv(int num){ // VÊ QUANTOS DIVISORES TEM O NÚMERO
        
        int aux = 0;
        int contador = 0;
        for (int i = 1; i <= num; i++){
        if (num % i == 0){contador++;} // SE I FOR DIVISOR DE NUM, ENTAO ADICIONA 1 NO CONTADOR
        
          }
        return contador;
    }
    
      public boolean testePrimo (int num){ // CHAMA O MÉTODO DE TESTE DIVISORES, QUE RETORNA QUANTOS DIVISORES TEM O NUM
        
            if (testeDiv(num) == 2){return true;} // SE O NUM TIVER APENAS 2 DIVISORES, ENTÃO ELE É PRIMO
            else{return false;} // SE NÃO, ELE NAO É PRIMO
    
    }
    
    public int somaDivisores(int n) {
        return somaDivPro(n) + n; // retorna a soma dos divisores + o número
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
        else{return false;} // se não, é falso
    }
	
    public int geraPossivelNumeroPerfeito(int n) {
	// aplicacao de 2^n-1 * (2^n) - 1
	return (int) Math.round(Math.pow(2, n-1)*(Math.pow(2, n) - 1));
    }
    
    
    public boolean amigos(int n, int k){ // testa se um número é amigo
            if (somaDivPro(n) == k && somaDivPro(k) == n) {
                return true;
            }else{
                        return false;
                        }
         }

    public int inverteNum(int num){ //PEGA UM NÚMERO DE 5 DIGITOS E MUDA A ORDEM DELES
        
        String a;
        String b;
        String c;
        String d; // SE FOE 2 NUM APAGAR
        String e; // SE FOE 2 NUM APAGAR
        String palavra = Integer.toString(num); //Transformando Int para String ou Integer.valueOf(num);
        
        
        
        a = palavra.substring(0, 1);
        b = palavra.substring(1,2);
        c = palavra.substring(2,3);
        d = palavra.substring(3,4);// SE FOE 2 NUM APAGAR
        e = palavra.substring(4,5);// SE FOE 2 NUM APAGAR
        String k = (e+d+c+b+a); // SE FOE 2 NUM APAGAR D e E
        int q = Integer.valueOf(k); // Transformando String para Int
        return q;
    }
        
    public int fatorial (int num){
        int produto = 1;
        for (int i = 1; i <= num; i++)
        {
            produto *= i;
        }
        return produto;
    }
    
    public int somatorio (int num){
        int soma = 0;
        for (int i = 1; i <= num; i++)
        {
            soma += i;
        }
        return soma;
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
    { // retorna a Ã¡rea da superfÃ­cie do paralelepipedo
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
    
    public  double superficieEsfera(double raio)
    {//recebe os raio de uma esfera e retorna seu volume
        return (4*Math.PI*Math.pow(raio,2));
    }
    
    /**
     * 
     * nomeVariavel.lenght() - Conta quantos caractéres tem a string;
     * toUpperCase() e toLowerCase() - 
     * int a = 555;
     * String b = "" +a - CONVERTI PARA STRING SEM USAR NENHUMA CONVERSÃO, ISSO VAI RETORNAR O VALOR DE A (555) JÁ EM STRING.
     * *******
     * Se eu quiser colocar apenas a primeira letra (charAt(0)) de uma String em maíusculo, eu posso usar:
     * System.out.println(letra.substring(0, 1).toUpperCase + letra.substring(1)); 
     * A primeira substring ela pega apenas o q está no índice 0 e coloca pra maiusculo, depois ela printa o resto apartir de 1.
     * *******
     * c.equals(b) - Está comparando se c é igual a b, se sim, retorna true, se não, retorna false.
     * equalsIgnoreCase() - Não considera Capslock
     * *******
     * StartsWith() verifica se há uma string no começo de outra
     * string. StartsWith() também possui um segundo parâmetro opcional que
     * determina a compensação inicial, ou seja, caso necessite verificar a string não
     * da posição 0, mas de uma posição mais adiante.
     * EndsWith() verifica se há uma string no final de outra string. Diferentemente
     * de startsWith(), o método endsWith()não possui compensação.
     **/   
}