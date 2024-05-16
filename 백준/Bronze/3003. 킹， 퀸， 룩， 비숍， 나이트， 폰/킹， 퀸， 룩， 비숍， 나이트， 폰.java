import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] piece = {1,1,2,2,2,8};

        int[] now = new int[6];
        for(int i=0;i<now.length;i++){
            now[i] = sc.nextInt();
        }

        int[] answer = new int[6];
        for(int i=0;i<piece.length;i++){
            answer[i] = piece[i] - now[i];
        }

        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }

    }
}