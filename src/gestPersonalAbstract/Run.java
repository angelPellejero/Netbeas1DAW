/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestPersonalAbstract;

/**
 *  La clase abstrac obliga a sus hijas a sobreescribir sus metodos cuando estos son abstract
 *  Se puede heredar sus atributos siempre cuando tengan un constructor de ellas en la su clase abstract a heredar
 *  El atributo final interesa pornerla en la casa padre para que todos puedan acceder a su valor y no poder modificarlo
 * @author Ángel
 */
public class Run {

    public static void main(String[] args) {
        Temporal temporal = new Temporal("72798430A", "Angel", 55, 2014, 10, 2, 2014, 10, 6);
        System.out.println("Temporal: " + temporal.calculaSueldo());
     
        
        Horas horas = new Horas(7, "angel", "72798430A", 23);
        System.out.println("Horas: " + horas.calculaSueldo());
        System.out.println("Horas: "+ horas.toString());
        
        Fijo fijo =new Fijo("Angel", "72798430A", 25, 2014);
        System.out.println("Fijo: "+ fijo.calculaSueldo());
    }
}
