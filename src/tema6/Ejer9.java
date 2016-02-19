//Realizar un método que reciba un número N (entero positivo + 0 entre 0 y 9) y
//retorne un String. El método rellenará inicialmente un String con números del 0 al 9. 
//Posteriormente recorrerá dicho String insertando el número N de forma ordenada 
//en el String y retornándolo.
package tema6;

public class Ejer9 {

    public static String ejercicio9(int n) {
        StringBuilder s1 = new StringBuilder("0123456789");
        StringBuilder s2 = new StringBuilder("");

        
        if (!(n > 0 || n >= 9)) {
            System.out.println("El numero no es valido");
            return null;
        }

        for (int i = 0; i < s1.length(); i++) {
            s2.append(s1.charAt(i));
            if(n==Character.getNumericValue(s1.charAt(i))){
                s2.append(n);
            }
        }
        return s2.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(ejercicio9(7)); 
    }
}
