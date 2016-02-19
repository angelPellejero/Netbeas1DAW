//metodo que pida al usuario una cadena y calcule el numero de palabras que tiene 
//dicha cadena y tambien calcule y muestre por pantalla el numero de frases usando TOKEN.
package tema6_2;

import java.util.StringTokenizer;

public class TokenPalabFrases {
    public static void main(String[] args) {
        String cadena=" hola esto es una frase. para hacer una prueba.";
        String palabras = " ", frases=".";
        StringTokenizer stFrases = new StringTokenizer(cadena, frases);
        StringTokenizer stPalabras = new StringTokenizer(cadena, palabras);
        System.out.println("Numero de frases: "+stFrases.countTokens() );
        System.out.println("Numero de palabras: "+ stPalabras.countTokens());
    }
}
