class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char[] c = new char[control.length()];
        for(int i=0;i<control.length();i++){
            c[i] = control.charAt(i);
        }

        for(int i=0;i<c.length;i++){
            if(c[i] == 'w'){
                n += 1;
            } else if(c[i] == 's'){
                n -= 1;
            } else if(c[i] == 'd'){
                n += 10;
            } else {
                n -= 10;
            }
        }
        
        answer = n;
        return answer;
    }
}