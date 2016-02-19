/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalesMascotas;

/**
 *
 * @author Ángel
 */
public abstract class Canino extends Animal{

    public Canino(String foto, String tipo_comida, String localizacion, String tamaño) {
        super(foto, tipo_comida, localizacion, tamaño);
    }
    
    public abstract boolean hacerRuido();
}
