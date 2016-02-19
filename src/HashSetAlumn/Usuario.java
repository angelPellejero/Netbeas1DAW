
package HashSetAlumn;

import java.util.Scanner;

public class Usuario {
    //atributos y objetos
    Scanner sc;
   
    public Usuario(){
        sc= new Scanner(System.in);
    }
    
    //metodo pedir opcion o numero de opcion
    public int pedirOpcion(){
        int numero;
        System.out.println("Pulsa el numero del menu que quieras ejecutar ");
        numero = sc.nextInt();
        return numero;
    }//fin metodo
    
}
