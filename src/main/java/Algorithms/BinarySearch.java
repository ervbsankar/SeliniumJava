package Algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args){

        Integer[] array = {1,22,43,3,5,67};
        int[] arr = {1,2,3,4};

        //Arrays.sort(array);

        long startTime = System.currentTimeMillis();
        for(int i =0 ; i < array.length; i++){

            boolean flag = true;
            int temp;
            for(int j=0; j < array.length - i - 1; j++) {
                if(array[j] >  array[j + 1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }

            if(flag) break;
        }
        System.out.println(System.currentTimeMillis() - startTime);

        for(int i =0 ; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
