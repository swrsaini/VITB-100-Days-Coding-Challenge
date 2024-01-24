class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int xr = 0;
        for(int i=0; i<n; i++){
            xr ^= arr[i]; // all array elements
            xr ^= i+1;// natural number from 1 to N
        }
        // Step 2: find right most set bit in xr
        int bitNo = xr & -xr;

        // Step 3: club the number in group of 0 and 1 And take the XOR of all grouped numbers
        int one = 0, zero = 0;
        for(int i=0; i<n; i++){
            // for the array elements
            if((arr[i] & bitNo) != 0) one ^= arr[i];
            else zero ^= arr[i];
            // for natural numbers
            if((i+1 & bitNo) != 0) one ^= i+1;
            else zero ^= i+1;
        }

        // Step 4: Verify which is missing and repeating
        int cnt = 0;
        for(int i = 0; i< n; i++){
            if(zero == arr[i])cnt++;
        }
        if(cnt == 2) return new int[]{zero, one};
        return new int[] {one, zero};
    }
}