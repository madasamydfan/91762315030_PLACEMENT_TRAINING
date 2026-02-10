package ARRAYS;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        // nums = new int[]{1,2,-2147483648};
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int i:nums){
            if(i>firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = i;
            }
            else if(i>secondMax && i!=firstMax){
                thirdMax = secondMax;
                secondMax = i;
            }
            else if(i>thirdMax && i!=secondMax && i!=firstMax){
                thirdMax = i;
            }
            else continue;
        }
        System.out.println(firstMax+" "+secondMax+" "+thirdMax);
        if(thirdMax!=Long.MIN_VALUE)return (int)thirdMax;
        return (int)firstMax;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
}
