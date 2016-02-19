/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalesMascotas;

/**
 *
 * @author Ángel
 */
public class Test {
    public static void main(String[] args) {
        Perro perro = new Perro("Foto1", "Pienso", "España", "50cm");
        Perro perro2 = new Perro("Foto1", "Pienso", "España", "50cm");
        Perro perro3 = new Perro("Foto3", "Pienso", "Portugal", "40cm");
        System.out.println(perro.comer());
        System.out.println(perro.hacerRuido());
        System.out.println(perro.jugar());
        System.out.println(perro.rugir());
        System.out.println(perro.vacunar());
        System.out.println("Perro  es igual de perro 2: "+ perro2.equals(perro));
        System.out.println("Perro es igual de perro 3: "+ perro.equals(perro3));
        System.out.println("Presentacion de perro: "+  perro.toString());
       
    }
}
