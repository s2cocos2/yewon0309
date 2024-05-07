import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int[] answer = new int[26];
        Arrays.fill(answer, -1);

        for(int i=0;i<S.length();i++){
            int index = S.charAt(i) - 'a';
            if(answer[index] == -1){
                answer[index] = i;
            }

        }
        
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }

    }
}