package org.ies.shapes.components;

import org.ies.shapes.model.Circulo;

import java.util.Scanner;

public class CirculoReader {
    private final Scanner scanner;

    public CirculoReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Circulo read() {
        System.out.println("Ingresa el color del circulo:");
        String color = scanner.nextLine();
        System.out.println("Ingresa el radio del circulo:");
        Double radio = scanner.nextDouble();
        scanner.nextLine();

        return new Circulo(
                color,
                radio
        );
    }
}

