package ARRAYS;
import java.util.List;
import java.util.ArrayList;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> resultList = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int absValue = Math.abs(nums[i]);
            if(nums[absValue-1]>=1)nums[absValue-1]*=-1;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)resultList.add(i+1);
        }
        return resultList;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
}
