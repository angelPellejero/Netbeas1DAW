/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestPersonalAbstract;

import java.util.GregorianCalendar;

/**
 *
 * @author Ángel
 */
public class Temporal extends Empleado{

    private GregorianCalendar fechaA, fechaB;
  

    public Temporal(String nif, String nombre, int edad, int Y1, int M1, int D1, int Y2, int M2, int D2) {
        super(nombre, nif, edad);
        this.fechaA = new GregorianCalendar(Y1, M1, D1);
        this.fechaB = new GregorianCalendar(Y2, M2, D2);
    }
    
    @Override
    public  double calculaSueldo(){
     return salario_minimo;   
    }

    @Override
    public String toString() {
        return super.toString()+ "fechaA=" + fechaA + ", fechaB=" + fechaB ;
    }

}