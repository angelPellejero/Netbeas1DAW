package utilidadesMatrices;

import reusable.AleatoriosNums;

public class MetodosMatrices {

    //Rellena matriz con con un caracter
    public static void rellenaArrayConCaracter(char[][] tabla, char caracter) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = caracter;
            }
        }
    }

    public static void rellenaMatrizNumAlea(int[][] matriz, int inicio, int fin) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = AleatoriosNums.dameUnNumero(inicio, fin);
            }
        }
    }

    //metodo para sumar dos matrices
    public static int[][] sumaMatrices(int[][] a, int[][] b) {
        int aux[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                aux[i][j] = a[i][j] + b[i][j];
            }
        }
        return aux;
    }

    //metodo para sumar dos matrices
    public static int[][] restarMatrices(int[][] a, int[][] b) {
        int aux[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                aux[i][j] = a[i][j] - b[i][j];
            }
        }
        return aux;
    }
    

    //metodo para multiplicar matrices
    public static int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int aux[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {     
                for (int k = 0; k < a[i].length; k++) {
                    aux[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return aux;
    }

    //Este metodo rellena con asteriscos en posicion aleatorio en un array bidimensional
    public static void rellenaArraysAstericos(char[][] tabla, int inicio, int fin) {
        int fila, columna;
        for (int i = 0; i < tabla.length; i++) {
            fila = AleatoriosNums.dameUnNumero(inicio, fin);
            columna = AleatoriosNums.dameUnNumero(inicio, fin);
            if (tabla[fila][columna] == '*') {
                i--;
            } else {
                tabla[fila][columna] = '*';
            }
        }
    }

    //Este metodo comprueba si las cordenadas coinciden con algun asterisco en un array bidimensional
    public static void coincidenciasArray(char[][] tabla, int fila, int columna) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] == tabla[fila][columna] && tabla[i][j] == '*') {
                    tabla[i][j] = 'H';
                }
            }
        }
    }

    //metodo que muestra el contenido de una matriz bidimensional 
    public static void toString(int[][] tabla) {
        for (int w = 0; w < tabla.length; w++) {
            for (int i = 0; i < tabla[w].length; i++) {
                System.out.print(tabla[w][i] + " ");

            }
            System.out.println();
        }
    }
}
