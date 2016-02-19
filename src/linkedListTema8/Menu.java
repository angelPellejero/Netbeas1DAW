package linkedListTema8;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private Cola cola;
    private Pila pila;
    private static boolean pilaCola;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public void crearColeccion() {
        int a, colec, lim;

        System.out.println("1.Quieres simular una cola");
        System.out.println("2.Quieres simular una pila");
        colec = sc.nextInt();
        switch (colec) {
            //Este caso instancia una cola
            case 1:
                pilaCola = true;
                System.out.println("1. Constructor con tamaño maximo de elementos: ");
                System.out.println("2. Constructor con número infinito de elementos: ");
                a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Cual sera el tamaño maximo??");
                        lim = sc.nextInt();
                        cola = new Cola(lim);
                        break;
                    case 2:
                        cola = new Cola();
                }
                break;

            //Este caso instancia una pila
            case 2:
                pilaCola = false;
                System.out.println("1. Constructor con tamaño maximo de elementos: ");
                System.out.println("2. Constructor con número infinito de elementos: ");
                a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Cual sera el tamaño maximo??");
                        lim = sc.nextInt();
                        pila = new Pila(lim);
                        break;
                    case 2:
                        pila = new Pila();
                }
        }
    }

    public void mostrarMenu() {
        System.out.println("1. Añadir datos alumno");
        System.out.println("2. Esta lleno??");
        System.out.println("3. Esta vacio ");
        System.out.println("4. Extraer el primer elemento borrandolo");
        System.out.println("5. Introducir un alumno al principio");
        System.out.println("6. Imprimir sin borrar");
        System.out.println("7. Que elemento esta en la cima??? ");
        System.out.println("8. Cual es el tamaño actual de la coleccion");
    }

    public int opcion() {
        int a;
        System.out.print("Cual opcion quieres usar??: ");
        a = sc.nextInt();
        return a;
    }

    public void ejecutaOpcion(int numero) {
        //depende del numero ejecuta una opcion llamando al metodo
        switch (numero) {
            //si "pilaCola" es true es porque se eligio simular una cola en el caso contrario fue cola
            case 1:
                if (pilaCola == true) {
                    cola.addAlumno();
                } else {
                    pila.addAlumno();
                }
                break;
            case 2:
                if (pilaCola == true) {
                    cola.estaLleno();
                } else {
                    pila.estaLleno();
                }
                break;
            case 3:
                if (pilaCola == true) {
                    cola.estaVacio();
                } else {
                    pila.estaVacio();
                }
                break;
            case 4:
                if (pilaCola == true) {
                    cola.pop();
                } else {
                    pila.pop();
                }
                break;
            case 5:
                if (pilaCola == true) {
                    cola.push();
                } else {
                    pila.push();
                }
                break;
            case 6:
                if (pilaCola == true) {
                    cola.imprimir();
                } else {
                    pila.imprimir();
                }
                break;
            case 7:
                if (pilaCola == true) {
                    cola.cima();
                } else {
                    pila.cima();
                }
                break;
            case 8:
                if (pilaCola == true) {
                    cola.size();
                } else {
                    pila.size();
                }

        }//fin switch 
    }//fin metodo

}
