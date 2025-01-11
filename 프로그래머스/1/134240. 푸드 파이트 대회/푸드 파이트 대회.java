class Solution {
    public String solution(int[] food) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            if (count > 0) {
                result.append(String.valueOf(i).repeat(count));
            }
        }

        return result.toString() + "0" + result.reverse().toString();
    }
}
