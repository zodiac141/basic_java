public class largestinarray {
    public int findTheLargest(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        largestinarray LargestInArray = new largestinarray();
        int[] nums = {1, 2, 3, 2, 1};
        int largest = LargestInArray.findTheLargest(nums);
        System.out.println("The largest number in the array is: " + largest);
    }
}