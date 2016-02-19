/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author Ángel
 */
public class Prueba {
    public static void main(String[] args) {
        StringII test = new StringII();
        String a="oso", b="lara", c="arañara";
        
        System.out.println(StringII.palidromo(a));
        System.out.println(StringII.palidromo(b));
        System.out.println(StringII.palidromo(c));
    }
}
