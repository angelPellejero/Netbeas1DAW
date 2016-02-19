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
public class Horas extends Empleado{

    private int numHoras;
    private final double precioHoras=7;

    public Horas(int numHoras, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.numHoras = numHoras;
    }
    
  
    @Override
    public  double calculaSueldo(){
        return (precioHoras*numHoras) + salario_minimo;
    }

    @Override
    public String toString() {
        return super.toString() + "numHoras=" + numHoras + ", precioHoras=" + precioHoras + '}';
    }

   

}
