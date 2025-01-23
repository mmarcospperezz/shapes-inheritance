import org.ies.shapes.components.*;
import org.ies.shapes.model.Draw;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CirculoReader circuloReader = new CirculoReader(scanner);
        CuadradoReader cuadradoReader = new CuadradoReader(scanner);
        TrianguloReader trianguloReader = new TrianguloReader(scanner);
        ShapeReader shapeReader = new ShapeReader(scanner, circuloReader, cuadradoReader, trianguloReader);
        DrawReader drawReader = new DrawReader(scanner, shapeReader);

        Draw draw = drawReader.read();
        draw.showInfo();
    }
}
