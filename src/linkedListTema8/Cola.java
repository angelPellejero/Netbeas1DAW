package linkedListTema8;

import com.sun.glass.ui.Size;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

//En una cola el primero en entrar es el primero en salir (similar a al cola del cina)
//todos los elementos entran por el final
public class Cola {

    private LinkedList cola;
    private int maximo;
    private Scanner sc;

    public Cola() {
        this.cola = new LinkedList();
        sc = new Scanner(System.in);
    }

    public Cola(int maximo) {
        this.maximo = maximo;
        sc = new Scanner(System.in);
    }

    public void estaLleno() {
        if (maximo != 0) {
            if (cola.size() == maximo) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }else{
            System.out.println("Esta coleccion es infinita de elementos");
        }
    }

    public void estaVacio() {
        if (cola.size() == 0) {
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

    // Este metodo añade elementos al final de la coleccion
    public void addAlumno() {
        if (maximo == 0 || cola.size() < maximo) {// Este if controla la inserccion por si se ha declarado un maximo de elementos
            Alumno alum;
            alum = pedirDatos();
            cola.add(alum);
        } else {
            System.out.println("La coleccion esta llena");
        }
    }

    //Este metodo extrae, elimina el primer elemento y lo muestra 
    public void pop() {
        if (cola.size() > 0) {
            System.out.println(cola.pop());
        }else{
            System.out.println("No hay elementos en la coleccion");
        }
    }

    //Este metodo introduce un elemento al principio de la cola
    public void push() {
        if (maximo == 0 || cola.size() < maximo) {
            Alumno alum;
            alum = pedirDatos();
            cola.push(alum);
        } else {
            System.out.println("La coleccion esta llena");
        }
    }

    //metodo imprimir elementos sin sacarlos
    public void imprimir() {
        Iterator it = cola.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    //metodo que devuelve el primer elemento de la lista pero no lo elimina
    public void cima() {
        System.out.println(cola.peekFirst());
    }

    //metodo que me muestra el tamaño de la cola
    public void size() {
        System.out.println(cola.size());
    }

}
