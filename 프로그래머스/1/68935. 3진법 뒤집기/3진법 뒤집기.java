class Solution {
    public int solution(int n) {
        StringBuilder ternary = new StringBuilder();
        while (n > 0) {
            ternary.append(n % 3);
            n /= 3;
        }
        
        String reversedTernary = ternary.toString();

        int decimal = 0;
        for (int i = 0; i < reversedTernary.length(); i++) {
            decimal = decimal * 3 + (reversedTernary.charAt(i) - '0');
        }

        return decimal;
    }
}
