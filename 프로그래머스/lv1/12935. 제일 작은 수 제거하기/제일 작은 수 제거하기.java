class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = arr[0];

        if (arr.length > 1) {
            answer = new int[arr.length-1];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
            }
            int j=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==min) {
                    continue;
                } else {
                    answer[j++] = arr[i];
                    
                }
            }
        } else {
            answer = new int[]{-1};
        }
        return answer;
    }
}