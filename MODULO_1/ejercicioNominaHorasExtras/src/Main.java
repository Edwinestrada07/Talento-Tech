package MODULO_1.ejercicioNominaHorasExtras.src;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Variables para almacenar las horas extra de cada tipo
        double horasExtraDiurna = 0;
        double horasExtraNocturna = 0;
        double horasExtraFestiva = 0;
        double horasExtraDominical = 0;

        // Entrada del salario básico con validación de entrada
        double salarioBasico = solicitarDouble("Ingrese su salario básico");

        // Preguntamos si el empleado realizó horas extras
        String respuesta = JOptionPane.showInputDialog(null, "¿El empleado realizó horas extras? (Si/No)", "Horas Extras", JOptionPane.QUESTION_MESSAGE);

        // Procesamos la respuesta para decidir si ingresar horas extra
        if ("si".equalsIgnoreCase(respuesta)) {
            boolean continuar = true;
            while (continuar) {
                // Opciones de selección de tipo de horas extra
                String[] opciones = {"Horas Extras Diurnas", "Horas Extras Nocturnas", "Horas Extras Festivas", "Horas Extras Dominicales", "Salir"};
                int opcion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de Hora Extra", "Horas Extras",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

                // Condicional de selección de tipo de hora extra
                switch (opcion) {
                    case 0:
                        horasExtraDiurna = solicitarDouble("Ingrese las Horas Extras Diurnas");
                        break;
                    case 1:
                        horasExtraNocturna = solicitarDouble("Ingrese las Horas Extras Nocturnas");
                        break;
                    case 2:
                        horasExtraFestiva = solicitarDouble("Ingrese las Horas Extras Festivas");
                        break;
                    case 3:
                        horasExtraDominical = solicitarDouble("Ingrese las Horas Extras Dominicales");
                        break;
                    case 4:
                        continuar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron horas extras. Gracias.");
        }

        int cantidadHorasExtra = solicitarEntero("Ingrese la cantidad de Horas Extra realizadas");

        // Entrada de los días que el empleado estuvo ausente
        int diasAusente = solicitarEntero("Ingrese la cantidad de días que el empleado faltó");

        // Instanciamos la clase Nomina con los parámetros ingresados
        Empleado empleado = new Nomina(cantidadHorasExtra, diasAusente, salarioBasico, horasExtraDiurna, horasExtraNocturna, horasExtraFestiva, horasExtraDominical);
        
        // Calculamos el salario total y lo mostramos al usuario
        String resultado = empleado.calcularSalarioTotal();
        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método auxiliar para solicitar entrada de tipo double
    private static double solicitarDouble(String mensaje) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }
    }

    // Método auxiliar para solicitar entrada de tipo entero
    private static int solicitarEntero(String mensaje) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }
    }
}
