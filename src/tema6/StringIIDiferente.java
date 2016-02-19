/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6;

/**
 *
 * @author VESPERTINO
 */
public class StringIIDiferente {

    public static String reverse(String s) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            a = s.charAt(i) + a;
        }
        return a;
    }

    public static boolean palidromoDos(String cadena) {
        String c1, c2;
        int indiceMitad = (cadena.length() / 2);
        c1 = cadena.substring(0, indiceMitad);
        if (cadena.length() % 2 == 0) {
            c2 = cadena.substring(indiceMitad, cadena.length());
        } else {
            c2 = cadena.substring(indiceMitad + 1, cadena.length());
        }
        c2 = reverse(c2);
        return c1.equals(c2);
    }

    public static String contraseña(String a) {
        String pwd;
        pwd = a.replace('a', '@');
        pwd = pwd.replace('e', '3');
        pwd = pwd.replace('i', '1');
        pwd = pwd.replace('o', '0');
        pwd = pwd.replace("u", "\\/");
        return pwd;
    }

    public static String orden(String a) {
        int longitud = a.length() - 1;
        StringBuffer aux = new StringBuffer();
        for (int c = 0; c < longitud; c++, longitud--) {
            aux.append(a.charAt(c));
            aux.append(a.charAt(longitud));
        }
        return aux.toString();
    }

    public static String ejercicio6(String s1, String s2) {
        StringBuilder sb = new StringBuilder("");

// Comprobar que el tamaño de las dos cadenas es el mismo
        if (s1.length() != s2.length()) {
            System.out.println("El tamaño debe ser el mismo");
            return null;
        }
// Comprobar que las cadenas tiernen enteros + 0
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < '0' || s1.charAt(i) > '9' || s2.charAt(i) < '0' || s2.charAt(i) > '9') {
                System.out.println("Las cadenas deben tener numeros enteros + o 0");
                return null;
            }
        }
// Hacer la mezcla
        for (int i = 0; i < s1.length(); i++) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        return sb.toString();

    }
    //Dado dos strings devuelve tres numeros de cada uno
    public static String ejercicio7(String s1, String s2) {
        StringBuilder sb = new StringBuilder("");
        if (s1.length() != s2.length()) {
            System.out.println("El tamaño es diferente");
            return null;
        }
        if (s1.length() % 3 != 0) {
            System.out.println("El tamaño de la cadena no es multiplo de 3");
            return null;
        }
        for (int i = 0; i < 3; i++) {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        return sb.toString();
    }
}
