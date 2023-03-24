package comparador;

import java.util.Comparator;
import java.util.regex.Pattern;

/**
 *
 * @author sergio
 */
public class NumeroVocalesMenosMas implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int vocal1=cuentaVocales(o2), vocal2=cuentaVocales(o1);
        if (vocal2==vocal1) return o2.compareTo(o1);
        return vocal2-vocal1;
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
