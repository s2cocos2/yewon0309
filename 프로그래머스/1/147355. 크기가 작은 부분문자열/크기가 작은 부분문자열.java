class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long target = Long.parseLong(p);
        int len = p.length();

        for (int i = 0; i <= t.length() - len; i++) {
            long num = Long.parseLong(t.substring(i, i + len));
            if (num <= target) {
                answer++;
            }
        }

        return answer;
    }
}
