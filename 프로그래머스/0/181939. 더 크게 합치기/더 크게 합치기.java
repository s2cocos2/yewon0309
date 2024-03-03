class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String cals1 = String.valueOf(a) + String.valueOf(b);
        String cals2 = String.valueOf(b) + String.valueOf(a);
        int cal1 = Integer.parseInt(cals1);
        int cal2 = Integer.parseInt(cals2);
        
        if(cal1<cal2){
            return cal2;
        } else {
            return cal1;
        }
    }
}