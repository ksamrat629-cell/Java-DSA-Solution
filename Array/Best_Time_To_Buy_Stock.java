package Array;

public class Best_Time_To_Buy_Stock {
    public static  int maxProfit(int[] prices) {
        int min =Integer.MAX_VALUE;
        int max = 0;
        for(int price : prices){
            if(price < min){
                min = price;
            }
            else if(price - min>max){
                max = price - min;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int res = maxProfit(prices);
        System.out.println("Ans: "+res);
    }
}
