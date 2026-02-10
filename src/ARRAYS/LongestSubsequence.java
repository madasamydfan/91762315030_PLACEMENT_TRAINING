package ARRAYS;
import java.util.Arrays;

public class LongestSubsequence {
    public static  int findLHS(int[] nums) {
        // HashMap<Integer,Integer> freqMap = new HashMap<>();
        // for(int i:nums){
        //     freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        // }
        // int maxLen =0;
        // for(int i:nums){
        //     if(freqMap.containsKey(i-1)) maxLen = Math.max(maxLen,freqMap.get(i)+freqMap.get(i-1));
        //     if(freqMap.containsKey(i+1)) maxLen = Math.max(maxLen,freqMap.get(i)+freqMap.get(i+1));
        // }
        // return maxLen;
        Arrays.sort(nums);
        int maxLen = 0;
        int i = 0;
        int j = 1;
        while (i < nums.length && j < nums.length) {
            if (nums[j] - nums[i] == 1) {
                maxLen = Math.max(maxLen, j - i + 1);
                j++;
            } else if (nums[j] - nums[i] == 0) j++;
            else if (nums[j] - nums[i] > 1) {
                while (i < nums.length && nums[j] - nums[i] > 1) i++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
