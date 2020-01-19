package collections.exercises;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercises {

    public static void getElement(int index, List<String> list) {
        System.out.println(list.get(index));
    }

    public static void main(String[] args) {

        //create arraylist
        List<String> arrayOfColours = new ArrayList<>();
        //add elements
        arrayOfColours.add("blue");
        arrayOfColours.add("green");
        arrayOfColours.add("red");
        arrayOfColours.add("yellow");

        //iterate through arraylist and print the elements
        for (String color : arrayOfColours) {
            System.out.println(color);
        }

        //adding an element at given index
        arrayOfColours.add(0, "brown");
        System.out.println(arrayOfColours);

        //retrieving element at given index
        getElement(3, arrayOfColours);

        //update element at given index
        arrayOfColours.set(0, "pink");
        System.out.println(arrayOfColours);

        //remove element at given index
        arrayOfColours.remove(2);
        System.out.println(arrayOfColours);

        //searching for element in array
        if (arrayOfColours.contains("red")) {
            System.out.println("Element exists.");
        } else {
            System.out.println("Element does not exist");
        }

        //sorting an arraylist
        arrayOfColours.add("black");
        arrayOfColours.add("white");
        arrayOfColours.add("violet");
        System.out.println("List before sort:" + arrayOfColours);
        Collections.sort(arrayOfColours);
        System.out.println("List after sort:" + arrayOfColours);

        //copy array
        //1
        List<String> secondArray = arrayOfColours;
        System.out.println("Second Array" + secondArray);
        //2
        List<String> thirdArray = new ArrayList<>();
        for (String string : arrayOfColours) {
            thirdArray.add(string);
        }
        System.out.println("Third Array: " + thirdArray);

        //shuffle elements
        Collections.shuffle(thirdArray);
        System.out.println("Shuffled list: " + thirdArray);

        //reverse elements
        Collections.reverse(thirdArray);
        System.out.println("Reversed list: " + thirdArray);

        //extract portion of list
        List<String> partialArray = thirdArray.subList(0, 3);
        System.out.println("Sublist: " + partialArray);

        //comparing 2 lists
        System.out.println("Are the arrays the same? " + arrayOfColours.equals(secondArray));
        System.out.println("Are the arrays the same? " + arrayOfColours.equals(thirdArray));
        System.out.println("Are the arrays the same? " + arrayOfColours.equals(partialArray));

        //swap 2 array elements

        Collections.swap(thirdArray, 0, 4);
        System.out.println(thirdArray);

        //joining 2 arrays

        List<String> joinedArray = new ArrayList<>();
        joinedArray.addAll(secondArray);
        joinedArray.addAll(thirdArray);
        System.out.println("Joined Array: " + joinedArray);

        //clone array
        List<String> cloneArray = new ArrayList<>(joinedArray);
        System.out.println("Clone array: " + cloneArray);

        //empty array

        cloneArray.clear();
        System.out.println("Emptied array: " + cloneArray);

        //is array empty
        System.out.println(cloneArray.isEmpty());
        System.out.println(joinedArray.isEmpty());

    }
}
