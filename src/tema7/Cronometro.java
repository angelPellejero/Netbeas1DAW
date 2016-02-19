//Clase para calculas tiempos de ejecucion
package tema7;


public class Cronometro {
    private static long time_start, time_end;
    
    public static void iniciar(){
       time_start = System.currentTimeMillis(); 
    }
     public static void parar(){
       time_end = System.currentTimeMillis(); 
    }
     
     public static void total(){
       System.out.println("the task has taken "+ ( time_end - time_start ) +" milliseconds"); 
    }

}

