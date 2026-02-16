package L2.RECURSION;

public class AddDigits {
    public static int addDigits(int num) {
        if(num==0)return 0;
        return num%9!=0 ? num%9 : 9;
    }
    public static void main(String[] args) {
        System.out.println(addDigits(2352));
    }
}
