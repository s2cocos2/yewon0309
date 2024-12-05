import java.time.LocalDate;
import java.time.DayOfWeek;

public class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        switch (dayOfWeek) {
            case MONDAY: return "MON";
            case TUESDAY: return "TUE";
            case WEDNESDAY: return "WED";
            case THURSDAY: return "THU";
            case FRIDAY: return "FRI";
            case SATURDAY: return "SAT";
            case SUNDAY: return "SUN";
            default: return "";
        }
    }
}
