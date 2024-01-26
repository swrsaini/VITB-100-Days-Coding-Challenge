class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
        Arrays.sort(A);
        
        for(int i=0; i<n-2; i++){
            for(int j=i+1, k=n-1; j<k; ){
                int cursum = A[i] + A[j] + A[k];
                
                if(cursum == X) return true;
                else if(cursum < X){
                    j++;
                }else{
                    k--;
                }
            }
        }
        
        return false;
    }
}
