package STRINGS;

public class DefangingIpAddress {
    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(char c:address.toCharArray()){
            if(c=='.')str.append("[.]");
            else str.append(c);
        }
        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
}
