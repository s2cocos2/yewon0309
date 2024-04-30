import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String t = sc.nextLine();
        int T = Integer.parseInt(t);
        for(int i=0;i<T;i++){
            String s = sc.nextLine();
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length()-1));
        }

    }
}