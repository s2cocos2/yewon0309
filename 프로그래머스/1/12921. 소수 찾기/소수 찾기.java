class Solution {
    public int solution(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) {
                count++;
                for (int j = i; j <= n; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        return count;
    }
}
