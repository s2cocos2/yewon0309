import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int min = arr[0], minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, minIndex);
        System.arraycopy(arr, minIndex + 1, result, minIndex, arr.length - minIndex - 1);

        return result;
    }
}
