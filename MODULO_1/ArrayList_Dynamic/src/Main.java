import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<>();
        //para ingresar datos de manera estatica add
        datos.add("Lucas");
        datos.add("Ana");
        datos.add("Rosa");
        datos.add("Luis");
        System.out.println(datos);
        System.out.println(datos.size()); // Para saber cuantos datos trae el arrayList

        //para remover datos de un arrayList
        datos.remove("Ana"); //Por nombre o por index 
        System.out.println(datos);

        // para consultar un dato
        if (datos.contains("Rosa")) {
            System.out.println("El dato se encontro");
        }

        //Para modificar un dato por el index
        datos.set(1, "Sofia");

        // para recorrer los datos de un arrayList
        for(String i : datos) {
            System.out.println(i);
        }

        Collections.sort(datos);
        System.out.println(datos);
    }
}
