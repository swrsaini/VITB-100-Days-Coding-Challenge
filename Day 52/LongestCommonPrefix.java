class Solution{
    String longestCommonPrefix(String arr[], int n){
        if (n == 0) {
            return "-1";
        }

        int minLength = Integer.MAX_VALUE;
        for (String str : arr) {
            minLength = Math.min(minLength, str.length());
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            char currentChar = arr[0].charAt(i);

            for (int j = 1; j < n; j++) {
                if (arr[j].charAt(i) != currentChar) {
                    return (result.length() == 0) ? "-1" : result.toString();
                }
            }

            result.append(currentChar);
        }

        return (result.length() == 0) ? "-1" : result.toString();
    }
}