package exception;

public class Car {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed() throws CarCrashedException {
        speed+=70;
        if(speed>200){
            throw new CarCrashedException("Car crashed");
        }
    }

    public static void main(String[] args) {

        Car c = new Car(100);
        try {
            c.increaseSpeed();
            c.increaseSpeed();
        } catch (CarCrashedException e){
            System.out.println("Car crashed");
        } finally {
            System.out.println("The End");
        }
    }


}
