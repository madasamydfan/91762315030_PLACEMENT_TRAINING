package L2.STRING_MANIPULATION;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] freqArr = new int[26];
        for(char c:magazine.toCharArray())freqArr[c-'a']++;
        for(char c:ransomNote.toCharArray()){
            freqArr[c-'a']--;
            if(freqArr[c-'a']<0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }
}
