/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasos;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Navidad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño;
        int i, j, k, h,n, c = 0;
        System.out.println("Tamaño del arbol entre 3 y 10");
        tamaño = sc.nextInt();

        for (i = 0; i <= tamaño; i++) {
            if (i % 2 == 1) {// cuando i es impar dibujo
                for (k = 10; k >= i; k--) {
                    if (k % 2 == 1) {//division de espacios basadas en resultados impares para que se pueda hacer la forma triangular
                        System.out.print(" ");
                    }
                }
                for (j = 0; j < i; j++) {
                    System.out.print("*");
                }
                c++;
                System.out.println();
            }
     
            }
         for (h = 0; h < c; h++) {
                 for(n=0; n<(tamaño/2); n++){
                     System.out.print(" ");
                 } 
                 System.out.print("**");
                 System.out.println("");
        }
    }
}
