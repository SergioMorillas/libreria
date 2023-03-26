package arrays;

import java.util.*;


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

    
    /**
     * Devuelve la suma de los elementos de un arreglo dado.
     *
     * @param array el arreglo del cual obtener la suma de elementos
     * @return la suma de los elementos del arreglo
     */
    public static double sumaElementosArray(double[] array) {
        double sum = 0.0;
        for (double d : array) {
            sum += d;
        }
        return sum;
    }

    /**
     * Devuelve el elemento máximo de un arreglo dado.
     *
     * @param array el arreglo del cual obtener el elemento máximo
     * @return el elemento máximo del arreglo
     */
    public static double maxElementoArray(double[] array) {
        double max = array[0];
        for (double d : array) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    /**
     * Devuelve el elemento mínimo de un array de números.
     *
     * @param array el array de números del que se desea obtener el mínimo
     * @return el elemento mínimo del array
     */
    public static double minElementoArray(double[] array) {
        double min = array[0];
        for (double d : array) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    /**
     * Ordena un array de números en orden descendente.
     *
     * @param array el array de números que se desea ordenar
     */
    public static void ordenaArrayDescendente(double[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    /**
     * Devuelve la mediana de un array de números.
     *
     * @param array el array de números del que se desea obtener la mediana
     * @return la mediana del array
     */
    public static double medianaDeArray(double[] array) {
        double median = 0.0;
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            median = (array[array.length / 2] + array[array.length / 2 - 1]) / 2.0;
        } else {
            median = array[array.length / 2];
        }
        return median;
    }

    /**
     * Cuenta el número de elementos distintos en un array de números.
     *
     * @param array el array de números del que se desea contar los elementos
     * distintos
     * @return el número de elementos distintos en el array
     */
    public static int cuentaElementosDistintos(double[] array) {
        Set<Double> set = new HashSet<>();
        for (double d : array) {
            set.add(d);
        }
        return set.size();
    }

    /**
     * Elimina los elementos duplicados de un array de números y devuelve el
     * resultado.
     *
     * @param array el array de números del que se desea eliminar los duplicados
     * @return un nuevo array que contiene los elementos únicos del array
     * original
     */
    public static double[] quitaDuplicadosArray(double[] array) {
        Set<Double> set = new LinkedHashSet<>();
        for (double d : array) {
            set.add(d);
        }
        double[] result = new double[set.size()];
        int i = 0;
        for (double d : set) {
            result[i++] = d;
        }
        return result;
    }

    /**
     * Combina dos arrays de números en uno solo.
     *
     * @param array1 el primer array de números a combinar
     * @param array2 el segundo array de números a combinar
     * @return un nuevo array que contiene los elementos de ambos arrays
     */
    public static double[] juntaArrays(double[] array1, double[] array2) {
        double[] result = new double[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }

    /**
     * Convierte un array en una lista.
     *
     * @param <T>
     * @param array el array que se desea convertir en una lista
     * @return una lista que contiene los elementos del array
     */
    public static <T> List<T> arrayALista(T[] array) {
        return Arrays.asList(array);
    }
    
}
