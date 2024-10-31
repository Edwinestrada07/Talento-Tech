// Clase absatracta, palabra reservada (abstract) me obliga a utilizar por lo menos un método que se haya 
// definido en la superclase o clase padre.

// Las interfaces palabra reservada (interface) es una herramienta utilizada por java para utilizar una herencia
// multiple, su naturalidad es la utilización de métodos abstractos. Lo que se  busca es que una clase herede 
// (atributos o métodos) de varias superClases, para utilizar la interface en una clase se hace con la palabra 
// reservada implements 

package MODULO_1.POO_Herencia.src;

public class empleado {
    private String documento;
    private String nombre;
    private String apellido;
    private int edad;
    private String usuario;
    private int clave;
    
    public empleado(String documento, String nombre, String apellido, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //sobre-carga del método constructor, se genera si y sólo si necesitamos pasar atributos diferentes de la clase
    public empleado(String documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Sobre-carga del método construtor, mismo número de parámetros pero diferente tipo de variable 
    public empleado(String documento, String usuario, int clave) {
        this.documento = documento;
        this.usuario = usuario;
        this.clave = clave;
    }

    //Creación propia del método salario
    public double salario() {
        return 0;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
