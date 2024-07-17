import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int month = sc.nextInt();
        int day = sc.nextInt();

        int total = 0;

        for(int i=1;i<month;i++){
            if(i == 1 || i == 3 ||i == 5 ||i == 7 ||i == 8 ||i == 10 ||i == 12){
                total += 31;
            } else if(i == 4 || i == 6 ||i == 9 ||i == 11 ){
                total += 30;
            } else {
                total += 28;
            }
        }

        total = total + day;

        int num = total % 7;

        String answer = str[num];
        System.out.println(answer);



        }
}