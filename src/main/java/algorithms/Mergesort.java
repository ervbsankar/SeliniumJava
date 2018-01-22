package algorithms;

public class Mergesort {

    private static int[] helper;

    public static void main(String[] args) {
        int[] numbers = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        helper = new int[numbers.length];
        mergeSort(numbers, 0, numbers.length - 1);

        for (int number1 : numbers) {
            System.out.print(number1 + " ");
        }
    }

    private static void mergeSort(int[] array, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }

        int middle = leftStart + (rightEnd - leftStart) / 2;
        mergeSort(array,leftStart, middle);
        mergeSort(array,middle + 1, rightEnd);
        merge(array,leftStart, rightEnd);
    }

    private static void merge(int[] array, int leftStart, int rightEnd) {

        System.arraycopy(array, leftStart, helper, leftStart, rightEnd + 1 - leftStart);

        int leftEnd = (leftStart + rightEnd)/2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

       while(left <= leftEnd && right <= rightEnd){
           if(helper[left] <= helper[right]) {
               array[index] = helper[left];
               left++;
           } else {
               array[index] = helper[right];
               right++;
           }
           index++;
       }

       System.arraycopy(helper, left, array, index, leftEnd - left + 1);
       System.arraycopy(helper, right, array, index, rightEnd- right+ 1);

    }
}