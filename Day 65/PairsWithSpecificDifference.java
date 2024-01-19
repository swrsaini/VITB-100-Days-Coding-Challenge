class Solution { 
    public static int maxSumPairWithDifferenceLessThanK(int arr[], int N, int K) 
    {
        Arrays.sort(arr);
        int i=N-1;
        int sum=0;
        while(i>=1)
        {
            if(arr[i]-arr[i-1] < K)
            {
                sum+=arr[i]+arr[i-1];
                i-=2;
            }
            else 
            {
                i-=1;
            }
        }
        return sum;
    }
    
}
