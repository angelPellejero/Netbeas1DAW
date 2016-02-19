package utilidadesArray;

import java.util.Arrays;
import java.util.Scanner;
import reusable.AleatoriosNums;

public class Ejer1 {

    //Este metodo rellena un vector con numeros aleatorios y no habra un numero que sea igual
    public static void rellenaVector(int vector[], int inicio, int fin) {
        int aux;
        for (int i = 0; i < vector.length; i++) {//recorro el vector hasta llenar todos los espacios

            aux = AleatoriosNums.dameUnNumero(inicio, fin);// guarda num en aux para proxima comparacion

            i = comprobarNumerosNoRepes(vector, aux, i);//llamar a metodo para saber si el numero es repetido o no

        }
    }

    //Este metodo rellena un vector con numeros aleatorios 
    public static void rellenaVectorConRepes(int vector[], int inicio, int fin) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = AleatoriosNums.dameUnNumero(inicio, fin);
        }
    }
    //este metodo se encarga de ver que no haya un numero repetido dentro de un vector
    public static int comprobarNumerosNoRepes(int vector[], int num, int indice) {
        boolean igual = false;
        for (int j = 0; j <= indice; j++) {// recorre hasta i ya que marca el indice de hasta donde se ha llenado el vector
            if (num == vector[j]) {// compara si el numero esta dentro del vector
                System.out.println("Este numero esta repetido no vale: " + num);
                igual = true;      // de encontrar el numero en el vector el boolean dira true
                break;
            } else {
                igual = false;  // de no encontrarlo dira false
            }
        }
        if (igual == false) { // si es false quiere decir que el numero no esta repetido
            vector[indice] = num;    //entonces el numero es introducido segun el indice marcado por "i"
        } else {        // en el caso contrario el bolean no se añada nada al vector
            indice--;            // se le resta -1 a "i" para que haga la funcion de pedir ese numero del indice
        }
        return indice;
    }

    //Este metodo hace al usuario rellenar un array sin tener numeros iguales
    public static void usuarioRellenaArray(int numerosUser[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los numeros para rellenar el array");
        for (int i = 0; i < numerosUser.length; i++) {
            n = sc.nextInt();
            i = comprobarNumerosNoRepes(numerosUser, n, i); //llamada al comprobador para que el usuario no meta numeros iguales
        }
    }

    public static int coincidenciasEnDosArrays(int numerosUser[], int vector[]) {
        int contador = 0;
        if (numerosUser.length != vector.length) {
            System.out.println("Los tamaños de los vectores deben ser iguales");
        } else {

            for (int i = 0; i < vector.length; i++) {
                for (int j = 0; j < vector.length; j++) {
                    if (numerosUser[i] == vector[j]) {
                        contador++;
                    }
                }
            }
        }
        return contador;
    }

    //metodo que devuelve un array con ordenador a partir de uno desordenado
    public static int[] ordenarArray(int[] array) {
        int aux[] = new int[array.length], indice;
        for (int i = 0; i < array.length; i++) {
            aux[i] = minimoDelvector(array);//llamada que recibe el minimo del vector
            indice = minimoIndiceDelvector(array);// llamada que recibe posicion en el indice del menor entero
            array[indice] = Integer.MAX_VALUE;// machaca ese numero con el valor maximo segun su indice en el array
        }
        return aux;
    }

    public static int maximoDelVector(int vector[]) {
        int aux = Integer.MIN_VALUE;
        for (int i : vector) { //con este tipo de for i saca el valor del array
            if (aux < i) {
                aux = i;
            }
        }
        return aux;
    }
//devuelve el entero menor en un array

    public static int minimoDelvector(int vector[]) {
        int aux = Integer.MAX_VALUE;
        for (int i : vector) {
            if (aux > i) {
                aux = i;
            }
        }
        return aux;
    }

    //devuelve el indice menor en un array de enteros
    public static int minimoIndiceDelvector(int vector[]) {
        int aux = Integer.MAX_VALUE, indice = 0;
        for (int i = 0; i < vector.length; i++) {
            if (aux > vector[i]) {
                aux = vector[i];
                indice = i;
            }
        }
        return indice;
    }

    public static float calcularMedia(int vector[]) {
        float suma = 0;
        for (int i : vector) {
            System.out.println(i);
            suma = suma + i;
        }
        return suma / vector.length;
    }
    
    public static String toString(int vector[]) {
        StringBuilder sb = new StringBuilder("");
        for (int w = 0; w < vector.length; w++) {
            sb.append(vector[w] + " ");
        }
        return sb.toString();
    }
}
