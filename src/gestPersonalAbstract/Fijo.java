/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestPersonalAbstract;

import java.util.Calendar;

/**
 *
 * @author Ángel
 */
public class Fijo extends Empleado{

    
    private int anoAlta;
    private int year = Calendar.getInstance().get(Calendar.YEAR);
    
    public Fijo(String nombre, String nif, int edad, int anoAlta) {
        super(nombre, nif, edad);
        this.anoAlta = anoAlta;
    }

    @Override
    public double calculaSueldo() {
        return (50 *(year-anoAlta))+ salario_minimo;
    }

    @Override
    public String toString() {
        return super.toString() + "Año de alta"+ anoAlta;
    }
    
}
