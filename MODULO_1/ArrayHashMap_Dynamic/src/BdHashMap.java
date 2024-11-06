// Se crea una simulación de base de datos y se crean los métodos utilizando HashMap

import java.util.HashMap;

public class BdHashMap {
    //HashMap creado de manera global para generar el objeto
    HashMap<String, Estudiante> data = new HashMap<>();
    Estudiante estudiante;
    boolean respuesta = false;

    //Método ingresar (Utilizando HashMap) - crear un objeto de la clase estudiante
    public void ingresar(Estudiante estudiante) {
        //Ingresamos datos con el método put, y get obtenemos el dato en este caso documento
        //El objeto se utiliza para ingresar a los métodos de la clase estudiante
        data.put(estudiante.getDocumento(), estudiante);
    }

    //Método de tipo HashMap (Para consultar todos los datos)
    public HashMap<String, Estudiante> consultar() {
        return data;
    }

    //Método Buscar Dato (Utilizando HashMap)
    public Estudiante buscarDato(String documento) {
        return data.get(documento);
    }

    // Método Actualizar Dato (Utilizando HashMap)
    public void actualizar(String documento, Estudiante estudiante) {
        data.put(documento, estudiante);
    }

    // Método Eliminar Dato (Utilizando HashMap)
    public boolean eliminar(String documento) {
        Estudiante doc = data.get(documento);
        if(doc != null) {
            data.remove(documento);
            respuesta = true;
        }
        return respuesta;
    }
}
