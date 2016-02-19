//11.Realizar un método que recibe un String con números pares e impares de una cifra 
//y retorna dos Strings con los números pares por un lado y los impares por otro.
package tema6;

public class Ejer11 {

    private static Separador separador = new Separador();//objeto statico para ser usado desde cualquier metodo

// recibo un String, separo por par o impar y lo guardo en un objeto para devolver dos valores del metodo
    public static Separador reparto(String cadena) {
        StringBuilder cadenaPar = new StringBuilder("");
        StringBuilder cadenaImpar = new StringBuilder("");
        for (int i = 0; i < cadena.length(); i++) {

            if (Character.getNumericValue(cadena.charAt(i)) % 2 == 0) {
                cadenaPar.append(cadena.charAt(i));
            } else {
                cadenaImpar.append(cadena.charAt(i));
            }
        }
        separador.pares = cadenaPar.toString();
        separador.impares = cadenaImpar.toString();
        return separador;
    }

    //metodo main principal
    public static void main(String[] args) {
        String cadena = "123456789";
        reparto(cadena);
        System.out.println("Los pares: " + separador.pares);
        System.out.println("Los impares: " + separador.impares);
    }
}
