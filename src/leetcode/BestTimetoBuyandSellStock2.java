package leetcode;

public class BestTimetoBuyandSellStock2 {
    public int maxProfit(int[] prices) {
    	if(prices.length==0)return 0;
    	int profit=0;
        for(int i=1;i<prices.length;i++){
        	int var =prices[i]-prices[i-1];
        	if(var>0){
        		profit+=var;
        	}
        }
        return profit;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
