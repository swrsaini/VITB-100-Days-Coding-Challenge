class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        int num = n/k;
        int count = 1;
        int ret = 0;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                if(count>num){
                    ret++;
                }
                count = 1;
            }
        }
         if(count>num){
                    ret++;
                }
        return ret;
    }
}
