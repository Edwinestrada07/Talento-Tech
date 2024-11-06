import java.util.HashMap;

public class BDLibros {
    HashMap<Integer, Libro> data = new HashMap<>();

    public void agregarLibro(Libro libro) {
        data.put(libro.getId(), libro);       
    }

    public HashMap<Integer, Libro> consultarLibros() {
        return data;
    }

    public boolean eliminarLibro(int id) {
        Libro libro = data.get(id);
        if(libro != null) {
            data.remove(id);
            return true;
        }
        return false;
    }

    public Libro buscarLibro(int id) {
        return data.get(id);
    }
}
