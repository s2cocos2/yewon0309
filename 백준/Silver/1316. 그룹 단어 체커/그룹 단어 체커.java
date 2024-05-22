import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for(int i=0;i<num;i++){
            String word = sc.nextLine();

            if(isGroupWord(word)){
                count++;
            }
        }

        System.out.println(count);

    }

    public static boolean isGroupWord(String word){
        boolean[] seen = new boolean[26];
        char prevChar = '0';

        for(int i=0;i<word.length();i++){
            char currentChar = word.charAt(i);

            if(prevChar != currentChar && seen[currentChar - 'a']){
                return false;
            }

            seen[currentChar - 'a'] = true;
            prevChar = currentChar;
        }
        return true;
    }
}