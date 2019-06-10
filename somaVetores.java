package Vetores;

import java.util.Scanner;
public class somaVetores {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int [] a = new int[5];
        int [] b = {1, 2, 3, 4, 5};
        int [] soma = new int[5];
        int k = 0;

//        for (int i = 0; i < a.length; i++){
//            soma[i] = a[i]+b[i];
//
//        }
//
//        for (int i = 0; i < soma.length; i++){
//            System.out.println(soma[i]);
//        }

        for (int i = 0; i < a.length; i++){
            k = input.nextInt();
            a[i] = k;

        }

        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }


    }


}
