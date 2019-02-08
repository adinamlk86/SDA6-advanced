package generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    public <T>List<T> arrayToList(T[] oldList){

        ArrayList<T> newList = new ArrayList<>();
        for(int i=0;i<oldList.length;i++){
            newList.add(oldList[i]);
        }

        return newList;
    }
}
