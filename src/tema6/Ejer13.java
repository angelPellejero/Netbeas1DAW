/*
13.Realiza una comprobación del rendimiento de las clases StringBuffer y 
StringBuilder para un programa en Java que concatene (método append) en una 
cadena inicialmente vacía un millón de string con la palabra “hola”. Calcula y 
muestra por pantalla cuando tardan ambas clases en realizar esa concatenación. 
NOTA: No es necesario sacar el resultado de la concatenación por pantalla.
y caclular elt tiempo que tarda

//usar nanoTime y currentTimeMillis
 */

package tema6;

/**
 *
 * @author Ángel
 */
public class Ejer13 {
     //atributo
    private static String hola = "hola";
    //metodo append para hacer un millon de holas
    public static void appendMillonHola(){
        //hacemos StringBuilder y StringBuffer
        StringBuilder sb1 = new StringBuilder();
        StringBuffer sbf1 = new StringBuffer();
        //variables locales
        long t1;
        long t2;
        long t3;
        
        t1 = System.currentTimeMillis();
        //recorremos con StringBuilder
        for(int i = 1; i< 1000001; i++){
            sb1.append(hola);     
        }
        
        t2 = System.currentTimeMillis();
        //recorremos con StringBuffer
        for(int i = 1; i< 1000001; i++){
            sbf1.append(hola);     
        }
        
        t3 = System.currentTimeMillis();
        //imprimimos
        System.out.println("Tiempo StringBuilder : " + (t2 - t1));
        System.out.println("Tiempo StringBuffer : " + (t3 - t2));      
    }//fin metodo
    //main
    public static void main(String[] args) {
        //creamos objeto
        Ejer13 cr = new Ejer13();
        ///llamamos metodo
        cr.appendMillonHola();
    }//fin main
}
