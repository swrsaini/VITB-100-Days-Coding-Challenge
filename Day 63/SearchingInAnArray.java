class Complete{
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        for(int ndx=0;ndx<n;){
            if(arr[ndx]==x){
                return ndx;
            }
            int d=arr[ndx]>x?arr[ndx]-x:x-arr[ndx];
            ndx+=(d/k)+(d%k==0?0:1);
        }
        return -1;
    }
}