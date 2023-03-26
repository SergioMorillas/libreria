package coleccion;

import java.util.*;

public class ColeccionesMapas {

    // <editor-fold defaultstate="collapsed" desc="Metodos especiales">
    //METODOS FUNCIONALES WRAPPERS
    /*
    valueOf
    parse
    toString
    */
    
    //METODOS FUNCIONALES COLECCIONES
    /*
    contains
    add
    isEmpty
    size
    remove
    toArray()
    set(en esta posicion, este elemento)
    add("", "")
    get(index)
    remove(index)
    indexfOf
    
    sort(ordena)
    shuffle(barajea)
    binarySearch (coleccion donde buscar, valor)
    max/min(busqueda de valores extremos)
    
    List subList(from,to)
    
    HashSet -- no duplicados
    LinkedHashSet -- no duplicados -- cola
    TreeSet -- no duplicados -- orden variable
    Qeue -- cola
    stack -- pila (metodo peek(coger 1º elemento), pop(lo elimina), push(poner elemento en la cabecera de la pila))
    
    //Ademas de iterator contamos con indices
    ArrayList -- duplicados -- orden variable
    LinkedList -- duplicados -- cola
    Vector
    */    
    
    //METODOS FUNCIONALES MAPAS
    /*
    put(key,value)
    get(key) cogemos su valor
    remove(key) eliminamos la pareja
    containsValue
    containsKey
    size
    isEmpty
    putAll(map) copia mapa
    
    HashMap
    HashTable
    TreeMap
    LinkedHashMap -- cola
    */
    //</editor-fold>
    
    /**
     * Metodo que muestra una coleccion por pantalla
     * @param c Coleccion a mostrar
     */
    public static void muestraColeccion (Collection c) {
        Iterator it = c.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    /**
     * Metodo que muestra un arraylist por pantalla
     * @param al ArrayList a mostrar
     */
    public static void muestraList (ArrayList al) {
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        
    }
        
/**
 * Metodo que muestra un mapa
 * @param mapa mapa a mostrar
 */
    public static void muestraMapa (Map mapa) {
        
        Set s = mapa.keySet();
        Iterator it = s.iterator();
        
        while (it.hasNext()) {
            String aux = (String) it.next();
            System.out.println(aux+": "+mapa.get(aux));
        }
        
    }
    
    /**
     * Metodo que rellena una coleccion con un array 
     * @param array array con los valores ya dados
     * @return Coleccion
     */
    public static Collection rellenaColeccion (int[] array) {
        Collection al= new ArrayList();
        for (int i = 0; i < array.length; i++) {
            al.add(array[i]);
        }
        return al;
    }
}
