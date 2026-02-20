package L2.STRING_MANIPULATION;

public class SplitString {
    public static int balancedStringSplit(String s) {
        int isSplit = 0;
        int noOfBalanced=0;
        for(char c:s.toCharArray()){
            if(c=='R')isSplit++;
            else isSplit--;
            if(isSplit==0)noOfBalanced++;
        }
        return noOfBalanced;
    }
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}
