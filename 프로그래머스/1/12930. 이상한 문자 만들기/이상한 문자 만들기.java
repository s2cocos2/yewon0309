class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                idx = 0;
                sb.append(c);
            } else {
                sb.append((idx % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
                idx++;
            }
        }

        return sb.toString();
    }
}
