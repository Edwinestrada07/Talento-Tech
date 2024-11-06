import java.util.Scanner;

public class OpcionesLibros {
    private Libro libro;

    public void opciones() {
        System.out.println("1. Añadir libro");
        System.out.println("2. Buscar Libros");
        System.out.println("3. Eliminar libro por su ID");
        System.out.println("4. Buscar libro por ID");
        System.out.println("5. Salir");
        Scanner teclado = new Scanner(System.in);

        int opcion = teclado.nextInt();
        BDLibros baseDatos = new BDLibros();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el ID del libro");
                System.out.println("Ingrese el titulo del libro");
                System.out.println("Ingrese el autor del libros");
                System.out.println("Ingrese la disponibilidad del libro");

                libro = new Libro(opcion, null, null);
                baseDatos.agregarLibro(libro);
                System.out.println("Añadiendo libro...");
                break;

            case 2:
                baseDatos.consultarLibros();
                System.out.println("Buscando libros...");
                break;

            case 3:
                System.out.println("Eliminando libro...");
                break;
            case 4:
                System.out.println("Buscando libro...");
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        teclado.close();
    }
}
