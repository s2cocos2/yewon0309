class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean left = false;
        boolean right = false;

        if(x1 == true || x2 == true){
            left = true;
        }

        if(x3 == true || x4 == true){
            right = true;
        }

        if(left == true && right == true){
            answer = true;
        }

        return answer;
    }
}