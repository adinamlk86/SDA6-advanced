package java8;

import exception.Car;
import io.serializable.Person;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

//        Person person = new Person("Ana", "Banarescu", 30);
//        Predicate<Person> test = y -> y.getAge()<25;
//        System.out.println(test.test(person));
//
//        Runnable myRunnable = () -> System.out.println("Running a runnable");
//        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
//        System.out.println(startsWithABCTest.test("ABCDEF"));
//        System.out.println(startsWithABCTest.test("DEFABC"));
//        myRunnable.run();
//
//
//        TestInterface interface1 = x ->x*x;
//        System.out.println(interface1.power(10));
//        TestInterface interface2 = x ->x*x*x;
//        System.out.println(interface2.power(10));
//
//        Function<String, Integer> stringIntegerFunction = s ->s.length();
//        System.out.println(stringIntegerFunction.apply("ABCDE"));
//
//        Function<String, String> stringStringFunction = x -> x.replace(',', '.');
//        System.out.println(stringStringFunction.apply("a,b,c,d,"));
//
//        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
//        int randomNumber = randomNumberSupplier.get();
//        System.out.println(randomNumber);
//
//        Consumer<Double> printWithPrefixConsumer = d -> System.out.println("Value: "+ d);
//        printWithPrefixConsumer.accept(10.5);

        UnaryOperator<Integer> addOperator = i -> {
            int result = 0;
            for (int j = 0; j <= i; j++) {
                result += j;
            }
            return result;
        };
        System.out.println(addOperator.apply(4));

        Optional<String> myOp = Optional.of("AAA");
//        if(myOp.isPresent()){
//            System.out.println(myOp.get());
//        } else{
//            System.out.println("Nope");
//        }

        // System.out.println(myOp.orElse("OTHER"));
        myOp.ifPresent(System.out::print);


    }
}
