package collections.exercises;

import sun.reflect.generics.tree.Tree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercises {

    public static void main(String[] args) {

        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("White");
        treeSet1.add("Black");
        treeSet1.add("Yellow");
        treeSet1.add("Pink");
        treeSet1.add("Blue");
        System.out.println("TreeSet1: " + treeSet1);

        /*for(String element : treeSet1){
            System.out.println(element);
        }*/

        TreeSet<String> treeSet2 = new TreeSet<>(treeSet1);
        System.out.println("TreeSet2: "+ treeSet2);

        Iterator<String> iterator = treeSet1.descendingIterator();
        System.out.println("Descending iteration: ");
        while (iterator.hasNext()){
            System.out.print(" " + iterator.next());
        }
        System.out.println();

        System.out.println("First element: "+ treeSet1.first());
        System.out.println("Last element: "+ treeSet1.last());

        TreeSet<String> treeSet3 = new TreeSet<>();
        treeSet3 = (TreeSet<String>) treeSet1.clone();
        System.out.println("TreeSet3: " + treeSet3);

        TreeSet<String> treeSet4 = new TreeSet<>();
        treeSet4.add("Black");
        treeSet4.add("Orange");
        treeSet4.add("Green");
        treeSet4.add("White");
        treeSet4.add("Brown");
        treeSet4.add("Blue");
        System.out.println("TreeSet4: " + treeSet4);
        for(String element: treeSet3){
            System.out.print(treeSet4.contains(element)? "Yes" : "No");
            System.out.print(" ");
        }
        System.out.println();

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(10);
        treeSet.add(85);
        treeSet.add(87);

        TreeSet<Integer> treeSetResult1 = (TreeSet<Integer>) treeSet.headSet(7);
        System.out.println(treeSetResult1);

        System.out.println("Greater than or equal to 75: " + treeSet.ceiling(75));
        System.out.println("Less than or equal to 25: " + treeSet.floor(25));
        System.out.println("Greater than 85: " + treeSet.higher(85));
        System.out.println("Less than 9: " + treeSet.lower(9));

        System.out.println(treeSet);
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet);
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);
        treeSet.remove(85);
        System.out.println(treeSet);
        treeSet.clear();
        System.out.println(treeSet);

    }
}
