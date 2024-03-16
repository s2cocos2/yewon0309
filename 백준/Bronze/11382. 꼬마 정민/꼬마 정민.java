import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import합니다.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();
        
        long result = A + B + C;
        System.out.println(result);
        scanner.close();
    }
}