package net.salesianos.actividad2;

public abstract class vehiculo {

    protected String color;
    protected int numeroPuertas;
    protected int numeroRuedas;
    protected String modelo;
    protected String matricula;

    public vehiculo(String color, int numeroPuertas, int numeroRuedas,
                    String modelo, String matricula) {

        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.numeroRuedas = numeroRuedas;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public abstract void arrancar();

    public abstract void pararMotor();

    public abstract void mover();
}