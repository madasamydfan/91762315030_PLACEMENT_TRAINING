package PATTERNS;

public class Pattern20 {
    public static void main(String[] args) {
        int n =10;
//        for(int i=1;i<=n;i++){
//            int ns = i*2;
//            for(int j=1;j<=ns/2;j++){
//                System.out.print("*");
//            }
//            for(int j=(ns/2)+1;j<=(n*2-ns/2);j++) {
//                System.out.print(" ");
//            }
//            for(int j=n*2-ns/2+1;j<=n*2;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n-1;i>=1;i--){
//            int ns = i*2;
//            for(int j=1;j<=ns/2;j++){
//                System.out.print("*");
//            }
//            for(int j=(ns/2)+1;j<=(n*2-ns/2);j++) {
//                System.out.print(" ");
//            }
//            for(int j=n*2-ns/2+1;j<=n*2;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        int spaces = n*2-2;
//        for(int i=1;i<n*2;i++){
//            int stars = i;
//            if(i>n) stars = n*2-i;
//            for(int j=1;j<=stars;j++){
//                System.out.print("*");
//            }
//            for(int j=1;j<=spaces;j++){
//                System.out.print(" ");
//            }
//            if(i<n)spaces -=2;
//            if(i>=n)spaces +=2;
//            for(int j=1;j<=stars;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
        int i=1;
        int count =1;
        while(i>=0){
            for(int j=1;j<=n*2;j++){
                    if(j<=i || j>(n*2-i)){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
            }
            System.out.println();
            count++;
            if(count <= n)i++;
            else i--;
        }


    }
}
