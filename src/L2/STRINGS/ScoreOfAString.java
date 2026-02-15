package L2.STRINGS;

public class ScoreOfAString {
    public static  int scoreOfString(String s) {
        int i=1;
        int sum =0;
        while(i<s.length()){
            sum+=Math.abs(s.charAt(i)-s.charAt(i-1));
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }
}
