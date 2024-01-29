import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] prev = arr.clone();
        int[] curr = arr.clone();

        while(true){
            for(int i=0;i<curr.length;i++){
                if(curr[i] >= 50 && curr[i] % 2 ==0){
                    curr[i] = curr[i] / 2;
                } else if(curr[i] < 50 && curr[i] % 2 == 1){
                    curr[i] = curr[i] * 2 +1;
                }
            }

            if(Arrays.equals(prev, curr)){
                break;
            } else {
                prev = curr.clone();
                answer++;
            }
        }
        return answer;
    }
}