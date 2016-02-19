/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeSetAlumn;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author PROF_VESPERTINO
 */
public class ListaAlumnos {

    private TreeSet lista;
    private Scanner sc;

    public ListaAlumnos() {
        lista = new TreeSet();
        sc = new Scanner(System.in);
    }
    
        //metodos
    public void mostrarMenu() {
        System.out.println("1. Añadir datos alumno");
        System.out.println("2. Orden natural (num. expediente) ");
        System.out.println("3. Orden por Nombre ");
        System.out.println("4. Orden por nota");
        System.out.println("5. Orden por telefono");
    }
      public int pedirOpcion(){
        int numero;
        System.out.println("Pulsa el numero del menu que quieras ejecutar ");
        numero = sc.nextInt();
        return numero;
    }
      
      public void deleteAlumno(){
          Iterator it = lista.iterator();
          int num, cont=0;
          Alumno aux;
          System.out.println("pasame numero");
          num=sc.nextInt();
          while (it.hasNext()) {
             aux=(Alumno)it.next();
              if(cont== num){
              lista.remove(aux);
              }
              cont++;
          }
      }
    
    public void ejecutaOpcion(int numero) {
        //depende del numero ejecuta una opcion llamando al metodo
        switch (numero) {
            case 1:
                anadeAlumnos();
                break;
            case 2:
                muestraPorNumeroDeExpediente();
                break;
            case 3:
                muestraPorNombre();
                break;
            case 4:
                muestraPorNota();
                break;
            case 5:
                muestraPorTelefono();
             
        }//fin switch 
    }//fin metodo
    
        //METODOS PARA IMPLEMETAR
    private void anadeAlumnos() {
        treeSetAlumn.Alumno alum = new treeSetAlumn.Alumno();
        //pedimos los datos
        sc.nextLine();
        System.out.println("Pon el nombre del alumno: ");
        alum.setNombre(sc.nextLine());
        System.out.println("Pon el apellido del alumno: ");
        alum.setApellido(sc.nextLine());
        System.out.println("Pon el numero de expendiente: ");
        alum.setnExpediente(sc.nextInt());
        System.out.println("Pon la nota del examen : ");
        alum.setNota(sc.nextInt());
        System.out.println("Pon el numero de telefono: ");
        alum.setTelefono(sc.nextLong());

        lista.add(alum);

    }
    

    public boolean guardaAlumno(Alumno a) {
        if (!lista.add(a)) {
            // Mostraremos listado haciendo uso del "orden natural"
            System.out.println("Alumno " + a.toString() + " esta repetido");
            return false;
        }
        return true;
    }

      public void muestraPorNumeroDeExpediente() {
        Iterator i = lista.iterator();
        // Mostraremos listado haciendo uso del "orden natural"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
      
    public void muestraPorNombre() {
        AlumnoOrdenadoPorNombre ordenNombre = new AlumnoOrdenadoPorNombre();
        TreeSet aux = new TreeSet(ordenNombre);
        aux.addAll(lista);
        // se podria mandar el treeset a un metodo llamado motrar alumno y de este modo no copiamos tantas veces el mismo bucle de abajo
        Iterator i = aux.iterator();
        // Mostraremos listado haciendo uso del "otro orden"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
    public void muestraPorNota(){
        AlumnoOrdenadoPorNota ordenNota = new AlumnoOrdenadoPorNota();
        TreeSet aux = new TreeSet(ordenNota);
        aux.addAll(lista);

        Iterator i = aux.iterator();
        // Mostraremos listado haciendo uso del "otro orden"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    
     public void muestraPorTelefono(){
        AlumnoOrdenadoPorTelefono ordenTelefono = new AlumnoOrdenadoPorTelefono();
        TreeSet aux = new TreeSet(ordenTelefono);
        aux.addAll(lista);

        Iterator i = aux.iterator();
        // Mostraremos listado haciendo uso del "otro orden"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
