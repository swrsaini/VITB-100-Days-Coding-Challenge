class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
    
        //        int arr[]= {2, 3, 4, 5, -1, 0};
        //int k = arr.length;
         long prefix =1;
                long suffix =1;
                long product = Integer.MIN_VALUE;
               for(int i = 0;i<n;i++){
        //prefix = prefix*arr[i];
        if(prefix==0){
            prefix=1;
        }
        prefix = prefix*arr[i];
        product = Math.max(product,prefix);

       }
       for(int i = n-1;i>-1;i--){
       // suffix = suffix*arr[i];
        if(suffix==0){
            suffix=1;
        }
                suffix = suffix*arr[i];
        product = Math.max(product,suffix);
        
               }
        return product;
    }
}