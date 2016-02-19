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
public class RomboN {

    public static void muestreCaracter(int x, char c) {
        for (int i = 0; i < x; i++) {
            System.out.print(c + "");
        }
    }

    public static void main(String[] args) {
        int n, numero, contador = 1;
        int ce, ca, auxce = 1, auxca = 2;

        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        ce = numero / 2;
        ca = 1;
        for (int i = 0; i < numero; i++) {
            muestreCaracter(ce, ' ');
            muestreCaracter(ca, '*');
            System.out.println("");
            if (ce == 0) {
                auxce = -1;
            }
            if (ca == numero) {
                auxca = -2;
            }
            ce = ce - auxce;
            ca = ca + auxca;
        }
    }

}
