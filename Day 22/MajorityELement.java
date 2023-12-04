class Solution
{
    static int majorityElement(int a[], int size)
    {
        int elem = a[0];
        int count = 1;
        
        for(int i = 1; i<size; i++){
            if(count == 0){
                elem = a[i];
                count = 1;
            }
            else if(elem == a[i]){
                count ++;
            }
            else{
                count--;
            }
        }
        
        int freq = 0;
        for (int i = 0; i<size; i++){
            if(a[i] == elem){
                freq++;
            }
        }
        
        return (freq > size / 2) ? elem : -1;
    }
}