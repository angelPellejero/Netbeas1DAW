//4. Realizar un método que recibe un String con 10 números aleatorios entre 0 y 9, y 
//calcula y retorna la suma y la media de esos 10 números.

package tema6_2;

import reusable.AleatoriosNums;

public class Ejer4 {
    
    private static SumMed rep = new SumMed();
 
    public static String cadenaAleatorios (){
        StringBuilder cadena= new StringBuilder("");
        for (int i = 0; i < 3; i++) {
            cadena.append(Integer.toString(AleatoriosNums.dameUnNumero(0, 9)));
        }
        return cadena.toString();
    }
    
    public static SumMed reparto(String a ){
        int aux, suma=0, media=0, contador=0;
        for (int i = 0; i <a.length(); i++) {
          aux=Character.getNumericValue(a.charAt(i));
          suma=suma+aux;
          contador++;
        }
        media=suma/contador;
        rep.setSuma(suma);
        rep.setMedia(media);
        return rep;
    }
    
    public static void main(String[] args) {
        String a=cadenaAleatorios();
        System.out.println("Esta es la cadena: "+ a);
        reparto(a);
        System.out.println("La suma de la secuencia "+ rep.getSuma());
        System.out.println("La media de la secuencia "+ rep.getMedia());
    }
}
