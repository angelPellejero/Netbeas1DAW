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
public class Triangulo extends Figura{
    private double a, b, c, h;

    public Triangulo(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    
    @Override
      public double calcularArea (){
        double area= (b*h)/2;
        return area;  
    }
    @Override
       public double calcularPerimetro (){
        double perimetro=a+b+c;
        return perimetro;
    }
}
