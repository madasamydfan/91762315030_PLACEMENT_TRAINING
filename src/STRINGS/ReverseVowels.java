package STRINGS;

public class ReverseVowels {
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();
        while (i < j) {
            while (i < j && !isVowel(arr[i])) i++;
            while (i < j && !isVowel(arr[j])) j--;
            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        reverseVowels("IceCreAm");
    }
}
