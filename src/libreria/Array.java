package libreria;

import static java.lang.Integer.MAX_VALUE;

public class Array {
    
    
    //MATRICES DESIGUALES
    /*
    int [][] matrizD = new int[2][];
    matrizD[0] = new int[2];
    */
    
    
    //FUNCION QUE RECIBE UN ARRAY, UNA CADENA STRING Y UN CARACTER DELIMITADOR DEVOLVIENDO EL MISMO ARRAY RELLENO CON LOS ELEMENTOS DE LA CADENA
    public static void rellenaArrayDeCadena (String cadena, String delim, int[] array){
        
        //Separamos la cadena con el delimitador introducido y almacenamos cada elemento en un array
        String [] elemento = cadena.split(delim); 
        
        //Rellenamos el array con los elementos guardados en el anterior array
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(elemento[i]);
        }        
    }
    
    //FUNCION QUE DEVUELVE LA FUSION DE DOS ARRAYS RECIBIDOS POR PARÁMETROS
    public static int[] fusionaArraysOrdenados (int[] array1, int[] array2) {
        
        //Contadores individuales de cada array
        int cont1 = 0, cont2 = 0;
        
        int [] aux1 = array1;
        int [] aux2 = array2;
        
        //Declaramos el nuevo array con el tamaño de los dos arrays a fusionar
        int[] arrayFusion = new int[array1.length + array2.length];
        
        //Fusionamos los Arrays en orden
        for (int i = 0; i < arrayFusion.length; i++) {
            
            if (aux1[cont1] < array2[cont2]){
               
                arrayFusion[i] = aux1[cont1];
                aux1[cont1] = MAX_VALUE;
                if (cont1 != aux1.length - 1) cont1++;
              
            }else{
                
                arrayFusion[i] = aux2[cont2];
                aux2[cont2] = MAX_VALUE;
                if (cont2 != array2.length - 1) cont2++;
                
            }
        }  
        return arrayFusion;
    }
    
    //FUNCION QUE DEVUELVE UNA MATRIZ CON LAS SUMAS DE SUS FILAS Y COLUMNAS
    public static int [][] sumaFilasColumnas(int[][] matriz) {
        
        for (int filas = 0; filas < matriz.length; filas++) {
            
            for (int columnas = 0; columnas < matriz[columnas].length; columnas++) {
                
                matriz[filas][columnas] = filas + columnas;
            }
            
        }
        return matriz;
    }
    
    //FUNCION QUE MUESTRA EL CONTENIDO DE UN ARRAY CON COMAS Y PUNTO
    public static void muestraArray (int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            
            if (i == (array.length - 1)){
                
                System.out.println(array[i] + ".");
                
            }else{
                
                System.out.print(array[i] + ", ");
            }
        }
    }
    
    //FUNCION QUE MUESTRA EL CONTENIDO DE UN ARRAY CON COMAS Y PUNTO
    public static void muestraArray (double[] array) {
        
        for (int i = 0; i < array.length; i++) {
            
            if (i == (array.length - 1)){
                
                System.out.println(array[i] + ".");
                
            }else{
                
                System.out.print(array[i] + ", ");
            }
        }
    }
    
    //FUNCION QUE MUESTRA EL CONTENIDO DE UNA MATRIZ
    public static void muestraMatriz (int[][] matriz) {
        
        for (int filas = 0; filas < matriz.length; filas++) {
            
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                
                System.out.print(matriz[filas][columnas] + " ");
            }
            
            System.out.println("");
        }
    }
    
    //FUNCION QUE MUESTRA EL CONTENIDO DE UN CUBO POR CORTES
    public static void muestraCubo (int[][][] cubo) {
        
        for (int planta = 0; planta < cubo.length; planta++) {
            
            System.out.println("CORTE N"+(planta+1));
            
            for (int filas = 0; filas < cubo[planta].length; filas++) {
                
                for (int columna = 0; columna < cubo[planta][filas].length; columna++){
                    
                    System.out.print(cubo[planta][filas][columna] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    
    //FUNCION QUE DEVUELVE LA SUMA DE LA FILA INTRODUCIDA DE LA MATRIZ 
    public static int sumaFilaMatriz (int[][] matriz, int fila) {
        
        int suma = 0;
        
        for (int columna = 0; columna < matriz[fila].length; columna++){
            
            suma += matriz[fila][columna];
        }
        
        return suma;
    }
    
    //FUNCION QUE DEVUELVE UN ARRAY CON TODAS LAS SUMAS DE LAS FILAS DE LA MATRIZ
    public static int[] sumaFilasMatriz (int [][] matriz){
        
        int [] sumas = new int [matriz.length];
        
        for (int fila = 0; fila < matriz.length; fila++) {
           
            sumas [fila] = sumaFilaMatriz(matriz,fila);
            
        }
        
        return sumas;
    }
    
    //FUNCION QUE DEVUELVE LA SUMA DE LA COLUMNA INTRODUCIDA DE LA MATRIZ
    public static int sumaColumnaMatriz (int[][] matriz, int columna) {
        
        int suma = 0;
        
        for (int fila = 0; fila < matriz.length; fila++) {
            suma += matriz[fila][columna];    
                
        }
        
        return suma;
        
    }
    
    //FUNCION QUE DEVUELVE UN ARRAY CON TODAS LAS SUMAS DE LAS FILAS DE LA MATRIZ (MATRICES CUADRADAS)
    public static int[] sumaColumnasMatriz (int [][] matriz){
        
        
        int [] sumas = new int [matriz.length];
        
        for (int columna = 0; columna < matriz.length; columna++) {
           
            sumas [columna] = sumaColumnaMatriz(matriz,columna);
            
        }
        
        return sumas;
    }

    //FUNCION BOOLEANA QUE DEVUELVE TRUE SI LA MATRIZ INTRODUCIDA ES MÁGICA
    public static boolean esMatrizMagica (int [][] matriz) {
        
        boolean magica = false;
        int cont = 0, sumaF = 0, sumaC = 0;
        
        while (cont < matriz.length) {  
            
            sumaF += sumaFilaMatriz(matriz, cont);            
            sumaC += sumaColumnaMatriz(matriz, cont);            
            
            if (sumaF != sumaC)
                break; 
            
            cont++;
        }
        
        if (sumaF == sumaC)
            magica = true;
        
        return magica;
         
    }
    
    //FUNCION QUE DEVUELVE LA MEDIA DE LOS POSITIVOS DEL ARRAY INTRODUCIDO
    public static float mediaPositivos (int [] a) {
        long acum = 0;
        float media;
        int positivos = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                acum += a[i];
                positivos++;
            }
        }
        
        media = acum / positivos;
        return media;
    }
    
    //FUNCION QUE DEVUELVE LA MEDIA DE LOS NEGATIVOS DEL ARRAY INTRODUCIDO
    public static float mediaNegativos (int [] a) {
        long acum = 0;
        float media;
        int negativos = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                acum += a[i];
                negativos++;
            }
        }
        
        media = acum / negativos;
        return media;
    }
    
    //FUNCION QUE DEVUEELVE EL NÚMERO DE CEROS INCLUIDOS EN EL ARRAY
    public static int cuentaCeros (int [] a) {
        int ceros = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0)
                ceros++;
        }
        return ceros;
    }
    
}
