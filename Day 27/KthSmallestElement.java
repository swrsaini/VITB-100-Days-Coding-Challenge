class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr, l, r+1);
        return arr[l+k-1];
    } 
}