//Realizar un programa en java que pida al usuario los 3 numeros (x,y, z). 
//Comprobar que la suma de x+y+z es igual a 100. Posteriormente llama a un método que recibe 
//un array de tamaño 15 y tambien recibe los 3 porcentajes anteriores. Dicho array será rellenado con 1, x y 2.
//Dependendiendo los porcentajes introducidos por el usuario.
////
//Ejemplo si sale el numero aleatorio 50 pondra 1, si sale 80 pondra x y si sale 95 pondra 2
//Si x=70 -> Indica 70% de 1
//Si y=20 -> Indica 20% de X
//si z=10 -> Indica 10% de 2
package tema7;

import java.util.Scanner;
import reusable.AleatoriosNums;

public class Quiniela {

    public static void rellenaQuiniela(char[] array, int x, int y, int z) {
        int numero;
        for (int i = 0; i < array.length; i++) {
            numero = AleatoriosNums.dameUnNumero(0, 100);
            if (numero < x) {
                array[i] = '1';
            } else if (numero > x && numero < x + y) {
                array[i] = 'x';
            } else {
                array[i] = '2';
            }
        }
    }

    public static void main(String[] args) {
        char array[] = new char[15];
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pasame 3 numeros x, y, z la suma debe de los 3 debe ser igual a 100: ");
        do {
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            if (x + y + z != 100) {
                System.out.println("La suma de los 3 numeros no da 100");
            }
        } while (x + y + z != 100);
        rellenaQuiniela(array, x, y, z);
        System.out.println("Resultado de la quiniela: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
