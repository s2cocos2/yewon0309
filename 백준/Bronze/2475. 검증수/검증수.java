import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i=0;i<5;i++){
            int N = sc.nextInt();
            sum += N * N;
        }


        int answer = sum % 10;
        System.out.println(answer);

        }
}