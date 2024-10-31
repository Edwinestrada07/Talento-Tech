package MODULO_1.POO_Herencia.src;

//Palabra reservada extends propia del lenguaje para manejar las herencias de clases
public class empleadoAdmin extends empleado{
    public int numeroproyectos; //Puede tener sus propios atributos 


    //Hereda los atributos de la clase empleado
    public empleadoAdmin(String documento, String nombre, String apellido, int edad, int numeroproyectos) {
        super(documento, nombre, apellido, edad); // Se heredan los datos del constructor y no es necesario this.
        this.numeroproyectos = numeroproyectos; //Se pasa el atributo propio que se creo
    }

    //Sobre-escritura del método salario llamado desde la clase empleado
    @Override
    public double salario() {
        // TODO Auto-generated method stub
        return super.salario();
    }
   
}
