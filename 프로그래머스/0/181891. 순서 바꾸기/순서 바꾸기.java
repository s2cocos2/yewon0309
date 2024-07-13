class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer1 = new int[num_list.length - n];
        int[] answer2 = new int[n];
        System.arraycopy(num_list, n, answer1, 0, num_list.length - n);
        System.arraycopy(num_list, 0, answer2, 0, n);

        int[] answer = new int[num_list.length];
        System.arraycopy(answer1, 0, answer, 0, answer1.length);
        System.arraycopy(answer2, 0, answer, answer1.length, answer2.length);
        return answer;
    }
}