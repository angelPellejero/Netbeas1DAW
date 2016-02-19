/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedListTema8;

/**
 *
 * @author Ángel
 */
public class Test {

    public static void main(String[] args) {
        int x;
        Alumno alumno = new Alumno();
        Menu menu = new Menu();
        menu.crearColeccion();
        do {
            menu.mostrarMenu();
            x = menu.opcion();
            if (x != 9) {
                menu.ejecutaOpcion(x);
            }
        } while (x != 9);
        System.out.println("FIN");
    }
}
