public class BinarySearchExample
{
    public static void main(String[] args)
    {
        int key = 9;
        int[ ] num = new int [10];
        // Fill the array
        for (int i = 0; i < 10; i++)
            num[ i ]= i;
        //The binary search method
        binarySearch (num, 0, 9, 14);
    }
    //Binary Search Method
    // This method accepts a pre-sorted array, the subscript of the starting element for the search,
    // the subscript of the ending element for the search,
    // and the key number for which we are searching.
    public static void binarySearch(int[ ] array, int lowerbound, int upperbound, int key)
    {
        int position;
        int comparisonCount = 1;    // counting the number of comparisons (optional)

        // To start, find the subscript of the middle position.
        position = ( lowerbound + upperbound) / 2;

        while((array[position] != key) && (lowerbound <= upperbound))
        {
            comparisonCount++;
            if (array[position] > key)             // If the number is > key, ..
            {                                              // decrease position by one.
                upperbound = position - 1;
            }
            else
            {
                lowerbound = position + 1;    // Else, increase position by one.
            }
            position = (lowerbound + upperbound) / 2;
        }
        if (lowerbound <= upperbound)
        {
            System.out.println("The number was found in array subscript: " + position);
            System.out.println("The binary search found the number after " + comparisonCount +
                    " comparisons.");
            // printing the number of comparisons is optional
        }
        else
            System.out.println("Sorry, the number is not in this array.  The binary search made "
                    +comparisonCount  + " comparisons.");
    }

}