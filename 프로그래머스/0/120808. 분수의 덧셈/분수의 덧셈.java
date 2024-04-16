class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int numer1N = numer1 * denom2;
        int denom1N = denom1 * denom2;
        int numer2N = numer2 * denom1;
        
        int numer3 = numer1N + numer2N;
        int denom3 = denom1N;

        int gcd = GCD(numer3, denom3);

        answer[0] = numer3 / gcd;
        answer[1] = denom3 / gcd;
        return answer;
    }
    
    public static int GCD(int a, int b){
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}