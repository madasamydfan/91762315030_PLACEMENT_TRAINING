package MATH;

public class Maximum69 {
    public static int maximum69Number (int num) {
        StringBuilder resultString = new StringBuilder();
        int valid = 1;
        for(char c:String.valueOf(num).toCharArray()){
            if(c=='6' && valid!=0){
                valid = 0;
                resultString.append('9');
            }
            else{
                resultString.append(c);
            }
        }
        return Integer.valueOf(resultString.toString());
    }
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }
}
