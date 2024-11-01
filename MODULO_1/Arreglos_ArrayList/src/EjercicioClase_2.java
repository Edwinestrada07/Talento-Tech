// 2) Realiza un programa el cual recorra un arreglo he identifique el número mayor

package MODULO_1.Arreglos_ArrayList.src;
import java.util.Scanner;

public class EjercicioClase_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] numeroMayor = new int[5];
        int mayor = 0;
        
        System.out.println("Ingrese un número");
        for (int i = 0; i < numeroMayor.length; i++) {
            numeroMayor[i] = teclado.nextInt();

            if (numeroMayor[i] > mayor) {
                mayor = numeroMayor[i];
            }
        }
        System.out.println("El númro mayor es: " + mayor);
        teclado.close();
    }
}
