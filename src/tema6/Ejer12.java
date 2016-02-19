//12.Realizar un método que recibe dos String con números de una cifra ordenados y 
//retorna un String con la fusión de ambos String recibidos también ordenados
//ejemplo a="12549"  b="2487955".
package tema6;

public class Ejer12 {

    // fusiona las cadenas por orden de valor
    public static String fusion(String c1, String c2) {
        StringBuilder sb = new StringBuilder("");
        int longitud, cad1 = 0, cad2 = 0;// cad es la cuenta de las posiciones de los strings

        longitud = c1.length() + c2.length();//suma de la distancia de las 2 cadenas

        for (int i = 0; i < longitud; i++) {// recorre los string con todas las posibles comparaciones
            
            if (c1.charAt(cad1) < c2.charAt(cad2)) {
                if (cad1 < c1.length()) {
                    sb.append(c1.charAt(cad1));
                    cad1++;
                    if(cad1==c1.length()){//dice que cuando este strig llega a su fin añade el restante de la otra cadena y sale
                        sb.append(c2.substring(cad2));
                        break;
                    }
                }
            } else {
                if (cad2 < c2.length()) {// esto seria como lo de arriba
                    sb.append(c2.charAt(cad2));
                    cad2++;
                     if(cad2==c2.length()){
                        sb.append(c1.substring(cad1));
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String c1 = "0278", c2 = "123579";
        System.out.println(fusion(c1, c2));
    }
}
