package Mapa;

import java.util.*;

public class ColeccionesMapas {

    
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
    
    //FUNCION QUE MUESTRA CUALQUIER COLECCION
    public static void muestraColeccion (Collection c) {
        Iterator it = c.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    //FUNCION QUE MUESTRA EL ARRAYLIST
    public static void muestraList (ArrayList al) {
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        
    }
        
    //FUNCION QUE MUESTRA EL MAPA INTRODUCIDO
    public static void muestraMapaArrays (Map mapa) {
        
        Set s = mapa.keySet();
        Iterator it = s.iterator();
        
        while (it.hasNext()) {
            String aux = (String) it.next();
            System.out.println(aux+": "+mapa.get(aux));
        }
        
    }
    
    //FUNCION QUE RELLENA UNA COLECCION A PARTIR DE UN ARRAY
    public static ArrayList rellenaColeccion (int[] array) {
        
        ArrayList al= new ArrayList();
        
        for (int i = 0; i < array.length; i++) {
            al.add(array[i]);
            
        }
        return al;
    }
}
