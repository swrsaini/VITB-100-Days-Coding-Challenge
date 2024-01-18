class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
      int[]arr=new int[n+m];
      int i=0;
      for( i=0;i<n;i++){
          arr[i]=a[i];
      }
      for(int j=0;j<m;j++){
          arr[i]=b[j];
          i++;
      }
    //   System.out.println(Arrays.toString(arr));
      for(int k=arr.length-1/2;k>=0;k--){
          heapify(arr,k,arr.length-1);
      }
    //   System.out.println(Arrays.toString(arr));
      return arr;
    }
    public void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public void heapify(int[]arr,int i,int n){
        int largest=i;
        int leftindex=2*i+1;
        int rightindex=2*i+2;
        if(leftindex<=n && arr[leftindex]>arr[largest]){
            largest=leftindex;
        }
        if(rightindex<=n && arr[rightindex]>arr[largest]){
            largest=rightindex;
        }
        if(largest!=i){
            swap(arr,i,largest);
            heapify(arr,largest,n);
        }
    }
}