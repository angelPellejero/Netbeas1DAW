/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestPersonalAbstract;

/**
 *
 * @author Ángel
 */
public abstract class Empleado {
    
    static final double salario_minimo=645;
    private String nombre, nif;
    private int edad;

    public Empleado(String nombre, String nif, int edad) {
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }
    
    public abstract double calculaSueldo();

    @Override
    public String toString() {
        return  "nombre=" + nombre + ", nif=" + nif + ", edad=" + edad + '}';
    }

 
     
}
