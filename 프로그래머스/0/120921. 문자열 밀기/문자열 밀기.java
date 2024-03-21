class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        String N = A;

        if(N.equals(B)){
            answer = 0;
        } else {
            for(int i=0;i<A.length();i++){
                N = (N.substring(N.length()-1, N.length())) + N.substring(0, N.length()-1);
                if(N.equals(B)){
                    answer = i+1;
                    break;
                }
            }
        }
        return answer;
    }
}