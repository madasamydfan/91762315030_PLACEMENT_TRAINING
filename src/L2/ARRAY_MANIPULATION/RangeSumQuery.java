package L2.ARRAY_MANIPULATION;

public class RangeSumQuery {
    static class NumArray {
        int[] prefixSum;
        public NumArray(int[] nums) {
            prefixSum = new int[nums.length];
            prefixSum[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                prefixSum[i]=prefixSum[i-1]+nums[i];
            }
        }

        public int sumRange(int left, int right) {
            if(left==0)return prefixSum[right];
            return prefixSum[right]-prefixSum[left-1];
        }
    }

    public static void main(String[] args) {
        NumArray obj1 = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(obj1.sumRange(0,2));
    }
}
