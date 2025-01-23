package org.ies.shapes.components;

import org.ies.shapes.model.Cuadrado;

import java.util.Scanner;

public class CuadradoReader {
    private final Scanner scanner;

    public CuadradoReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Cuadrado read(){
        System.out.println("Ingresa el color del cuadrado:");
        String color = scanner.nextLine();
        System.out.println("Ingresa la longitud del lado del cuadrado:");
        Double lado = scanner.nextDouble();
        scanner.nextLine();

        return new Cuadrado(
                color,
                lado
        );
    }
}
