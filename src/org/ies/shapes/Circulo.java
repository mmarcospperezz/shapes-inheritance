package org.ies.shapes;

import java.util.Objects;

public class Circulo extends Shape{
    private Double radio;

    public Circulo(String color, Double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public Double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public String showInfo() {
        return "";
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circulo circulo = (Circulo) o;
        return Objects.equals(radio, circulo.radio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
