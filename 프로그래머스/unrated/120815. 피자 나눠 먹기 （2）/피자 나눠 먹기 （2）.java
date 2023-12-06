class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = LCM(6, n) / 6;
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

    public static int LCM(int a, int b){
        return a * b / GCD(a, b);
    }
    
}