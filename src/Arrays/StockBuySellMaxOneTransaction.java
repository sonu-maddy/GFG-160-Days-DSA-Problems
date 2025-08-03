package Arrays;

public class StockBuySellMaxOneTransaction {
    public int maximumProfit(int prices[]) {
        // Code here
        int maxprofit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++){
            minprice = Math.min(minprice,prices[i]);
            maxprofit = Math.max(maxprofit,prices[i] - minprice);
        }
        return maxprofit;
    }
}
