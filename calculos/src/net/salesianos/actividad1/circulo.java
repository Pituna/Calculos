package net.salesianos.actividad1;

public class circulo implements CalculoGeometrico {

    protected double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}