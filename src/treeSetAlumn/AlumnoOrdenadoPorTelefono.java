/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeSetAlumn;

import java.util.Comparator;

/**
 *
 * @author VESPERTINO
 */
public class AlumnoOrdenadoPorTelefono implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno)o1;
        Alumno a2 = (Alumno)o2;
        int aux= (int)(a2.getTelefono()- a1.getTelefono());
        return aux;
    }
    
}
