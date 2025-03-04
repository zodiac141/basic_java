public class ArrayExceptionExamples {
    public static void main(String[] args) {

        //This exception is thrown when trying to access an array index that is out of bounds (either negative or greater than or equal to the array length).
        int[] data = {1, 2, 3};
        try {
            // Accessing an invalid index (index 5 does not exist)
            System.out.println(data[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }


        //This exception is thrown when an array is instantiated with a negative size.
        try {
            // Attempt to create an array with negative size
            int[] negativeArray = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
        //A NullPointerException may occur when an array reference is null and you try to access its elements.
        int[] arr = null;
        try {
            // Attempting to access an element from a null array
            System.out.println(arr[0]);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        //OutOfMemoryError
        //This error is thrown when the Java Virtual Machine (JVM) cannot allocate enough memory for a new array (often due to attempting to create an extremely large array).
        // Although this is an error (not an exception), you can catch it to demonstrate the concept. However, catching errors is generally not recommended.
        try {
            // Attempt to allocate a huge array that likely exceeds available memory
            int[] hugeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError: " + e.getMessage());
        }
    }

}




