class Solution {
    void rearrange(int arr[], int n) {
        
         ArrayList<Integer> ar1= new ArrayList<>();
          ArrayList<Integer> ar2= new ArrayList<>();
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                count1++;
            ar1.add(arr[i]);
            }
        }
         for(int i=0;i<n;i++)
        {
            if(arr[i]<0)
            {
                count2++;
            ar2.add(arr[i]);
            }
        }
        int i=0;
        int j=0;
        for(i=0;i<Math.min(count1,count2);i++)
        {
            arr[j++]=ar1.get(i);
            arr[j++]=ar2.get(i);
        }
        
       if(count1!=count2)
        {
        if(count1>count2)
        {
            for(int k=i;k<count1;k++)
            arr[j++]=ar1.get(k);
        }
        else
        {
            for(int k=i;k<count2;k++)
            arr[j++]=ar2.get(k);
        }
        
        }
    }
}