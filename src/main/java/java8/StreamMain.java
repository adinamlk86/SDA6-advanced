package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        List<String> aList = Arrays.asList("aa","bb","cc","dd","as","ax");
        Predicate<String> a1 = j -> j.startsWith("a");
        List<String> a = aList.stream().filter(a1).collect(Collectors.toList());
        System.out.println(a);
    }
}
