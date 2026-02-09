package STRINGS;

public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String s = new String("   fly me   to   the moon  ");
        int length = 0;
        int i=s.length()-1;
        while(s.charAt(i) ==' ')i--;
        while(i>=0){
            if(s.charAt(i)==' ')break;
            length++;
            i--;
        }
        System.out.println(length);
    }
}
