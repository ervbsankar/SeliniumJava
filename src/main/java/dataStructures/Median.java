package dataStructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Median {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< total; i++){
            list.add(scan.nextInt());

            if(list.size() == 1) System.out.println(list.get(0).doubleValue());
            else if (list.size() % 2 == 0) evenMedian(list);
            else if (list.size() % 2 != 0) oddMedian(list);
        }

        /*sort(list);
        for(Integer i : list){
            System.out.println(i.doubleValue());
        }*/
    }

    private static void sort(List<Integer> list){
        list.sort(Integer::compareTo);
    }

    private static void evenMedian(List<Integer> list){
        sort(list);
        Integer divider = list.size() / 2;
        Double  median = (double) ((Double.valueOf(list.get(divider)) + Double.valueOf(list.get(divider - 1))) / 2);
        System.out.println(median);
    }

    private static void oddMedian(List<Integer> list){
        sort(list);
        Integer divider = list.size() / 2;
        Double  median = Double.valueOf(list.get(divider));
        System.out.println(median);
    }
}
