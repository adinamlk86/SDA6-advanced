package collections.exercises;

import java.util.*;

public class HashSetExercises {


    public static void main(String[] args) {

        Set<String> newHashSet = new HashSet<>();

        newHashSet.add("Red");
        newHashSet.add("Green");
        newHashSet.add("Black");
        newHashSet.add("White");
        newHashSet.add("Pink");
        newHashSet.add("Yellow");

        System.out.println("newHashSet: " + newHashSet);

       /* Iterator<String> iterator = newHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/
        System.out.println("HashSet size: "+newHashSet.size());

       /* newHashSet.clear();
        System.out.println("Is the hashSet empty? "+newHashSet.isEmpty());*/

        Set<String> secondHashSet = new HashSet<>();
        secondHashSet.addAll(newHashSet);
        System.out.println("Cloned HashSet: "+ secondHashSet);

        String[] hashSetToArray = new String[newHashSet.size()];
        newHashSet.toArray(hashSetToArray);
        System.out.println("HashSet to array: "+Arrays.toString(hashSetToArray));

        Set<String> hashSetToTreeSet = new TreeSet<>(secondHashSet);
        System.out.println("HashSet to TreeSet: "+hashSetToTreeSet.toString());

        List<String> hashSetToArrayList = new ArrayList<>(newHashSet);
        System.out.println("HashSet to ArrayList: " + hashSetToArrayList);

        Set<String> hashSet1 = new HashSet<>();
        hashSet1.add("Red");
        hashSet1.add("Green");
        hashSet1.add("Black");
        hashSet1.add("White");
        System.out.println("HashSet1: "+ hashSet1);
        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Red");
        hashSet2.add("Pink");
        hashSet2.add("Black");
        hashSet2.add("Orange");
        System.out.println("HashSet2: "+ hashSet2);

        for(String element : hashSet1){
            System.out.print(hashSet2.contains(element) ? "Yes" : "No");
            System.out.print("  ");
        }

        System.out.println(hashSet1.containsAll(hashSet2));

        hashSet1.retainAll(hashSet2);
        System.out.println("Common elements: "+hashSet1);

    }
}
