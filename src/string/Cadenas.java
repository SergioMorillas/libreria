package string;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Cadenas {

    /**
     *
     * Función que devuelve un valor verdadero si la primera cadena es más corta
     * que la segunda.
     *
     * @param palabra1 La primera cadena a comparar.
     * @param palabra2 La segunda cadena a comparar.
     * @return True si la primera cadena es más corta que la segunda, False en
     * caso contrario.
     */
    public static boolean esMasCorta(String palabra1, String palabra2) {
        return palabra1.length() < palabra2.length();
    }

    /**
     *
     * Función que devuelve la cadena introducida sin vocales.
     *
     * @param cadena La cadena a modificar.
     *
     * @return La cadena introducida sin vocales.
     */
    public static String cadenaSinVocales(String cadena) {

        StringBuilder sb = new StringBuilder();
        char caracter;
        String vocales = "[aeiouáéíóúÁÉÍÓÚAEIOU]";

        for (int cont = 0; cont < cadena.length(); cont++) {
            caracter = cadena.charAt(cont);

            if (!Pattern.matches(vocales, caracter + "")) {
                sb.append(caracter);
            }

        }
        return sb.toString();
    }

    /**
     *
     * Función que devuelve la cadena introducida sin espacios.
     *
     * @param cadena La cadena a modificar.
     *
     * @return La cadena introducida sin espacios.
     */
    public static String cadenaSinEspacios(String cadena) {

        StringBuilder sb = new StringBuilder();
        char caracter;

        for (int cont = 0; cont < cadena.length(); cont++) {
            caracter = cadena.charAt(cont);

            if (caracter != ' ') {
                sb.append(caracter);
            }
        }
        return sb.toString();
    }

    /**
     *
     * Función que devuelve la cadena introducida sin caracteres especiales.
     *
     * @param cadena La cadena a modificar.
     *
     * @return La cadena introducida sin caracteres especiales.
     */
    public static String cadenaSinSimbolos(String cadena) {

        StringBuilder sb = new StringBuilder();
        char caracter;
        String simbolos = "[,.-;!¡=?¿/()]";

        for (int cont = 0; cont < cadena.length(); cont++) {
            caracter = cadena.charAt(cont);

            if (!Pattern.matches(simbolos, caracter + "")) {
                sb.append(caracter);
            }

        }
        return sb.toString();
    }

    /**
     *
     * Función que devuelve la cadena introducida invertida.
     *
     * @param cadena La cadena a invertir.
     *
     * @return La cadena introducida invertida.
     */
    public static String cadenaInvertida(String cadena) {
        StringBuilder inversa = new StringBuilder();

        for (int cont = (cadena.length() - 1); cont >= 0; cont--) {
            inversa.append(cadena.charAt(cont));
        }

        return inversa.toString();
    }

    /**
     *
     * Función que devuelve el número de espacios en una cadena.
     *
     * @param cadena La cadena a analizar.
     *
     * @return El número de espacios en la cadena.
     */
    public static int cuentaEspacios(String cadena) {
        int numEspacios = 0;

        for (int cont = 0; cont < cadena.length(); cont++) {
            if (cadena.charAt(cont) == ' ') {
                numEspacios++;
            }

        }
        return numEspacios;
    }

    /**
     *
     * Función que devuelve un valor verdadero si la cadena introducida es un
     * palíndromo.
     *
     * @param cadena La cadena a analizar.
     * @return True si la cadena introducida es un palíndromo, False en caso
     * contrario.
     */
    public static boolean esPalindromo(String cadena) {

        boolean palindromo = true;
        String cadena2 = Cadenas.cadenaSinEspacios(cadena.toLowerCase());

        int longCadena2 = cadena2.length();

        for (int cont = 0, cont2 = longCadena2 - 1; cont < longCadena2
                && palindromo == true; cont++, cont2--) {

            if (cadena2.charAt(cont) != cadena2.charAt(cont2)) {
                palindromo = false;
            }
        }

        return palindromo;

    }

    /**
     *
     * Esta función recibe una cadena de texto y un delimitador, y devuelve un
     * arreglo de números de tipo double. La cadena de texto es separada en
     * elementos utilizando el delimitador proporcionado. Los elementos se
     * convierten de tipo String a tipo double y son almacenados en el arreglo
     * que será devuelto.
     *
     * @param cadena la cadena de texto que se desea convertir en arreglo de
     * double
     * @param delim el delimitador que se utilizará para separar los elementos
     * de la cadena
     * @return un arreglo de double que contiene los elementos de la cadena
     * convertidos a este tipo de dato
     */
    public static double[] rellenaDatos(String cadena, String delim) {

        StringTokenizer tokens = new StringTokenizer(cadena, delim);
        int nDatos = tokens.countTokens();
        double[] datos = new double[nDatos];

        int i = 0;
        while (tokens.hasMoreTokens()) {

            String elemento = tokens.nextToken();
            datos[i] = Double.parseDouble(elemento);
            i++;
        }
        return datos;
    }

    /**
     *
     * Método para comparar dos strings en función del número de vocales que
     * contienen. El comparador es descendente, es decir, las palabras con mayor
     * número de vocales se sitúan antes.
     *
     * @param o1 el primer string a comparar
     * @param o2 el segundo string a comparar
     * @return un número entero que indica si el primer string es mayor, menor o
     * igual al segundo string.
     */
    private int cuentaVocales(String palabra) {
        int cont = 0;
        for (int i = 0; i < palabra.length(); i++) {
            palabra = palabra.toLowerCase();
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                cont++;
            }
        }
        return cont;
    }

}
