// 1) Elabore un algoritmo que solicite la cantidad de número que se van a procesar, luego que lea los 
// números y calcule e imprima el promedio de dichos números.

import javax.swing.JOptionPane;

public class Ejerci_1 {
    public static void main(String[] args) {
        
        int numerosAProcesar = 0;

        numerosAProcesar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números va a procesar?"));
        //System.out.println("El promedio es: " + promedio(numerosAProcesar));
        JOptionPane.showMessageDialog(null, args, null, numerosAProcesar);
    }

    public static int promedio(int cantidad) {
        System.out.println("Cantidad de números: " + cantidad);

        int total = 0;

        for (int i = 1; i <= cantidad; i++) {
            total += Integer.parseInt(JOptionPane.showInputDialog("Digite el número " + i));           
        }
        return total / cantidad;
    }
}
