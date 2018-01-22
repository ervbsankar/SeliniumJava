package dataStructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  This class used to test the  List data structure
 */
public class ListExample {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        list.clear();
        list.add(4);
        list.add(2);
        list.add(3);
        System.out.println(list);
        Collections.sort(list, Integer::compareTo);
        System.out.println(list);
    }
}
