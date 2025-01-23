package org.ies.shapes.model;

import java.util.Objects;

public class Draw {
    private double coordenadasX;
    private double coordenadasY;
    private Shape forma;

    public Draw(double coordenadasX, double coordenadasY, Shape forma) {
        this.coordenadasX = coordenadasX;
        this.coordenadasY = coordenadasY;
        this.forma = forma;
    }

    public void showInfo(){
        System.out.println("Informacion del dibujo:" + coordenadasX +" "+ coordenadasY +" "+ forma);
    }

    public double getCoordenadasX() {
        return coordenadasX;
    }

    public void setCoordenadasX(double coordenadasX) {
        this.coordenadasX = coordenadasX;
    }

    public double getCoordenadasY() {
        return coordenadasY;
    }

    public void setCoordenadasY(double coordenadasY) {
        this.coordenadasY = coordenadasY;
    }

    public Shape getForma() {
        return forma;
    }

    public void setForma(Shape forma) {
        this.forma = forma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Draw draw = (Draw) o;
        return Double.compare(coordenadasX, draw.coordenadasX) == 0 && Double.compare(coordenadasY, draw.coordenadasY) == 0 && Objects.equals(forma, draw.forma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordenadasX, coordenadasY, forma);
    }

    @Override
    public String toString() {
        return "Draw{" +
                "coordenadasX=" + coordenadasX +
                ", coordenadasY=" + coordenadasY +
                ", forma=" + forma +
                '}';
    }
}


