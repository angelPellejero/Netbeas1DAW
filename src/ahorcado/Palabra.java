/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author VESPERTINO
 */
public class Palabra {

    private String palabraScondida, palabraMostrar;
    StringBuilder sb;

    //Constructor
    public Palabra(String palabraScondida) {
        sb = new StringBuilder("");
        this.palabraScondida = palabraScondida;//inicializa la  palabra escondida con la plabra enviada
        for (int i = 0; i < palabraScondida.length(); i++) {
            sb.append("-"); //inicializa la palabra a mostrar con la cantidad de guiones que letras tiene palabra escondida
        }
        palabraMostrar = sb.toString();
    }

    //metodo
    public void mostrarPalabraOculta() {
        for (int i = 0; i < palabraMostrar.length(); i++) {
            System.out.print(palabraMostrar.charAt(i) + " ");// esto es solo para mostrarlo bonito con espacios
        }
    }

    //comprobar que la palabra enviada sea acerta o erronea
    public boolean comprueba(String v) {
        boolean estaLetra = false, acertada = false;
        for (int i = 0; i < palabraScondida.length(); i++) {
            if (palabraScondida.charAt(i) == v.charAt(0)) {
                estaLetra = true;
                sb.replace(i, i + 1, v);// cambia el '_' por la letra enviada
                palabraMostrar = null;//lo pongo a null como para limpar el contenido y asi poder cambiarlo
                palabraMostrar = sb.toString();
                acertada = true;// por si alguna letra esta repetida es necesario esto  para que muestre todas y no descuentes vidas
            } else if (acertada != true) {

                estaLetra = false;
            }
        }
        return estaLetra;
    }

    public boolean noEstaCompleta() {// metodo para saber si la palabra esta correcta o no
        if (palabraMostrar.equals(palabraScondida)) {
            return true;
        } else {
            return false;
        }
    }

}
