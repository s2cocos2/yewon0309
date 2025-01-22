class Solution {
    public int solution(int n) {
        String reversedTernary = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        
        return Integer.parseInt(reversedTernary, 3);
    }
}
