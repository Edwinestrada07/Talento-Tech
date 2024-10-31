// 8) En un juego de preguntas a las que se responde Si o No gana quien responda correctamente las tres preguntas.
// Si se responde mal a cualquiera de ellas ya no se pregunta la siguiente y termina el juego. Las preguntas son:
// ¿Colon descubrió América?
// ¿La independencia de México fue en el año 1810?
// ¿The Doors fue un grupo de rock americano?

package MODULO_1.condicional_var_opera.src;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al juego de cultura general, escribe la opción correcta para avanzar\n");
        System.out.println("¿Colon descubrió América?");
        System.out.println("1.Si o 2.No" );

        int respuesta = teclado.nextInt();
        switch (respuesta){
            case 1:
            System.out.println("Correcto, vas por buen camino");
                break;
            case 2:
            System.out.println("Incorrecto, sera para una próxima");
            System.exit(0);
                break;
        }

        System.out.println("¿La independencia de México fue en el año 1810?");
        System.out.println("1.Si o 2.No" );

        int respuesta2 = teclado.nextInt();
        switch (respuesta2){
            case 1:
                System.out.println("Correcto, sigue así casi lo logras");
                break;
            case 2:
                System.out.println("Incorrecto, finalizaste el juego");
                System.exit(0);
                break;
        }

        System.out.println("¿The Doors fue un grupo de rock americano?");
        System.out.println("1.Si o 2.No" );

        int respuesta3 = teclado.nextInt();
        switch (respuesta3){
            case 1:
                System.out.println("Correcto");
                break;
            case 2:
                System.out.println("Incorrecto, aahhh fallaste intentalo luego");
                System.exit(0);
                break;
        }
        System.out.println("¡FELICITACIONES, GANASTE.......!");

        teclado.close();
    }
}
