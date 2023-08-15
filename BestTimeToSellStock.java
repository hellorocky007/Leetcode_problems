
public class BestTimeToSellStock {
    public static int maxProfit(int[] prices){
        int MaxProfit = 0;
          int profit = 0;
          int minprices =Integer.MAX_VALUE;
        int n= prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<minprices){
                minprices =prices[i];
            }
            profit = prices[i]-minprices;
                if(profit>MaxProfit){
                MaxProfit = profit;
               }
            
            
        }

            return MaxProfit;

    }
    public static void main(String[] args){
        int prices[] ={7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
