/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Ángel
 */
public class Run {

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4, 5, 6);
        Matematico matematico = new Matematico();
        System.out.println("Area del triangulo: " + matematico.averiguaArea(triangulo));
        System.out.println("Perimetro del triangulo: " + matematico.averiguaPerimetro(triangulo));

        Cuadrado cuadrado = new Cuadrado(10, 10);
        System.out.println("Area del cuadrado: "+ matematico.averiguaArea(cuadrado));
        System.out.println("Perimetro del cuadrado: "+ matematico.averiguaPerimetro(cuadrado));
        
        Circulo circulo = new Circulo(3.13);
        System.out.println("Area del circulo: "+ matematico.averiguaArea(circulo));
        System.out.println("Perimetro del circulo: "+ matematico.averiguaPerimetro(circulo));
        
    }
}
