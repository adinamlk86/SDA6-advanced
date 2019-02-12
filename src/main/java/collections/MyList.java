package collections;

import java.util.*;


public class MyList {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("ddd");
        list1.add("ccc");
        list1.add("bbb");


        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        if(list1.contains("rrr")){
            System.out.println("element is present");
        } else {
            System.out.println("element is not present");
        }

        if(list1.contains("bbb")){
            System.out.println("element is present");
        } else {
            System.out.println("element is not present");
        }

        list1.sort(Comparator.reverseOrder());
        System.out.println("Reverse Order: " +list1);
        list1.sort(Comparator.naturalOrder());
        System.out.println("Natural Order: "+list1);

        List<String> list2 = list1;

        System.out.println("Copied list: "+list2);

        List<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println("Combined list: "+list3);

        Collections.swap(list3,1,5);
        System.out.println("Swapped: "+ list3);








    }



}
