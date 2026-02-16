package L2.RECURSION;

public class Print1ToN {
    public static void printNos(int n) {
        // Code here
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        else{
            printNos(n-1);
        }
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printNos(10);
    }
}
