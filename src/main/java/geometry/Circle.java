package geometry;

public class Circle extends GeometricShape {

    private int radius;
    static final double PI = Math.PI;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea(){

       return PI*(radius*radius);
    }
}
