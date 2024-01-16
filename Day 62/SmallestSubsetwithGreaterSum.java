class Solution { 
    int minSubset(int[] Arr,int n) { 
        Arrays.sort(Arr);
        long l=0,r=0;
        for(int i:Arr)
        l+=i;
        for(int i=0;i<n;i++)
        {
            r+=Arr[n-1-i];
            l-=Arr[n-1-i];
            if(r>l)
            return i+1;
        }
        return 0;
    }
}