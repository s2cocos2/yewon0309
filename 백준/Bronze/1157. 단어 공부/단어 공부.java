import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String[] alpabet = new String[26];
        char c = 'A';
        for(int i=0;i<alpabet.length;i++){
            alpabet[i] = String.valueOf(c);
            c++;
        }

        String wordUpper = word.toUpperCase();
        String[] words = new String[word.length()];
        for(int i=0;i<word.length();i++){
            words[i] = String.valueOf(wordUpper.charAt(i));
        }

        int[] arr = new int[alpabet.length];
        for(int i=0;i<alpabet.length;i++){
            for(int j=0;j< words.length;j++){
                if(alpabet[i].equals(words[j])){
                    arr[i]++;
                }
            }
        }

        int max = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int count = 0;
        char ch = '?';
        for(int i=0;i<arr.length;i++){
            if(arr[i] == max){
                count++;
                ch = (char)('A' + i);
            }
        }

        if(count > 1){
            System.out.println("?");
        } else {
            System.out.println(ch);
        }

    }
}