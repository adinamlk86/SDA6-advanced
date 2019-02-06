package geometry;

public class PaintShop {


    public double totalPaintQuantity(GeometricShape[] list){

        double paintQuantity=0;

        for(int i=0; i<list.length;i++){
            paintQuantity += list[i].getArea();
        }

        return paintQuantity;

    }
}
