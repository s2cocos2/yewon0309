import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int answer = 0;

        if(A == B && B == C){
            answer = 10000 + A * 1000;
        } else if(A == B && A != C){
            answer = 1000 + A * 100;
        } else if(B == C && A != B){
            answer = 1000 + B * 100;
        } else if(A == C && A != B){
            answer = 1000 + A * 100;
        } else if(A != B && B != C && A != C){
            answer = Math.max(Math.max(A, B), C) * 100;
        }

        System.out.println(answer);

    }
}