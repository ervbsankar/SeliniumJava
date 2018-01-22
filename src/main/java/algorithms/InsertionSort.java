package algorithms;

import java.util.Scanner;

public class InsertionSort {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
        for(int i=ar.length-1; i >= 0 ; i--){
            int j= i-1;
            while(j >= 0){
                if(ar[i] < ar[j]){
                    int tmp = ar[i];
                    ar[i] =  ar[j];
                    printArray(ar);
                    ar[j] = tmp;
                }
                /*else{
                    printArray(ar);
                }*/
                j--;
            }

        }
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
        printArray(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
