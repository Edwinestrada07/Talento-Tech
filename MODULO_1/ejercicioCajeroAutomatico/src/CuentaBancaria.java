package MODULO_1.ejercicioCajeroAutomatico.src;

public class CuentaBancaria { //Clase cuentaBancaria
    //Atributos de clase de la cuentaBancaria (Se encapsula mediante private)
    private String numeroCuenta; //Se maneja String ya que no se manejan operaciones matemáticas, reduce la memoria
    private String password;
    private double saldo;
    private String mensaje;
    private final String passwordusu = "ab12"; //Simula guardar la contraseña en BD

    //Método Constructor (se le otorga un valor inicial) lleva los datos de validación
    public CuentaBancaria(String numeroCuenta, String password) { //Se pasan solo los parámetros (numeroCuenta y password)
        this.numeroCuenta = numeroCuenta;
        this.password = password;
        this.saldo = 0;
        this.mensaje = "";
    }

    //Método para validación de password
    public boolean login() {
        boolean validacion = false;
        if (password.equals(passwordusu)) {
            validacion = true;
        }
        return validacion;
    }

    //Método para la operación depositar
    public String depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad;
        } else {
            mensaje = "Valor negativo, digite una catidad positiva";
        }
        return "Consignación Exitosa";
    }

    //Método para la operación retirar
    public String retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            mensaje = "Su retiro fue Exitoso\n";
        } else {
            mensaje = "Fondos Insuficientes para su retiro\n";
        }
        return mensaje;
    }

    //Se obtienen los datos mediante los getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getPassword() {
        return password;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getMensaje() {
        return mensaje;
    }
}
