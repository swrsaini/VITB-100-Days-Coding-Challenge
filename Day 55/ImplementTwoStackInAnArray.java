
class twoStacks
{
    int arr[] = new int[1000];
    int n = arr.length;
    int top1;
    int top2;
    twoStacks()
    {
        top1 = -1;
        top2 = n/2;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
     if(top1<=n/2){
        top1++;
        arr[top1] = x;
     }
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
     if(top2<n) {
         top2++;
         arr[top2] = x;
     } 
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(top1 == -1){
            return -1;
        }
        else{
            return arr[top1--];
        }
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2 == n/2){
            return -1;
        }
        else{
            return arr[top2--];
        }
    }
}