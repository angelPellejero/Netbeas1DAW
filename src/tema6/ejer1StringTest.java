/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 * Implementar 4 metodos ya implementados
 *
 * @author VESPERTINO
 */
public class ejer1StringTest {

    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String(" ababABAB ");
        String s3 = "Ejemplo";

        System.out.println(s1.compareTo(" ")); // “ “ es un espacio en blanco.

        System.out.println(s2.concat((s3)));

        System.out.println(s1.indexOf('h'));

        System.out.println(s2.trim());
    }
}
