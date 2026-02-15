package L2.MATH;

public class NoOfCommonFactors {
    public static int commonFactors(int a, int b) {
        int n = Math.min(a,b);
        int noOfFactors=0;
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0)noOfFactors++;
        }
        return noOfFactors;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        System.out.println(commonFactors(a,b));
    }
}
