class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a){
            if(n % a == 0){
                int num1 = 0;
                num1 = n / a;
                answer += num1 * b;
                n = num1 * b;
            } else {
                int num1 = 0;
                num1 = n / a;
                answer += num1 * b;
                n = num1 * b + (n % a);
            }
        }
        return answer;
    }
}