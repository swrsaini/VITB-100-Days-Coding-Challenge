class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        int i = 0;

        while (i < n) {
           
            if (stack.isEmpty() || hist[stack.peek()] <= hist[i]) {
                stack.push(i);
                i++;
            } else {
                int top = stack.pop();
                long height = hist[top];
                long width = stack.isEmpty() ? i : i - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            long height = hist[top];
            long width = stack.isEmpty() ? i : i - stack.peek() - 1;

            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
        
}