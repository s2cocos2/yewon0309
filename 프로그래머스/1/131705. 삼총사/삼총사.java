class Solution {
    public int solution(int[] number) {
        return findTriplets(number, 0, 0, 0);
    }

    private int findTriplets(int[] number, int start, int depth, int sum) {
        if (depth == 3) {
            return sum == 0 ? 1 : 0;
        }

        int count = 0;

        for (int i = start; i < number.length; i++) {
            count += findTriplets(number, i + 1, depth + 1, sum + number[i]);
        }

        return count;
    }
}
