package L2.RECURSION_PART_TWO;

public class StringToInteger {
    public static int stringToInt(String val,int start,int end){
//        System.out.println(val);
        if(val.length()==1)return val.charAt(0)-'0';
        else return stringToInt(val.substring(start,end-1),start,end-1)*10+(int)val.charAt(end-1)-'0';
    }
    public static void main(String[] args) {
        System.out.println(stringToInt("12345",0,5));
    }
}
