/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author VESPERTINO
 */
public class Cuadrado extends Figura{
    private double b, a;

    public Cuadrado(double b, double a) {
        this.b = b;
        this.a = a;
    }

       @Override
      public double calcularArea (){
        double area= a*a;
        return area;  
    }
    @Override
       public double calcularPerimetro (){
        double perimetro=4*a;
        return perimetro;
    }
}
