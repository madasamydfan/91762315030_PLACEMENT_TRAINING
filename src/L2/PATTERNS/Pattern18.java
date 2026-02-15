package L2.PATTERNS;

public class Pattern18 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j<=n;j++){
                System.out.print((char)('A'+j-1));
//                System.out.print(j);
            }

            System.out.println();
        }
    }
}

//
//5
//45
//345

//
//11
//21 22
//31 32 33
//41 42 43 44
//
//5
//4 5
//3 4 5
//2 3 4 5