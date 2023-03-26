package libreria;

import static java.lang.Integer.MAX_VALUE;

public class Array {

    /**
     * Funcion que recibe una cadena, un delimitador y devuelve un array con de
     * ints con los valores de la cadena separados
     *
     * @param cadena Cadena con valores numericos separados con un separador 'x'
     * @param delim Separador utilizado en la cadena
     * @return array Array de valores enteros que será devuelto
     */
    public static int[] rellenaArrayEnteros(String cadena, String delim) {
        int[] array;
        String[] aux = cadena.split(delim);
        array = new int[aux.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(aux[i]);
        }
        return array;
    }

    /**
     * Funcion que unifica dos arrays de enteros previamente ordenados y lo
     * devuelve
     *
     * @param array1 Primer array a fusionar
     * @param array2 Segundo array a fusionar
     * @return Array ordenado y con los valores de los dos arrays anteriores
     */
    public static int[] fusionaArraysOrdenados(int[] array1, int[] array2) {

        //Contadores individuales de cada array
        int cont1 = 0, cont2 = 0;

        int[] aux1 = array1;
        int[] aux2 = array2;

        //Declaramos el nuevo array con el tamaño de los dos arrays a fusionar
        int[] arrayFusion = new int[array1.length + array2.length];

        //Fusionamos los Arrays en orden
        for (int i = 0; i < arrayFusion.length; i++) {
            if (aux1[cont1] < array2[cont2]) {
                arrayFusion[i] = aux1[cont1];
                aux1[cont1] = MAX_VALUE;
                if (cont1 != aux1.length - 1) {
                    cont1++;
                }
            } else {
                arrayFusion[i] = aux2[cont2];
                aux2[cont2] = MAX_VALUE;
                if (cont2 != array2.length - 1) {
                    cont2++;
                }
            }
        }
        return arrayFusion;
    }

    /**
     * Funcion que devuelve una matriz con la suma de sus filas y columnas
     *
     * @param matriz
     * @return
     */
    //FUNCION QUE DEVUELVE UNA MATRIZ CON LAS SUMAS DE SUS FILAS Y COLUMNAS
    public static int[][] sumaFilasColumnas(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[columnas].length; columnas++) {
                matriz[filas][columnas] = filas + columnas;
            }
        }
        return matriz;
    }

    /**
     * Funcion que devuelve un array de enteros separado por <b>','</b> y
     * acabando con un <b>'.'</b>
     *
     * @param array Array a recibir
     * @return La cadena con los valores del array
     */
    public static String muestraArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                sb.append(array[i]).append(".");
            } else {
                sb.append(array[i]).append(",");
            }
        }
        return sb.toString();
    }

    /**
     *
     * @param array
     */
    /**
     * Funcion que devuelve un array de doubles separado por <b>','</b> y
     * acabando con un <b>'.'</b>
     *
     * @param array Array a recibir
     * @return La cadena con los valores del array
     */
    public static String muestraArray(double[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == (array.length - 1)) {
                sb.append(array[i]).append(".");
            } else {
                sb.append(array[i]).append(",");
            }
        }
        return sb.toString();
    }

    /**
     * Funcion que muestra el contenido de una matriz de enteros
     *
     * @param matriz Matriz a recibir
     * @return La cadena con los valores de la matriz
     */
    //FUNCION QUE MUESTRA EL CONTENIDO DE UNA MATRIZ
    public static String muestraMatriz(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                sb.append(matriz[filas][columnas] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Funcion que muestra el contenido de un cubo por cortes
     *
     * @param cubo Cubo a recibir
     * @return Cadena con todos los cortes del cubo
     */
    public static String muestraCubo(int[][][] cubo) {
        StringBuilder sb = new StringBuilder();
        for (int planta = 0; planta < cubo.length; planta++) {
            System.out.println("CORTE N" + (planta + 1));
            for (int filas = 0; filas < cubo[planta].length; filas++) {
                for (int columna = 0; columna < cubo[planta][filas].length; columna++) {
                    sb.append(cubo[planta][filas][columna]).append(" ");
                }
                sb.append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    /**
     * Devuelve la suma de la fila introducida de la matriz
     *
     * @param matriz Matriz de enteros a partir de la cual se calcula la suma de
     * la fila
     * @param fila Índice de la fila de la matriz que se desea sumar
     * @return Suma de los elementos de la fila especificada
     */
    public static int sumaFilaMatriz(int[][] matriz, int fila) {
        int suma = 0;
        for (int columna = 0; columna < matriz[fila].length; columna++) {
            suma += matriz[fila][columna];
        }
        return suma;
    }

    /**
     * Devuelve un array con todas las sumas de las filas de la matriz
     *
     * @param matriz Matriz de enteros a partir de la cual se calculan las sumas
     * de las filas
     * @return Array con las sumas de las filas de la matriz
     */
    public static int[] sumaFilasMatriz(int[][] matriz) {
        int[] sumas = new int[matriz.length];
        for (int fila = 0; fila < matriz.length; fila++) {
            sumas[fila] = sumaFilaMatriz(matriz, fila);
        }
        return sumas;
    }

    /**
     * Devuelve la suma de la columna introducida de la matriz
     *
     * @param matriz Matriz de enteros a partir de la cual se calcula la suma de
     * la columna
     * @param columna Índice de la columna de la matriz que se desea sumar
     * @return Suma de los elementos de la columna especificada
     */
    public static int sumaColumnaMatriz(int[][] matriz, int columna) {
        int suma = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            suma += matriz[fila][columna];
        }
        return suma;
    }

    /**
     * Devuelve un array con todas las sumas de las columnas de la matriz
     * (matrices cuadradas)
     *
     * @param matriz Matriz de enteros a partir de la cual se calculan las sumas
     * de las columnas
     * @return Array con las sumas de las columnas de la matriz
     */
    public static int[] sumaColumnasMatriz(int[][] matriz) {
        int[] sumas = new int[matriz.length];
        for (int columna = 0; columna < matriz.length; columna++) {
            sumas[columna] = sumaColumnaMatriz(matriz, columna);
        }
        return sumas;
    }

    /**
     * Devuelve true si la matriz introducida es mágica
     *
     * @param matriz Matriz de enteros a comprobar si es mágica
     * @return true si la matriz es mágica, false en caso contrario
     */
    public static boolean esMatrizMagica(int[][] matriz) {
        boolean magica = false;
        int cont = 0, sumaF = 0, sumaC = 0;
        while (cont < matriz.length) {
            sumaF += sumaFilaMatriz(matriz, cont);
            sumaC += sumaColumnaMatriz(matriz, cont);
            if (sumaF != sumaC) {
                break;
            }
            cont++;
        }
        if (sumaF == sumaC) {
            magica = true;
        }
        return magica;
    }

    /**
     * Devuelve la media de los números positivos del array introducido
     *
     * @param a Array de enteros del cual se quiere calcular la media de los
     * positivos
     * @return Media de los números positivos del array
     */
    public static float mediaPositivos(int[] a) {
        long acum = 0;
        float media;
        int positivos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                acum += a[i];
                positivos++;
            }
        }
        media = acum / positivos;
        return media;
    }

    /**
     * Devuelve la media de los números negativos del array introducido
     *
     * @param a Array de enteros del cual se quiere calcular la media de los
     * negativos
     * @return Media de los números negativos del array
     */
    public static float mediaNegativos(int[] a) {
        long acum = 0;
        float media;
        int negativos = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                acum += a[i];
                negativos++;
            }
        }
        media = acum / negativos;
        return media;
    }

    /**
     * Devuelve el número de ceros incluidos en el array
     *
     * @param a Array de enteros del cual se quiere contar el número de ceros
     * @return Número de ceros en el array
     */
    public static int cuentaCeros(int[] a) {
        int ceros = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                ceros++;
            }
        }
        return ceros;
    }
}
