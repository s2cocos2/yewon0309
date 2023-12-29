class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
                ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--",
                "-..-", "-.--", "--.."};
        String[] splitLetter = letter.split(" ");

        for(int i=0;i<splitLetter.length;i++){
            for(int j=0;j< morse.length;j++){
                if(splitLetter[i].equals(morse[j])){
                    answer += (char)('a' + j);
                }
            }
        }
        return answer;
    }
}