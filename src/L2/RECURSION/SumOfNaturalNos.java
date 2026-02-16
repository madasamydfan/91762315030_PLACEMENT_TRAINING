package L2.RECURSION;

public class SumOfNaturalNos {
    public static int findSum(int n) {
        // code here
        if(n==0){
            return 0;
        }
        else{
            return n+findSum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(findSum(10));
    }
}
