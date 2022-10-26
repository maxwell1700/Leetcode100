package BuySellStock;

public class main {
    public static void main(String[] args) {
        int [] arr = {1,2};
        System.out.println(maxProfit(arr));
    }
    static int maxProfit(int[] prices) {

        if(prices.length == 0){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }else if(profit < prices[i] - min){
                profit = prices[i] - min;
            }
        }

        return profit;
    }
}
