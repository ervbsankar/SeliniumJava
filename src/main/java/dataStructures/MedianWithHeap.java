package dataStructures;

import java.util.*;

public class MedianWithHeap {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int total = scan.nextInt();
        for(int i=0; i< total; i++) {
            list.add(scan.nextInt());
        }

        //max heap
        PriorityQueue<Integer> lowers = new PriorityQueue<>(Comparator.reverseOrder());
        //min heap
        PriorityQueue<Integer> highers = new PriorityQueue<>();
        double[] medians = new double[list.size()];

        for(int i =0; i< list.size() ; i++){
               addNumber(list.get(i), lowers,highers );
               rebalance(lowers, highers);
               //medians[i] =
            System.out.println(     getMedian(lowers,highers));
        }

    }

    private static void addNumber(int number, PriorityQueue<Integer> lowers,
                                  PriorityQueue<Integer> highers) {
        if(lowers.size() == 0 || number < lowers.peek()){
            lowers.add(number);
        }else {
            highers.add(number);
        }
    }

    private static void rebalance(PriorityQueue<Integer> lowers,
                                  PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap =
                lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap =
                lowers.size() > highers.size() ? highers : lowers;

        if(biggerHeap.size() - smallerHeap.size() >= 2) {
            smallerHeap.add(biggerHeap.poll());
        }
    }

    private static double getMedian(PriorityQueue<Integer> lowers,
                                    PriorityQueue<Integer> highers){
        PriorityQueue<Integer> biggerHeap =
                lowers.size() > highers.size() ? lowers : highers;
        PriorityQueue<Integer> smallerHeap =
                lowers.size() > highers.size() ? highers : lowers;
        if(biggerHeap.size() == smallerHeap.size()){
            return ((double)biggerHeap.peek() + smallerHeap.peek()) /2;
        } else {
            return biggerHeap.peek();
        }
    }


}
