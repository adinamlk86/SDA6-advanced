package collections.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercises {

    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(43, "Red");
        map1.put(2, "Green");
        map1.put(15, "White");


        for(Map.Entry entry : map1.entrySet()){
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }

        System.out.println("First map size: "+map1.size());

        Map<Integer,String> map2 = new HashMap<>();
        map2.put(7, "Black");
        map2.put(31, "Blue");
        map2.putAll(map1);
        System.out.println("Second map: " + map2);

        map1.clear();
        System.out.println("Emptied first map: "+ map1);
        System.out.println("Is the first map empty?" + map1.isEmpty());

        if(map2.containsKey(2)){
            System.out.println("Yes");
        } else
            System.out.println("No");

        if (map2.containsKey(4242)){
            System.out.println("Yes");
        } else
            System.out.println("No");

        if(map2.containsValue("Blue"))
            System.out.println("Yes");
        else
            System.out.println("No");

        if(map2.containsValue("Orange"))
            System.out.println("Yes");
        else
            System.out.println("No");

        Set set = map2.entrySet();
        Set keySet = map2.keySet();

        System.out.println("Set values: " + set);
        System.out.println("Key values: "+ keySet);

        String value = map2.get(2);
        System.out.println("Value for key 2 is: " + value);

        System.out.println("Collection view: " + map2.values());
    }
}
