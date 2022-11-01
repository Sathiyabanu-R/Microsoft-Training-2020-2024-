class Solution {
    public int max(int a,int b){
        int d=a>b?a:b;
        return d;
    }
    public int maxProfit(int[] prices) {
       int buy=prices[0];
        int maxprofit=0;
       for(int i=0;i<prices.length;i++)
          if(prices[i]>buy){
              int sell=prices[i];
              maxprofit=max(maxprofit,sell-buy);
          }
        else{
            buy=prices[i];
        }
       return maxprofit;
    }
}
