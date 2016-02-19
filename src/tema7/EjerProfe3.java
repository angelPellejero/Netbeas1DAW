//Mandar un array con numero aleatorios y devolver un array y otro ordenador usando
//los metodos Min y Max ya creados
package tema7;

public class EjerProfe3 {
    public static void main(String[] args) {
        int  vectorOrdenado[]= new int [4];
        utilidadesArray.Ejer1.rellenaVector(vectorOrdenado, 1, 123);
        System.out.println("Numeros sin ordenar: "+ utilidadesArray.Ejer1.toString(vectorOrdenado));
        System.out.println("Numeros ordenados:   " + utilidadesArray.Ejer1.toString(utilidadesArray.Ejer1.ordenarArray(vectorOrdenado)));    
    }
}
