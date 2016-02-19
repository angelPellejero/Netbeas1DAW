//3. Realiza un método que recibe tres enteros negativos (por referencia) y los convierte en
//positivos dentro del método (usando el método abs de la clase Math). Mostrar en el main 
//el valor de los 3 enteros antes y después de llamar al método.

package tema6_2;

public class Ejer3 {
    private static Numeros negativos= new Numeros(-1, -2, -3);
    private static Numeros positivos= new Numeros();
    
   
    public static Numeros cambio (Numeros a){
     positivos.setN1(Math.abs(a.getN1()));
     positivos.setN2(Math.abs(a.getN2()));
     positivos.setN3(Math.abs(a.getN3()));      
     return positivos;   
    }
    
    public static void main(String[] args) {
        cambio(negativos);
        System.out.println(negativos.getN1()+" "+negativos.getN2()+" "+negativos.getN3()); 
        System.out.println(positivos.getN1()+" "+positivos.getN2()+" "+positivos.getN3()); 
    }
}
