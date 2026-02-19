package L2.STRING_MANIPULATION;

public class RotateString {
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        for(int i=0;i<s.length();i++){
            boolean match = true;
            for(int j=0;j<s.length();j++){
                if(s.charAt((i+j)%s.length())!=goal.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match)return match;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(rotateString("abcde","cdeab"));
    }
}
