import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public long solution(long n) {
        String str = Long.toString(n);
        Character[] arr = new Character[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }

        return Long.parseLong(sb.toString());
    }
}
