public class ArraySum {
    public int SumOfArray(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum+= nums[i];
            }
        return sum;
    }

    public static void main(String[] args) {
        ArraySum arraysum = new ArraySum();
        int[] nums = {1, 2, 3, 2, 1};
        int totalsum = arraysum.SumOfArray(nums);
        System.out.println("The sum of the array is: " + totalsum);
    }
}


