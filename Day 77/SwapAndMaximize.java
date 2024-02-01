class GFG
{
    long maxSum(long arr[] ,int n)
    {
        
    Arrays.sort(arr);
    
    int start = 0;
    int end = n-1;
    
    long sum = 0;
    while (start<end) {
        sum += Math.abs(arr[start] - arr[end]);
        start++;
        end--;
    }
    
    return 2*sum;
        
    }
}