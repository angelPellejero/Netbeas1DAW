// calcular tiempo que tarda nuestro metodo de ordenamiento de arrays en un array de 10000 posiciones y numeros entre (0-25000) y 
//compararlo con el tiempo que tarda el metodo de ordenamiento sort
package tema7;

import java.util.Arrays;

public class EjerProfe4 {
    public static void main(String[] args) {
        int array[]= new int[15];
        int array2[];
        utilidadesArray.Ejer1.rellenaVectorConRepes(array, 0, 15);
        array2=Arrays.copyOf(array, array.length);
        Cronometro.iniciar();
        utilidadesArray.Ejer1.ordenarArray(array);
        Cronometro.parar();
        Cronometro.total();
        
        System.out.println("Metodo sort el de abajo");
        Cronometro.iniciar();
        Arrays.sort(array);
        Cronometro.parar();
        Cronometro.total();
        
        
    }
}
