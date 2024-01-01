class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (a1[i] < a2[j]) {
                i++;
            } else if (a1[i] == a2[j]) {
                i++;
                j++;
            } else {
                return "No";
            }
        }

        return (j == m) ? "Yes" : "No";
    }
}