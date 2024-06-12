class Solution {
    public int solution(int n) {
        // n 이하의 숫자 중 소수를 찾기 위한 배열
        boolean[] isPrime = new boolean[n + 1];
        
        // 2부터 n까지 모든 수를 소수로 가정
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        
        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // 소수의 개수를 세기
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}
