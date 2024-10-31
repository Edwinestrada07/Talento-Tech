// 7) El gobierno ha establecido el programa SAR (Sistema de Ahorro para el Retiro) que consiste en que 
// los dueños de la empresa deben obligatoriamente depositar en una cuenta bancaria un porcentaje del 
// salario de los trabajadores; adicionalmente los trabajadores pueden solicitar a la empresa que deposite 
// directamente una cuota fija o un porcentaje de su salario en la cuenta del SAR, la cual le será 
// descontada de su pago. Un trabajador que ha decidido aportar a su cuenta del SAR desea saber la cantidad 
// total de dinero que estará depositado a esa cuenta cada mes, y el pago mensual que recibirá.

package MODULO_1.condicional_var_opera.src;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        System.out.println("Ingrese el nombre del empleado");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese el salario mensual del empleado");
        int salarioMensual = teclado.nextInt();

        int descuentoDel5 = (int) (salarioMensual * 0.05);
        int descuentoDel15 = (int) (salarioMensual * 0.15);
        int descuentoDel25 = (int) (salarioMensual * 0.25);

        while (true) {
            System.out.println("Elija la opción para realizar el descuento");
            System.out.println("Tener encuenta que el descuenta puede ser: cuota fija o 5%, 15% o el 25% del salario mensual");
            System.out.println("1 - Descuento del 5%");
            System.out.println("2 - Descuento del 15%");
            System.out.println("3 - Descuento del 25%");
            System.out.println("4 - Descuento cuota fija");
            System.out.println("5 - Salir\n");
            opcion = Integer.parseInt(teclado.next());

            switch (opcion) {
                case 1:
                    System.out.println("El empleado " + nombre + " tiene los siguientes descuentos:");
                    System.out.println("El salario mensual del empleado sin descuento es de: " + salarioMensual);
                    System.out.println("El 5% de descuento corresponde al ingresado al SAR: " + descuentoDel5);
                    System.out.println("El aporte anual es de: " + (descuentoDel5 * 12));
                    System.out.println("El salario mensual con el descuento para el empleado es de: " + (salarioMensual - descuentoDel5));
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("El empleado " + nombre + " tiene los siguientes descuentos:");
                    System.out.println("El salario mensual del empleado sin descuento es de: " + salarioMensual);
                    System.out.println("El 15% de descuento corresponde al ingresado al SAR: " + descuentoDel15);
                    System.out.println("El aporte anual es de: " + (descuentoDel15 * 12));
                    System.out.println("El salario mensual con el descuento para el empleado es de: " + (salarioMensual - descuentoDel15));
                    System.exit(0);
                case 3:
                    System.out.println("El empleado " + nombre + " tiene los siguientes descuentos:");
                    System.out.println("El salario mensual del empleado sin descuento es de: " + salarioMensual);
                    System.out.println("El 25% de descuento corresponde al ingresado al SAR: " + descuentoDel25);
                    System.out.println("El aporte anual es de: " + (descuentoDel25 * 12));
                    System.out.println("El salario mensual con el descuento para el empleado es de: " + (salarioMensual - descuentoDel25));
                    System.exit(0);
                case 4:
                    System.out.println("Ingrese la cuota fija estimada");
                    int cuotaFija = teclado.nextInt();
                    if (cuotaFija >= 10000) {
                        System.out.println("El empleado " + nombre + " tiene los siguientes descuentos:");
                        System.out.println("El salario mensual del empleado sin descuento es de: " + salarioMensual);
                        System.out.println("El aporte anual es de: " + (cuotaFija * 12));
                        System.out.println("El salario mensual con el descuento para el empleado es de: " + (salarioMensual - cuotaFija));
                    } else {
                        System.out.println("Debe de ingresar un monto mínimo de 10.000");
                    }
                    System.exit(0);
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opción no valida, vuelve a intentarlo");;
            }
            teclado.close();
        }
    }
}
