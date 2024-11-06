// 1) Sistema de Gestión de Biblioteca <<<<<---------
// Contexto: Crea una aplicación para gestionar una biblioteca donde los usuarios pueden agregar, eliminar 
// y buscar libros.
// Requerimientos:
// • Define una clase Libro que tenga atributos como id, titulo, autor y disponibilidad.
// • Utiliza un HashMap<Integer, Libro> para almacenar los libros, donde la clave es el id del libro.
// • Implementa métodos para agregar un nuevo libro, eliminar un libro por su id y buscar un libro por 
// su titulo.

public class Main {
    public static void main(String[] args) {
        OpcionesLibros vista = new OpcionesLibros();
        vista.opciones();        
    }
}
