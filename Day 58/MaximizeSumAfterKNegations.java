class Solution {

    public static long maximizeSum(long a[], int n, int k)
    {
        Arrays.sort(a);
        int count = 0;
        for(int i = 0; i<n; i++){
            if(a[i]<0){
                count++;
            }
        }
        
        for(int i = 0; i<count; i++){
            a[i] = a[i] * (-1);
            k--;
            if(k==0){
                break;
            }
        }
        
        Arrays.sort(a);
        if(k!=0 && k%2!=0){
            a[0] = -1 * a[0];
        }
        
        long sum = a[0];
        for(int i = 1; i<n; i++){
            sum += a[i];
        }
        
        return sum;
    }
}