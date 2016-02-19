//Ejercicio propuesto introduccion a matrices
//Realizar un método que reciba una tabla de 8x8 de tipo char y retorne dicha tabla con 8 casillas con el caracter '*' 
//el resto de casillas se rellenaran con 'A'. Despues muestra la tabla por pantalla
package tema7;

import utilidadesMatrices.MetodosMatrices;

public class Matriz1 {
    public static void main(String[] args) {
        char flota[][]= new char [8][8];
        MetodosMatrices.rellenaArrayConCaracter(flota, 'A');
        MetodosMatrices.rellenaArraysAstericos(flota, 0, 8);
        MetodosMatrices.coincidenciasArray(flota,1, 1);
//        MetodosMatrices.toString(flota);
    }
}
