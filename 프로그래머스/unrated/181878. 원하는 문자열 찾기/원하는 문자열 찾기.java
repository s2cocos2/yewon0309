class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String lowerMyString = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();
        
        if(lowerMyString.contains(lowerPat)){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}