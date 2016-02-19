/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeSetAlumn;


/**
 *
 * @author VESPERTINO
 */
public class Test {
    public static void main(String[] args) {
        //atributos y objetos
        int x;
//        HashSetAlumn.Alumno alumno = new HashSetAlumn.Alumno();
        ListaAlumnos lista = new ListaAlumnos();

        Usuario usuario = new Usuario();
        
        do{
            lista.mostrarMenu();
            x = usuario.pedirOpcion();
            if(x!=6){
                lista.ejecutaOpcion(x);// añadir//borrar//listado
            }
        }while(x!=6);
        
        System.out.println("FIN ");
        
    }//fin main
}//fin clase

