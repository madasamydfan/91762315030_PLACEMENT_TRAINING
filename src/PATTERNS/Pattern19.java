package PATTERNS;

public class Pattern19 {
    public static void main(String[] args) {
        int n=5;
        int spaces = 0;
        for(int i=1;i<=n*2;i++){
            int stars = n-i+1;
            if(i>n)stars = i - n;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            if(i<n) spaces+=2;
            if(i>n) spaces-=2;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
