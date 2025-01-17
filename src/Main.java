import org.ies.shapes.Circulo;
import org.ies.shapes.Cuadrado;
import org.ies.shapes.Triangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado("rojo", 5.5);
        Circulo circulo = new Circulo("azul", 3.3);
        Triangulo triangulo = new Triangulo("verde", 4.4,6.6);

        System.out.println(cuadrado.area());
        System.out.println(circulo.area());
        System.out.println(triangulo.area());
        System.out.println(cuadrado.showInfo());
        System.out.println(circulo.showInfo());
        System.out.println(triangulo.showInfo());
    }
}