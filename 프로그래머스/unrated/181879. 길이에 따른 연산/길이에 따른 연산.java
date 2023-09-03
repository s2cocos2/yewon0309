class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int product = 1;
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            answer = (num_list.length >= 11) ? (sum += num_list[i]) : (product *= num_list[i]);       
        }
        return answer;
    }
}
//