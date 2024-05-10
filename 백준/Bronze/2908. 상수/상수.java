import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split(" ");

        int num1 = Integer.parseInt(new StringBuilder(str[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(str[1]).reverse().toString());

        int answer = Math.max(num1, num2);
        System.out.println(answer);



    }
}