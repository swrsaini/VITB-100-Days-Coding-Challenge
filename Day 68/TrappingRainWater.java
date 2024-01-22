class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        
        //using two pointer approach
        int left=0;
        int right=n-1;
        long res=0;
        int leftmax=0;
        int rightmax=0;
        
        while(left<=right){
            
            if(arr[left]<=arr[right]){
                if(arr[left]>=leftmax){
                    leftmax=arr[left];
                }else{
                    res+=leftmax-arr[left];
                }
                left++;
            }
            
            else{
                if(arr[right]>=rightmax){
                    rightmax=arr[right];
                }else{
                    res+=rightmax-arr[right];
                } 
                right--;
            }
        }
        return res;
        
    } 
}