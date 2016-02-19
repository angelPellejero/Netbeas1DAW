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
public class Perro  extends Canino implements Mascota{

    public Perro(String foto, String tipo_comida, String localizacion, String tamaño) {
        super(foto, tipo_comida, localizacion, tamaño);
    }
    @Override
     public boolean equals(Object obj) {
        Perro aux2 = (Perro) obj;

        if (super.equals(aux2)== true && hacerRuido()== aux2.hacerRuido()){
            return true;
        }else{
        return false;
        }
    }

    @Override
    public boolean hacerRuido() {
       return true;    
    }

    @Override
    public String comer() {
       return " Estoy Comiendo como un perro";
    }

    @Override
    public String rugir() {
        return " Estoy rugiendo como un perro";
    }

    @Override
    public String toString() {
        return super.toString()+ this.rugir()+ " "+ this.comer();
    }

    @Override
    public String jugar() {
        return" El perro esta jugando";
    }

    @Override
    public String vacunar() {
       return " EL perro esta siendo vacubnado";
    }
    
}
