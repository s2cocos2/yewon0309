import java.util.Stack;

public class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int box = 1; box <= order.length; box++) {
            if (box == order[index]) {
                index++;
            } else {
                stack.push(box);
            }

            while (!stack.isEmpty() && stack.peek() == order[index]) {
                stack.pop();
                index++;
            }
        }

        return index;
    }
}
