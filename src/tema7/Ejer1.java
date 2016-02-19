/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Ejer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaracion
        int vector[];
        int n, x, y;
        //pedir datos
        System.out.println("Pasame el valor para el tamaño del vector");
        n=sc.nextInt();
        vector = new int[n];
        System.out.println("Pasame el principio del numero de aleatorios");
        x=sc.nextInt();
        System.out.println("Pasame el final del numero de aleatorios");
        y=sc.nextInt();
        
        utilidadesArray.Ejer1.rellenaVector(vector, x, y);
        System.out.println("El valor minimo: "+ utilidadesArray.Ejer1.minimoDelvector(vector));
        System.out.println("El valor maximo: "+ utilidadesArray.Ejer1.maximoDelVector(vector));
        System.out.println("El valor de la media: "+ utilidadesArray.Ejer1.calcularMedia(vector));
        System.out.println("Metodo toString: "+ utilidadesArray.Ejer1.toString(vector));
    }
}
