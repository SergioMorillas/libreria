package libreria;

// Funciones matemáticas

public class Matematicas {
    
    //FUNCION QUE DEVUELVE EL VALOR POSITIVO DE LA ECUACION DE SEGUNDO GRADO
    public static float ecuacion2GradoPositivo (float a, float b, float c) {
        float raiz, resultado;
        //Calculamos la raíz
        raiz = (float) Math.pow (b,2)- 4 * a * c;
        
        /* Si el resultado de la raíz es negativo, devolvemos 0, en caso
         * contrario, calculamos resultado */        
        if (raiz < 0)
            resultado = 0;
        else         
            resultado = (float) ((-b + Math.sqrt (raiz)) /2 * a);
        
        //Devolvemos resultado        
        return resultado;
    }
    
    //FUNCION QUE DEVUELVE EL VALOR NEGATIVO DE LA ECUACION DE SEGUNDO GRADO
    public static float ecuacion2GradoNegativo (float a, float b, float c) {
        float raiz, resultado;
        //Calculamos la raíz
        raiz = (float) Math.pow (b,2)- 4 * a * c;
        
        /* Si el resultado de la raíz es negativo, devolvemos 0, en caso
         * contrario, calculamos resultado */        
        if (raiz < 0)
            resultado = 0;
        else 
            resultado = (float) ((-b - Math.sqrt (raiz)) /2 * a);
        //Devolvemos resultado
        
        return resultado;
    }
    
    //FUNCION QUE DEVUELVE LA POTENCIA DE LA BASE Y SU EXPONENTE A BASE DE MULTIPLICACIONES
    public static int powProducto (int base, int exp) {
        int resultado = 1;
        
        // Cualquier número elevado a 0 es 1 (caso base)
        if (exp == 0)
            resultado = 1;
        // Si la base es 0, el resultado es 0
        else if (base == 0)
            resultado =  0;
        else            
            resultado = base * powProducto(base, (exp - 1));
        return resultado;
    }
    
    //FUNCION QUE DEVUELVE LA POTENCIA DE LA BASE Y SU EXPONENTE A BASE DE SUMAS
    public static int powSumas (int base, int exp) {
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
        
        if (base < 0 && exp % 2 != 0)
            resultado = - resultado;  
        
        return resultado;   
    }
    
    //FUNCION QUE DEVUELVE UN NÚMERO ALEATORIO ENTRE EL MÍNIMO Y MÁXIMO INTRODUCIDOS
    public static int numAleatorio (int min, int max) {
        return (int) Math.floor(Math.random() * ((max + 1 - min) + min));
    }
    
    //FUNCION QUE DEVUELVE UN VALOR POSITIVO SI EL PRIMER NUMERO INTRODUCIDO ES DIVISOR DEL SEGUNDO
    public static boolean esDivisor (int num1, int num2) {
        boolean divisor = false;
        
        if (num1 % num2 == 0)
            divisor = true;
        
        return divisor;
    }
    
    //FUNCION QUE DEVUELVE UN VALOR POSITIVO SI EL NUMERO ES PRIMO
    public static boolean esPrimo (int num) {
        boolean primo = false;
        int divisores = 0;
        
        /* Declaramos bucle para que compruebe si es divisile por todos
        * los número entre 2 y el número - 1 (es obvio que cualquier número es 
        * divisible entre sí mismo y 1)
        */
        for (int cont = 2;cont < num; cont++) {
            if (num % cont == 0)
                divisores++;
        }
        
        //Si no tiene divisores, es primo; de lo contrario, no lo es.
        if (divisores == 0)
            primo = true;
        
        return primo;
    }
    
    //FUNCION QUE DEVUELVE EL NÚMERO FACTORIAL DE FORMA RECURSIVA
    public static int factorialRecursivo (int num) {
        int resultado;
        if (num ==0)
            resultado = 1;
        else
            resultado = num * factorialRecursivo(num-1);
        return resultado;
    }
    
    //FUNCION QUE CALCULA EL NUMERO FIBONACCI DE LA POSICION NUM
    public static int fibonacci (int num) {
        
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return fibonacci(num - 1) + fibonacci(num - 2);
        
    }
    

}