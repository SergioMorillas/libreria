package matematica;

/**
 *
 * @author Sergio
 */
public class MatematicasSecundarias {

    /**
     * Comprueba si un número es primo.
     *
     * @param n El número a comprobar.
     * @return true si el número es primo, false si no lo es.
     */
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(n); i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calcula el factorial de un número.
     *
     * @param n El número para el que se desea calcular el factorial.
     * @return El factorial del número.
     */
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    /**
     * Calcula el máximo común divisor (MCD) de varios números enteros.
     *
     * @param numeros Los números enteros para calcular el MCD.
     * @return El MCD de los números proporcionados.
     * @throws IllegalArgumentException Si no se proporciona ningún número.
     */
    public static int calcularMCD(int... numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("Debe proporcionar al menos un número");
        }
        int mcd = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            mcd = calcularMCD(mcd, numeros[i]);
        }
        return mcd;
    }

    /**
     * Calcula el máximo común divisor (MCD) de dos números enteros utilizando
     * el algoritmo de Euclides.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El MCD de los dos números proporcionados.
     */
    private static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * Calcula el mínimo común múltiplo (MCM) de varios números enteros.
     *
     * @param numeros Los números enteros para calcular el MCM.
     * @return El MCM de los números proporcionados.
     * @throws IllegalArgumentException Si no se proporciona ningún número.
     */
    public static int calcularMCM(int... numeros) {
        if (numeros.length == 0) {
            throw new IllegalArgumentException("Debe proporcionar al menos un número");
        }
        int mcm = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            mcm = calcularMCM(mcm, numeros[i]);
        }
        return mcm;
    }

    /**
     * Calcula el mínimo común múltiplo (MCM) de dos números enteros utilizando
     * el algoritmo de Euclides.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El MCM de los dos números proporcionados.
     */
    private static int calcularMCM(int a, int b) {
        return (a * b) / calcularMCD(a, b);
    }
}
