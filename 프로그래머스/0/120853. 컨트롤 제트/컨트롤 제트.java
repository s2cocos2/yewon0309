import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        String[] arr = s.split(" ");

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("Z")){
                stack.pop();
            } else {
                stack.push(Integer.parseInt(arr[i]));
            }
        }

        while(!stack.isEmpty()){
            answer += stack.pop();
        }
        return answer;
    }
}