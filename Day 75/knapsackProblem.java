class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         /* Recursive
         if(n == 0 || W == 0){
             return 0;
         }
         if(wt[n - 1] > W){
             return knapSack(W,wt,val,n - 1);
         }else{
             return Math.max(val[n - 1] +knapSack(W - wt[n - 1],wt,val,n-1),knapSack(W,wt,val,n-1));
         }
         */
        int[][] dp = new int[n + 1][W + 1];
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= W;j++){
                if(wt[i - 1] > j){
                    dp[i][j] = dp[i - 1][j];
                }else{
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]],dp[i - 1][j]);
                }
            }
        }
        return dp[n][W];
    } 
}