class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int bin11 = 0;
        int bin22 = 0;
        int bin = 0;

        for(int i=0;i<bin1.length();i++){
            char c = bin1.charAt(i);
            if(c != '0'){
                bin11 += Math.pow(2, bin1.length()-1-i);
            }
        }

        for(int i=0;i<bin2.length();i++){
            char c = bin2.charAt(i);
            if(c != '0'){
                bin22 += Math.pow(2, bin2.length()-1-i);
            }
        }

        bin = bin11 + bin22;

        answer = Integer.toBinaryString(bin);
        return answer;
    }
}