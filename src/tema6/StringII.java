/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 * Realiza un método dentro de la clase StringII que reciba un string leído por
 * teclado (desde la clase de prueba) y retorne un booleano indicando si es o no
 * palíndromo.
 *
 * @author Ángel
 */
public class StringII {

    

    public static boolean palidromo(String cadena) {
       boolean iguales = true;
        int j = cadena.length()-1;
        for (int i=0; i<j; i++,j--) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                iguales = false;
            }
        }
        return iguales;
    }
}
