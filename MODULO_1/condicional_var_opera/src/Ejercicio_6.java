// 6) Un supermercado ha puesto en oferta la venta al por mayor de cierto producto, ofreciendo un descuento del
// 15% por la compra de más de 3 docenas y 10% en caso contrario. Además, por la compra de más de 3 docenas se
// obsequia una unidad del producto por cada docena. Diseñe un algoritmo que determine el monto de la compra, el monto
// del descuento, el monto a pagar y el número de unidades de obsequio por la compra de cierta cantidad de docenas del
// producto.

package MODULO_1.condicional_var_opera.src;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de docenas a comprar");

        double producto = teclado.nextDouble();
        double valorDocena = 10000;
        double totalProducto = valorDocena * producto;
        double descuentoQuince = totalProducto * 0.15;
        double descuentoDiez = totalProducto * 0.10;

        System.out.println("Valor sin descuento: " + totalProducto);

        if(producto >= 3){
            totalProducto -= descuentoQuince;
            System.out.println("Número de unidades " + (producto * 12));
            System.out.println("Número de obsequios " + producto + " unidades");
            System.out.println("Su descuento fue de: " + descuentoQuince);
        } else if (producto < 3) {
            totalProducto -= descuentoDiez;
            System.out.println("Número de unidades " + producto * 12);
            System.out.println("Su descuento fue de: " + descuentoDiez);
        }
        System.out.println("Su monto a pagar: " + totalProducto);

        teclado.close();
    }
}
