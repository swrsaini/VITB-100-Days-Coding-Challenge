class GfG {
    public static int palinArray(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int num = a[i];
            int rev = 0, temp;
            
            int copy = num;
            while (num > 0) {
                temp = num % 10;
                rev = rev * 10 + temp;
                num = num / 10;
            }

            if (copy != rev) {
                return 0; 
            }
        }
        return 1; 
    }
}