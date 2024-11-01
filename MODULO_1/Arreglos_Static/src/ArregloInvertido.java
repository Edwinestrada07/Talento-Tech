package MODULO_1.Arreglos_Static.src;

public class ArregloInvertido {
    public static void main(String[] args) {

        int [] numeroInvertir = {1,2,3,4,5,6,7,8,9};
        System.out.println("Arreglo original: {1,2,3,4,5,6,7,8,9}");

        for (int i = 8; i >= 0; i--) {
            System.out.print(numeroInvertir[i] + " ");
        }
    }
}
