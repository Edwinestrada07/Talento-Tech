// 4) Calcular el salario que debe recibir una persona teniendo en cuenta lo siguiente, el salario básico mensual se 
// ingresa por teclado, el número de horas extras se ingresa por teclado, el tipo de horas extras que puede trabajar 
// la persona son; horas extras diurna, el valor de una hora extra diurna corresponde a 25% más del valor de la hora 
// normal de trabajo, horas extras nocturnas el valor de una hora extra nocturna corresponde a 35% más del valor de la 
// hora normal de trabajo, horas extras festivas el valor de una hora extra festiva corresponde a 75% más del valor de 
// la hora normal de trabajo, horas extras dominicales el valor de una hora extra dominica corresponde a 100% más del 
// valor de la hora normal de trabajo. El número de horas extras que trabaja la persona se ingresan por teclado. Al 
// trabajador le descuenta del total de lo que recibe el 4% para salud y el 4% para pensión. Se debe tener presente que 
// el trabajador puede fallar uno o más días y si es así se debe descontar ese día(s) del salario básico. El algoritmo 
// debe mostrar salario básico, total de ingresos por horas extras, descuentos y total a pagar. (Los días de trabajo en 
// Colombia son 30, de 8 horas diarias. 

package MODULO_1.condicional_var_opera.src;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        System.out.println("Ingrese el nombre completo del empleado");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese el salario básico mensual del empleado");
        double salarioMensual = teclado.nextDouble();

        System.out.println("Ingrese el número de horas extras trabajas al mes");
        double horasExtras = teclado.nextDouble();

        double horasTrabajadasMensual = 240;
        double horasTrabajadasDiarias = salarioMensual / horasTrabajadasMensual;

        double horaExtraDiurna = (horasTrabajadasDiarias * 0.25) + horasTrabajadasDiarias;
        double horaExtraNocturna = (horasTrabajadasDiarias * 0.30) + horasTrabajadasDiarias;
        double horaExtraFestivas = (horasTrabajadasDiarias * 0.75) + horasTrabajadasDiarias;
        double horaExtraDominicales = (horasTrabajadasDiarias * 1) + horasTrabajadasDiarias;

        while (true) {
            System.out.println("Por favor selecione el tipo de Hora Extra");
            System.out.println("1 - Horas Extras Diurna");
            System.out.println("2 - Horas Extras Nocturna");
            System.out.println("3 - Horas Extras Festivos");
            System.out.println("4 - Horas Extras Dominicales");
            System.out.println("5 - Salir");
            opcion = Integer.parseInt(teclado.next());

            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.println("El salario básico del empleado es: " + salarioMensual);
                    System.out.println("El valor de la Hora Extra Diurna es: " + horaExtraDiurna);
                    System.out.println("El total del valor de Horas Extras Diurnas realizadas por el empleado " + nombre + " fueron: " + horasExtras * horaExtraDiurna);
                    System.out.println("El total del sueldo mensual del empleado es: " + (salarioMensual + (horasExtras * horaExtraDiurna)));
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("El salario básico del empleado es: " + salarioMensual);
                    System.out.println("El valor de la Hora Extra Nocturna es: " + horaExtraNocturna);
                    System.out.println("El total del valor de Horas Extras Nocturnas realizadas por el empleado " + nombre + " fueron: " + horasExtras * horaExtraNocturna);
                    System.out.println("El total del sueldo mensual del empleado es: " + (salarioMensual + (horasExtras * horaExtraNocturna)));
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("El salario básico del empleado es: " + salarioMensual);
                    System.out.println("El valor de la Hora Extra Festiva es: " + horaExtraFestivas);
                    System.out.println("El total del valor de Horas Extras Festivas realizadas por el empleado " + nombre + " fueron: " + horasExtras * horaExtraFestivas);
                    System.out.println("El total del sueldo mensual del empleado es: " + (salarioMensual + (horasExtras * horaExtraFestivas)));
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("El salario básico del empleado es: " + salarioMensual);
                    System.out.println("El valor de la Hora Extra Dominical es: " + horaExtraDominicales);
                    System.out.println("El total del valor de Horas Extras Dominicales realizadas por el empleado " + nombre + " fueron: " + horasExtras * horaExtraDominicales);
                    System.out.println("El total del sueldo mensual del empleado es: " + (salarioMensual + (horasExtras * horaExtraDominicales)));
                    System.out.println("\n");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcion no valida");
            }
            teclado.close();
        }
    }
}
