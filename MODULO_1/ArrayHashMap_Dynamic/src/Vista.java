import javax.swing.*;

public class Vista {
    private Estudiante estudiante;

    public void vista() {
        BdHashMap bd = new BdHashMap(); //instanciamos la clase BdHashMap para utilizar los métodos creados

        boolean opcion = true;
        int opc;
        while (opcion) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite una opción\n\n1.Agregar\n2.Consultar\n3.Buscar\n4.Actualizar\n5.Eliminar\n6.Salir"));

            switch (opc) {
                case 1:
                    //Insertar
                    String documento = JOptionPane.showInputDialog("Ingrese el documento");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));

                    estudiante = new Estudiante(documento, nombre, edad); //Se envian datos del constructor
                    bd.ingresar(estudiante);
                    break;

                case 2:
                    //Consultar
                    JOptionPane.showMessageDialog(null, "Datos consultados " + bd.consultar());
                    break;

                case 3:
                    //Buscar
                    String documentoConsultar = JOptionPane.showInputDialog("Digite número de documento a consultar");
                    JOptionPane.showMessageDialog(null, "Dato consultado por documento " + bd.buscarDato(documentoConsultar));
                    break;

                case 4:
                    //Actualizar
                    String documentoNew = JOptionPane.showInputDialog("Ingrese el documento a modificar");
                    String nombreNew = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
                    int edadNew = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad"));

                    estudiante = new Estudiante(nombreNew, edadNew);
                    bd.actualizar(documentoNew, estudiante);
                    break;

                case 5:
                    //Eliminar
                    String documentoDelete = JOptionPane.showInputDialog("Ingrese el documento a eliminar");
                    if (bd.eliminar(documentoDelete)) {
                        JOptionPane.showMessageDialog(null, "Dato eliminado");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el dato");
                    }
                    break;

                case 6:
                    //Salir
                    opcion = false;
                    break;

                default:
                    System.out.println("Ingrese una opción valida");
            }
        }
    }
}
