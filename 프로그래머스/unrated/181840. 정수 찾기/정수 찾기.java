class Solution {
    public int solution(int[] num_list, int n) {
        for (int num : num_list) {
            if (num == n) {
                return 1; // n을 찾았을 경우 1을 반환
            }
        }
        return 0; // n을 찾지 못한 경우 0을 반환
    }
}
//