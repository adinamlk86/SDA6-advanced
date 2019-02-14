package java8;

import io.serializable.Person;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Ana", "Banarescu", 30);
        Predicate<Person> test = y -> y.getAge()<25;
        System.out.println(test.test(person));

        Runnable myRunnable = () -> System.out.println("Running a runnable");
        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));
        System.out.println(startsWithABCTest.test("DEFABC"));
        myRunnable.run();


        TestInterface interface1 = x ->x*x;
        System.out.println(interface1.power(10));
        TestInterface interface2 = x ->x*x*x;
        System.out.println(interface2.power(10));

        Function<String, Integer> stringIntegerFunction = s ->s.length();
        System.out.println(stringIntegerFunction.apply("ABCDE"));

        Function<String, String> stringStringFunction = x -> x.replace(',', '.');
        System.out.println(stringStringFunction.apply("a,b,c,d,"));



    }
}
