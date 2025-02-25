import org.ies.shapes.model.Circulo;
import org.ies.shapes.model.Cuadrado;
import org.ies.shapes.model.Triangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("rojo", 5.5);
        Circulo circulo = new Circulo("azul", 3.3);
        Triangulo triangulo = new Triangulo("verde", 4.4,6.6);

        System.out.println("Areas y informacion de cada forma:");
        System.out.println(cuadrado.area());
        System.out.println(circulo.area());
        System.out.println(triangulo.area());
        cuadrado.showInfo();
        circulo.showInfo();
        triangulo.showInfo();
    }
}