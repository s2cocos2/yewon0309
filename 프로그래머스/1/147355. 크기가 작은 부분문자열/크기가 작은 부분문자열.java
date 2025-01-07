import java.util.stream.IntStream;

class Solution {
    public int solution(String t, String p) {
        long target = Long.parseLong(p);
        int len = p.length();
        
        return (int) IntStream.range(0, t.length() - len + 1)
                              .mapToObj(i -> t.substring(i, i + len))
                              .mapToLong(Long::parseLong)
                              .filter(num -> num <= target)
                              .count();
    }
}
