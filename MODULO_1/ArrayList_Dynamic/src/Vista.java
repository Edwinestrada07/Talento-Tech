package MODULO_1.ArrayList_Dynamic.src;

import javax.swing.JOptionPane;

public class Vista {
    public void vista() {
        System.out.println("Vista de los estudiantes");
        System.out.println("************************"); 
        
        boolean opcion = true;
        int opc;
        while(opcion) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite una opción\n\n1. Agregar\n2. Consultar\n3. Buscar\n4 .Actualizar\n5. Eliminar\6. Salir"));

            switch(opc) {
                case 1:
                    //Insertar
                    break;
                case 2:
                    //consultar
                    break;
                case 3:
                    //Buscar
                    break;
                case 4:
                    //Actualizar
                    break;
                case 5:
                    //Eliminar
                    break;
                case 6:
                    //Salir
                    opcion = false;
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
    }
}
