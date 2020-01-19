package collections.exercises;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercises {

    public static void main(String[] args) {

        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(7,"Red");
        treeMap.put(43,"Green");
        treeMap.put(232,"Black");

        System.out.println("Tree map: "+ treeMap);

        Map<Integer,String> copiedTreeMap = new TreeMap<>();
        copiedTreeMap.put(3,"White");
        copiedTreeMap.put(1,"Blue");
        copiedTreeMap.putAll(treeMap);
        System.out.println("Copied tree map: "+copiedTreeMap);

        if(copiedTreeMap.containsKey(3)){
            System.out.println("Yes");
        } else
            System.out.println("No");

        if (copiedTreeMap.containsKey(32)){
            System.out.println("Yes");
        } else
            System.out.println("No");

        if(copiedTreeMap.containsValue("Blue"))
            System.out.println("Yes");
        else
            System.out.println("No");

        if(copiedTreeMap.containsValue("Orange"))
            System.out.println("Yes");
        else
            System.out.println("No");


    }
}
