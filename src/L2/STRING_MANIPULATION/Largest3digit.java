package L2.STRING_MANIPULATION;

public class Largest3digit {
    public static boolean checkInteger(String s){
        if(s.charAt(0)!=s.charAt(1) || s.charAt(1)!=s.charAt(2))return false;
        return true;
    }
    public static String largestGoodInteger(String num) {
        int i=0;
        int j=3;
        int largest = Integer.MIN_VALUE;
        while(j<=num.length()){
            System.out.println(num.substring(i,j));
            if(checkInteger(num.substring(i,j))){
                largest = Math.max(largest,Integer.valueOf(num.substring(i,j)));
            }
            i++;
            j++;
        }
        if(largest==0)return "000";
        if(largest==Integer.MIN_VALUE)return "";
        return String.valueOf(largest);
    }
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
    }
}
