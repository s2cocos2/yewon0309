class Solution {
    public boolean solution(int x) {
        int sumOfDigits = 0;
        
        for (char c : String.valueOf(x).toCharArray()) {
            sumOfDigits += c - '0';
        }
        
        return x % sumOfDigits == 0;
    }
}
