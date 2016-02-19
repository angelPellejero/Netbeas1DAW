package HashSetAlumn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Menu {

    //atributos, objetos
    private HashSet alumnos;
    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
        alumnos=new HashSet();
    }

    //metodos
    public void mostrarMenu() {
        System.out.println("1. Añadir datos alumno");
        System.out.println("2. Borrar por posición");
        System.out.println("3. Mostrar listado ");
        System.out.println("4. Salir del programa");
    }

    public void ejecutaOpcion(int numero) {
        //depende del numero ejecuta una opcion llamando al metodo
        switch (numero) {
            case 1:
                anadeAlumnos();
                break;
            case 2:
                borrarAlumnos();
                break;
            case 3:
                mostrarListado();
        }//fin switch 
    }//fin metodo

    //METODOS PARA IMPLEMETAR
    private void anadeAlumnos() {
        Alumno alum = new Alumno();

        //pedimos los datos
        System.out.println("Pon el nombre del alumno: ");
        alum.setNombre(sc.nextLine());
        System.out.println("Pon el apellido del alumno: ");
        alum.setApellido(sc.nextLine());
        System.out.println("Pon el curso del alumno: ");
        alum.setCurso(sc.nextLine());
        
        //al sobreescribir equals en la clase alumno, no me dejara introducir alumnos con mismos datos ya que hashSet no permite duplicados(lo mira automaticamente asi)
        alumnos.add(alum);
        
    }

    //metodo para borrar un alumno por su posicion en el indice
    private void borrarAlumnos() {
        int i, contador = 0;
        System.out.println("Que posicion borrar???");
        i = sc.nextInt();
        for (Object alumno : alumnos) {
            if (i == contador) {
                alumnos.remove(alumno);
                break;
            }
            contador++;
        }
    }

    //muestra todo lo que cotiente la coleccion
    private void mostrarListado() {
        Iterator it = alumnos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }


}//fin clase
