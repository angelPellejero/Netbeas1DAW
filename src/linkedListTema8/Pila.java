
package linkedListTema8;

//En una pila el primero en entrar es el ultimo en salir
//todos los elementos entran por el final

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Pila {
     private LinkedList pila;
    private int maximo;
    private Scanner sc;

    public Pila() {
        this.pila = new LinkedList();
        sc = new Scanner(System.in);
    }

    public Pila(int maximo) {
        this.maximo = maximo;
        sc = new Scanner(System.in);
    }

    public void estaLleno() {
        if (maximo != 0) {
            if (pila.size() == maximo) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }else{
            System.out.println("Esta coleccion es infinita de elementos");
        }
    }

    public void estaVacio() {
        if (pila.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public Alumno pedirDatos() {
        Alumno alum = new Alumno();
        //pedimos los datos
        System.out.println("Pon el nombre del alumno: ");
        alum.setNombre(sc.nextLine());
        System.out.println("Pon el apellido del alumno: ");
        alum.setApellido(sc.nextLine());
        System.out.println("Pon el curso del alumno: ");
        alum.setCurso(sc.nextLine());
        return alum;
    }

    //añadir elementos al final de la lista
    public void addAlumno() {
        if (maximo == 0 || pila.size() < maximo) {// Este if controla la inserccion por si se ha declarado un maximo de elementos
            Alumno alum;
            alum = pedirDatos();
            pila.add(alum);
        } else {
            System.out.println("La coleccion esta llena");
        }
    }

    //Este metodo extrae, elimina el primer elemento y lo muestra que en el caso de ser pila sera el ultimo de la lista
    public void pop() {
          if (pila.size() > 0) {
            System.out.println(pila.pollLast());
        }else{
            System.out.println("No hay elementos en la coleccion");
        }
    }

    //Este metodo introduce un elemento al principio de la cola
    public void push() {
        if (maximo == 0 || pila.size() < maximo) {
            Alumno alum;
            alum = pedirDatos();
            pila.push(alum);
        } else {
            System.out.println("La coleccion esta llena");
        }
    }

    //metodo imprimir elementos sin sacarlos
    public void imprimir() {
        LinkedList aux= new LinkedList(pila);
        Iterator it = aux.iterator();
        while (it.hasNext()) {
            System.out.println(aux.pollLast());
            
        }
    }

    //metodo que devuelve el ultimo elemento de la lista pero no lo elimina
    public void cima() {
        System.out.println(pila.peekLast());
    }

    //metodo que me muestra el tamaño de la cola
    public void size() {
        System.out.println(pila.size());
    }

}
