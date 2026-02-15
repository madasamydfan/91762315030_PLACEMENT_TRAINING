package L2.STRINGS;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = new String("anagram");
        String t = new String("nagaram");
        if(s.length()!=t.length()) System.out.println(false);;
        int[] freqArr = new int[26];
        for(char c:s.toCharArray())freqArr[c-'a']++;
        // System.out.println(Arrays.toString(freqArr));
        for(char c:t.toCharArray())freqArr[c-'a']--;
        //   System.out.println(Arrays.toString(freqArr));
        for(int i:freqArr){
            if(i!=0)System.out.println(false);
        }
        System.out.println(true);
    }
}
