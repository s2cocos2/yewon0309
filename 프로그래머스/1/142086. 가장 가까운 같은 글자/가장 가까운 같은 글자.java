public class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        int[] lastSeen = new int[26];
        for (int i = 0; i < 26; i++) {
            lastSeen[i] = -1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int index = currentChar - 'a';
            
            if (lastSeen[index] != -1) {
                result[i] = i - lastSeen[index];
            } else {
                result[i] = -1;
            }
            
            lastSeen[index] = i;
        }
        
        return result;
    }
}
