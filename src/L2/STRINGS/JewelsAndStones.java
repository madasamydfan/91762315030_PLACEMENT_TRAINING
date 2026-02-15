package L2.STRINGS;
import java.util.HashMap;
public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> stoneMap = new HashMap<>();
        int noOfJewels=0;
        for(char c:stones.toCharArray()){
            stoneMap.put(c,stoneMap.getOrDefault(c,0)+1);
        }
        for(char c:jewels.toCharArray()){
            noOfJewels+=stoneMap.getOrDefault(c,0);
        }
        return noOfJewels;


        // for(char j:jewels.toCharArray()){
        //     for(char s:stones.toCharArray()){
        //         if(s==j){
        //             noOfJewels++;
        //         }
        //     }
        // }
        // return noOfJewels;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
}
