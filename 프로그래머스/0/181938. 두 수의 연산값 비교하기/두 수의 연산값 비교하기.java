class Solution {
    public int solution(int a, int b) {
        String cals = String.valueOf(a) + String.valueOf(b);
        int cal = Integer.parseInt(cals);
        
        return cal<(2*a*b) ? (2*a*b) : cal;
    }
}