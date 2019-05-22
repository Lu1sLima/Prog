public class Retangulo//classe base
{

//atributos desta classe onde irei guardar as informações de cada objeto criado. Ou seja, os valores a serem atribuidos a estas variaveis
   private double base, altura;
    // privado, pq os objetos têm que interagir entre si
    // CADA ATRIBUTO TEM QUE TER UM MÉTODO GETTER E UM MÉTODO SETTER
    // GETTER: CONJUNTO DE MÉTODOS DE ACESSO
    // SETTER = DEFINE, MODIFICA
   
   
   
   //metodo construtor com regramento para instanciar (criar) um objeto **este e com uso de parametro 
   public Retangulo(double base, double altura) // poderia ser double base1, double altura1
   // SE O PARÂMETRO FOR IGUAL O ATRIBUTO, COLOCA-SE O THIS!!!!!
    //CONSTRUTOR SEMPRE COMEÇA COM MAIÚSCULA
   {
       this.base=base; // poderia ser assim base = base1, sem o THIS    
       //ESTOU USANDO O THIS. pq o parâmetro é IGUAL OS ATRIBUTOS!!!!!!!!
       this.altura=altura; // poderia ser assim altura = altura1, sem o This
       
   }
  
   
   // Igual o de cima, mas o parâmetro NÃO É IGUAL AO ATRIBUTO, PORTANTO, NAO PRECISA USAR O THIS.
   //public RetanguloSemtHIS(double base1, double altura1) // poderia ser double base1, double altura1
   // SE O PARÂMETRO FOR IGUAL O ATRIBUTO, COLOCA-SE O THIS!!!!!
    //CONSTRUTOR SEMPRE COMEÇA COM MAIÚSCULA
   //{
       //base=base1; // poderia ser assim base = base1, sem o THIS    
       //ESTOU USANDO O THIS. pq o parâmetro é IGUAL OS ATRIBUTOS!!!!!!!!
      //altura=altura1; // poderia ser assim altura = altura1, sem o This
       
   //}
   
   
   //getters ***metodos de acesso ao conteudo dos atributos do objeto (valor)
   
   public double getBase()
   {
       return base;
   }
   
   public double getAltura()
   {
       return altura;
   }
   
      //metodos de modificao ***** setters *******
   
   public void setBase(double base)
   {
       this.base=base;
   }
   
   public void setAltura(double altura)
   {
       this.altura=altura;
   }
    
   //outros metodos 
   public double areaR() // Esses métodos DESSA CLASSE já recebem, por default, as variáveis LOCAIS DESTA CLASSE(ATRIBUTOS) como parâmetro
   {//retorna a area do retangulo
       return base*altura;
   }
   
   public double perimetroR() 
   {//retorna o perimetro
    double aux= 2*base+2*altura;
    return aux;    
    }
    
    public double diagonalR()
    {//retorna a diagonal
    double aux= Math.sqrt(base*base+ altura*altura);
    return aux;    
    }
    // metodo  to String para escrever todos atributos com formatacao 
    
    public String toString()
    {
             
          String aux= "\n Medidas do Retangulo \n Base= "+ base+ "\n altura="+ altura;
         return aux;
       
    
     }

}
