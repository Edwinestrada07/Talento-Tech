package MODULO_1.ejercicioNominaHorasExtras.src;
import java.text.NumberFormat;
import java.util.Locale;

//Con la palabra reservada extends, extiendo o heredo los atributos de la clase empleado
public class Nomina extends Empleado {
    
    //Hereda los atributos de la clase empleado
    public Nomina(int cantidadHorasExtra, int diasAusente, double salarioBasico, double horasExtraDiurna, double horasExtraNocturna,
                  double horasExtraFestiva, double horasExtraDominical) {
        super(cantidadHorasExtra, diasAusente, salarioBasico, horasExtraDiurna, horasExtraNocturna, horasExtraFestiva, horasExtraDominical);
    }

    //Sobre-escritura del método calcularSalarioTotal llamado desde la clase empleado
    @Override
    public String calcularSalarioTotal() {
        Locale col = new Locale("es", "CO");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(col);
        
        double valorHora = this.salarioBasico / 240;
        double cantidadHorasExtra = this.cantidadHorasExtra;
        double salarioExtraDiurna = this.horasExtraDiurna * valorHora * 0.25;
        double salarioExtraNocturna = this.horasExtraNocturna * valorHora * 0.35;
        double salarioExtraFestiva = this.horasExtraFestiva * valorHora * 0.75;
        double salarioExtraDominical = this.horasExtraDominical * valorHora * 1;

        double totalHorasExtra = salarioExtraDiurna + salarioExtraNocturna + salarioExtraFestiva + salarioExtraDominical;
        double descuentoDiasAusente = this.diasAusente * (this.salarioBasico / 30);
        double salarioNeto = this.salarioBasico + totalHorasExtra - descuentoDiasAusente;
        double descuentoSalud = salarioNeto * 0.04;
        double descuentoPension = salarioNeto * 0.04;

        double salarioTotal = salarioNeto - descuentoSalud - descuentoPension;

        return 
            "Salario Básico: " + formatter.format(this.salarioBasico) +
            "\nCantidad Horas Extras Trabajadas" + formatter.format(cantidadHorasExtra) +
            "\nHoras Extras Diurnas: " + formatter.format(salarioExtraDiurna) +
            "\nHoras Extras Nocturnas: " + formatter.format(salarioExtraNocturna) +
            "\nHoras Extras Festivas: " + formatter.format(salarioExtraFestiva) +
            "\nHoras Extras Dominicales: " + formatter.format(salarioExtraDominical) +
            "\nDescuento Días Ausentes: " + formatter.format(descuentoDiasAusente) +
            "\nDescuento Salud: " + formatter.format(descuentoSalud) +
            "\nDescuento Pensión: " + formatter.format(descuentoPension) +
            "\nSalario Total: " + formatter.format(salarioTotal);
    }
}
