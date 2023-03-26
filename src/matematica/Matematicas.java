package matematica;

// Funciones matemáticas
public class Matematicas {

    /**
     *
     * Función que devuelve el valor positivo de la ecuación de segundo grado.
     *
     * @param a coeficiente cuadrático
     * @param b coeficiente lineal
     * @param c término independiente
     * @return valor positivo de la ecuación de segundo grado
     */
    public static float ecuacion2GradoPositivo(float a, float b, float c) {
        float raiz, resultado;
        //Calculamos la raíz
        raiz = (float) Math.pow(b, 2) - 4 * a * c;

        /* Si el resultado de la raíz es negativo, devolvemos 0, en caso
         * contrario, calculamos resultado */
        if (raiz < 0) {
            resultado = 0;
        } else {
            resultado = (float) ((-b + Math.sqrt(raiz)) / 2 * a);
        }

        //Devolvemos resultado        
        return resultado;
    }

    /**
     *
     * Función que devuelve el valor negativo de la ecuación de segundo grado.
     *
     * @param a coeficiente cuadrático
     * @param b coeficiente lineal
     * @param c término independiente
     * @return valor negativo de la ecuación de segundo grado
     */
    public static float ecuacion2GradoNegativo(float a, float b, float c) {
        float raiz, resultado;
        //Calculamos la raíz
        raiz = (float) Math.pow(b, 2) - 4 * a * c;

        /* Si el resultado de la raíz es negativo, devolvemos 0, en caso
         * contrario, calculamos resultado */
        if (raiz < 0) {
            resultado = 0;
        } else {
            resultado = (float) ((-b - Math.sqrt(raiz)) / 2 * a);
        }
        //Devolvemos resultado

        return resultado;
    }

    /**
     *
     * Función que devuelve la potencia de la base y su exponente a base de
     * multiplicaciones.
     *
     * @param base la base de la potencia
     * @param exp el exponente de la potencia
     * @return el resultado de la potencia
     */
    public static int powProducto(int base, int exp) {
        int resultado = 1;

        // Cualquier número elevado a 0 es 1 (caso base)
        if (exp == 0) {
            resultado = 1;
        } // Si la base es 0, el resultado es 0
        else if (base == 0) {
            resultado = 0;
        } else {
            resultado = base * powProducto(base, (exp - 1));
        }
        return resultado;
    }

    /**
     *
     * Función que devuelve la potencia de la base y su exponente a base de
     * sumas.
     *
     * @param base la base de la potencia
     * @param exp el exponente de la potencia
     * @return el resultado de la potencia
     */
    public static int powSumas(int base, int exp) {
        int baseAbs, resultado = 0, acum;
        baseAbs = Math.abs(base);
        acum = baseAbs;

        switch (exp) {
            case 0:
                resultado = 1;
                break;
            case 1:
                resultado = base;
            default:
                for (int cont = 1; cont < exp; cont++) {
                    resultado = 0;
                    for (int cont2 = 0; cont2 < baseAbs; cont2++) {
                        resultado = resultado + acum;
                    }
                    acum = resultado;
                }
        }

        if (base < 0 && exp % 2 != 0) {
            resultado = -resultado;
        }

        return resultado;
    }

    /**
     *
     * Función que devuelve un número aleatorio entre el mínimo y máximo
     * introducidos.
     *
     * @param min el número mínimo
     * @param max el número máximo
     * @return un número aleatorio entre el mínimo y máximo introducidos
     */
    public static int numAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * ((max + 1 - min) + min));
    }

    /**
     *
     * Función que devuelve un valor positivo si el primer número introducido es
     * divisor del segundo.
     *
     * @param num1 el número que se quiere comprobar si es divisor
     * @param num2 el número que se quiere comprobar si es divisible
     * @return true si el primer número es divisor del segundo, false si no lo
     * es
     */
    public static boolean esDivisor(int num1, int num2) {
        boolean divisor = false;

        if (num1 % num2 == 0) {
            divisor = true;
        }

        return divisor;
    }

    /**
     *
     * Función que devuelve un valor positivo si el número introducido es primo.
     *
     * @param num el número que se quiere comprobar si es primo
     * @return true si el número es primo, false si no lo es
     */
    public static boolean esPrimo(int num) {
        boolean primo = false;
        int divisores = 0;

        /* Declaramos bucle para que compruebe si es divisile por todos
        * los número entre 2 y el número - 1 (es obvio que cualquier número es 
        * divisible entre sí mismo y 1)
         */
        for (int cont = 2; cont < num / 2; cont++) {
            if (num % cont == 0) {
                divisores++;
            }
        }

        //Si no tiene divisores, es primo; de lo contrario, no lo es.
        if (divisores == 0) {
            primo = true;
        }

        return primo;
    }

    /**
     *
     * Función que devuelve el número factorial de forma recursiva.
     *
     * @param num el número del que se quiere obtener el factorial
     * @return el factorial del número introducido
     */
    public static int factorialRecursivo(int num) {
        int resultado;
        if (num == 0) {
            resultado = 1;
        } else {
            resultado = num * factorialRecursivo(num - 1);
        }
        return resultado;
    }

    /**
     *
     * Función que calcula el número Fibonacci de la posición num.
     *
     * @param num la posición del número Fibonacci que se quiere calcular
     * @return el número Fibonacci de la posición num
     */
    public static int fibonacci(int num) {

        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }

    }
}
