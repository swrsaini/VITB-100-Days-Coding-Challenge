class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
         ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        for (int i = 0; i < n; i++) {
            if ((arr[i] / n) > 1) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}
