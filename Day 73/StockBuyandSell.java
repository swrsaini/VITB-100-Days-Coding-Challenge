class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n-1;i++){
            if(A[i]<A[i+1])
            arr.add(new ArrayList<Integer>(Arrays.asList(i,i+1)));
        }
        return arr;
    }
}