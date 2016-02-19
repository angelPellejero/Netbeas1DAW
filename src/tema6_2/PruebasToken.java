package tema6_2;

import java.util.StringTokenizer;

public class PruebasToken {

    public static void main(String[] args) {
        String a = "12:10:35";
        String delimitador = ":";
        StringTokenizer st = new StringTokenizer(a, delimitador, true);// true cuenta el delimitador y si es false no
    
        System.out.println("Tokes num: "+ st.countTokens());
        
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
