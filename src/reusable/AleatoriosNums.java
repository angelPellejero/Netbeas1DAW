
package reusable;

public class AleatoriosNums {
    
    
     public static int dameUnNumero( int fin, int inicio)  {       
           int aux;  
           aux = (int)Math.floor(Math.random()*(inicio-(fin+1))+(fin+1));
           return aux;
       }
   
}
