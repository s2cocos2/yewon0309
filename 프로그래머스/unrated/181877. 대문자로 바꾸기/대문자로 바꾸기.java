public class Solution {
    public String solution(String myString) {
        return myString.toUpperCase();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        String input1 = "aBcDeFg";
        String result1 = solution.solution(input1);
        System.out.println(result1);

        String input2 = "AAA";
        String result2 = solution.solution(input2);
        System.out.println(result2);
    }
}
//