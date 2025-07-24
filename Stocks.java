public class Stocks {
    public static int buyNdSellStocks(int prices[]) {
        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = prices[0];
        int buyDay = -1;
        int sellDay = -1;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                // maxProfit = Math.max(maxProfit, profit);
                if (maxProfit < profit) {
                    maxProfit = profit;
                    sellDay = i + 1;
                }
            } else {
                buyPrice = prices[i];
                buyDay = i + 1;
            }
        }
        System.out.println("Buy day: "+ buyDay);
        System.out.println("Sell day: "+ sellDay);

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max Profit: "+ buyNdSellStocks(prices));
    }
}
