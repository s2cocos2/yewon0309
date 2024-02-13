import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger aL = new BigInteger(a);
        BigInteger bL = new BigInteger(b);

        BigInteger num = aL.add(bL);
        answer = num.toString();
        return answer;
    }
}