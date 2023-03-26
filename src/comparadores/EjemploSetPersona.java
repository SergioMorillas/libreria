package comparadores;

/**
 *
 * @author Sergio
 */
import java.util.*;

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}

class ComparadorEdad implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        return p1.getEdad() - p2.getEdad();
    }
}

public class EjemploSetPersona {
    public static void main(String[] args) {
        Set<Persona> personas = new TreeSet<>(new ComparadorEdad());
        
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Pedro", 20));
        
        for (Persona p : personas) {
            System.out.println(p.getNombre() + ": " + p.getEdad());
        }
    }
}
