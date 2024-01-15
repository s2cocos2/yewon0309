import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int num = -1;
        int num2 = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 2){
                num = i;
                break;
            }
        }

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] == 2){
                num2 = i;
                break;
            }
        }

        int[] answer;
        if(num == -1 && num2 == -1){
            answer = new int[]{-1};
        } else {
            answer = Arrays.copyOfRange(arr, num, num2+1);
        }
        return answer;
    }
}