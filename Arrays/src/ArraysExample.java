import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args)
    {
        // Declaration and allocation of an integer array with 5 elements
        int[] numbers = new int[5];
        // Declaration and initialization with values
        int[] primes = {2, 3, 5, 7, 11};
        // Accessing elements using index (0-based indexing)
            System.out.println("First prime: " + primes[0]); // Output: 2
        // Accessing the length of the array
            System.out.println("Length of primes array: " + primes.length);

        // Modifying an element
        primes[1] = 13;
            System.out.println("Modified second prime: " + primes[1]); // Output: 13
        //array traversing
        for(int i=0;i<primes.length;i++){
            System.out.println(primes[i]);
        }
        for(int prime:primes){
            System.out.println(prime); //for each in array
        }
        // Two-dimensional array declaration and initialization
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

    // Accessing an element in a 2D array
        System.out.println("Element at row 1, column 2: " + matrix[1][2]); // Output: 6
    // Declaration of a jagged array
        int[][] jagged = new int[3][];
        jagged[0] = new int[] {1, 2};
        jagged[1] = new int[] {3, 4, 5};
        jagged[2] = new int[] {6, 7, 8, 9};

    // Iterating through a jagged array
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
        //length – A property (not a method) that returns the size of the array.
        //	2.	Arrays.toString(array) – Converts an array into a string representation.
        //	3.	Arrays.sort(array) – Sorts an array in ascending order.
        //	4.	Arrays.fill(array, value) – Fills an array with a specific value.
        //	5.	Arrays.copyOf(array, newLength) – Creates a copy of an array with a specified size.
        //	6.	Arrays.copyOfRange(array, from, to) – Copies a specific range from an array.
        //	7.	Arrays.equals(array1, array2) – Checks if two arrays are equal.
        //	8.	Arrays.binarySearch(array, value) – Searches for a value in a sorted array and returns its index.
        //	9.	Arrays.deepToString(array) – Converts multi-dimensional arrays into a string.
        //	10.	Arrays.asList(array) – Converts an array into a List (only for non-primitive types).

        Arrays.toString(primes);
        Arrays.sort(primes);
        Arrays.fill(primes, 4);
        Arrays.copyOf(primes, 3);
        Arrays.equals(primes, primes);
        Arrays.binarySearch(primes, 3);
        Arrays.deepToString(matrix);
        Arrays.asList(primes);


    }
}