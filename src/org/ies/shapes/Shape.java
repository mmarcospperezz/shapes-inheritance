package org.ies.shapes;

import java.util.Objects;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract Double area();
    public  void showInfo(){
        System.out.println("Info. del vehiculo:" + color);
        showEspecificInfo();
    }

    public abstract void showEspecificInfo();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }
}
