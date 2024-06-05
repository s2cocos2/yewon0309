import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int money = sc.nextInt();
            int Q = 0;
            int D = 0;
            int N = 0;
            int P = 0;

            if(money >= 25){
                Q = money / 25;
                money %= 25;
            }
            if(money >= 10){
                D = money / 10;
                money %= 10;
            }
            if(money >= 5){
                N = money / 5;
                money %= 5;
            }
            if(money > 0){
                P = money;
            }

            System.out.println(Q + " " + D + " " + N + " " + P);

        }



        }
}