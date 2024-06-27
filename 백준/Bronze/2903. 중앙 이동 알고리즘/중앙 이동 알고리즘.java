import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int num = 2;

        for(int i=0;i<N;i++){
            num = num -1 + num;
        }

        int answer = num * num;
        System.out.println(answer);






        }
}