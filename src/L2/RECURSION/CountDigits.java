package L2.RECURSION;

public class CountDigits {
    public static int countDigits(int n) {
        // code here
        if(n!=0){
            // System.out.println(count);
            return 1+countDigits(n/10);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(countDigits(20838));
    }
}
