class Solution {
    public int solution(int n, int k) {
        int answer = -1;
        String str = Integer.toString(n, k);
        String[] arr = str.split("0");

        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(!arr[i].isEmpty() &&isPrime(Long.parseLong(arr[i]))){
                count++;
            }
        }

        answer = count;
        return answer;
    }
    
        public static boolean isPrime(Long num){
        if(num <= 1){
            return false;
        }

        if(num == 2){
            return true;
        }

        for(int i=3;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}