import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(C > 60){
            A = A + (C / 60);
            B = B + (C % 60);
            if(B > 60){
                A = A + 1;
                B = B - 60;
            }
        } else {
            B = B + C;
            if(B > 60){
                A = A + 1;
                B = B - 60;
            }
        }

        if(B == 60){
            A++;
            B = 0;
        }

        if(A >= 24){
            A = A - 24;
        }

        System.out.println(A + " " + B);
    }
}