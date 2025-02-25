public class Solution {
    public boolean solution(int x) {
        int sumOfDigits = 0;
        int original = x;
        
        while (x > 0) {
            sumOfDigits += x % 10;
            x /= 10;
        }
        return original % sumOfDigits == 0;
    }
}
