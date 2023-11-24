class Solution {
    int maximumSumRectangle(int R, int C, int M[][]) {
        int maxSum = Integer.MIN_VALUE;
        for(int left = 0; left < C; left++){
            int[] temp = new int[R];
            
            for(int right = left; right < C; right++){
                for (int i = 0; i < R; i++){
                    temp[i] += M[i][right];
                }
                
                int currentSum = temp[0];
                int maxSumSubArray = temp[0];
                
                for (int i = 1; i < R; i++){
                    currentSum = Math.max(temp[i], currentSum + temp[i]);
                    maxSumSubArray = Math.max(maxSumSubArray, currentSum);
                }
                maxSum = Math.max(maxSum, maxSumSubArray);
            }
        }
        return maxSum;
    }
}