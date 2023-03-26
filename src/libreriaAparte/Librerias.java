package libreriaAparte;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;

/**
 *
 * @author djunc
 */
public class Librerias {

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
     * Comprueba si hay duplicados en un conjunto (Set) de números y los muestra
     * por consola.
     *
     * @param s El conjunto a comprobar.
     * @param numeros El array de números a agregar al conjunto.
     */
    public static void chequeaDuplicadosEnSet(Set s, String[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (!s.add(numeros[i])) {
                System.out.println("Set type = " + s.getClass().getName() + " " + s);
            }
        }
    }

    /**
     * Calcula la suma de una colección de números.
     *
     * @param collection La colección de números a sumar.
     * @return La suma de la colección de números.
     */
    public static int sumaColecciones(Collection<Integer> collection) {
        int sum = 0;
        for (int value : collection) {
            sum += value;
        }
        return sum;
    }

    /**
     * Filtra una colección de números según un predicado y devuelve una nueva
     * colección con los elementos que lo cumplen.
     *
     * @param collection La colección a filtrar.
     * @param predicate El predicado que deben cumplir los elementos para ser
     * agregados a la nueva colección.
     * @return Una nueva colección con los elementos que cumplen el predicado.
     */
    public static Collection<Integer> filtraColecciones(Collection<Integer> collection, Predicate<Integer> predicate) {
        Collection<Integer> filteredCollection = new ArrayList<>();
        for (int value : collection) {
            if (predicate.test(value)) {
                filteredCollection.add(value);
            }
        }
        return filteredCollection;
    }

    /**
     * Agrupa una colección de strings por longitud y devuelve un mapa con las
     * listas de strings que tienen la misma longitud.
     *
     * @param collection La colección a agrupar.
     * @return Un mapa con las listas de strings que tienen la misma longitud.
     */
    public static Map<Integer, List<String>> agrupaColeccionesPorLongitud(Collection<String> collection) {
        Map<Integer, List<String>> groupedCollection = new HashMap<>();
        for (String value : collection) {
            int length = value.length();
            if (!groupedCollection.containsKey(length)) {
                groupedCollection.put(length, new ArrayList<>());
            }
            groupedCollection.get(length).add(value);
        }
        return groupedCollection;
    }

    /**
     * Encuentra el valor máximo de una colección de números.
     *
     * @param collection La colección de números.
     * @return El valor máximo de la colección de números.
     * @throws NoSuchElementException Si la colección está vacía.
     */
    public static int encuentraValorMaximo(Collection<Integer> collection) {
        if (collection.isEmpty()) {
            throw new NoSuchElementException("La colección está vacía");
        }
        int max = Integer.MIN_VALUE;
        for (int value : collection) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Encuentra el valor mínimo de una colección de números.
     *
     * @param collection La colección de números.
     * @return El valor mínimo de la colección de números.
     * @throws NoSuchElementException Si la colección está vacía.
     */
    public static int encuentraValorMinimo(Collection<Integer> collection) {
        if (collection.isEmpty()) {
            throw new NoSuchElementException("La colección está vacía");
        }
        int min = Integer.MAX_VALUE;
        for (int value : collection) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Une los elementos de una colección en una cadena separados por un
     * delimitador.
     *
     * @param collection la colección de elementos a unir
     * @param delimiter el delimitador a utilizar entre elementos
     * @return la cadena que contiene los elementos unidos por el delimitador
     */
    public static String uneColecciones(Collection<String> collection, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            sb.append(str).append(delimiter);
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - delimiter.length(), sb.length());
        }
        return sb.toString();
    }

    /**
     * Encuentra el primer elemento en una colección que cumple un predicado
     * dado.
     *
     * @param collection la colección de elementos en la que buscar
     * @param predicate el predicado a evaluar para cada elemento
     * @return un Optional que contiene el primer elemento que cumple el
     * predicado, o vacío si no hay ninguno
     */
    public static <T> Optional<T> encuentraPrimero(Collection<T> collection, Predicate<T> predicate) {
        for (T value : collection) {
            if (predicate.test(value)) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }

    /**
     * Devuelve el índice de la primera ocurrencia de un valor en una colección.
     *
     * @param collection la colección en la que buscar
     * @param value el valor a buscar
     * @return el índice de la primera ocurrencia del valor, o -1 si no está
     * presente
     */
    public static <T> int indiceDe(Collection<T> collection, T value) {
        int i = 0;
        for (T element : collection) {
            if (Objects.equals(element, value)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /**
     * Devuelve una nueva colección que contiene únicamente los elementos únicos
     * de una colección dada.
     *
     * @param collection la colección de elementos
     * @return una nueva colección que contiene únicamente los elementos únicos
     * de la colección original
     */
    public static <T> Collection<T> unico(Collection<T> collection) {
        return new HashSet<>(collection);
    }

    /**
     * Calcula la media de los elementos de una colección de enteros.
     *
     * @param collection la colección de enteros
     * @return la media de los elementos de la colección
     * @throws NoSuchElementException si la colección está vacía
     */
    public static double calcularMedia(Collection<Integer> collection) {
        if (collection.isEmpty()) {
            throw new NoSuchElementException("La colección está vacía");
        }
        double sum = 0;
        for (int value : collection) {
            sum += value;
        }
        return sum / collection.size();
    }

    /**
     * Devuelve una lista ordenada ascendentemente a partir de una colección de
     * enteros.
     *
     * @param collection la colección de enteros a ordenar
     * @return una lista ordenada ascendentemente que contiene los elementos de
     * la colección original
     */
    public static List<Integer> ordenaAscendente(Collection<Integer> collection) {
        List<Integer> sortedList = new ArrayList<>(collection);
        Collections.sort(sortedList);
        return sortedList;
    }

    /**
     * Cuenta el número de ocurrencias de cada elemento en una colección dada.
     *
     * @param collection la colección de elementos
     * @return un mapa que asocia cada elemento con su número de ocurrencias en
     * la colección
     */
    public static <T> Map<T, Integer> cuentaOcurrencias(Collection<T> collection) {
        Map<T, Integer> occurrences = new HashMap<>();
        for (T element : collection) {
            occurrences.put(element, occurrences.getOrDefault(element, 0) + 1);
        }
        return occurrences;
    }

    /**
     * Concatena varias colecciones en una sola.
     *
     * @param collections las colecciones a concatenar
     * @return una nueva colección que contiene todos los elementos de las
     * colecciones dadas
     */
    public static <T> Collection<T> concatenaCollecciones(Collection<T>... collections) {
        List<T> result = new ArrayList<>();
        for (Collection<T> collection : collections) {
            result.addAll(collection);
        }
        return result;
    }

    /**
     * Devuelve una nueva colección que contiene los elementos comunes a dos
     * colecciones dadas.
     *
     * @param collection1 la primera colección
     * @param collection2 la segunda colección
     * @return una nueva colección que contiene los elementos comunes a ambas
     * colecciones
     */
    public static <T> Collection<T> interseccionColecciones(Collection<T> collection1, Collection<T> collection2) {
        Set<T> result = new HashSet<>(collection1);
        result.retainAll(collection2);
        return result;
    }

    /**
     * Divide una lista en particiones de un tamaño dado.
     *
     * @param list la lista que se quiere particionar
     * @param size el tamaño de cada partición
     * @return una lista de particiones de tamaño "size"
     * @throws IllegalArgumentException si "size" es menor o igual a cero
     */
    public static <T> List<List<T>> particionLista(List<T> list, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("El tamaño de la partición debe ser mayor que cero");
        }
        List<List<T>> partitions = new ArrayList<>();
        for (int i = 0; i < list.size(); i += size) {
            partitions.add(list.subList(i, Math.min(i + size, list.size())));
        }
        return partitions;
    }

    /**
     *
     * Ordena una lista utilizando un comparador dado.
     *
     * @param list la lista que se quiere ordenar
     * @param comparator el comparador que se utilizará para ordenar la lista
     */
    public static <T> void ordenaLista(List<T> list, Comparator<T> comparator) {
        Collections.sort(list, comparator);
    }

    /**
     *
     * Fusiona dos colecciones ordenadas en una única colección ordenada.
     *
     * @param collection1 la primera colección ordenada
     * @param collection2 la segunda colección ordenada
     * @return una lista que contiene todos los elementos de ambas colecciones,
     * ordenados
     * @throws NullPointerException si "collection1" o "collection2" es nula
     */
    public static <T extends Comparable<T>> List<T> fusionaColeccionesOrdenadas(Collection<T> collection1, Collection<T> collection2) {
        List<T> result = new ArrayList<>();
        Iterator<T> iter1 = collection1.iterator();
        Iterator<T> iter2 = collection2.iterator();
        T element1 = iter1.hasNext() ? iter1.next() : null;
        T element2 = iter2.hasNext() ? iter2.next() : null;
        while (element1 != null || element2 != null) {
            if (element2 == null || (element1 != null && element1.compareTo(element2) <= 0)) {
                result.add(element1);
                element1 = iter1.hasNext() ? iter1.next() : null;
            } else {
                result.add(element2);
                element2 = iter2.hasNext() ? iter2.next() : null;
            }
        }
        return result;
    }

    /**
     *
     * Une dos listas en una única lista.
     *
     * @param list1 la primera lista
     * @param list2 la segunda lista
     * @return una lista que contiene todos los elementos de ambas listas
     */
    public static <T> List<T> uneListas(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    /**
     *
     * Convierte una colección en un array del tipo especificado.
     *
     * @param collection la colección que se quiere convertir en array
     * @param type el tipo de los elementos del array resultante
     * @return un array que contiene los elementos de la colección
     */
    public static <T> T[] coleccionAArray(Collection<T> collection, Class<T> type) {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) java.lang.reflect.Array.newInstance(type, collection.size());
        int i = 0;
        for (T element : collection) {
            result[i++] = element;
        }
        return result;
    }

    /**
     * Devuelve una sublista de la lista original desde el índice fromIndex
     * hasta el índice toIndex.
     *
     * @param list La lista original.
     * @param fromIndex El índice inicial de la sublista.
     * @param toIndex El índice final de la sublista.
     * @return La sublista de la lista original.
     * @throws IndexOutOfBoundsException Si fromIndex es menor que cero, toIndex
     * es mayor que el tamaño de la lista original o fromIndex es mayor que
     * toIndex.
     */
    public static <T> List<T> subListas(List<T> list, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > list.size() || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        return new ArrayList<>(list.subList(fromIndex, toIndex));
    }

    /**
     * Devuelve una lista que contiene los elementos de la primera lista que no
     * se encuentran en la segunda lista.
     *
     * @param list1 La primera lista.
     * @param list2 La segunda lista.
     * @return La lista de elementos diferentes.
     */
    public static <T> List<T> diferentesLista(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        for (T element : list1) {
            if (!list2.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    /**
     * Devuelve una lista que contiene los mismos elementos que la lista
     * original pero en orden inverso.
     *
     * @param list La lista original.
     * @return La lista invertida.
     */
    public static <T> List<T> invertir(List<T> list) {
        List<T> result = new ArrayList<>(list);
        Collections.reverse(result);
        return result;
    }

    /**
     * Devuelve una lista que contiene los mismos elementos que la lista
     * original pero sin duplicados.
     *
     * @param list La lista original.
     * @return La lista sin duplicados.
     */
    public static <T> List<T> quitaDuplicados(List<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));

    }

    /**
     * Devuelve un mapa ordenado por los valores de sus entradas de forma
     * ascendente.
     *
     * @param map El mapa original.
     * @return El mapa ordenado por valores ascendentes.
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> ordenaMapaValorAscendente(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    /**
     * Devuelve un mapa ordenado por los valores de sus entradas de forma
     * descendente.
     *
     * @param map El mapa original.
     * @return El mapa ordenado por valores descendentes.
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> ordenaValorDescendente(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Collections.reverseOrder(Map.Entry.comparingByValue()));
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    /**
     *
     * Devuelve una lista de claves ordenadas según el valor asociado en el mapa
     * de entrada.
     *
     * @param map el mapa de entrada.
     * @return una lista de claves ordenadas según el valor asociado.
     */
    public static <K, V extends Comparable<? super V>> List<K> darmeClavesOrdenadasPorValor(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        List<K> result = new ArrayList<>();
        for (Map.Entry<K, V> entry : list) {
            result.add(entry.getKey());
        }
        return result;
    }

    /**
     *
     * Devuelve una lista de valores ordenados según las claves en el mapa de
     * entrada.
     *
     * @param map el mapa de entrada.
     * @return una lista de valores ordenados según las claves.
     */
    public static <K extends Comparable<? super K>, V> List<V> darmeValoresOrdenadasPorClaves(Map<K, V> map) {
        List<K> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        List<V> result = new ArrayList<>();
        for (K key : keys) {
            result.add(map.get(key));
        }
        return result;
    }

    /**
     *
     * Devuelve una lista de valores únicos en el mapa de entrada.
     *
     * @param map el mapa de entrada.
     * @return una lista de valores únicos.
     */
    public static <K, V> List<V> valoresUnicosDeMapa(Map<K, V> map) {
        Set<V> uniqueValues = new HashSet<>(map.values());
        return new ArrayList<>(uniqueValues);
    }

    /**
     *
     * Devuelve una lista de claves únicas en el mapa de entrada.
     *
     * @param map el mapa de entrada.
     * @return una lista de claves únicas.
     */
    public static <K, V> List<K> clavesUnicasDeMapa(Map<K, V> map) {
        Set<K> uniqueKeys = new HashSet<>(map.keySet());
        return new ArrayList<>(uniqueKeys);
    }

    /**
     *
     * Devuelve un mapa que tiene los valores del mapa de entrada como claves y
     * las claves del mapa de entrada como valores.
     *
     * @param map el mapa de entrada.
     * @return un mapa invertido.
     */
    public static <K, V> Map<V, K> invierteValoresYClaves(Map<K, V> map) {
        Map<V, K> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }

    /**
     *
     * Devuelve un nuevo mapa que es la unión de los dos mapas de entrada.
     *
     * @param map1 el primer mapa de entrada.
     * @param map2 el segundo mapa de entrada.
     * @return un nuevo mapa que es la unión de los dos mapas de entrada.
     */
    public static <K, V> Map<K, V> juntaMapas(Map<K, V> map1, Map<K, V> map2) {
        Map<K, V> mergedMap = new HashMap<>(map1);
        mergedMap.putAll(map2);
        return mergedMap;
    }

    /**
     *
     * Devuelve un mapa filtrado por una condición de clave y valor dada.
     *
     * @param map el mapa de entrada.
     * @param condition la condición de clave y valor para filtrar el mapa.
     * @return un mapa filtrado por la condición de clave y valor dada.
     */
    public static <K, V> Map<K, V> filtraMapaPorCondicion(Map<K, V> map, Map.Entry<K, V> condition) {
        Map<K, V> filteredMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey().equals(condition.getKey()) && entry.getValue().equals(condition.getValue())) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }
        return filteredMap;
    }

    /**
     *
     * Devuelve el valor medio de los valores numéricos en el mapa de entrada.
     *
     * @param map el mapa de entrada.
     * @return el valor medio de los valores numéricos en el mapa de entrada.
     */
    public static <K, V extends Number> double dameValorMedio(Map<K, V> map) {
        double sum = 0.0;
        for (V value : map.values()) {
            sum += value.doubleValue();
        }
        return sum / map.size();
    }

    /**
     *
     * Devuelve una sublista de valores en el mapa de entrada, desde el índice
     * inicial (inclusive) hasta el índice final (exclusive).
     *
     * @param map el mapa de entrada.
     * @param fromIndex el índice inicial (inclusive).
     * @param toIndex el índice final (exclusive).
     * @return una sublista de valores en el mapa de entrada.
     */
    public static <K, V> List<V> sublistaValoresMapa(Map<K, V> map, int fromIndex, int toIndex) {
        List<V> values = new ArrayList<>(map.values());
        return values.subList(fromIndex, toIndex);
    }

    /**
     * Devuelve una sublista de claves de un mapa dado desde el índice
     * "fromIndex" hasta el índice "toIndex".
     *
     * @param map el mapa del cual obtener la sublista de claves
     * @param fromIndex el índice inicial de la sublista (inclusive)
     * @param toIndex el índice final de la sublista (exclusivo)
     * @param <K> el tipo de clave del mapa
     * @param <V> el tipo de valor del mapa
     * @return una sublista de claves de un mapa dado desde el índice
     * "fromIndex" hasta el índice "toIndex"
     */
    public static <K, V> List<K> sublistaClavesMapa(Map<K, V> map, int fromIndex, int toIndex) {
        List<K> keys = new ArrayList<>(map.keySet());
        return keys.subList(fromIndex, toIndex);
    }

    /**
     * Devuelve el número de ocurrencias de un valor en un mapa dado.
     *
     * @param map el mapa en el que buscar el valor
     * @param value el valor a buscar en el mapa
     * @param <K> el tipo de clave del mapa
     * @param <V> el tipo de valor del mapa
     * @return el número de ocurrencias del valor en el mapa
     */
    public static <K, V> int cuentaOcurrenciasDeUnValor(Map<K, V> map, V value) {
        int count = 0;
        for (V v : map.values()) {
            if (v.equals(value)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Crea un mapa a partir de dos listas dadas, una de claves y otra de
     * valores. Las listas deben tener la misma longitud.
     *
     * @param keys la lista de claves para crear el mapa
     * @param values la lista de valores para crear el mapa
     * @param <K> el tipo de clave del mapa
     * @param <V> el tipo de valor del mapa
     * @return un mapa creado a partir de las dos listas dadas
     * @throws IllegalArgumentException si las listas tienen diferentes
     * longitudes
     */
    public static <K, V> Map<K, V> creaMapaDeDosListas(List<K> keys, List<V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Lists have different sizes");
        }
        Map<K, V> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
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
     * @param array el array que se desea convertir en una lista
     * @return una lista que contiene los elementos del array
     */
    public static <T> List<T> arrayALista(T[] array) {
        return Arrays.asList(array);
    }

    /**
     *
     * Convierte una lista en un array del tipo especificado.
     *
     * @param list la lista a convertir
     * @param clase la clase del tipo del array resultante
     * @param <T> el tipo de elemento de la lista y del array
     * @return el array resultante
     */
    public static <T> T[] listaAArray(List<T> list, Class<T> clase) {
        T[] array = (T[]) Array.newInstance(clase, list.size());
        return list.toArray(array);
    }

    /**
     *
     * Convierte una colección en un array del tipo especificado.
     *
     * @param collection la colección a convertir
     * @param clase la clase del tipo del array resultante
     * @param <T> el tipo de elemento de la colección y del array
     * @return el array resultante
     */
    public static <T> T[] coleccionAArray2(Collection<T> collection, Class<T> clase) {
        T[] array = (T[]) Array.newInstance(clase, collection.size());
        return collection.toArray(array);
    }

    /**
     *
     * Clase para comparar dos strings en función del número de vocales que
     * contienen.
     *
     * El comparador es descendente, es decir, las palabras con mayor número de
     * vocales se sitúan antes.
     */
    public class ComparadorNumVocalesDesc implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            int vocaleso1, vocaleso2;
            vocaleso1 = cuentaVocales(o1);
            vocaleso2 = cuentaVocales(o2);
            if (vocaleso1 - vocaleso2 == 0) {
                return 1;
            } else {
                return vocaleso2 - vocaleso1;
            }
        }

        /**
         *
         * Método para comparar dos strings en función del número de vocales que
         * contienen. El comparador es descendente, es decir, las palabras con
         * mayor número de vocales se sitúan antes.
         *
         * @param o1 el primer string a comparar
         * @param o2 el segundo string a comparar
         * @return un número entero que indica si el primer string es mayor,
         * menor o igual al segundo string.
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
}
