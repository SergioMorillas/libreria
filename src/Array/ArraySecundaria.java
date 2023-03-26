package Array;

import java.util.Scanner;

/**
 *
 * @author Sergio Morillas Carmona
 */
public class ArraySecundaria {

    /**
     *
     * Muestra los elementos de un array de floats en la consola.
     *
     * @param v el array de floats a mostrar
     */
    public static void showArray(float[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);

        }
    }

    /**
     *
     * Muestra los elementos de un array de enteros en la consola.
     *
     * @param v el array de enteros a mostrar
     */
    public static void showArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);

        }
    }

    /**
     *
     * Muestra los elementos de un array de enteros distintos de cero en la
     * consola.
     *
     * @param v el array de enteros a mostrar sin ceros
     */
    public static void showArraySinCeros(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                System.out.println(v[i]);

            }
        }
    }

    /**
     *
     * Muestra los elementos de un array de enteros mayores que cero en la
     * consola.
     *
     * @param v el array de enteros a mostrar sin negativos
     */
    public static void showArraySinNegativos(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] > 0) {
                System.out.println(v[i]);
            }
        }
    }

    /**
     *
     * Muestra los elementos de un array de enteros en orden inverso en la
     * consola.
     *
     * @param v el array de enteros a mostrar en orden inverso
     */
    public static void showArrayInverso(int[] v) {
        for (int i = v.length - 1; i > -1; i--) {
            System.out.println(v[i]);

        }
    }

    /**
     *
     * Muestra los elementos de un array de doubles en la consola.
     *
     * @param v el array de doubles a mostrar
     */
    public static void showArray(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);

        }
    }

    /**
     *
     * Rellena un array de floats con valores introducidos por el usuario desde
     * la consola.
     *
     * @param v el array de floats a rellenar
     */
    public static void rellenaVector(float[] v) {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduzca numero" + (i + 1) + ":");
            v[i] = t.nextFloat();
        }
    }

    /**
     *
     * Este método permite rellenar un vector de enteros con valores ingresados
     * por el usuario.
     *
     * @param v el vector a rellenar.
     */
    public static void rellenaVector(int[] v) {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduzca numero" + (i + 1) + ":");
            v[i] = t.nextInt();
        }
    }

    /**
     *
     * Este método permite rellenar un vector de dobles con valores ingresados
     * por el usuario.
     *
     * @param v el vector a rellenar.
     */
    public static void rellenaVector(double[] v) {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduzca numero" + (i + 1) + ":");
            v[i] = t.nextDouble();
        }

    }

    /**
     *
     * Este método calcula la media de los números positivos de un vector de
     * enteros.
     *
     * @param v el vector a procesar.
     * @return la media de los números positivos del vector.
     */
    public static float MediaPositivos(int[] v) {
        int sum = 0, cont = 0;
        float media;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > 0) {
                sum += v[i];
                cont++;
            }
        }
        media = sum / cont++;
        return media;
    }

    /**
     *
     * Este método calcula la media de los números negativos de un vector de
     * enteros.
     *
     * @param v el vector a procesar.
     * @return la media de los números negativos del vector.
     */
    public static float MediaNegativos(int[] v) {
        int sum = 0, cont = 0;
        float media;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < 0) {
                sum += v[i];
                cont++;
            }
        }
        media = sum / cont;
        return media;
    }

    /**
     *
     * Este método cuenta el número de ceros en un vector de enteros.
     *
     * @param v el vector a procesar.
     * @return el número de ceros en el vector.
     */
    public static int NumeroCeros(int[] v) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) {
                cont++;
            }
        }
        return cont;
    }

    /**
     *
     * Este método muestra los elementos de un arreglo multidimensional de
     * enteros de cuatro dimensiones.
     *
     * @param numeros el arreglo a mostrar.
     */
    public static void verArrays(int[][][][] numeros) {
        for (int[][][] aux : numeros) {
            for (int[][] aux2 : aux) {
                for (int[] aux3 : aux2) {
                    for (int aux4 : aux3) {
                        System.out.println(aux4);
                    }
                }
            }
        }
    }

    /**
     *
     * Este método muestra los elementos de un arreglo multidimensional de
     * enteros de tres dimensiones.
     *
     * @param numeros el arreglo a mostrar.
     */
    public static void verArrays(int[][][] numeros) {
        for (int[][] aux : numeros) {
            for (int[] aux2 : aux) {
                for (int aux3 : aux2) {
                    System.out.print(aux3);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    /**
     *
     * Método para mostrar por consola un array bidimensional de números
     * enteros.
     *
     * @param numeros el array bidimensional de números enteros a mostrar
     */
    public static void verArrays(int[][] numeros) {

        for (int[] aux : numeros) {

            for (int aux2 : aux) {

                System.out.print(aux2);

            }
            System.out.println("");
        }
    }

    /**
     *
     * Método para mostrar por consola un array bidimensional de caracteres.
     *
     * @param numeros el array bidimensional de caracteres a mostrar
     */
    public static void verArrays(char[][] numeros) {

        for (char[] aux : numeros) {

            for (char aux2 : aux) {

                System.out.print(aux2);

            }
            System.out.println("");
        }
    }

    /**
     *
     * Método para mostrar por consola un array unidimensional de números
     * enteros.
     *
     * @param numeros el array unidimensional de números enteros a mostrar
     */
    public static void verArrays(int[] numeros) {

        for (int aux : numeros) {

            System.out.println(aux);

        }
    }

}
