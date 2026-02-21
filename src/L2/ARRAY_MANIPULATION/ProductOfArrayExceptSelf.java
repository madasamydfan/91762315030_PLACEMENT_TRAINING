package L2.ARRAY_MANIPULATION;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] resultArray = new int[nums.length];
        resultArray[0]=1;
        for(int i=1;i<nums.length;i++){
            resultArray[i]=resultArray[i-1]*nums[i-1];
        }
        // System.out.println(Arrays.toString(resultArray));
        int right = 1;
        for(int j=nums.length-1;j>=0;j--){
            resultArray[j]*=right;
            right = right*nums[j];
        }
        return resultArray;
    }
    public static void main(String[] args) {
    productExceptSelf(new int[]{1,2,3,4});
    }
}
