package MATH;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        int sum =0;
        for(int i:nums)sum+=i;
        return  (nums.length*(nums.length+1)/2) - sum;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
