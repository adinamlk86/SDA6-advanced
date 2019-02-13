package nested;
// creati un outer class CPU care contine un field price
// inner classes: Processor (fields: double cores, String manufacturer; metoda: double get Cache()
// RAM (fields: double memory, String manufacturer; metoda: getClockSpeed.
// In main creem un CPU si afisham Cache si Clockspeed.
public  class CPU {

    private double price;

    public CPU(double price) {
        this.price = price;
    }

    public static class Processor {
        double cores;
        String manufacturer;

        public Processor(double cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        double getCache(){
            return 1550;
        }
    }

    public static class RAM{
        double memory;
        String manufacturer;

        public RAM(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        double getClockSpeed(){
            return 450;
        }
    }
}
