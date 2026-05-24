package net.salesianos.actividad2;

public class MainActividad2 {

    public static void main(String[] args) {

        CocheCombustion coche = new CocheCombustion(
                "Rojo",
                5,
                4,
                "Toyota Corolla",
                "1234ABC",
                20
        );

   
        coche.mover();
        coche.arrancar();
        coche.mover();
        coche.mover();
        coche.mover();


        System.out.println("\nCombustible restante actual: "
                + coche.getLitrosCombustible() + " litros");


        coche.setLitrosCombustible(2);

        System.out.println("\nCombustible modificado a 2 litros.");

        coche.mover();
        coche.mover();
        coche.mover();
    }
}