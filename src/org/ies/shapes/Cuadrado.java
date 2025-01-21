package org.ies.shapes;

import java.util.Objects;

public class Cuadrado extends Shape{
    private Double lado;

    public Cuadrado(String color, Double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public Double area() {
        return lado * lado;
    }

    @Override
    public void showEspecificInfo() {
        System.out.println("Info. adicional del cuadrado:" + lado + ". Area del cuadrdado:"+ area());
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cuadrado cuadrado = (Cuadrado) o;
        return Objects.equals(lado, cuadrado.lado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
