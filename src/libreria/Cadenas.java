package libreria;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Cadenas {
    
    //FUNCION QUE DEVUELVE UN VALOR VERDADERO SI EL PRIMER PARÁMETRO (STRING) ES MÁS CORTO QUE EL SEGUNDO
    public static boolean esMasCorta (String palabra1, String palabra2) {
        
        if (palabra1.length() < palabra2.length()){
            return true;
        }
        else {
            return false;
        }
    }
  
    //FUNCION QUE DEVUELVE LA CADENA INTRODUCIDA SIN VOCALES
    public static String cadenaSinVocales (String cadena) {
        
        StringBuilder sb = new StringBuilder();
        char caracter;
        String vocales = "[aeiouáéíóúÁÉÍÓÚAEIOU]";
                       
        for(int cont = 0; cont < cadena.length(); cont++) {
            caracter = cadena.charAt(cont);
            
            if(!Pattern.matches(vocales,caracter+"")){
                sb.append(caracter); 
            }
                 
        }
        return sb.toString();
    }
    
    //FUNCION QUE DEVUELVE LA CADENA INTRODUCIDA SIN ESPACIOS
    public static String cadenaSinEspacios (String cadena) {
        
        StringBuilder sb = new StringBuilder();
        char caracter;
                    
        for(int cont = 0; cont < cadena.length(); cont++) {
            caracter = cadena.charAt(cont);
            
            if(caracter != ' ')
                sb.append(caracter);  
        }
        return sb.toString();        
    }
    
    //FUNCION QUE DEVUELVE LA CADENA INTRODUCIDA SIN CARÁCTERES ESPECIALES
    public static String cadenaSinSimbolos (String cadena) {
        
        StringBuilder sb = new StringBuilder();
        char caracter;
        String simbolos = "[,.-;!¡=?¿/()]";
                       
        for(int cont = 0; cont < cadena.length(); cont++) {
            caracter = cadena.charAt(cont);
            
            if(!Pattern.matches(simbolos,caracter+"")){
                sb.append(caracter); 
            }
                 
        }
        return sb.toString();
    }

    //FUNCION QUE DEVUELVE LA CADENA INTRODUCIDA INVERTIDA
    public static String cadenaInvertida (String cadena) {
    StringBuilder inversa = new StringBuilder();
      
    for (int cont = (cadena.length() - 1); cont >=0; cont--) {
          inversa.append(cadena.charAt(cont));                    
    }
    
    return inversa.toString();
  }
    
    //FUNCION QUE DEVUELVE EL NÚMERO DE ESPACIOS
    public static int cuentaEspacios (String cadena) {
        int numEspacios = 0;
       
        for (int cont = 0; cont < cadena.length(); cont++) {
            if (cadena.charAt(cont) == ' ')
                numEspacios++;
            
        }
        return numEspacios;
    }
    
    //FUNCION QUE DEVUELVE UN VALOR VERDADERO SI LA CADENA INTRODUCIDA ES UN PALÍNDROMO
    public static boolean esPalindromo (String cadena) {
        
        boolean palindromo = true;
        StringBuilder cadena2 = new StringBuilder(Cadenas.cadenaSinEspacios(cadena.toLowerCase()));
        
        int longCadena2 = cadena2.length();
                       
        for (int cont = 0, cont2 = longCadena2 - 1;cont < longCadena2 && 
                palindromo == true;  cont++, cont2--) {
            
            if (cadena2.charAt(cont) != cadena2.charAt(cont2))
                palindromo = false;
        }
        
        return palindromo;
        
    }

    //FUNCION QUE RELLENA UN ARRAY DE DOUBLES CON LOS ELEMENTOS DE UNA CADENA SEPARADA POR UN DELIMITADOR
    public static double[] rellenaDatos (String cadena, String delim) {        
         
	StringTokenizer tokens=new StringTokenizer(cadena, delim);
        int nDatos = tokens.countTokens();
        double[] datos=new double[nDatos];
        
        int i = 0;
        while(tokens.hasMoreTokens()){
            
            String elemento = tokens.nextToken();
            datos[i]=Double.valueOf(elemento).doubleValue();
            i++;
        }
        return datos;
    }
}
