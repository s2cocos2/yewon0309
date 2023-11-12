class Solution {
    public int[] solution(String myString) {
        int count = 0;
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i) == 'x'){
                count++;
            }
        }

        int[] answer = new int[count+1];

        String[] a = myString.split("x");
        for(int i=0;i<a.length;i++){
            answer[i] = a[i].length();
        }
        return answer;
    }
}