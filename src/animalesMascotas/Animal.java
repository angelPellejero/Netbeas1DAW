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
public abstract class Animal {

    private String foto, tipo_comida, localizacion, tamaño;

    public Animal(String foto, String tipo_comida, String localizacion, String tamaño) {
        this.foto = foto;
        this.tipo_comida = tipo_comida;
        this.localizacion = localizacion;
        this.tamaño = tamaño;
    }

    public String getFoto() {
        return foto;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void dormir() {
        System.out.println("zzzzz");
    }

    public boolean equals(Object obj) {
        Animal aux = (Animal) obj;
       
        if (this.foto== aux.foto && this.tamaño==aux.tamaño && this.localizacion==aux.localizacion) {
            return true;
        }else{
          return false;
        }
    }

    @Override
    public String toString() {
        return "Animal{" + "foto=" + foto + ", tipo_comida=" + tipo_comida + ", localizacion=" + localizacion + ", tama\u00f1o=" + tamaño + '}';
    }

    
    public abstract String comer();

    public abstract String rugir();
}
