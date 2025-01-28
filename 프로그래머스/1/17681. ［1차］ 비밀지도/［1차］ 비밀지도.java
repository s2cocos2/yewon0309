public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            StringBuilder row = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if ((combined & (1 << (n - 1 - j))) != 0) {
                    row.append("#");
                } else {
                    row.append(" ");
                }
            }

            result[i] = row.toString();
        }

        return result;
    }
}
