// 3) Realiza un programa el cual recorra un arreglo he identifique el número mayor y el número menor

package MODULO_1.Arreglos_ArrayList.src;
import java.util.Scanner;

public class EjercicioClase_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] MayorMenor = new int[15];
        int mayor = MayorMenor[1];
        int menor = MayorMenor[1];

        System.out.println("Ingrese un arreglo de números para determinar mayor y menor");
        for (int i = 0; i < MayorMenor.length; i++) {
            MayorMenor[i] = teclado.nextInt();
            
            if (MayorMenor[i] > mayor) {
                mayor = MayorMenor[i];
            }
            if (MayorMenor[i] < menor) {
                menor = MayorMenor[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        teclado.close();
    }
}
