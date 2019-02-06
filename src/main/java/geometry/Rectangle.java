package geometry;

public class Rectangle extends GeometricShape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){

        return length*width;
    }
}
