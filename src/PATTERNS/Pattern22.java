package PATTERNS;
import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n ");
        int n = sc.nextInt();
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<n*2-1;j++){
                int min = Math.min(n*2-1-j-1,Math.min(n*2-1-i-1,Math.min(i,j)));
                System.out.print(n-min);
            }
            System.out.println();
        }
    }
}
