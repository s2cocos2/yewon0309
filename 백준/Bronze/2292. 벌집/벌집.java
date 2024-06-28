import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int num = 1;
        int layer = 1;
        int answer = 0;

        if(N == 1){
            answer = 1;
        } else {
            for(int i=1;;i++){
                num += i * 6;
                layer = i+1;
                answer = layer;
                if(num >= N){
                    break;
                }
            }
        }



        System.out.println(answer);





        }
}