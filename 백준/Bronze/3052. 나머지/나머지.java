import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<10;i++){
            int N = sc.nextInt();
            set.add(N % 42);
        }
        
        System.out.println(set.size());
    }
}