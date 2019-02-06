package exception;

import java.io.FileNotFoundException;

public class MyTest {


    public static void test() throws FileNotFoundException {
        Object x = null;
        if(x==null){
            throw new FileNotFoundException("file not found");
        }
    }
    public static void main(String[] args) {
        try {
            test();
        } catch (FileNotFoundException e) {
            System.out.println("crapa");
        }
    }
}
