public class Solution {
    public int solution(int left, int right) {
        int result = 0;
        
        for (int i = left; i <= right; i++) {
            if (isSquareNumber(i)) {
                result -= i;
            } else {
                result += i;
            }
        }
        
        return result;
    }
    
    private boolean isSquareNumber(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }
}
