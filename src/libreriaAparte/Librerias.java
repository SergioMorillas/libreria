package libreriaAparte;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Predicate;

/**
 *
 * @author djunc
 */
public class Librerias {

    public static boolean esPrimo(int a) {

        if (a == 2 || a == 3 || a == 5 || a == 7) {
            return true;
        } else if (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a % 7 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void chequeaDuplicadosEnSet(Set s, String[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (!s.add(numeros[i])) {
                System.out.println("Set type = " + s.getClass().getName() + " " + s);
            }
        }
    }

    public static int sumaColecciones(Collection<Integer> collection) {
        int sum = 0;
        for (int value : collection) {
            sum += value;
        }
        return sum;
    }

    public static Collection<Integer> filtraColecciones(Collection<Integer> collection, Predicate<Integer> predicate) {
        Collection<Integer> filteredCollection = new ArrayList<>();
        for (int value : collection) {
            if (predicate.test(value)) {
                filteredCollection.add(value);
            }
        }
        return filteredCollection;
    }

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

    public static <T> Optional<T> encuentraPrimero(Collection<T> collection, Predicate<T> predicate) {
        for (T value : collection) {
            if (predicate.test(value)) {
                return Optional.of(value);
            }
        }
        return Optional.empty();
    }

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

    public static <T> Collection<T> unico(Collection<T> collection) {
        return new HashSet<>(collection);
    }

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

    public static List<Integer> ordenaAscendente(Collection<Integer> collection) {
        List<Integer> sortedList = new ArrayList<>(collection);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static <T> Map<T, Integer> cuentaOcurrencias(Collection<T> collection) {
        Map<T, Integer> occurrences = new HashMap<>();
        for (T element : collection) {
            occurrences.put(element, occurrences.getOrDefault(element, 0) + 1);
        }
        return occurrences;
    }

    public static <T> Collection<T> concatenaCollecciones(Collection<T>... collections) {
        List<T> result = new ArrayList<>();
        for (Collection<T> collection : collections) {
            result.addAll(collection);
        }
        return result;
    }

    public static <T> Collection<T> interseccionColecciones(Collection<T> collection1, Collection<T> collection2) {
        Set<T> result = new HashSet<>(collection1);
        result.retainAll(collection2);
        return result;
    }

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

    public static <T> void ordenaLista(List<T> list, Comparator<T> comparator) {
        Collections.sort(list, comparator);
    }

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

    public static <T> List<T> uneListas(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public static <T> T[] coleccionAArray(Collection<T> collection, Class<T> type) {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) java.lang.reflect.Array.newInstance(type, collection.size());
        int i = 0;
        for (T element : collection) {
            result[i++] = element;
        }
        return result;
    }

    public static <T> List<T> subListas(List<T> list, int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex > list.size() || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        return new ArrayList<>(list.subList(fromIndex, toIndex));
    }

    public static <T> List<T> diferentesLista(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        for (T element : list1) {
            if (!list2.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static <T> List<T> invertir(List<T> list) {
        List<T> result = new ArrayList<>(list);
        Collections.reverse(result);
        return result;
    }

    public static <T> List<T> quitaDuplicados(List<T> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));

    }

    public static <K, V extends Comparable<? super V>> Map<K, V> ordenaMapaValorAscendente(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> ordenaValorDescendente(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Collections.reverseOrder(Map.Entry.comparingByValue()));
        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static <K, V extends Comparable<? super V>> List<K> darmeClavesOrdenadasPorValor(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        List<K> result = new ArrayList<>();
        for (Map.Entry<K, V> entry : list) {
            result.add(entry.getKey());
        }
        return result;
    }

    public static <K extends Comparable<? super K>, V> List<V> darmeValoresOrdenadasPorClaves(Map<K, V> map) {
        List<K> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        List<V> result = new ArrayList<>();
        for (K key : keys) {
            result.add(map.get(key));
        }
        return result;
    }

    public static <K, V> List<V> valoresUnicosDeMapa(Map<K, V> map) {
        Set<V> uniqueValues = new HashSet<>(map.values());
        return new ArrayList<>(uniqueValues);
    }

    public static <K, V> List<K> clavesUnicasDeMapa(Map<K, V> map) {
        Set<K> uniqueKeys = new HashSet<>(map.keySet());
        return new ArrayList<>(uniqueKeys);
    }

    public static <K, V> Map<V, K> invierteValoresYClaves(Map<K, V> map) {
        Map<V, K> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }

    public static <K, V> Map<K, V> juntaMapas(Map<K, V> map1, Map<K, V> map2) {
        Map<K, V> mergedMap = new HashMap<>(map1);
        mergedMap.putAll(map2);
        return mergedMap;
    }

    public static <K, V> Map<K, V> filtraMapaPorCondicion(Map<K, V> map, Map.Entry<K, V> condition) {
        Map<K, V> filteredMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey().equals(condition.getKey()) && entry.getValue().equals(condition.getValue())) {
                filteredMap.put(entry.getKey(), entry.getValue());
            }
        }
        return filteredMap;
    }

    public static <K, V extends Number> double dameValorMedio(Map<K, V> map) {
        double sum = 0.0;
        for (V value : map.values()) {
            sum += value.doubleValue();
        }
        return sum / map.size();
    }

    public static <K, V> List<V> sublistaValoresMapa(Map<K, V> map, int fromIndex, int toIndex) {
        List<V> values = new ArrayList<>(map.values());
        return values.subList(fromIndex, toIndex);
    }

    public static <K, V> List<K> sublistaClavesMapa(Map<K, V> map, int fromIndex, int toIndex) {
        List<K> keys = new ArrayList<>(map.keySet());
        return keys.subList(fromIndex, toIndex);
    }

    public static <K, V> int cuentaOcurrenciasDeUnValor(Map<K, V> map, V value) {
        int count = 0;
        for (V v : map.values()) {
            if (v.equals(value)) {
                count++;
            }
        }
        return count;
    }

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
    
    public static double sumaElementosArray(double[] array) {
        double sum = 0.0;
        for (double d : array) {
            sum += d;
        }
        return sum;
    }

    public static double maxElementoArray(double[] array) {
        double max = array[0];
        for (double d : array) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    
    public static double minElementoArray(double[] array) {
        double min = array[0];
        for (double d : array) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public static void ordenaArrayDescendente(double[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            double temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

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

    public static int cuentaElementosDistintos(double[] array) {
        Set<Double> set = new HashSet<>();
        for (double d : array) {
            set.add(d);
        }
        return set.size();
    }

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
    
     public static double[] juntaArrays(double[] array1, double[] array2) {
        double[] result = new double[array1.length + array2.length];
        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
     
      public static <T> List<T> arrayALista(T[] array) {
        return Arrays.asList(array);
    }

    public static <T> T[] listaAArray(List<T> list, Class<T> clase) {
        T[] array = (T[]) Array.newInstance(clase, list.size());
        return list.toArray(array);
    }
     public static <T> T[] coleccionAArray2(Collection<T> collection, Class<T> clase) {
        T[] array = (T[]) Array.newInstance(clase, collection.size());
        return collection.toArray(array);
    }
     
     public class LibreriaVector {

    public static void showArray(float[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);

        }
    }

    public static void showArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);

        }
    }

    public static void showArraySinCeros(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                System.out.println(v[i]);

            }
        }
    }

    public static void showArraySinNegativos(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] > 0) {
                System.out.println(v[i]);
            }
        }
    }

    public static void showArrayInverso(int[] v) {
        for (int i = v.length - 1; i > -1; i--) {
            System.out.println(v[i]);

        }
    }

    public static void showArray(double[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);

        }
    }

    public static void rellenaVector(float[] v) {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduzca numero" + (i + 1) + ":");
            v[i] = t.nextFloat();
        }
    }

    public static void rellenaVector(int[] v) {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduzca numero" + (i + 1) + ":");
            v[i] = t.nextInt();
        }
    }

    public static void rellenaVector(double[] v) {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.println("Introduzca numero" + (i + 1) + ":");
            v[i] = t.nextDouble();
        }

    }

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

    public static int NumeroCeros(int[] v) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) {
                cont++;

            }
        }
        return cont;

    }

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

    public static void verArrays(int[][][] numeros) {

        for (int[][] aux : numeros) {

            for (int[] aux2 : aux) {

                for (int aux3 : aux2) {
                    System.out.print(aux3);
                }

            System.out.println("");}
        System.out.println("");}
    }

    public static void verArrays(int[][] numeros) {

        for (int[] aux : numeros) {

            for (int aux2 : aux) {

                System.out.print(aux2);

            }
            System.out.println("");}
    }
    public static void verArrays(char[][] numeros) {

        for (char[] aux : numeros) {
            
            for (char aux2 : aux) {

                System.out.print(aux2);
                
            }
            System.out.println("");}
    }

    public static void verArrays(int[] numeros) {

        for (int aux : numeros) {

            System.out.println(aux);

        }
    }
}
/* public class ComparadorNumVocalesDesc implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int vocaleso1,vocaleso2;
        vocaleso1=cuentaVocales(o1);
        vocaleso2=cuentaVocales(o2);
        if(vocaleso1-vocaleso2==0){
            return 1;
        }else{
        return vocaleso2-vocaleso1;
    }}

    private int cuentaVocales(String palabra) {
        int cont=0;
    for (int i = 0; i < palabra.length(); i++) {
        palabra=palabra.toLowerCase();
            if (palabra.charAt(i)=='a'||palabra.charAt(i)=='e'||palabra.charAt(i)=='i'||palabra.charAt(i)=='o'||palabra.charAt(i)=='u') {
                cont++;
            }
        }
        return cont;
claseOrd= new TreeSet<>(new ComparadorNumVocalesDesc());
}*/ 
}