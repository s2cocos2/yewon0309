import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String answer = "";
        for(int i=0;i<N;i=i+4){
            answer += "long ";
        }

        answer = answer + "int";
        System.out.println(answer);
    }
}