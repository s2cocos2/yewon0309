class Solution {
    boolean solution(String s) {
        char c = ' ';
        int p = 0;
        int y = 0;
        boolean answer = true;

        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            if(c=='p' || c=='P'){
                p++;
            } else if(c=='y'|| c=='Y'){
                y++;
            }
        }
        if(p==y){
            answer = true;
        } else if(p!=y){
            answer = false;
        } else if(p==0 && y==0){
            answer = true;
        }
        return answer;
    }
}