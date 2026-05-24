package net.salesianos.actividad1;

import java.util.Scanner;

public class MainActividad1 {

    public static void main(String[] args) {

        Scanner josele = new Scanner(System.in);

        // RECTÁNGULO
        System.out.println(" DATOS DEL RECTÁNGULO ");

        System.out.print("Introduce la base: ");
        double base = josele.nextDouble();

        System.out.print("Introduce la altura: ");
        double altura = josele.nextDouble();

        rectangulo rectangulo = new rectangulo(base, altura);

        System.out.println("\nRECTÁNGULO CREADO");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        // CÍRCULO
        System.out.println("\n DATOS DEL CÍRCULO ");

        System.out.print("Introduce el radio: ");
        double radio = josele.nextDouble();

        circulo circulo = new circulo(radio);

        System.out.println("\nCÍRCULO CREADO");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        josele.close();
    }
}