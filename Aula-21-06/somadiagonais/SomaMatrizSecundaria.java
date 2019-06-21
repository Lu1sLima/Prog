/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somadiagonais;

public class SomaMatrizSecundaria {
    public static void main(String[]args){
    
    int [][] matriz = {{1, 2},{5, 6}};
    int ordem = matriz.length-1;
    
    double soma = 0;
    for (int i = 0; i < matriz.length; i++){
        for(int j = 0; j< matriz[0].length; j++){
            if (i+j == matriz.length-1){
                soma += +matriz[i][j];
            }
        } 
}
        System.out.println(soma);
        
        
        
        
        
        
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" "+matriz[i][j]);
                
            }
            System.out.println("");
        }
    
        double s2 = 0;
       for (int i = 0; i < matriz.length; i++){
        s2 = s2+matriz[i][ordem-i];
    }
       
   System.out.println("S2: "+s2);
}
}