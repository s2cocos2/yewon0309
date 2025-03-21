class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] monthDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDays = b - 1;
        for (int i = 1; i < a; i++) {
            totalDays += monthDays[i];
        }
        
        return days[totalDays % 7];
    }
}
