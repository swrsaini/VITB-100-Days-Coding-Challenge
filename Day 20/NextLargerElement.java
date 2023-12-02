class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] result = new long[n];
        Stack<Integer> stack =  new Stack<>();
        
        for (int i = 0; i<n; i++){
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]){
                int index = stack.pop();
                result[index] = arr[i];
            }
            stack.push(i);
        }
        
        while (!stack.isEmpty()) {
            int index = stack.pop();
            result[index] = -1;
        }
        return result;
    } 
}