package nested;

public class Main {
    public static void main(String[] args) {

       // CPU produs = new CPU(50);

        CPU.Processor processor = new CPU.Processor(2,"IBM");
        System.out.println(processor.getCache());

        CPU.RAM ram = new CPU.RAM(200,"AMD");
        System.out.println(ram.getClockSpeed());


    }
}
