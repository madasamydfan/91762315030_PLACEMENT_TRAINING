package L2.MATH;

public class WaterBottles {
    public  static  int numWaterBottles(int numBottles, int numExchange) {
        int numWaterBottles =0;
        while(numBottles>numExchange){
            numBottles -= numExchange;
            numWaterBottles+=numExchange;
            numBottles++;
        }
        if(numBottles ==numExchange)return numBottles+numWaterBottles+1;
        numWaterBottles+=numBottles;
        return numWaterBottles;
    }
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;
        System.out.println(numWaterBottles(numBottles,numExchange));
    }
}
