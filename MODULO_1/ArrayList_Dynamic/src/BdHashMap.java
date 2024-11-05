// Se crea una simulación de base de datos y se crean los métodos utilizando HashMap

package MODULO_1.ArrayList_Dynamic.src;
import java.util.*;

public class BdHashMap {
    HashMap<String, Estudiante> data = new HashMap<>();
    Estudiante estudiante;
    boolean respuesta = false;

    // Método ingresar (Utilizando HashMap)
    public void ingresar(Estudiante estudiante) {
        //Ingresamos datos con el método put, y con get obtenemos el dato en este caso documento
        data.put(estudiante.getDocumento(),estudiante);       
    }

    //Método de tipo HashMap
    public HashMap<String, Estudiante> Consultar () {
        return data;
    }

    // Método Buscar Dato (Utilizando HashMap)
    public Estudiante buscarDato(String documento) {
        return data.get(documento);
    }

    // Método Actualizar Dato (Utilizando HashMap)
    public void actualizar(String documento, Estudiante estudiante) {
        data.put(documento, estudiante);    
    }

    public boolean eliminar(String documento) {
        Estudiante  doc = data.get(documento);
        if (doc!= null) {
            data.remove(documento);
            respuesta = true;
        }
        return respuesta;
    }
}
