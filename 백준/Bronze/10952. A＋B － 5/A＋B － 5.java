import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A == 0 && B == 0){
                break;
            }
            System.out.println(A + B);
        }
    }
}