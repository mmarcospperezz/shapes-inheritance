package org.ies.shapes;

import java.util.Objects;

public class Triangulo extends Shape {
    private Double base;
    private Double altura;

    public Triangulo(String color, Double base, Double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return base * altura/2;
    }

    @Override
    public String showInfo() {
        return "";
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangulo triangulo = (Triangulo) o;
        return Objects.equals(base, triangulo.base) && Objects.equals(altura, triangulo.altura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, altura);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
