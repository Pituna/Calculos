package net.salesianos.actividad2;

public class CocheCombustion extends Vehiculo {

    protected boolean motorEncendido;
    protected double litrosCombustible;

    public CocheCombustion(String color, int numeroPuertas,
                           int numeroRuedas, String modelo,
                           String matricula, double litrosCombustible) {

        super(color, numeroPuertas, numeroRuedas, modelo, matricula);

        this.litrosCombustible = litrosCombustible;
        this.motorEncendido = false;
    }

    public double getLitrosCombustible() {
        return litrosCombustible;
    }

    public void setLitrosCombustible(double litrosCombustible) {
        this.litrosCombustible = litrosCombustible;
    }

    @Override
    public void arrancar() {

        if (litrosCombustible > 0) {

            litrosCombustible--;
            motorEncendido = true;

            System.out.println("El coche ha arrancado.");
            System.out.println("Combustible restante: " + litrosCombustible + " litros");

        } else {

            motorEncendido = false;
            System.out.println("No hay combustible. El coche no puede arrancar.");
        }
    }

    @Override
    public void pararMotor() {

        motorEncendido = false;
        System.out.println("El motor se ha detenido.");
    }

    @Override
    public void mover() {

        if (!motorEncendido) {

            System.out.println("El coche no puede moverse porque el motor está apagado.");
            return;
        }

        if (litrosCombustible <= 0) {

            System.out.println("El coche no tiene combustible.");
            motorEncendido = false;
            return;
        }

        litrosCombustible--;

        System.out.println("El coche se está moviendo.");
        System.out.println("Combustible restante: " + litrosCombustible + " litros");

        if (litrosCombustible <= 0) {

            System.out.println("El combustible se ha agotado.");
            motorEncendido = false;
        }
    }
}