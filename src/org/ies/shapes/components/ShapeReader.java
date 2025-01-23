package org.ies.shapes.components;

import org.ies.shapes.model.Shape;

import java.util.Scanner;

public class ShapeReader {
    private final Scanner scanner;
    private final CirculoReader circuloReader;
    private final CuadradoReader cuadradoReader;
    private final TrianguloReader trianguloReader;

    public ShapeReader(Scanner scanner, CirculoReader circuloReader, CuadradoReader cuadradoReader, TrianguloReader trianguloReader) {
        this.scanner = scanner;
        this.circuloReader = circuloReader;
        this.cuadradoReader = cuadradoReader;
        this.trianguloReader = trianguloReader;
    }

    public Shape read() {
        int option = chooseOption();
        do{
            if(option == 1){
                return circuloReader.read();
            }
            if(option == 2){
                return cuadradoReader.read();
            }
            if(option == 3){
                return trianguloReader.read();
            }
        }while (option != 4);

        return null;
    }

    public int chooseOption(){
        int option;

        System.out.println("Eliga una opcion del menu:");
        System.out.println("1.Circulo:");
        System.out.println("2.Cuadrado:");
        System.out.println("3.Triangulo:");

        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}
