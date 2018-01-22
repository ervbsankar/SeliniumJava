package algorithms;

public class QuickSort  {
    private static int[] numbers;
    private static int number;

    public static void main(String[] args) {

        int[] values = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        numbers = values;
        number = values.length;
        quickSort(0, number - 1);

        for(int i=0; i < values.length; i++){
            System.out.println(values[i]);
        }
    }

    private static void quickSort(int low, int high) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high-low)/2];
        //int pivot = numbers[high];

        System.out.println("pivot value:" + pivot);
        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller then the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger then the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a values in the left list which is larger then
            // the pivot element and if we have found a value in the right list
            // which is smaller then the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j);
                 i++;
                 j--;
            }
        }
        //System.out.println("low: " + low + " i: " + i + " j : " + j + " high: " + high );
        // Recursion
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }

    private static void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}