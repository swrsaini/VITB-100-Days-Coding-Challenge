class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<>();
        int maxFromRight = arr[n-1];
        result.add(maxFromRight);
        
        for(int i = n-2; i>=0; i--){
            if(arr[i] >= maxFromRight){
                maxFromRight = arr[i];
                result.add(maxFromRight);
            }
        }
        
        ArrayList<Integer> reversedResult = new ArrayList<>();
        for(int i = result.size() - 1; i >= 0; i--){
            reversedResult.add(result.get(i));
        }
        return reversedResult;
    }
}
