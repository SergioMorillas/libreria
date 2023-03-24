package libreriaAparte;

import java.util.Comparator;
import java.util.regex.Pattern;

/**
 *
 * @author sergio
 */
public class NumeroVocalesMasMenos implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int vocal1 = cuentaVocales(o2), vocal2 = cuentaVocales(o1);
        if (vocal1 == vocal2) {
            return o1.compareTo(o2);
        }
        return vocal1 - vocal2;
    }
    public int cuentaVocales(String palabra) {
        int cont = 0;
        String vocales = "[aeiouAEIOU]";
        for (int i = 0; i < palabra.length(); i++) {
            String letra = palabra.charAt(i) +"";
            if (Pattern.matches(vocales, letra)) cont++;
        }
        return cont;
    }
}
