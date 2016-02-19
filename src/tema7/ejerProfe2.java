//array tamaño 6,  con 6 numeros de la primitiva entre [1-49] Dentro del array no puede tener numeros repetidos,
//posteriormete pedir 6 numeros al usuario diferentes y posteriormente 
//el programa dira cuantos numeros ha acertado el usuario
package tema7;




public class ejerProfe2 {
    public static void main(String[] args) { 
        int vector[],numerosUser[];
        vector = new int[6];
        numerosUser= new int[6];
        utilidadesArray.Ejer1.rellenaVector(vector, 0, 7);// asi me saca num entre (1-6)
        System.out.println("El string: " + utilidadesArray.Ejer1.toString(vector));
        utilidadesArray.Ejer1.usuarioRellenaArray(numerosUser);
        System.out.println("Tu numero de aciertos es: "+ utilidadesArray.Ejer1.coincidenciasEnDosArrays(numerosUser, vector) );
    } 
}
