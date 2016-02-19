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
public class Rombo2 {

    public static void main(String[] args) {
        int n, numero, contador = 1, aux = 0, espAbajo = 1;
        boolean bajo = true;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        aux = numero / 2;
        for (n = numero / 2; n >= 0; n--) {
            
            if (bajo == true) {
                for (int a = 0; a <= n; a++) {  //Espacios de la parte de arriba
                    System.out.print(" ");
                }
            } else {
                for (int a = 0; a < espAbajo; a++) { //Espacios de la parte de abajo
                    System.out.print(" ");
                }
            }

            if (bajo == true) {// rellena la parte de arriba
                for (int b = 0; b < contador; b++) {
                    System.out.print("*");
                }
            } else {// rellena la parte de abajo
                for (int b = 0; b < contador; b++) {
                    System.out.print("*");
                }
            }

            System.out.println("");

            if (n == 0 && bajo == true) { // cuando llega a la mitad del rombo le da mas vida al bucle
                n = aux;                 // para acabar  la parte de abajo
                bajo = false;
            }

            if (bajo == true) { // modica el contador para el tema del relleno de los *
                contador += 2;  //parte de arriba
            } else {
                contador -= 2;  // parte de abajo
                espAbajo++;
            }

        }

    }
}
