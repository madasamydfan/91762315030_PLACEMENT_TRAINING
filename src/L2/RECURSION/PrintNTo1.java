package L2.RECURSION;

public class PrintNTo1 {
    public static void printNos(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        else{
            System.out.print(n+" ");
            printNos(n-1);
        }
    }
    public static void main(String[] args) {
        printNos(10);
    }
}
