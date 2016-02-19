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
public class Matematico {
    
       // Metodo POLIMORFICO
    public double averiguaPerimetro(Figura figura){
        return figura.calcularPerimetro();
    }
    // Metodo POLIMORFICO
    public double averiguaArea(Figura figura){
        return figura.calcularArea();
    }
}
