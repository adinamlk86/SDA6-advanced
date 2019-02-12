package collections;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MySet {

    public static void main(String[] args) {

        HashSet<String> mySet = new HashSet<>();
        mySet.add("Ana");
        mySet.add("are");
        mySet.add("mere");
        System.out.println(mySet);
        List<String> aaaa = new ArrayList<>(mySet);
        System.out.println(aaaa);

        HashSet<String> mySet2 = new HashSet<>();
        mySet2.add("Ana");
        mySet2.add("nu");
        mySet2.add("are");
        mySet2.add("pere");
        System.out.println(mySet2);

        System.out.println(mySet2.contains(mySet));





    }
}
