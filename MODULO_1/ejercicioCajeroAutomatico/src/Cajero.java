package MODULO_1.ejercicioCajeroAutomatico.src;

import java.util.Scanner;

public class Cajero {
    private Scanner scanner; 

    public void menu () {
        scanner = new Scanner(System.in);

        System.out.println("Digite la clave");
        String clave = scanner.next();

        CuentaBancaria cuentabancaria = new CuentaBancaria("12221", clave); //Se instancia cuentaBancaria
        boolean valid = cuentabancaria.login(); //Se valida el método login creado en cuentaBancaria

        if (valid) { //Se llama la variable valid nombrada anteriormente, para verificar el login sea correcto
            while (true) {
                System.out.println("Por favor seleccione la opción");
                System.out.println("1. Consultar Saldo");
                System.out.println("2. Depositar");
                System.out.println("3. Retirar");
                System.out.println("4. Salir");
                String opc = scanner.next();

                switch (opc) {
                    case "1":
                        System.out.println("Su saldo es: " + cuentabancaria.getSaldo()); //Objeto cuentaBancaria y se optiene el saldo a partir de get
                        break;
                    case "2":
                        System.out.println("Digite la cantidad a depositar");
                        double deposito = scanner.nextDouble();

                        System.out.println(cuentabancaria.depositar(deposito)); //System.out retorna el valor de la función
                        break;
                    case "3":
                        System.out.println("Digite la cantidad a retirar");
                        double retiro = scanner.nextDouble();

                        System.out.println(cuentabancaria.retirar(retiro)); //System.out retorna el valor de la función
                        break;
                    case "4":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción incorrecta");;
                }
            }
        } else {
            System.out.println("Clave incorrecta");
        }
    }
}
