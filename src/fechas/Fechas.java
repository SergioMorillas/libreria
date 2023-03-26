package fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author Sergio Morillas Carmona
 */
public class Fechas {

    /**
     *
     * Comprueba si el año correspondiente a la fecha ingresada es bisiesto.
     *
     * @param fecha fecha en formato ISO-8601 (yyyy-mm-dd)
     * @return true si el año es bisiesto, false en caso contrario
     */
    public static boolean esBisiesto(String fecha) {
        LocalDate date = LocalDate.parse(fecha);
        return date.isLeapYear();
    }

    /**
     *
     * Comprueba si la fecha ingresada es válida.
     *
     * @param fecha fecha en formato ISO-8601 (yyyy-mm-dd)
     * @return true si la fecha es válida, false en caso contrario
     */
    public static boolean esFechaValida(String fecha) {
        try {
            LocalDate.parse(fecha);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     *
     * Obtiene el día de la semana en español correspondiente a la fecha
     * ingresada.
     *
     * @param fecha fecha en formato ISO-8601 (yyyy-mm-dd)
     * @return el día de la semana en español
     */
    public static String getDiaDeLaSemanaEnEspanol(String fecha) {
        LocalDate date = LocalDate.parse(fecha);
        String dayOfWeek = date.getDayOfWeek().toString().toLowerCase();
        switch (dayOfWeek) {
            case "monday":
                return "Lunes";
            case "tuesday":
                return "Martes";
            case "wednesday":
                return "Miércoles";
            case "thursday":
                return "Jueves";
            case "friday":
                return "Viernes";
            case "saturday":
                return "Sábado";
            case "sunday":
                return "Domingo";
            default:
                return "Desconocido";
        }
    }

    /**
     *
     * Compara dos fechas ingresadas y devuelve un valor que indica si una es
     * anterior, igual o posterior a la otra.
     *
     * @param fecha1 fecha en formato ISO-8601 (yyyy-mm-dd)
     * @param fecha2 fecha en formato ISO-8601 (yyyy-mm-dd)
     * @return -1 si fecha1 es anterior a fecha2, 0 si son iguales, 1 si fecha1
     * es posterior a fecha2
     */
    public static int comparaFechas(String fecha1, String fecha2) {
        LocalDate localDate1 = LocalDate.parse(fecha1);
        LocalDate localDate2 = LocalDate.parse(fecha2);
        return localDate1.compareTo(localDate2);
    }

    /**
     *
     * Calcula la cantidad de días que faltan para finalizar el mes
     * correspondiente a la fecha ingresada.
     *
     * @param fecha fecha en formato ISO-8601 (yyyy-mm-dd)
     * @return la cantidad de días restantes hasta el final del mes
     */
    public static long diasHastaFinDeMes(String fecha) {
        LocalDate localDate = LocalDate.parse(fecha);
        LocalDate finDeMes = localDate.withDayOfMonth(localDate.lengthOfMonth());
        return ChronoUnit.DAYS.between(localDate, finDeMes);
    }

    /**
     *
     * Calcula la cantidad de días que faltan para finalizar el año
     * correspondiente a la fecha ingresada.
     *
     * @param fecha fecha en formato ISO-8601 (yyyy-mm-dd)
     * @return la cantidad de días restantes hasta el final del año
     */
    public static long diasHastaFinDeAno(String fecha) {
        LocalDate localDate = LocalDate.parse(fecha);
        LocalDate finDeAno = localDate.withDayOfYear(localDate.lengthOfYear());
        return ChronoUnit.DAYS.between(localDate, finDeAno);
    }

    /**
     *
     * Calcula la cantidad de días entre dos fechas.
     *
     * @param fecha1 La primera fecha en formato String.
     * @param fecha2 La segunda fecha en formato String.
     * @return La cantidad de días entre las dos fechas.
     */
    public static long diasEntre(String fecha1, String fecha2) {
        LocalDate localDate1 = LocalDate.parse(fecha1);
        LocalDate localDate2 = LocalDate.parse(fecha2);
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    /**
     *
     * Añade una cantidad de días especificada a una fecha dada.
     *
     * @param fecha La fecha en formato String a la que se le añadirán los días.
     * @param dias La cantidad de días que se añadirán a la fecha.
     * @return La fecha resultante después de añadir los días en formato String.
     */
    public static String añadeDias(String fecha, int dias) {
        String fechaDiasAñadidos;
        LocalDate localDate = LocalDate.parse(fecha);
        fechaDiasAñadidos = localDate.plusDays(dias).toString();
        return fechaDiasAñadidos;
    }

    /**
     *
     * Obtiene la fecha actual en un formato específico en español.
     *
     * @return La fecha actual en formato String con el formato "d de MMMM del
     * yyyy".
     */
    public static String getDiaActualFormateado() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'del' yyyy", new Locale("es", "ES"));
        return localDate.format(dateTimeFormatter);
    }
}
