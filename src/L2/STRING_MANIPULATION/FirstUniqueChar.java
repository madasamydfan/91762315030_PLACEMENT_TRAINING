package L2.STRING_MANIPULATION;

public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        int[] hashset = new int[26];
        for(char c:s.toCharArray())hashset[c-'a']++;
        for(int i=0;i<s.length();i++){
            if(hashset[s.charAt(i)-'a']==1)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
