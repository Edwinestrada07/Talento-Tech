package MODULO_1.ejercicioNominaHorasExtras.src;

public abstract class Empleado {
    protected int cantidadHorasExtra;
    protected int diasAusente;
    protected double salarioBasico;
    protected double horasExtraDiurna;
    protected double horasExtraNocturna;
    protected double horasExtraFestiva;
    protected double horasExtraDominical;

    // Constructor para inicializar los atributos
    // Creamos el método constructor en base a los atributos y generamos los parámetros
    // Método Constructor (se le otorga un valor inicial) lleva los datos de validación
    public Empleado(int cantidadHorasExtra, int diasAusente, double salarioBasico, double horasExtraDiurna, double horasExtraNocturna,
                    double horasExtraFestiva, double horasExtraDominical) {
        this.cantidadHorasExtra = cantidadHorasExtra;
        this.diasAusente = diasAusente;
        this.salarioBasico = salarioBasico;
        this.horasExtraDiurna = horasExtraDiurna;
        this.horasExtraNocturna = horasExtraNocturna;
        this.horasExtraFestiva = horasExtraFestiva;
        this.horasExtraDominical = horasExtraDominical;
    }

    // Método abstracto que calculará el salario total
    public abstract String calcularSalarioTotal();
}
