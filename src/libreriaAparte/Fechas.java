package com.mavenproject1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Stack;

/**
 *
 * @author djunc
 */
public class Fechas {

    public static boolean esBisiesto(String fecha) {
        LocalDate date = LocalDate.parse(fecha);
        return date.isLeapYear();
    }

    public static boolean esFechaValida(String fecha) {
        try {
            LocalDate.parse(fecha);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

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

    public static int comparaFechas(String fecha1, String fecha2) {
        LocalDate localDate1 = LocalDate.parse(fecha1);
        LocalDate localDate2 = LocalDate.parse(fecha2);
        return localDate1.compareTo(localDate2);
    }

    public static long diasHastaFinDeMes(String fecha) {
        LocalDate localDate = LocalDate.parse(fecha);
        LocalDate finDeMes = localDate.withDayOfMonth(localDate.lengthOfMonth());
        return ChronoUnit.DAYS.between(localDate, finDeMes);
    }

    public static long diasHastaFinDeAno(String fecha) {
        LocalDate localDate = LocalDate.parse(fecha);
        LocalDate finDeAno = localDate.withDayOfYear(localDate.lengthOfYear());
        return ChronoUnit.DAYS.between(localDate, finDeAno);
    }

    public static long diasEntre(String fecha1, String fecha2) {
        LocalDate localDate1 = LocalDate.parse(fecha1);
        LocalDate localDate2 = LocalDate.parse(fecha2);
        return ChronoUnit.DAYS.between(localDate1, localDate2);
    }

    public static String añadeDias(String fecha, int dias) {
        String fechaDiasAñadidos;
        LocalDate localDate = LocalDate.parse(fecha);
        fechaDiasAñadidos = localDate.plusDays(dias).toString();
        return fechaDiasAñadidos;
    }

    public static String getDiaActualFormateado() {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'del' yyyy", new Locale("es", "ES"));
        return localDate.format(dateTimeFormatter);
    }
}
