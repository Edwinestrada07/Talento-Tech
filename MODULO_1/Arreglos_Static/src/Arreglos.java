// Conjunto de datos que se almacena en memoria de manera contigua con el mismo nombre, pero con diferentes 
// índices. Los arreglos son estructuras fijas que se declaran y que mantienen su tamaño durante toda la ejecución 
// del programa, los arreglos pueden ser de un determinado tipo de dato y puede almacenar solo valores de ese tipo
// Unidimensionales: Poseen unicamente filas o columnas, ejemplo los vectores.
// Bidimensionales: Comprenden tablas de valores, donde cada elemento esta sumultáneamente en una fila y una columna a la vez
// ejemplo las matrices.

package MODULO_1.Arreglos_Static.src;

public class Arreglos {
    public static void main(String[] args) {
        //Declaración el vector o arreglo    
        int [] vector = new int[4];
        
        //Asignación datos del arreglo
        vector[0] = 10;
        vector[1] = 20;
        vector[2] = 30;
        vector[3] = 40;
        
        //Mostrar datos del arreglo (Se puede localizar por la posición del índ)
        System.out.println("El arreglo es: " + vector[0] + ", " + vector[1] + ", " + vector[2] + ", " + vector[3]);
        
        //Recorrer el arreglo con un ciclo for
        System.out.println("Elementos del arreglo:");
        System.out.println("El tamaño del vector es: " + vector.length); // .length me arroja el tamaño 
        for (int i = 0; i < 4; i++) {
            System.out.println(vector[i] + " ");
        } 
    }  
}