package comparadores;
import java.util.Comparator;
/**
 *
 * @author sergio
 */
public class AlfabeticoMasMenos implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o2.compareToIgnoreCase(o1);
    }    
}
