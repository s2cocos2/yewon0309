class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] strArr = new String[array.length];
        String str = "";
        for(int i=0;i<array.length;i++){
            strArr[i] = array[i] + "";
            str += strArr[i];
        }
        
//        String str = "";
//        for(int i=0;i<strArr.length;i++){
//            str += strArr[i];
//        }

        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '7'){
                count++;
            }
        }

        answer = count;
        return answer;
    }
}