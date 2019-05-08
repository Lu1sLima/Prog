/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author 19111170
 */
public class Ex8 {
    public static void main(String[] args) {
        //int num = 0; // começa em 0 e vai até 999
        for (int num = 6; num <= 999; num++) {
            int contador = 0;
            if (numPerfeito(num)){ // sei qe o método retorna boolean poderia ser if (numPerfeito(num) == true)
                contador++;
                System.out.println(num);
            }
            
        }
        
    
}
}