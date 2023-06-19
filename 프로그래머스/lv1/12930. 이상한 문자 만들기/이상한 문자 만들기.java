class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int id = 0;

        for(int i=0;i<str.length;i++){
            if(str[i].equals(" ")){
                id = 0;
            } else if(id%2==0){
                str[i] = str[i].toUpperCase();
                id++;
            } else {
                str[i] = str[i].toLowerCase();
                id++;
            }
            answer += str[i];
        }
        return answer;
    }
}