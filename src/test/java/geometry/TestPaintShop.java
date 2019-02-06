package geometry;

import org.junit.Test;

public class TestPaintShop {

    @Test
    public void testIfPaintShopWorks(){

        GeometricShape s = new Square(5);
        GeometricShape c = new Circle(5);
        GeometricShape t = new Triangle(3,4,5);
        GeometricShape r = new Rectangle(5,10);

       GeometricShape[] shapes = {s,c,t,r};

       for(int i=0;i<shapes.length;i++){
           System.out.println(shapes[i].getArea());
       }

       PaintShop shop = new PaintShop();

       System.out.println(shop.totalPaintQuantity(shapes));


    }
}
