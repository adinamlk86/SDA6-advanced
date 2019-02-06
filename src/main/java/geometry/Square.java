package geometry;

public class Square extends GeometricShape {

    private int length;

    public Square(int length) {
        this.length = length;
    }

    public double getArea(){

        return length*length;
    }
}
