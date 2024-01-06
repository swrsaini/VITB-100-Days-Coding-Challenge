class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        long P[] = new long[n];
        long product = 1;
        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i!=j){
                    product *= nums[j];
                }
            }
            P[i] = product;
            product = 1;
        }
        return P;
	} 
} 