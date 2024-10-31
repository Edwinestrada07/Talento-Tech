// 5) En un estacionamiento cobran $ 1.500 por hora o fracción. Diseñe un algoritmo que determine cuanto debe pagar 
// un cliente por el estacionamiento de su vehículo, conociendo el tiempo de estacionamiento en horas y minutos. 

package MODULO_1.condicional_var_opera.src;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ingrese las horas ");
        int hora = teclado.nextInt();

        System.out.println("Ingrese los minutos");
        int minutos = teclado.nextInt();

        int totalAPagar = (hora * 1500) + 1500;

        System.out.println("El valor total a pagar es de: " + totalAPagar);
        System.out.println("El anterior cobra hace relación a la cantidad de " + hora + " horas " + " y la cantidad de " + minutos + " minutos ");

        teclado.close();
    }
}
