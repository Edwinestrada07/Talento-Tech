// 3) Calcular los honorarios de una persona que le pagan por hora trabajada $75.000
// Se debe pedir la cantidad de horas que trabajo en el mes de septiembre.
// Del total debe dejar un 12,5% para pago de salud y un 16% para pago de pensión.
// El programa debe mostrar el total de lo que recibe, cuanto debe pagar a salud cuanto a pensión y el 
// total que le queda después de estos pagos.

package MODULO_1.condicional_var_opera.src;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese el total de horas trabajadas");
        double cantidadHoras = teclado.nextDouble();

        double totalAPagar = cantidadHoras * (75000);
        double pagoSalud = 12.5;
        double pagoPension = 16;
        double descuentos = (totalAPagar * (pagoSalud + pagoPension)) / 100;
        double totalAPagarConDescuentos = totalAPagar - descuentos;

        System.out.println("El total a pagar sin descuento para el empleado " + nombre + " es: " + totalAPagar);
        System.out.println("El total de los descuentos legales es: " + descuentos);
        System.out.println("Las horas extras del empleado " + nombre + " en el mes fue de: " + totalAPagarConDescuentos);

        teclado.close();
    }
}
