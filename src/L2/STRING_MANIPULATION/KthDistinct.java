package L2.STRING_MANIPULATION;

import java.util.ArrayList;
import java.util.HashMap;

public class KthDistinct {
    public static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int noOfUniq = 0;
        for(String s:arr){
            if(map.get(s)==1){
                noOfUniq++;
                if(noOfUniq==k)return s;
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"},2));
    }
}
