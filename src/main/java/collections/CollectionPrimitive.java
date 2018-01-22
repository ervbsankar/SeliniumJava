import java.util.*;


public class CollectionPrimitive {

    /* Collection only have objects*/
    private static List<Integer> list = new ArrayList<>();
    public static void main(String[] args){
        list.add(1);
        list.add(2);
        list.set(1,3);
        list.add(4);
        list.add(2);
        list.add(7);


        for (Integer x : list) {
            System.out.println("value in x: " + x);
        }

        if(list.contains(1)){
            System.out.println("list: " + list) ;
        }

        //sort the array
        Collections.sort(list);
        System.out.println(list);
        int i  = Collections.binarySearch(list,5);
        System.out.println(i);

    }
}
