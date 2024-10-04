class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];

            String reversedPart = new StringBuilder(sb.substring(start, end + 1)).reverse().toString();
            sb.replace(start, end + 1, reversedPart);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        String result = sol.solution(my_string, queries);
        System.out.println(result);
    }
}