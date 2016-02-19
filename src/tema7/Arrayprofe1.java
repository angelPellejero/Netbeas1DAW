//Ejercicio propuesto. Implementar un programa en Java que cree e inicialice en introducciones separadas un array de tipo float de tamaña 20. 
//Rellene dicho array con numeros aletatorios entre 0 y 10. Y
//calcule y muestre por pantalla posteriormente la nota media de los elementos del array
package tema7;

import reusable.AleatoriosNums;

public class Arrayprofe1 {

    //Declaro e instancio el array con 20 posiciones

    private static float num[] = new float[20];

    //meter 20 num aleatorios entre (0-10)
    public static float[] numeros() {
        for (int i = 0; i < num.length; i++) {
            num[i] = AleatoriosNums.dameUnNumero(0, 10);
        }
        return num;
    }

    //Mostar datos del array y sacar su media
    public static void main(String[] args) {
        numeros();
        float suma = 0;
        System.out.println("Valores dentro del array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            suma = suma + num[i];
        }
        System.out.println("La media es: " + (suma / num.length));
    }
}
