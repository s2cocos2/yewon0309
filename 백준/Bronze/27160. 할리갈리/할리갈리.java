import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for(int i=0;i<N;i++) {
	        String fruit = sc.next();
          int count = sc.nextInt();
          map.put(fruit, map.getOrDefault(fruit,0)+count);
          }
            
        String answer = "NO";
        for (String key : map.keySet()) {
            if(map.get(key)==5) answer ="YES";
        }
        
        System.out.println(answer);
    }
}