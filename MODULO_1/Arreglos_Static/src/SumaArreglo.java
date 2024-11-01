package MODULO_1.Arreglos_Static.src;

public class SumaArreglo {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,5,6,7,8,9};
        int suma = 0;

        // Recorre el arreglo y suma los elementos for each
        for (int i : numeros) {
            suma += i;
        }
        System.out.println("La suma es igual a: " + suma);
    }
}
