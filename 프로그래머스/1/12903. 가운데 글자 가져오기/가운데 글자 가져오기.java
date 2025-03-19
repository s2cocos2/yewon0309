class Solution {
    public String solution(String s) {
        int mid = s.length() / 2;
        return (s.length() % 2 == 0) ? 
            String.valueOf(s.charAt(mid - 1)) + s.charAt(mid) :
            String.valueOf(s.charAt(mid));
    }
}
