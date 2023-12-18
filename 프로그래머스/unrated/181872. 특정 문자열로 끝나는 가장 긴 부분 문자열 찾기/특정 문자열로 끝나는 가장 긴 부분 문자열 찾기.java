class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for(int i=0;i<myString.length();i++){
            for(int j=i;j<=myString.length();j++){
                String sub = myString.substring(i, j);
                if(sub.endsWith(pat) && sub.length() > answer.length()){
                    answer = sub;
                }
            }
        }
        return answer;
    }
}