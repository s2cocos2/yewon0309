import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hr = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        int time = sc.nextInt();

        int total = (hr * 3600) + (min * 60) + sec + time;
        int hour = total / 3600 % 24;
        int minute = total / 60 % 60;
        int second = total % 60;


        System.out.println(hour + " " + minute +" " + second);


        }
}