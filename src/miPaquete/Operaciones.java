
package miPaquete;

/**
 * @author  Ángel Pellejero
 * @version 8 Marca la version sobre la que trabajamos
 * @since   JDK1.0 Marca la version desde cual se puede utilziar la clase
 * @serial Dice que esta clase es serializable
 * @deprecated Dice que este metodo esta desfasado y debe ir seguido de espacio o nueva linea y etiqueta see
 * @see java.lang esta etiqueta mostrara algo mas que pueda funcionar similar a esto como un enlace
 * param no puede ser usado en una clase
*/
public class Operaciones {
    /**
     * @serialField  a  int  es una atributo de la clase
     * @serialField  b  int  es una atributo de la clase
     */
    private int a, b;
    private static final double SMI = 5322.234;

    public Operaciones() {
    }

    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }
/**
 * @return  El valor de la suma de dos varibles int
 * @see   java.lang.Integer#MAX_VALUE
 * @param suma la suma de dos variavles de tipo int
 */
    public int calculaSuma() {
        return a + b;
    }
/**
 * @return  El valor de la resta de dos varibles int
 * @see   java.lang.Integer#MIM_VALUE
*/
    public int calculaResta() {
        return a - b;
    }
/**
 * @param c es la variable de entrada tipo int
 * @return  El valor de la multiplicacion de tres varibles int
 */
    public int multiplicaNumero(int c) {
        return a * b * c;
    }
}
