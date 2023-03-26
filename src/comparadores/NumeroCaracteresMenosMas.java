package comparadores;
import java.util.Comparator;
/**
 *
 * @author sergio
 */
public class NumeroCaracteresMenosMas implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        int longitud= o1.length()-o2.length();
        if (longitud==0) {
            return 1;
        } else {
        return longitud;
        }
    }    
}
