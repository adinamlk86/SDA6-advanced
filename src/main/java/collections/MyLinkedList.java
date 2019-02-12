package collections;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList links = new LinkedList<>();
        links.add(1);
        links.add(2);
        links.add(3);
        links.add(4);
        links.add(5);

        System.out.println(links);
        System.out.println(links.getFirst());
        System.out.println(links.getLast());

        Iterator<Integer> iterator = links.listIterator(1);
        while(iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
        System.out.println();
        System.out.println(links.getFirst());
        System.out.println(links.getLast());

        Iterator<Integer> iterator2 = links.descendingIterator();
        while(iterator2.hasNext()){
            System.out.print(iterator2.next()+ " ");
        }




    }
}
