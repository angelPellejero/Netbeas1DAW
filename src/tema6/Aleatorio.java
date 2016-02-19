/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 * Propiedades inicial y fin tipo entero
 * Crear una clase llamada aleatorios
 * Constructor [inicial y fin]
 * Metodo muestra aleatorios que reciba un entero N indincando la cantidad de numeros y calcule y muestre por panntal N numeros entre [inicial y final]
 * 
 * @author VESPERTINO
 */
public class Aleatorio {
    //Atributos
     private int inicio, fin;
      //Constructores

       public  Aleatorio (int a, int b){
        inicio = a;
        fin = b;
    }
       public void getNumeros(int n){
           int aux;
           for(aux=0; n>0; n--){
           aux = (int)Math.floor(Math.random()*(fin-inicio+1)+inicio);
               System.out.println(aux);
           }
       }
       
       
       public int dameUnNumero()  {
           int aux;  
           aux = (int)Math.floor(Math.random()*(fin-inicio+1)+inicio);
           return aux;
       }
}
