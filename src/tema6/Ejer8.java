
//Realizar un método que reciba dos número N y M (entero positivo + 0). Rellene un
//
//String con 10 números aleatorios de una cifra y añada en el String de aleatorios N 
//
//asteriscos a partir de la posición M del String, retornando el resultado.

package tema6;



public class Ejer8 {
    
    public static void ejercicio8 (int n, int m){
        Aleatorio aleatorio1 = new Aleatorio(0, 9);
        StringBuilder destino= new StringBuilder("");
        StringBuilder aleatorio= new StringBuilder("");
        
        for (int i = 0; i < 10; i++) {
            aleatorio.append(aleatorio1.dameUnNumero());
        }
        
        //comprobamos entrada
        if(n<0 && m<0){
            System.out.println("No se permiten numeros negativos");
          
        }
        if(m>9){
             System.out.println("M no puede ser mayor de 9");
            
        }
        
        
        for(int i=0; i<10; i++){
            destino.append(aleatorio.charAt(i));
            if(i==m){
                for (int j = 0; j < n; j++) {
                         destino.append('*') ;
                    }
            }
        }
        System.out.println(destino);
    }
    
     
     public static void main(String[] args) {
         ejercicio8(3, 2);
         
    }
}
