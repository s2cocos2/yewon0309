import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        
        int[] alpha = new int[26]; 
        
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }
        
        for (int i = 0; i < S.length(); i++) {
            int index = S.charAt(i) - 'a';
            
            if (alpha[index] == -1) {
                alpha[index] = i;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}
