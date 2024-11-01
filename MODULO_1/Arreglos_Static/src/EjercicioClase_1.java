// 1) Realizar un programa que permita ingresar o capturar 15 números en un vector. Una vez cargados, se requiere 
// que el programador muestre por panatalla el número de veces que se ingresó el número 3.

package MODULO_1.Arreglos_Static.src;
import java.util.Scanner;

public class EjercicioClase_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] numeros3 = new int [15];
        int contador = 0;

        System.out.println("Ingrese un número para el arreglo");
        for (int i = 0; i < numeros3.length; i++) {
            numeros3[i] = teclado.nextInt();

            if (numeros3[i] == 3) {
                contador += 1;
            }
        }
        System.out.println("El número 3 se encuentra " + contador + " veces");
        teclado.close();
    }
}

        /*int [] numeros;
        int dato = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese cantidad de datos"));
        int contador = 0;
        numeros = new int[dato];

        for (int i = 0; i < dato; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese dato " + (i + 1)));

            if(numeros[i] == 3){
                contador++;
            }
            System.out.println("Dato" + (i + 1) + " es: " + numeros[i]);
        }
        System.out.println("El numero 3 aparece: " + contador);*/