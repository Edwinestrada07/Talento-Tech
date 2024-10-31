// 2) Calcular el precio de venta de un artículo. Se tienen los datos de descripción del artículo y el costo de producción. 
// El precio de venta se calcula añadiendo al costo el 120% como utilidad y el 15% de impuesto. 

package MODULO_1.condicional_var_opera.src;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la descripción del articulo");
        String descripcion = teclado.nextLine();

        System.out.println("Ingrese el costo de producción del producto");
        double costoProduccion = teclado.nextDouble();

        double precioVenta = costoProduccion * (1 + 1.2);
        double impuesto = precioVenta * 0.15;
        double precioFinalProducto = precioVenta + impuesto;

        System.out.println("El precio de Venta del producto sin impuesto es: " + precioVenta);
        System.out.println("El impuesto del producto es: " + impuesto);
        System.out.println("El precio de Venta Final del: " + descripcion + " es: " + precioFinalProducto);

        teclado.close();
    }
}
