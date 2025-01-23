package org.ies.shapes.components;

import org.ies.shapes.model.Triangulo;

import java.util.Scanner;

public class TrianguloReader {
    private final Scanner scanner;

    public TrianguloReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Triangulo read(){
        System.out.println("Ingrese el color del triangulo:");
        String color = scanner.nextLine();
        System.out.println("Ingrese la base del triangulo:");
        Double base = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingrese la altura del triangulo:");
        Double altura = scanner.nextDouble();
        scanner.nextLine();

        return new Triangulo(
                color,
                base,
                altura
        );
    }
}
