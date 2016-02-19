/*
6. Realizar un nuevo método que dado dos Strings con números enteros y positivos,
retorne un String con una mezcla de la forma: el 1o de A, 1o de B, el 2o de A, el 2o 
de B etc. (suponemos que el tamaño de ambos es el mismo, aunque será 
necesario comprobarlo)
7. Idem a ejercicio 6 pero retorna: tres números de A, tres de B ... suponemos que el 
tamaño de ambos es múltiplo de tres y del mismo tamaño (comprobad)
EJEMPLO 1:
1ºSTRING: 111222333
2ºSTRING: 444555666
RESULTADO: 111444222555333666
//Pon primer String : 374625
//Pon segundo String : 543278
//Resultado: 374543746432
 */

package tema6;

import java.util.Scanner;

/**
 *
 * @author Ángel
 */
public class Ejer7 {
      //ATRIBUTOS
    private static String primerString;
    private static String segundoString;
    private static boolean comp = true;

    //metodo pedir datos
    public static void pedirDat() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Pon primer String : ");
        primerString = sc.nextLine();
        System.out.print("Pon segundo String : ");
        segundoString = sc.nextLine();

    }//fin metodo

    //metodo juntarStrings
    public static String juntar3() {
        //nueva variable local
        String stringJuntos = "";
        //creamos un objeto StringBuilder del primer string
        StringBuilder js = new StringBuilder();
        //recorremos
        for(int i = 0; i<primerString.length();i+=3) {
            //capturamos las 3 primeras posiciones(del 0 a 2)
            js.append(primerString.substring(i, i+3));
            js.append(segundoString.substring(i, i+3));
        } //fin for
         
        //pasamos a String la nueva variable
        stringJuntos = js.toString();
        //imprimimos     
        return stringJuntos;
    }//fin metodo

    //main
    public static void main(String[] args) {
        //creamos objeto
        Ejer7 pa = new Ejer7();
        pa.pedirDat();
        System.out.println("Resultado: " + pa.juntar3());
    }//fin main
}
