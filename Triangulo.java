public class Triangulo//classe base
{

//atributos desta classe onde irei guardar as informações de cada objeto criado. Ou seja, os valores a serem atribuidos a estas variaveis
   private double base, altura, lado1, lado2, lado3;
   
   
   
   //metodo construtor com regramento para instanciar (criar) um objeto **este e com uso de parametro 
   public Triangulo(double base, double altura, double lado1, double lado2, double lado3) // mÉTODO ESQUISITO
   {
       this.base =  base;
       this.altura = altura;
       this.lado1 = lado1;
       this.lado2 = lado2;
       this.lado3 = lado3;
       
   }
   //getters ***metodos de acesso ao conteudo dos atributos do objeto (valor)
   public double getBase()
   {
       return base;
   }
   
   public double getAltura()
   {
       return altura;
   }
   
      public double getLado1()
   {
       return lado1;
   }
   
      public double getLado2()
   {
       return lado2;
   }
   
      public double getLado3()
   {
       return lado3;
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
   
      public void setLado1(double altura)
   {
       this.lado1 = lado1;
   }
   
      public void setLado2(double altura)
   {
       this.lado2 = lado2;
   }
   
      public void setLado3(double altura)
   {
       this.lado3 =lado3;
   }
    
   //outros metodos 
   public double areaT()
   {//retorna a area do retangulo
       return (base*altura)/2;
   }
   
   public double perimetroT() 
   {//retorna o perimetro
       if (lado1 >
    }
    
    public double menorMedida()
    {//retorna a diagonal
    double aux= Math.sqrt(base*base+ altura*altura);
    return aux;    
    }
    
    
    // metodo  to String para escrever todos atributos com formatacao 
    
    public String toString() // MOSTRA O CONTEÚDO DOS ATRIBUTOS COLOCADOS NO OBJETO
    {
             
          String aux= "\n Medidas do Retangulo \n Base= "+ base+ "\n altura="+ altura;
         return aux;
       
    
     }

}
