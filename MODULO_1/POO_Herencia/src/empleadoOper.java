package MODULO_1.POO_Herencia.src;

public class empleadoOper extends empleado {

    //Hereda los atributos de la clase empleado
    public empleadoOper(String documento, String nombre, String apellido) {
        super(documento, nombre, apellido);
    }

    //Sobre-escritura del método salario llamado desde la clase empleado
    @Override
    public double salario() {
        // TODO Auto-generated method stub
        return super.salario();
    }
      
}
