package comparador;

import java.util.Comparator;

/**
 *
 * @author sergio
 */

public class NumeroCaracteresMasMenos implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int longitud = o2.length() - o1.length();
        if (longitud == 0) {
            return -1;
        } else {
            return longitud;
        }
    }
}
