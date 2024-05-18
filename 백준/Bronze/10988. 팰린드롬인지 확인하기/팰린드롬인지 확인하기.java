import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder(word);
        String sbReverse = sb.reverse().toString();
        int answer = -1;


        if(word.equals(sbReverse)){
            answer = 1;
        } else {
            answer = 0;
        }

        System.out.println(answer);


    }
}