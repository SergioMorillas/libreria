package libreria;

import java.util.Comparator;

public class ComparadorDeObjetos implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        return (int) o1;
    }
    //Retornar negativo si o1 va primero
    //Retornar positivo si o2 va primero
}
