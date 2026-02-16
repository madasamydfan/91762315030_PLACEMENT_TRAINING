package L2.RECURSION;

public class Powxn {
    public static double pow(double x, long n){
        if(n==0)return 1;
        if(n<0){n=-n;x=(1/x);}
        if(n==1){
            return x;
        }
        else{
            if(n%2==0)return pow(x*x,n/2);
            else return x*pow(x*x,(n-1)/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(2,20));
        System.out.println(pow(19,-222));
    }
}
