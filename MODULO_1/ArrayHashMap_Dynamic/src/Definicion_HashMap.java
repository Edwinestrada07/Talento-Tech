// Lista de matrices de Java:
// La ArrayList clase es una matriz redimensionable , que se puede encontrar en el java.utilpaquete.
// La diferencia entre una matriz incorporada y una matriz ArrayList en Java es que el tamaño de una
// matriz no se puede modificar (si desea agregar o eliminar elementos de una matriz, debe crear una nueva).
// Mientras que los elementos se pueden agregar y eliminar de una matriz ArrayList cuando lo desee.
// La sintaxis también es ligeramente diferente:

// En este ArrayList capítulo, aprendiste que las matrices almacenan elementos como una colección ordenada y
// que se puede acceder a ellos con un número de índice (int tipo). HashMap Sin embargo, las matrices almacenan
// elementos en pares " clave / valor " y se puede acceder a ellos mediante un índice de otro tipo (por
// ejemplo, a String).

// Un objeto se utiliza como clave (índice) de otro objeto (valor). Puede almacenar distintos tipos:
// Stringclaves y Integervalores, o el mismo tipo, como: Stringclaves y Stringvalores:

import java.util.*;

public class Definicion_HashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> datos = new HashMap<>();

        // Añadir elementos al HashMap (Put es un método)
        datos.put(1, "Lucas");
        datos.put(2, "Lina");
        datos.put(3, "Marcos");

        if (datos.containsValue("Lina")) { //Para buscar por valor (En este caso nombre)
            System.out.println("El dato se encontro");
        } else {
            System.out.println("El dato no se encontro");
        }

        if (datos.containsKey(1)) { // Para buscar por key o clave
            System.out.println("Clave se encontro");
        } else {
            System.out.println("Clave no encontrada");
        }

        System.out.println(datos);
        System.out.println("El valor es de " + datos.get(2)); // Método get me arroja el valor a travéz de la clave

        // Borrar un elemento del HashMap (Remove es un método) remuevo por clave
        datos.remove(2);
        System.out.println(datos);
    }
}
