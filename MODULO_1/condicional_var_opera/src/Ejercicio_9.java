// 9) Un proveedor de estéreos ofrece un descuento del 10% sobre el precio sin IVA, de algún aparato si esta
// cuesta $2000 o más. Además, independientemente de esto, ofrece un 5% de descuento si la marca es NOSY.
// Determinar cuánto pagara, con IVA incluido, un cliente cualquiera por la compra de su aparato.

package MODULO_1.condicional_var_opera.src;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double iva = 1.21;
        String nombreStereo = "";

        System.out.println("Ingrese el nombre del estéreo");
        nombreStereo = teclado.nextLine();

        System.out.println("Ingrese el precio del estéreo sin incluir el IVA");
        double precioStereo = teclado.nextDouble();

        if (precioStereo >= 2000) {
            System.out.println("El descuento del estéreo con el 10% es de: " + (precioStereo * 0.10));
            System.out.println("El precio del estéreo aplicando el descuento es de: " + (precioStereo - ((precioStereo * 0.10))));
            System.out.println("El precio del estéreo con el descuento y más el iva es de: " + (precioStereo - (precioStereo * 0.10)) * iva);

            if (nombreStereo.equalsIgnoreCase("NOSY")) {
                System.out.println("El descuento del estéreo del 5% mas en marca es de: " + ((precioStereo - (precioStereo * 0.10)) * iva) * 0.05);
            }
            
        } else {
            System.out.println("El estéreo no aplica para ningun descuento");
            System.out.println("Total a pagar del estéreo " + (precioStereo * iva));
        }

        teclado.close();
    }
}
