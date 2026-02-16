package L2.RECURSION;

public class GCD {
    public static int GCDoF(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return GCDoF(b,a%b);
        }
    }
    public static int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int i:nums){
            if(i<smallest)smallest = i;
            if(i>maximum)maximum = i;
        }
        return GCDoF(smallest,maximum);
    }
    public static void main(String[] args) {
        System.out.println(findGCD(new int[]{2,5,6,9,10}));
    }
}
