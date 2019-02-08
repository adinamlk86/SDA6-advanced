package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class MyTest {


//    public static void test() throws FileNotFoundException {
//        Object x = null;
//        if(x==null){
//            throw new FileNotFoundException("file not found");
//        }
//    }

    static void test() {

        try {
            test2();
            throw new NumberFormatException("X");
        } catch (NumberFormatException | IOException t) {
            System.out.println("Exception"+ t);
        }

    }

    static void test2() throws IOException {
        throw new IOException("X");

    }

    public static void main(String[] args) {
        test();
    }
}
