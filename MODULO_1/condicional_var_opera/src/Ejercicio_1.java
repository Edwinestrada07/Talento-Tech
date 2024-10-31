// 1) Calcular la calificación final de un estudiante. Los datos disponibles para lectura son:
// calificación 1, equivale al 30% de la nota final, calificacion2, equivale al 20% de la nota final, 
// calificacion3, equivale al 10% de la nota final, calificacion4, equivale al 40% de la nota final de 
// cada uno de los cuatro exámenes presentados. La información que se debe imprimir es el promedio de las calificaciones

package MODULO_1.condicional_var_opera.src;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombre = "";
        double nota1, nota2, nota3, nota4, notaFinal;
        
        System.out.println("Nombre del estudiante");
        nombre = teclado.nextLine();

        System.out.println("Ingrese la calificación 1 (30% de la nota final):");
        nota1 = teclado.nextDouble();

        System.out.println("Ingrese la calificación 2 (20% de la nota final):");
        nota2 = teclado.nextDouble();

        System.out.println("Ingrese la calificación 3 (10% de la nota final):");
        nota3 = teclado.nextDouble();

        System.out.println("Ingrese la calificación 4 (40% de la nota final):");
        nota4 = teclado.nextDouble();

        notaFinal = (nota1 * 0.3) + (nota2 * 0.2) + (nota3 * 0.1) + (nota4 * 0.4);

        System.out.println("La calificacion final del alumno " + nombre + " es: " + notaFinal);

        if (notaFinal >= 6){
            System.out.println("El estudiante pasa al siguiente curso. ¡FELICITACIONES!");
        } else {
            System.out.println("El estudiante reprueba el curso, debe repetir");
        }

        teclado.close();
    }
}