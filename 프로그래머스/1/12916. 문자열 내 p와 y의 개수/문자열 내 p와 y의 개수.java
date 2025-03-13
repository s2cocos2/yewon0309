class Solution {
    boolean solution(String s) {
        long pCount = s.chars().filter(c -> c == 'p' || c == 'P').count();
        long yCount = s.chars().filter(c -> c == 'y' || c == 'Y').count();
        return pCount == yCount;
    }
}